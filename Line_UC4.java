package computation;
import java.util.*;
public class Line_UC4 {

		public static void main(String[] args) {
		LineComputation ab=new LineComputation();
		ab.input();
		ab.length();
		ab.equal();
		}
	}
	class LineComputation {

		int x,x1,x2,x3,y,y1,y2,y3;
	        double length1,length2;

		Scanner sc=new Scanner(System.in);

		void input()
		{
		System.out.print("enter the value of x = ");
			x=sc.nextInt();
		System.out.print("enter the value of x1 = ");
	        	x1=sc.nextInt();
		System.out.print("enter the value of x2 = ");
	        	x2=sc.nextInt();
		System.out.print("enter the value of x3 = ");
	        	x3=sc.nextInt();
		System.out.print("enter the value of y = ");
	        	y=sc.nextInt();
	        System.out.print("enter the value of y1 = ");
	        	y1=sc.nextInt();
	        System.out.print("enter the value of y2 = ");
	        	y2=sc.nextInt();
	        System.out.print("enter the value of y3 = ");
	        	y3=sc.nextInt();

		}

		void length()
		{
		length1=Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
		System.out.println("Length = " +length1);
		length2=Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
	        System.out.println("Length = " +length2);
		}

		void equal()
		{
		if(length1 == length2)
			System.out.print("Length are same ");
		else if(length1>length2)
			System.out.print(" length1 is greater ");
		else
			System.out.println("length2 is greater");
		}
	}


