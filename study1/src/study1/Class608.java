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
			System.out.println("1.�ӵ����� 2.�ӵ����� 3.�ӵ���ȸ 4.����");
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
				System.out.println("���α׷� ����");
				isContinue = false;
			}
		}
		
	}

}
