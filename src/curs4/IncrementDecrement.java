package curs4;
/*
 * operator unar --> un operand  >> numar++
 * operatori binari --> doi operanzi >> numar1 + numar2
 * operatorul ternar --> trei operanzi
 */


public class IncrementDecrement {

	public static void main(String[] args) {

		// num++   --> POST increment
		// ++num   --> PRE increment
		// num--   --> POST decrement
		// --num   --> PRE decrement
		
		// num++  ==  num = num +1   ==  num += 1
		int num = 10;
		System.out.println("Numar :" + num);
		System.out.println("Numar POST increment :" + num++);
		System.out.println("Numar :" + num);
		System.out.println("-----------------------------------");
		int num2 = 10;
		System.out.println("Numar :" + num2);
		System.out.println("Numar PRE increment :" + ++num2);
		System.out.println("Numar :" + num2);
	
	
	}

}