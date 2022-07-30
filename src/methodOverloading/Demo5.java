package methodOverloading;

public class Demo5 {

	public static void main(int a)
	{System.out.println("Inside main method int");
	}
	
	public static void main(float a)
	{System.out.println("Inside main method float");
	}

	public static void main(String[] args) {
		main(100);
		main(200.5f);
		

	}

}
