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
		System.out.println("과목명 : "+name);
		System.out.println("수업장소 : "+where);
		System.out.println("수업날짜 : "+when);
	}
}
