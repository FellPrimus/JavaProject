
public class BingoArray {
	int size;
	int array[][];
	BingoArray(int size) {
		this.size = size;
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				array[i][j] = (int)(Math.random()*(size*size))+1;
			}
			System.out.println();
		}
	}
}
