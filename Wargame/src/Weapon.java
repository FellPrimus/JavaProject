
public class Weapon {
	int laser=0, bomb=0, gun=0, money=100, power=0;;
	
	void buylaser() {
		money-=30;
		laser+=40;
	}
	
	void buybomb() {
		money-=10;
		bomb+=20;
	}
	
	void buygun() {
		money-=20;
		gun+=30;
	}
	
	int Calculatepower() {
		power = laser+bomb+gun;
		
		return power;
	}
}
