import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�g���F");
		double height = sc.nextDouble();
		System.out.print("�̏d�F");
		double weight = sc.nextDouble();
		double bmi = weight/Math.pow((height/100), 2);
		System.out.println("BMI��"+Math.floor(bmi*100)/100+"�ł�");
		sc.close();
	}
}
