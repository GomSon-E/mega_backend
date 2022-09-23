package step9_01.atm_v1_analysis;

public class Account {

	String number = "";
	int money = 0;
	
	void printOwnAccount() {
		System.out.println(this.number + " : " + this.money);
	}
	
}
