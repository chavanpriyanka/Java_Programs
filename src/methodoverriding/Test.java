package methodoverriding;


 class Parent{
	 void property() {
	 System.out.println("Gold|Money|House");
	 }
	 void marry(){
		 System.out.println("Somesh");
	 }
 }
 class Child extends Parent{
	 void marry() {
		 System.out.println("Vipul");
	 }
	 
 }
 
class Test{
	public static void main(String[] args) {
		Parent p=new Parent();
		p.property();
		p.marry();
		
		Child c=new Child();
		c.property();
		c.marry();
		
		Parent t=new Child();
		t.property();
		t.marry();
		
		}

	}

