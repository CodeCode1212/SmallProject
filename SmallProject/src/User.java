
public class User {
	private String username = null;
	private String password = null;
	public static User key = new User();
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
	    this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User() {
	    }
	
	User(String username, String password) {
		this.username = username;
		this.password = password;
	}
}
