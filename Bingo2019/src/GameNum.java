
public class GameNum {
	int bingosize;
	int Playernum[];
	
	BingoArray[] bingo;
	
	GameNum(int Playernum) {
		for(int i=0; i<Playernum; i++) bingo[i] = new BingoArray(bingosize);//bingosize ũ���� ���� Player ����ŭ �����
	}
	
	void round() {
		int rndNum;//�� ���� ����üũ ����
		boolean isContinue=true;
		int rnd=0;
		while(isContinue) {
		rndNum = (int)(Math.random()*bingo[rnd].size);
		System.out.println("#####("+(rnd+1)+" round) RandNumber : "+rndNum+"#####");
		
				
		}
	}
		
	void printGame() {
	System.out.println("##### �ʱⰪ ������ ���� #####");
	}
}
