package study1;

public class SpeedControl {
	
	int speed;
	
	void add(int speed) {
		speed += 10;
	}
	
	void sub(int speed) {
		speed -= 10;
	}
	
	void print() {
		System.out.println("현재속도 : "+speed);
	}
}
