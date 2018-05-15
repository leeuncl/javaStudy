import java.lang.Math;

class Student {
	private String sno;			//学号
	private String sname;		//姓名
	private int mathScore;
	private int englishScore;
	private int computerScore;

	public void setSno(String sno) {
		this.sno = sno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setMathScore (int mathScore) {
		this.mathScore = mathScore;
	}
	public void setEnglishScore (int englishScore) {
		this.englishScore = englishScore;
	}
	public void setComputerScore (int computerScore) {
		this.computerScore = computerScore;
	}

	private int sum (int mathScore, int englishScore, int computerScore) {		//总分
		return (this.mathScore + this.englishScore + this.computerScore);
	}
	private int avg(int mathScore, int englishScore, int computerScore) {		//平均分
		return ((this.mathScore + this.englishScore + this.computerScore) / 3);
	}
	private int max(int mathScore, int englishScore, int computerScore) {		//最高分
		int max = (this.mathScore > this.englishScore) ? this.mathScore : this.englishScore;
		max = (max > this.computerScore) ? max : this.computerScore;
		return max;
	}
	private int min(int mathScore, int englishScore, int computerScore) {		//最低分
		int min = (this.mathScore < this.englishScore) ? this.mathScore : this.englishScore;
		min = (min < this.computerScore) ? min : this.computerScore;
		return min;
	}


	public int sumScore () {		//总分
		return sum(this.mathScore, this.englishScore, this.computerScore);
	}
	public int avgScore () {		//平均分
		return avg(this.mathScore, this.englishScore, this.computerScore);
	}
	public int maxScore () {		//最高分
		return max(this.mathScore, this.englishScore, this.computerScore);
	}
	public int minScore () {
		return min(this.mathScore, this.englishScore, this.computerScore);
	}
}

public class Test {
	public static void main(String args[]) {
		Student zhangsan = new Student();
		zhangsan.setMathScore(120);
		zhangsan.setEnglishScore(90);
		zhangsan.setComputerScore(80);
		System.out.println("总分是" + zhangsan.sumScore());
		System.out.println("平均分是" + zhangsan.avgScore());
		System.out.println("最高分是" + zhangsan.maxScore());
		System.out.println("最低分是" + zhangsan.minScore());
	}
}