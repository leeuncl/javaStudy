/*
	date : 2018-3-24
	obj : the sum of odd number among 1~100 and the count of odd number
*/

public class AfterClassWork_oddNumber{
	public static void main(String[] args) {		//main
		int sum = 0, count = 0;		//define the sum and count
		/*for (int i = 1; i < 100; i++){	//for loop and if judge the number if odd or not
			if (i % 2 == 0)
				continue;
			else{
				sum += i;
				count++;
			}
		}*/

		for (int i = 1; i < 100; i += 2) {		//for loop
			sum += i;
			count++;
		}

		/*int i = 1;
		while (i < 100) {		//while loop
			sum += i;
			i += 2;
			count++;
		}*/

		/*int i = 1;
		do {				//do--while loop
			sum += i;
			i += 2;
			count++;
		} while (i < 100);*/

		System.out.println("The sum is :" + sum + "\n" + "The count of odd nubmer is :" + count);
	}
}