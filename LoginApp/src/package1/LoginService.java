package package1;

import java.util.HashMap;

public class LoginService {

	
	static HashMap<String,String> users = new HashMap<String,String>();
	
	
	public LoginService(){
		users.put("hari", "hello");

		users.put("hari1", "hello1");
		users.put("hari2", "hello2");
		
	}
	
	public boolean authenticate(String userId, String password){
		
		if(password == null || password.trim() == ""){
			return false;
		}
		
		return true;
	}
	
public static User getUser(String userId){
	
	User user = new User();
	user.setUsername(users.get(userId));
	user.setUserid(userId);
	return user;
	
	
}
	
	
}
