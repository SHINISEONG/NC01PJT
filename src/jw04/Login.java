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
				System.out.println("db�� client���� �Է��� <" + id + ">�� <" + pwd + ">�� �����ϴ�.");
			}
			rs.close();
			pr.close();
			con.close();

		} catch (Exception e) {
			System.out.println("jdbc���� exception�� �߻��� ���");
			e.printStackTrace();
		}

		out.println("<html>\r\n" + "    <head></head>\r\n" + "    <body>\r\n" + "        <h2>Loginȭ��</h2>");
		if (fromDbId != null && fromDbPwd != null && fromDbId.equals(id) && fromDbPwd.equals(pwd)) {
			out.println(id + "�� ȯ�� �մϴ�.");
		} else {
			out.println("id, pwd�� Ȯ���ϼ���");
		}
		out.println("<p><p><a href = './jw04/login.html'>�ڷ�</a></p>\r\n" + "    </body>\r\n" + "</html>");
	}// end of method
}// end of class
