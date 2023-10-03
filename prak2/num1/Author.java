package prak2.num1;

public class Author {
  private String name;
  private String email;
  private char gender;

	public Author(String inputname, String inputemail, char inputgender) {
		this.name = inputname;
		this.email = inputemail;
		this.gender = inputgender;
	}

	public String getName() {
			return name;
	}

	public String getEmail() {
			return email;
	}

	public void setEmail(String inputemail) {
			this.email = inputemail;
	}

	public char getGender() {
			return gender;
	}
	
	@Override
	public String toString () {
		return "Name = " + this.name + ", email = " + this.email + ", gender = " + this.gender;
	}	
}