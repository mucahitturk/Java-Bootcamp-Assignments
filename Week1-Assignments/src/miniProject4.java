
public class miniProject4 {
	public static void main(String[] args) {
		int total1= 0,total2 = 0;
		int number1 = 284,number2 = 220;
		for (int i = 1; i <= number1/2; i++) {
			if(number1 % i == 0 ){
				total1 += i;
			}
		}
		for (int i = 1; i <= number2/2; i++) {
			if(number2 % i == 0 ){
				total2 += i;
			}
		}
		if(number1 == total2 && number2 == total1) {
			System.out.println("These number are friends number");
		}else {
			System.out.println("These number are not friends number");
		}
			
	}
}
