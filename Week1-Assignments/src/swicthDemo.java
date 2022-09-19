
public class swicthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("You passed with grade "+grade);
		break;
		case 'B':
			System.out.println("You passed with grade "+grade);
		break;
		case 'C':
			System.out.println("You passed with grade "+grade);
		break;
		case 'D':
			System.out.println("You passed with grade "+grade);
		break;
		case 'F':
			System.out.println("You did not pass with grade "+grade);
		break;
		default:
			System.out.println("Invalid grade");
		break;
		}
	}

}
