package jw04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sqlcmd.SqlCmd;

public class Login extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		this.doPost(req, res);		
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");

		String fromDbId = null;
		String fromDbPwd = null;

		try {
			Connection con = SqlCmd.getConnection("scott", "tiger");

			PreparedStatement pr = con.prepareStatement("SELECT id, pwd FROM users WHERE id=?");
			pr.setString(1, id);
			ResultSet rs = pr.executeQuery();

			if (rs.next()) {
				fromDbId = rs.getString("id");
				fromDbPwd = rs.getString("pwd");

			} else {
				System.out.println("db에 client에서 입력한 <" + id + ">와 <" + pwd + ">가 없습니다.");
			}
			rs.close();
			pr.close();
			con.close();

		} catch (Exception e) {
			System.out.println("jdbc관련 exception이 발생한 모양");
			e.printStackTrace();
		}

		out.println("<html>\r\n" + "    <head></head>\r\n" + "    <body>\r\n" + "        <h2>Login화면</h2>");
		if (fromDbId != null && fromDbPwd != null && fromDbId.equals(id) && fromDbPwd.equals(pwd)) {
			out.println(id + "님 환영 합니다.");
		} else {
			out.println("id, pwd를 확인하세요");
		}
		out.println("<p><p><a href = './jw04/login.html'>뒤로</a></p>\r\n" + "    </body>\r\n" + "</html>");
	}// end of method
}// end of class
