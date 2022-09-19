
public class stringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString = "Today is a good day.";
		System.out.println(testString);
		System.out.println("total size:"+testString.length());
		System.out.println("Fifth: "+testString.charAt(4));
		System.out.println(testString.concat("At the end."));
		System.out.println(testString.startsWith("T"));
		System.out.println(testString.endsWith("."));
		char[] characters = new char[5];
		testString.getChars(0, 5, characters, 0);
		System.out.println(characters);
		System.out.println(testString.indexOf('a'));
		System.out.println(testString.lastIndexOf('.'));
		
		System.out.println(testString.replace(' ', '-'));
		System.out.println(testString.substring(2));
		System.out.println(testString.substring(2, 17));
		
		for(String word:testString.split(" ")) {
			System.out.println(word);
		}
		System.out.println(testString.toLowerCase());
		System.out.println(testString.toUpperCase());
		System.out.println(testString.trim());
	}

}
