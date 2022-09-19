
public class miniProject5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numberList = new int[] {1,2,3,4,5,6,7,8,9};
		int searchedNumber = 5;
		boolean isFind = false;
		for (int i = 0; i < numberList.length; i++) {
			if(numberList[i] == searchedNumber) {
				isFind = true;
				break;
			}
		}
		if (isFind) {
			System.out.println(searchedNumber+" is founded in the list");
		} else {
			System.out.println(searchedNumber+" is not founded in the list");
		}
	}

}
