
public class arrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] courses = new String[10];
		courses[0] = "Turkish";
		courses[1] = "English";
		courses[2] = "Calculus";
		courses[3] = "Electronic";
		for (int i = 0; i < courses.length; i++) {
			if(courses[i] != null )
			{
				System.out.println("course  "+i+" "+courses[i]);	
			}	
		}
	}

}
