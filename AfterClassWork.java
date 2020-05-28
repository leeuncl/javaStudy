//从控制台输入学员李明3门课的成绩，编写程序实现：
//  1、 语文、数学、英语的分数之和
//  2、 3门课的平均分
//  3、 语文比数学高多少分

import java.util.Scanner;

public class AfterClassWork {
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		System.out.println("请输入语文成绩：");
		int chineseS = st.nextInt();
		System.out.println("请输入数学成绩：");
		int mathS = st.nextInt();
		System.out.println("请输入英语成绩：");
		int englishS = st.nextInt();
		int scoreSum = chineseS + mathS + englishS;		//成绩之和
		float averge = scoreSum / 3;		//成绩平均分
		System.out.println("3门课的成绩之和是 " + (chineseS + mathS + englishS) + "分。");
		System.out.println("3门课的成绩之和是 " + scoreSum + "分。");
		System.out.println("3门课的平均分是 " + averge);
		if (chineseS >= mathS)
			System.out.println("语文成绩比数学成绩高 " + (chineseS - mathS) + "分。");
		else
			System.out.println("语文成绩没有数学成绩高！");
	}
}
