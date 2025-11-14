package Week3.Day1;

	// Given a list:
	// List<Integer> nums = Arrays.asList(3, 10, 15, 8, 21, 14, 7);
	// Task
	// Functional Interface
	// 	Create a functional interface: NumberRule with method: boolean apply(int n);
	// Lambda
	// 	Define two rules using lambda: isEven → returns true if number is even, 
	// 					       isPrime → returns true if number is prime
	// Stream Operations
	// 	Using streams and your lambda rules: 
	// 	Filter numbers that are both even AND prime , Square each filtered number,Collect results into a list
	// Optional
	// 	Get the first squared number from the result list using Optional, 
	// 	Print the value if present,Else print: "No matching number found"

import java.util.*;
import java.util.stream.Collectors;

// Functional Interface
@FunctionalInterface
interface NumberRule {
    boolean apply(int n);
}

public class EvenPrime {
    public static void main(String[] args) {

        // Given a list:
        List<Integer> nums = Arrays.asList(3, 10, 15, 8, 21, 14, 7, 2, 11, 4);

        // Lambda
        NumberRule isEven = (n) -> n % 2 == 0;

        NumberRule isPrime = (n) -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        // Stream Operations
        List<Integer> result = nums.stream()
                .filter(n -> isEven.apply(n) && isPrime.apply(n))
                .map(n -> n * n)
                .collect(Collectors.toList());

        // Optional
        Optional<Integer> firstValue = result.stream().findFirst();

        firstValue.ifPresentOrElse(
                v -> System.out.println("First squared number: " + v),
                () -> System.out.println("No matching number found")
        );
    }
}

