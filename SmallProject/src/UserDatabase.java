import java.util.ArrayList;
import java.util.List;

public class UserDatabase {
    private final List<User> accountList;

    public UserDatabase() {
        this.accountList = new ArrayList<>();
    }

    public void storeAccount(User user) {
        accountList.add(user);
    }

    public User getFirstAccount() {
        return accountList.isEmpty() ? null : accountList.get(0);
    }

    public User getAccount(int index) {
        if (index < 0 || index >= accountList.size()) return null;
        return accountList.get(index);
    }

    public int getAccountCount() {
        return accountList.size();
    }

    public List<String> getAllUsernames() {
        List<String> names = new ArrayList<>();
        for (User user : accountList) {
            names.add(user.getUsername());
        }
        return names;
    }

    public User findUser(String username, String password) {
        for (User user : accountList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}