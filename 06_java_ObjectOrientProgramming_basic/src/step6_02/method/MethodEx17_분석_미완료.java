package step6_02.method;

class TTT {
	
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;
	
	void setGame() {
		
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				game[i][j] = " ";
			}
		}
		
	}
	
	void showGame() {
		
		System.out.println("===틱택토===");
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				System.out.print("[" + game[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println("===========");
		
	}
	
	void run() {
		
		setGame();
		
		while (true) {
			
			showGame();
			
			if (win == 1) {
				System.out.println("turn1 승리");
				break;
			}
			else if (win == 2) {
				System.out.println("turn2 승리");
				break;
			}
			
			choiceIdx = 0;
			exitWidth();
			exitHeight();
			exitCross();			
			
		}
		
	}
	
}

public class MethodEx17_분석_미완료 {

}
