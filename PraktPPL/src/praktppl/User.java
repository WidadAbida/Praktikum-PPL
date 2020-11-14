package praktppl;

/**
 *
 * @author Aryasakti Wirasena
 */
public class User {
        String userID;
        String password;
        boolean loginStatus;
        
        public User(String id, String pw){
            userID = id;
            password = pw;
            loginStatus = false;
        }
        
        public void login(){
            loginStatus = true;
        }
}