package userProject;

public class ClassExample {
	
	public static void main(String[] args) {
		user user1 = new user();
		user1.id = 1;
		user1.name = "Zayn";
		user1.email = "zayntoorawa1@live.co.uk";
		user1.age = "22";

System.out.print("id:");
System.out.println(user1.id);

System.out.print("name:");
System.out.println(user1.name);

System.out.print("email:");
System.out.println(user1.email);

System.out.print("age:");
System.out.println(user1.age);

        user user2 = new user();
		user2.id = 2;
		user2.name = "Adam";
		user2.email ="zzz@123.co.uk";
		user2.age = "29";
		
		System.out.print("id:");
		System.out.println(user2.id);

		System.out.print("name:");
		System.out.println(user2.name);

		System.out.print("email:");
		System.out.println(user2.email);

		System.out.print("age:");
		System.out.println(user2.age);
		
		
	}

}
