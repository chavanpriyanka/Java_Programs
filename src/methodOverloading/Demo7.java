package methodOverloading;

public class Demo7 {

	
	
	Demo7(){
		System.out.println("0 arg");
	}
	Demo7(int a){
		System.out.println("1 arg");
	}
	
	void m1(){
		System.out.println("default method");
		
	}
	void m1(int b){
		System.out.println("m1 method");
		
	}
	public static void main(String[] args) {
		new Demo7().m1(100);
		new Demo7(200).m1();
		

	}

}
