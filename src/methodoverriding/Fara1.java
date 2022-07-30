package methodoverriding;

class Fara1 {
	void job(){
		System.out.println("Govt job");
	}
}
	class Sara1 extends Fara1{
		void job() {
			System.out.println("private job");
		}
	}
	class Demo{
	
	public static void main(String[] args) {
	Sara1 s=new Sara1();
	s.job();
	}
	}
		

