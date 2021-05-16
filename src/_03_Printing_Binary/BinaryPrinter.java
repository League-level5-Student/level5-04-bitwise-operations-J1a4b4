package _03_Printing_Binary;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */

	
	public static void printByteBinary(byte b) {
		// We first want to print the bit in the one's place
		for (int i = 0; i < 8; i++) {
			// Shift b seven bits to the right
			byte b1 = (byte) (b >> 7 - i);
			// Use the & operator to "mask" the bit in the one's place
			// This can be done by "anding" (&) it with the value of 1
			b1 = (byte) (b1 & 1);
			// Print the result using System.out.print (NOT System.out.println)
			System.out.print(b1);
			//Use this method to print the remaining 7 bits of b
		}
	}
	
	public static void printShortBinary(short s) {
		// Create 2 byte variables
		byte a = 0;
		byte b = 0;
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		a = (byte) (s >> 8);
		b = (byte) (s);
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
		printByteBinary(a);
		printByteBinary(b);
	}
	
	public static void printIntBinary(int i) {
		// Create 2 short variables
		short a = 0;
		short b = 0;
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		a = (short) (i >> 16);
		b = (short) (i);
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
		printShortBinary(a);
		printShortBinary(b);
	}
	
	public static void printLongBinary(long l) {
		// Use the same method as before to complete this method
		int a = 0;
		int b = 0;
		a = (int)(l >> 32);
		b = (int)(l);
		printIntBinary(a);
		printIntBinary(b);
	}
	
	public static void main(String[] args) {
		// Test your methods here
		printByteBinary((byte) 42);
		System.out.println();
		printShortBinary((short) 46250);
		System.out.println();
		printIntBinary(2033700005);
		System.out.println();
		printLongBinary(1135900095979965605l);
	}
}
