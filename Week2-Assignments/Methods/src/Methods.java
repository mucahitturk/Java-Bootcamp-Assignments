
public class Methods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printHello();
		System.out.println(add(10, 20));
		int []numbers= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(addArray(numbers));
	}
	public static void printHello() {
		System.out.println("Hello World!");
	}
	public static int add(int number1,int number2) {
		return number1+number2;
	}
	public static int addArray(int... numbers) {
		int result = 0;
		for (int number : numbers) {
			result +=number;
		}
		return result;
	}
}
