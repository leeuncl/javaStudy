/*有一个数列：8，4，2，1，23，344，12
1、循环输出数列的值
2、求数列中所有数值的和
3、从键盘输入任意一个数据，判断数列中是否包含此数*/

import java.util.Scanner;

public class AfterClassWork_array {
	public static void main(String[] args) {
		int arr[] = {8, 4, 2, 1, 23, 344, 12};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum += arr[i];
		}
		Scanner input = new Scanner(System.in);
		int temp = input.nextInt();
		int judge = 0;		//定义判断是否在数列中的值
		for (int i = 0; i < arr.length; i++) {
			if (temp == arr[i]) {
				System.out.println(temp + "在此数列中。");
				judge = 1;
			}
		}
		if (judge == 0)
			System.out.println(temp + "不在此数列中。");
	}
}