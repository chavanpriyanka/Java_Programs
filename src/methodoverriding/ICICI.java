package methodoverriding;

public class ICICI extends RBI{
public static void main(String[] args) {
	ICICI home=new ICICI();
	home.homeLoanRate();
}
		public void homeLoanRate() {
			System.out.println("ROI is 12%");
	
		}

}

