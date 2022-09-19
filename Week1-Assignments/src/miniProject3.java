import java.util.Iterator;

public class miniProject3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int number = 28;
		for (int i = 1; i <= number/2; i++) {
			if(number % i == 0 ){
				total += i;
			}
		}
		if (total == number) {
			System.out.println(number+" is perfect number");
		} else {
			System.out.println(number+" is not perfect number");
		}
	}
}
