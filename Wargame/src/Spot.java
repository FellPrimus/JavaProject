import java.util.Scanner;

public class Spot {
	int x=0,y=0, x2=100, y2=100;
	Scanner scanner = new Scanner(System.in);
	
	void moveSpot() {
		System.out.println("�Ʊ����� �̵��մϴ�.");
		System.out.print("�̵���ǥ(x)>"); x=scanner.nextInt();
		System.out.print("�̵���ǥ(y)>"); y=scanner.nextInt();
		
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
