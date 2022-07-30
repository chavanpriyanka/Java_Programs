package methodOverloading;

public class Demo2 {

	void m1() {
		System.out.println("hey");
	}
	
	void m1(int b) {
		System.out.println("hello");
	}
	

	void m1(int b,float c) {
		System.out.println("hell");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Demo2 t=new Demo2();
t.m1();
t.m1(100);
t.m1(200,300.5f);

	}

}
