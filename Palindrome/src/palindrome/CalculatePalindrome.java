package palindrome;

import java.util.ArrayList;
import java.util.List;

public class CalculatePalindrome {
	
	public int largestThreeDigitPaldindromeProduct() {
		int maxPalindrome = 0;
		for(int number1 = 999; number1 >= 100; number1--) {
			for(int number2 = number1; number2 >= 100; number2--) {
				int result = calculatePalandrome(number1*number2);
				if (maxPalindrome < result) {
					maxPalindrome = result;
				}
			}
		}
		
		return maxPalindrome;
	}
	
	public int calculatePalandrome(int number){
		List<Integer> digits = new ArrayList<>();
		int result = number;
		while (number > 0) {
			digits.add(number % 10);
			number = number / 10;
		}
		// 50105
		// 210012
		
		// even number of digits
		if(digits.size() % 2 == 0) {
			for(int i = digits.size() - 1, j = 0; i > digits.size()/2 - 1; i--, j++) {
				if(digits.get(i) != digits.get(j)) {
					System.out.println(digits.get(i)+", "+digits.get(j));
					return 0;
				}
			}
		} else {
			for(int i = digits.size() - 1, j = 0; i > digits.size()/2; i--, j++) {
				System.out.println(digits.get(i)+", "+digits.get(j));
				if(digits.get(i) != digits.get(j)) {
					return 0;
				}
			}
		}
		
		return result;
	}

}
