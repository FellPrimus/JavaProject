
public class Team {
	Weapon weapon = new Weapon();
	Spot spot = new Spot();
	String name;
	Team(String name) {
		this.name=name;
	}
	
	void printTeam() {
		System.out.println("============================================");
		System.out.println("team�� : "+name+", power : "+weapon.Calculatepower()+", money : "+weapon.money+", ��ġ("+spot.x+","+spot.y+")"+", laser:"+weapon.laser+", gun:"+weapon.gun+", bomb:"+weapon.bomb);
	}
}
