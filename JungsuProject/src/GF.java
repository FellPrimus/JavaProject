import java.util.Scanner;

public class GF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("임의의 두 수를 입력하시오>");
		byte num1 = scanner.nextByte();
		byte num2 = scanner.nextByte();
		System.out.println("GaloisMult : "+cal.galoisMult(num1, num2));
	}

}
