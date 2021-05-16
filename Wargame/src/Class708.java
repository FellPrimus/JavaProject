import java.util.Scanner;

public class Class708 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isContinue=true;
		int inputData;
		Scanner scanner = new Scanner(System.in);
		System.out.println("팀명을 설명하세요");
		System.out.print("팀이름>"); String team1=scanner.nextLine();
		
		System.out.println("팀명을 설명하세요");
		System.out.print("팀이름>"); String team2=scanner.nextLine();
		
		Team teamA=new Team(team1);
		Team teamB=new Team(team2);
		
		while(isContinue) {
			System.out.print("메뉴 선택>"); inputData=scanner.nextInt(); 
			switch(inputData) {
			case 1:
				System.out.println("팀정보를 조회합니다");
					
			}
			}
		}
	

}
