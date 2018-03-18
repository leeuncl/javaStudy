//AfterClassWork
//从控制台输入学员李明3门课的成绩，编写程序实现：
//	1、 语文、数学、英语的分数之和
//  2、 3门课的平均分
//  3、 语文比数学高多少分

public class AfterClassWork2{
	public static void main(String args[]){
		int chineseS, mathS, englishS, scoreSum;
		chineseS = 90;
		mathS = 99;
		englishS = 100;
		scoreSum = chineseS + mathS + englishS;
		System.out.println("The sum score is:" + scoreSum);
		float average = scoreSum / 3;
		System.out.println("The average is:" + average);
		if (chineseS >= mathS)
			System.out.println("chineseScore is more" + (chineseS - mathS) + "than mathScore");
		else
			System.out.println("chineseScore isn't higher than mathScore");
	}
}
