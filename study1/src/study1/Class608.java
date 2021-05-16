package study1;

import java.util.Scanner;

public class Class608 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpeedControl sp1 = new SpeedControl();
		boolean isContinue=true;
		int inputData;
		Scanner scanner = new Scanner(System.in);
		int speed=100;
		
		while(isContinue) {
			System.out.println("1.속도증가 2.속도감속 3.속도조회 4.종료");
			System.out.print("Choice>");
			inputData = scanner.nextInt();
			switch(inputData) {
			case 1:
				sp1.add(speed);
				break;
			case 2:
				sp1.sub(speed);
				break;
			case 3:
				sp1.print();
				break;
			case 4:
				System.out.println("프로그램 종료");
				isContinue = false;
			}
		}
		
	}

}
