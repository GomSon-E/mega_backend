package step9_02.atm_v2_analysis;

public class User {

	Account[] acc = new Account[UserManager.getInstance().ACC_MAX_CNT];
	int accCnt;
	String id;
	String pw;
	
}
