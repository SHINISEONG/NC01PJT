package teamdraw;

import java.util.*;

public class TeamDraw {
	/// field
	int totalPeopleNum;
	int teamNum;
	int teamPeopleNum = (int) (Math.ceil((double) totalPeopleNum / teamNum));
	List<String> leaderArray = new ArrayList<String>(teamNum);
	List<String> subLeaderArray = new ArrayList<String>(teamNum);
	List<String> totalPeopleArray = new ArrayList<String>(totalPeopleNum);

	public TeamDraw() {
		totalPeopleArray.addAll(
				Arrays.asList("�赿��", "�����","�輮��", "�輺��", "����", "�迵��", "������", "�ڰ���", "�ڼ���", "������", "������", "���翬", "�ۿ���", "�ۿ��",
						"����", "����ȣ", "������", "�̵���", "�̽���", "������", "������", "������", "��ö", "������", "����â", "������", "�ּ���"));
		leaderArray.addAll(Arrays.asList("�赿��", "�����", "����ȣ", "�輺��", "����"));
		subLeaderArray.addAll(Arrays.asList("����", "������", "�ڰ���", "�ڼ���", "��ö"));
	}

	public TeamDraw(int totalPeopleNum, int teamNum) {
		this();
		this.totalPeopleNum = totalPeopleNum;
		this.teamNum = teamNum;

	}

	public void leaderChoice() {
		System.out.println("JAVA�� �ͼ��� ����� " + (teamNum * 2) + "�� �Է��� �ּ���.");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < (teamNum * 2); i++) {
			leaderArray.add(scanner.next());
		}
		scanner.close();
	}// end of leaderChoice()

	public void teamDraw() {

		for (int i = 0; i < teamNum; i++) {
			for (int j = 0; j < totalPeopleArray.size(); j++) {
				if (totalPeopleArray.get(j).equals(leaderArray.get(i))) {
					totalPeopleArray.remove(j);
					break;
				}
			} // end of inner for
		} // end of outer for
		for (int i = 0; i < teamNum; i++) {
			for (int j = 0; j < totalPeopleArray.size(); j++) {
				if (totalPeopleArray.get(j).equals(subLeaderArray.get(i))) {
					totalPeopleArray.remove(j);
					break;
				}
			} // end of inner for
		} // end of outer for

		for (int i = 0; i < 10000; i++) {
			Collections.shuffle(totalPeopleArray);
			Collections.shuffle(subLeaderArray);
		}
	}// end of teamDraw()

	public void printTeam() {
		/// method variable

		System.out.println("======================================================================================");
		System.out.println("\t\t\t\tNcloud 2�� �� ��\t\t\t\t");
		System.out.println("======================================================================================");

		for (int i = 0; i < teamNum; i++) {
			System.out.print("\t" + (i + 1) + "��\t");
		}

		System.out.println("\n--------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t*����*\t\t\t");
		for (int i = 0; i < this.leaderArray.size(); i++) {
			System.out.print("\t" + this.leaderArray.get(i) + "\t");
			if ((i + 1) % teamNum == 0) {
				System.out.println();
			} 
		}
		System.out.println("\n--------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t*������*\t\t\t");
		for (int i = 0; i < this.subLeaderArray.size(); i++) {
			System.out.print("\t" + this.subLeaderArray.get(i) + "\t");
			if ((i + 1) % teamNum == 0) {
				System.out.println();
			}
		}

		System.out.println("\n--------------------------------------------------------------------------------------");
		for (int i = 0; i < totalPeopleArray.size(); i++) {
			
			System.out.print("\t" + totalPeopleArray.get(i) + "\t");
			if ((i + 1) % teamNum == 0) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		TeamDraw teamDraw = new TeamDraw(28, 5);
		// teamDraw.leaderChoice();
		teamDraw.teamDraw();
		teamDraw.printTeam();
	} // end of main
} // end of class
