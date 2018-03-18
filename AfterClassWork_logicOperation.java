/*
	date : 2018-3-18 13点37分
	obj : 身高在170以上并且视力5.0以上或者学历是本科
*/

import java.util.Scanner;

public class AfterClassWork_logicOperation{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input the height, eyesight and education background:");
		float height = input.nextFloat();
		float eyesight = input.nextFloat();
		String eduBackground = input.next();
		if (height > 170 && eyesight > 5.0 || eduBackground == "undergraduate")
			System.out.println("Yes!");
		else
			System.out.println("No!");
	}
}