package abstraction;

	abstract class Vehicles{
		abstract void start();
	}

	class Cars extends Vehicles{
		void start()
		{
			System.out.println("Starts with keys");
		}
	}
		class Scooters extends Vehicles{
			void start()
			{System.out.println("Starts with kick");
			}
			public static void main(String[] args) {
				Cars c=new Cars(); 
					c.start();
					Scooters s=new Scooters();
					s.start();
				
			}
		}
