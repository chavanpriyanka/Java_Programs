package methodOverloading;

public class Demo4 {

	void m1(int b) {
		System.out.println("hello");
	}

	void m1(int a,float b) {
		System.out.println("hell");
	}
	static void m1(float b) {
		System.out.println("fan");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Demo4 t=new Demo4();
t.m1(100,200.5f);
m1(100.5f);
}
}
