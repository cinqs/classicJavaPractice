import java.util.Scanner;

public class CheckLogin {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("user name please: ");
		String username = scan.nextLine();
		System.out.println("password please: ");
		String password = scan.nextLine();
		if (!username.equals("cisong")) {
		  System.out.println("username not existed");
		}else if (!password.equals("merde")) {
		  System.out.println("password not right");
		}else {
		  System.out.println("you are authorised");
		}
	}
}
