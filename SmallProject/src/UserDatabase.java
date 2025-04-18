
public class UserDatabase {
	public static UserDatabase index = new UserDatabase();
	private java.util.ArrayList<User> AccountList = new java.util.ArrayList<>();
	
	public void StoreAccounts(User user) {
		AccountList.add(user);
		
	}
	
	public User firstLogin() {
		return AccountList.get(0);
	}
	
	public User getAccount(int i) {
		return AccountList.get(i);
	}
}
