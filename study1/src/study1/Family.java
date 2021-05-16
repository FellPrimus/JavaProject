package study1;

public class Family {
	Person[] person;
	int personNum;
	int totalIncome;
	int totalIncome50;

	Family() {
		personNum=(int)(Math.random()*8)+1;
		person=new Person[personNum];
		for(int i=0; i<personNum; i++) person[i] = new Person();
	}

	void calculateSum() {
		totalIncome=0;
		for(int i=0; i<personNum; i++) {totalIncome += person[i].income;}
	}
	
	void calculateSum50() {
		totalIncome50 = 0;
		for(int i=0; i<personNum; i++) {
			if(person[i].age>50)
				totalIncome50 += person[i].income;
		}
	}

	void displayFamilyInfo() {
		System.out.println("== Each Family Info ==");
		for(int i=0; i<personNum; i++)System.out.println((i+1)+" th person. Age : "+person[i].age+", Income : "+person[i].income);
	}
}
