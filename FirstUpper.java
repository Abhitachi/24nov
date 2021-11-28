package geek_assignment_26;
import java.util.Scanner;
public class FirstUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		String t="";
		t=t+c[0];
		t=t.toUpperCase();
		for(int i=1;i<c.length;i++) {
			if(c[i]!=' ') {
				t=t+c[i];	
			}
			else if(c[i]==' ') {
				String up="";
				up=up+c[i+1];
				up=up.toUpperCase();
				t=t+" "+up;
				i++;
			}
		}
		System.out.println(t);
		

	
	}
}
