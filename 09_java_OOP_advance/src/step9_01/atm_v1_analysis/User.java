package step9_01.atm_v1_analysis;

public class User {

	String id;
	int accCount;
	Account[] acc;
	
	void printAccount() {
		
		for (int i = 0; i < accCount; i++) {
			acc[i].printOwnAccount();
		}		
		
	}
	
}
