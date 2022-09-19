
public class recapDemo2 {
	public static void main(String[] args) {
		double[] myList = {1.1,1.2,1.3,1.4};
		double totalValue = 0;
		double maxValue = 0;
		for (int i = 0; i < myList.length; i++) {
			if(maxValue < myList[i]) {
				maxValue = myList[i];
			}
			totalValue +=  myList[i];
		}
		System.out.println("total value of array:"+totalValue);
		System.out.println("max value of array:"+maxValue);
		
	}
}
