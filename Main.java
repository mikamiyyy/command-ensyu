import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("身長：");
		double height = sc.nextDouble();
		System.out.print("体重：");
		double weight = sc.nextDouble();
		double bmi = weight/Math.pow((height/100), 2);
		System.out.println("BMIは"+Math.floor(bmi*100)/100+"です");
		sc.close();
	}
}
