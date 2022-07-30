package methodoverriding;

public class SBI extends RBI{
public static void main(String[] args) {
	SBI home=new SBI();
	home.homeLoanRate();
}
		public void homeLoanRate() {
			System.out.println("ROI is 10%");
	
		}

}
