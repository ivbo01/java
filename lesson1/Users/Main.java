package lesson1.Users;

public class Main {
    public static void main(String[] args) {
        System.out.println(User.count);
        User User1 = new User();
        System.out.println(User.count);
        User User2 = new User("User2", "7890");
        System.out.println(User.count);
        User1.setPassword("1234");
        System.out.println(User1.getUsername() + " " + User1.getPassword());
        System.out.println(User2.getUsername() + " " + User2.getPassword());
    }
}
