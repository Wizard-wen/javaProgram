package abstractClasses;


public class personTest{
	

	public static void main(String [] args) {
		Person [] people = new Person[2];


		Person[0] = new Employee('', 50000, 1989, 10, 1);

		Person[1] = new Student('Maria', 'computer science');


		for (Person p : people){
			System.out.println(p.getName()+''+p.getDescription());
		}
	}



}