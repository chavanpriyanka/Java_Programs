package javaprog;

public class Employeestatic {
	
	int Emp_id;
	String Emp_name;
	static String Company="WNS";
	//String Company;
	
	Employeestatic(int Emp_id,String Emp_name)//,String Company)
	{
		this.Emp_id=Emp_id;
	this.Emp_name=Emp_name;
	//this.Company=Company;
	
	}
	
void display() {
	System.out.println(Emp_id+" "+Emp_name+" "+Company);
}
	public static void main(String[] args) {
		Employeestatic e1=new Employeestatic(101,"Priyanka");//,"Tcs");
		Employeestatic e2=new Employeestatic(102,"Priya");//,"Capgemini");
		e1.display();
		e2.display();

	}

}
