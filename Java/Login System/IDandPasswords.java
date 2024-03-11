import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<>();

    IDandPasswords() {
        logininfo.put("Chris", "Pizza");
        logininfo.put("Christopher", "Password123");
        logininfo.put("Chrisso", "abc");
    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }
    
}