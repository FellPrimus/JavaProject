package study1;

public class Class6150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("### �� �α���, �� ���� ###");
		Region reg[] = new Region[10];
		for(int i=0; i<10; i++) {
			reg[i] = new Region();
			reg[i].calculateRegionPerson();
			reg[i].calculateRegionSum();
			reg[i].printRegion(i);
		}
		System.out.println("### �� �α���, 50�̻� �� ���� ###");
		for(int i=0; i<10; i++) {
			reg[i].calculateRegionSum50();
			reg[i].printRegion50(i);
		}
		
		Family fm[] = new Family[10];
		
	}

}
