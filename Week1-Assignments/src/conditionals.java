
public class conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double examAverage = 56.8;
		if(examAverage > 80 && examAverage <= 100 ) {
			System.out.println("You passed with an AA degree.");
		}
		else if(examAverage > 50 && examAverage <= 80) {
			System.out.println("You passed with an BB degree.");
		}
		else if(examAverage >= 0 && examAverage <= 50) {
			System.out.println("You did not pass so your grade is FF");
		}
		else {
			System.out.println("Invalid Note");
		}
	}

}
