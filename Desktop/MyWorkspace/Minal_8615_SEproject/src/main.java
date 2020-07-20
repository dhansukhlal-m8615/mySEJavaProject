import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter admin ID:");
		int id=sc.nextInt();
		System.out.println("Enter admin name:");
		String name=sc.next();
		System.out.println("Enter email address:");
		String email=sc.next();
		Admin admin=new Admin(id,name,email);
		System.out.println("ID:" +admin.getAdminID()+ " Name: "+admin.getAdminName()+ " Email: " +admin.getEmail() );
	}

}
