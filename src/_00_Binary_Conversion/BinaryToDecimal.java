package _00_Binary_Conversion;

import javax.swing.JOptionPane;

public class BinaryToDecimal {
	public static void main(String[] args) {
		String bn = JOptionPane.showInputDialog(null, "Enter the number in binary form.");
		System.out.println("0b" + bn);
		/*To convert binary to decimal, use the following algorithm:
			1. Start from the right most digit of the binary number and assign that bit the value of 1.
		 	 	eg: 0	1	0	1	1	0
		                      			1 
			2. As you move to the left, assign the next digit a value that is double the previous digit.
				eg: 0	1	0	1	1	0
				    32	16	8	4	2	1
				    
			3. For every 1 in the binary number, add all of the corresponding values together.
				eg: 0	1	0	1	1	0
				    32	16	8	4	2	1
				    
				    16 + 4 + 2 = 22
				    010110 in binary is equal to 22 in decimal!
		 
		 */
		int dval = 1;
		int total = 0;
		for (int i = bn.length() - 1; i >= 0; i--) {
			if (bn.charAt(i) == '1') {
				total += dval;
			}
			dval = dval * 2;
		}
		System.out.println(total);
	}
}
