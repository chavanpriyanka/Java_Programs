package methodOverloading;

public class Demo6 {
	
	
Demo6(){
System.out.println("Default conts");

}
Demo6(int a,float b){
	System.out.println("1 arg contsr");
}

Demo6(int a,char c){
	System.out.println("2 arg contsr");
	
}

void m1() {
System.out.println("Inside m1");
}

static void m1(int a){
	System.out.println("m2 method");
}
	public static void main(String[] args) {
		Demo6 t=new Demo6();
		Demo6 d=new Demo6(100,200.5f);
		Demo6 b=new Demo6(200,'X');
		new Demo6().m1();
		new Demo6(100,200.5f);
		new Demo6(200,'Z');
		m1(200);
		t.m1();
		
		
		
		
		

	}

}
