import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Please enter two numbers ");
		Scanner sc  = new Scanner(System.in);
		float fnum = sc.nextFloat();
		float snum = sc.nextFloat();
		float addnum=fnum+snum;
		float subnum=fnum-snum;
		float multinum=fnum*snum;
		float divnum=fnum/snum;
		System.out.println("addition of numbers is: "+ addnum);
		System.out.println("substraction of numbers is: "+ subnum);
		System.out.println("multiplication of numbers is: "+ multinum);
		System.out.println("division of numbers is: "+ divnum);
	}
}
