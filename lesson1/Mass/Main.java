package lesson1.Mass;
	
public class Main {
  public static void main(String[] args) {
		User[] users = {
				new User("user1", "pass1"),
				new User("user2", "pass2"),
		};

		int i = 0;
		while(i < users.length) {
				System.out.println(users[i]);
				i++;
		}
  }
}
