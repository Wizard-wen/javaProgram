package abstractClasses;



import java.time.*;



public class Employee extends Person {

	private double salary;
	private LocalDate hireDay;


	public Employee(String name, double salary, int year int month, int day){
		super(name);
		this.salary = salary;
		hireDay = LocalDate(year, month, day);
	}


	public double getSalary(){
		return salary;
	}

	public LocalDate getHireDay(){
		return hireDay;
	}

	public String Description(){
		return String.formate("an employ with a salary of $%.2f", salary);
	}

	public raiseSalary(double byPercent){
		double raise = salary * byPercent / 100 ;
		salary += raise;
	}
}








