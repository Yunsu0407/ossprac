import java.util.Scanner;

public class Student {
	public static void act(Scanner oInDev) {
		String sName;
		//String sMajor;
		int iStuNo;
		
		System.out.print("이름: ");
		sName = oInDev.next();
		System.out.print("학번: ");
		iStuNo = oInDev.nextInt();
		//System.out.print("학과: ");
		//sMajor = oInDev.next();
		
		
		System.out.println("이름: " + sName);
		System.out.println("학번: " + iStuNo);
		//System.out.println("학과: " + sMajor);
	}
	
	public static void main(String[] args) {
		Scanner oInDev = new Scanner(System.in);
		
		act(oInDev);
		oInDev.close();
	}

}
