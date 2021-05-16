import java.util.Scanner;

public class Spot {
	int x=0,y=0, x2=100, y2=100;
	Scanner scanner = new Scanner(System.in);
	
	void moveSpot() {
		System.out.println("아군팀을 이동합니다.");
		System.out.print("이동좌표(x)>"); x=scanner.nextInt();
		System.out.print("이동좌표(y)>"); y=scanner.nextInt();
		
	}
	
	int Calculatedistance() {
		int distancex, distancey, result;
		distancex=x2-x;
		distancey=y2-y;
		result = distancex+distancey;
		
		return result;
	}
	
	void printSpot() {
		System.out.print("("+x+","+y+")");
	}
}
