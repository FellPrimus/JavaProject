package study1;

public class Study {
	String name;
	String where;
	String when;
	
	Study(String name, String where, String when) {
		this.name = name;
		this.where = where;
		this.when = when;
	}
	
	void printstudy() {
		System.out.println("����� : "+name);
		System.out.println("������� : "+where);
		System.out.println("������¥ : "+when);
	}
}
