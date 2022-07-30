package methodoverriding;

	public class HDFC extends RBI{
	public static void main(String[] args) {
		RBI r=new RBI();
		r.homeLoanRate();
	}
			public void homeLoanRate() {
				System.out.println("ROI is 13%");
		
			}

	}

