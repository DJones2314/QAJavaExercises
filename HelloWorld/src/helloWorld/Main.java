/**
 * 
 */
package helloWorld;

/**
 * @author Admin
 *
 */
public class Main {
		public static void main(String[] args) {
		
			//System.out.println("Hello World!");
			
			//String hello = "Hello";
			//String world = "World";
			
			//System.out.println(hello + " " + world + "!");
			
			//hi("Dave");
			
			//System.out.println(greeting("Luke"));
			
			for(int i = 0; i < 11; i++) {
			System.out.println(sumOfInts(i, 12, false));
			};
			
			int testArray[] = {2, 23, 56, 8, 425, 8, 46, 258, 986, 125};
			
			System.out.println("An array that passes values " + sumOfInts(testArray[0], testArray[2], false));
			
			System.out.println(testArray[2]);
			
			for(int i = 0; i<testArray.length; i++) {
				System.out.println("Iterating through gives me " + testArray[i]);
			}
			
			int itterationArray[] = {};
			for(int i = 0; i < 7; i++) {
				
			}
			
			/*int[] newArray = new int[10];
			for(int i = 0; i < 7; i++) {
				newArray[i] = i + 1;
			}
			System.out.println("my new array is" + newArray);*/
			
			
			
			
		}
		
		public static void hi(String name) {
			System.out.println("Hello " + name);
		}
		
		public static String greeting(String alias) {
			
			String message = "Hello " + alias;
			return message;
			
		}
		
		public static int sumOfInts(int one, int two, boolean addOrMulty) {
			
			int sumOfBoth = 0;
			if(one==0 || two==0) {
				sumOfBoth = one + two;
			} else if(addOrMulty) {
			sumOfBoth = one + two;
			} else {
			sumOfBoth = one * two;
			}
		
			return sumOfBoth;
		}
		
	
}
