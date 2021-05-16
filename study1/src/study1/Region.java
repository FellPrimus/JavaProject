package study1;

public class Region {
	Family[] fm;
	int Familynum;
	int persontotal;
	int regiontotal;
	int regiontotal50;
	
	Region() {
		Familynum = (int)(Math.random()*10)+1;
		fm = new Family[Familynum];
		for(int i=0; i<Familynum; i++) fm[i] = new Family();
	}

	void calculateRegionPerson() {
		persontotal=0;
		for(int i=0; i<Familynum; i++) {
			persontotal += fm[i].personNum;
		}
	}
	
	void calculateRegionSum() {
		regiontotal=0;
		for(int i=0; i<Familynum; i++) {
			fm[i].calculateSum();
			regiontotal = fm[i].totalIncome;
			}
	}
	
	void calculateRegionSum50() {
		regiontotal50=0;
		for(int i=0; i<Familynum; i++) {
			fm[i].calculateSum50();
			regiontotal50 = fm[i].totalIncome50;
			}
		}
	
	
	void printRegion(int i) {
		System.out.println((i+1)+"지역.	총 인구수 : "+persontotal+" ,	총 수입 : "+regiontotal+"만원");
	}
	
	void printRegion50(int i) {
		System.out.println((i+1)+"지역.	총 인구수 : "+persontotal+" ,	총 수입 : "+regiontotal50+"만원");
	}
}
