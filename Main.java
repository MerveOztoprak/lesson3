package week3project2;

public class Main {

	public static void main(String[] args) {
	
		StudentManager studentManager= new StudentManager();
		studentManager.add(new User());
		
	InstructorManager instructorManager= new InstructorManager();
	instructorManager.update(new User());
		
	//InstructorManager instructorManager1= new InstructorManager("engin");
	//instructorManager1 

		User user1= new User();
		user1.adi="Merve";	
		user1.soyadi="Öztoprak";
		user1.id=1;
	

		studentManager.add(user1);

	}

}
