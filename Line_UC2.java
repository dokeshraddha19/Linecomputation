package computation;
import java.util.Scanner;
public class Line_UC2 {
	public static void main(String[] args) {
		LineComparision ab=new LineComparision();
		ab.input();
		ab.cal_length();
		}
	}
class LineComparision {

		int x,x1,y,y1;
	        double length;

		Scanner sc=new Scanner(System.in);

		void input() 
		{
		System.out.print("enter the value of x = ");
		x=sc.nextInt();
		System.out.print("enter the value of x1 = ");
	        x1=sc.nextInt();
		System.out.print("enter the value of y = ");
	        y=sc.nextInt();
		System.out.print("enter the value of y1 = ");
	        y1=sc.nextInt();
		}

		void cal_length()
		{
		length=Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
		System.out.println("length = " +length);
		}
	}


