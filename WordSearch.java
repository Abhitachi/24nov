package geek_assignment_26;
import java.util.Scanner;
public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		System.out.println("Enter the word to be Searched:");
		String word=sc.nextLine();
		int index=s.indexOf(word);
		if(index==-1) {
			System.out.println("not found");
		}
		else {
			System.out.println("found at "+index);
		}
	}

}
