package geek_assignment_26;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");

		String s=sc.nextLine();
		char[] a=s.toCharArray();
		
		String str="";
		for(int i=a.length-1;i>=0;i--) {
			str=str+a[i];
		}
		System.out.println("String after reversingd:"+str);
		if(str.equals(s)) {
			System.out.println("Is palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
