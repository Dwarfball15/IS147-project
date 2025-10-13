import java.util.Scanner;

public class passwordtest {
    public static boolean strongPassword(String password) {
        String passwordkey = "^(?=.*[0-9])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};:'\"\\\\|,.<>/?]).{8,}$";
        return password.matches(passwordkey);
    }

    public static boolean weakpassword(String password) {
        String passwordkey = "qwertyuiopasdfghjklzxcvbnm";
        return password.matches(passwordkey);

    }

    public static void main(String[] args) {
        System.out.print("Enter your new password: ");
        Scanner pass = new Scanner(System.in);
        String password = pass.nextLine();
        if (strongPassword(password) & weakpassword(password) & (password.length() >= 8)) {
            System.out.println("Your Password is Strong");
        }else if(weakpassword(password) && (password.length() >= 8)){
            System.out.println("Your Password is missing a special character");
        }else if(password.length() < 8){
            System.out.println("Your password is too short");
        }else{
            System.out.println("Please enter a valid password");
        }

    }
}
