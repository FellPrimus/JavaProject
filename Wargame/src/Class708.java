import java.util.Scanner;

public class Class708 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isContinue=true;
		int inputData;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �����ϼ���");
		System.out.print("���̸�>"); String team1=scanner.nextLine();
		
		System.out.println("������ �����ϼ���");
		System.out.print("���̸�>"); String team2=scanner.nextLine();
		
		Team teamA=new Team(team1);
		Team teamB=new Team(team2);
		
		while(isContinue) {
			System.out.print("�޴� ����>"); inputData=scanner.nextInt(); 
			switch(inputData) {
			case 1:
				System.out.println("�������� ��ȸ�մϴ�");
					
			}
			}
		}
	

}
