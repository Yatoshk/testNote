package src.main.java.untitled;

import java.util.Scanner;
public class Authentication {
    private  static final String LOGIN = "Yatoshk";
    private  static final String PASSWORD = "123";

    public static int authenticate(){
        Scanner s = new Scanner(System.in);

        int maxCount = 3;
        boolean isLoginSuccess = false;

        while(maxCount > 0 && !isLoginSuccess){
            System.out.print("Login: ");
            var login = s.nextLine();
            System.out.print("Password: ");
            var password = s.nextLine();

            if(login.equals(LOGIN) && password.equals(PASSWORD)){
                isLoginSuccess = true;
            }
            maxCount--;
        }

        return isLoginSuccess?0:1;
    }
}
