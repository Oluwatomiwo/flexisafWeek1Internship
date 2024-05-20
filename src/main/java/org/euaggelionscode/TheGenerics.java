package org.euaggelionscode;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class TheGenerics {


    public static <T> int countElementsWithProperty(Collection<T> collection, Predicate<T> propertyCheck) {
        int count = 0;
        for (T element : collection) {
            if (propertyCheck.test(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int oddCount = countElementsWithProperty(numbers, n -> n % 2 != 0);
        System.out.println("Number of odd integers: " + oddCount);

        int primeCount = countElementsWithProperty(numbers, n -> Prime(n));
        System.out.println("Number of prime numbers: " + primeCount);

        Collection<String> words = List.of("level", "java", "radar", "programming", "madam");
        int palindromeCount = countElementsWithProperty(words, s -> Palindrome(s));
        System.out.println("Number of palindromes: " + palindromeCount);
    }

    public static boolean Prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean Palindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

