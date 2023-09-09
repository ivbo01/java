package lesson1.Mass;

public class User {
    private String username;
    private String password;
    static int count;

    public User() {
        count++;
        this.username = "Default";
        this.password = "Default";
    }

    public User(String username, String password) {
        count++;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Username: " + username + " " + "Password: " + password;
    }
}
