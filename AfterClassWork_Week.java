/*
	date: 2018-3-24 12:00
	obj : AfterClassWork -- input num and ouput Weekday
*/
import java.util.Scanner;		//input lib

public class AfterClassWork_Week{
	public static void main(String args[]){		//main
		Scanner input = new Scanner(System.in);
		System.out.println("input a number between 1~7:");
		int week = input.nextInt();
		
		/*if (week == 1)		//if-else
			System.out.println(week + "--> Monday");
		else if (week == 2)
			System.out.println(week + "--> Tuesday");
		else if (week == 3)
			System.out.println(week + "--> Wensday");
		else if (week == 4)
			System.out.println(week + "--> Thursday");
		else if (week == 5)
			System.out.println(week + "--> Friday");
		else if (week == 6)
			System.out.println(week + "--> Saturday");
		else if (week == 7)
			System.out.println(week + "--> Sunday");
		else 
			System.out.println("input error");*/
		
		switch(week){		//switch
			case 1:
			System.out.println(week + "--> Monday");
			break;
			case 2:
			System.out.println(week + "--> Tuesday");
			break;
			case 3:
			System.out.println(week + "--> Wensday");
			break;
			case 4:
			System.out.println(week + "--> Thursday");
			break;
			case 5:
			System.out.println(week + "--> Friday");
			break;
			case 6:
			System.out.println(week + "--> Saturday");
			break;
			case 7:
			System.out.println(week + "--> Sunday");
			break;
			default:
			System.out.println("input error");
		}
	}
}