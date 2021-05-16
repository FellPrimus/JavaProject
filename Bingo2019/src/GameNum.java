
public class GameNum {
	int bingosize;
	int Playernum[];
	
	BingoArray[] bingo;
	
	GameNum(int Playernum) {
		for(int i=0; i<Playernum; i++) bingo[i] = new BingoArray(bingosize);//bingosize 크기의 빙고를 Player 수만큼 만든다
	}
	
	void round() {
		int rndNum;//매 라운드 빙고체크 숫자
		boolean isContinue=true;
		int rnd=0;
		while(isContinue) {
		rndNum = (int)(Math.random()*bingo[rnd].size);
		System.out.println("#####("+(rnd+1)+" round) RandNumber : "+rndNum+"#####");
		
				
		}
	}
		
	void printGame() {
	System.out.println("##### 초기값 숫자판 생성 #####");
	}
}
