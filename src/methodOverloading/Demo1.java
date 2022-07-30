package methodOverloading;

public class Demo1 {

	void Sample(int a){
	
		System.out.println("Hello");
			
		}
	
	static void Sample(double b){
		
		System.out.println("Hi");
			
		}
    static void Sample(char c,float f){
		
		System.out.println("getout");
    }
		public static void main(String[] args) {
			Sample(200.5);
			Sample('X',300.5f);
			Demo1 t=new Demo1();
			t.Sample(100);
			
		}
}
		
		