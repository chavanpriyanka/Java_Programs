package methodOverloading;

public class Demo3 {

	void m1(int a) {
		System.out.println("hey");
	}
	
	void m1(float b) {
		System.out.println("hello");
	}

	void m1(char c) {
		System.out.println("hell");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Demo3 t=new Demo3();
t.m1(100);
t.m1(200.5f);
t.m1('X');

	}

}