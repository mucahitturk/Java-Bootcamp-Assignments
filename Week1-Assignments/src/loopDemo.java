
public class loopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < data.length; i++) {
			System.out.println("index of:"+i+" data is "+data[i]);
		}
		System.out.println("the end of for loop");
		int i = 0;
		while(i<10) {
			System.out.println("index of:"+i+" data is "+data[i]);
			i++;
		}
		System.out.println("the end of while loop");
		int j = 0;
		do{
			System.out.println("index of:"+j+" data is "+data[j]);
			j++;;
		}while(j<10);
		
		System.out.println("the end of do while loop");
			
		
	}

}
