package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class PalindromesTest {

  @ParameterizedTest
  @CsvFileSource(resources = "/positive.csv")
  void isPalindrome_affirmative(String testCase) {
    assertTrue(Palindromes.isPalindrome(testCase));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/negative.csv")
  void isPalindromeNegative(String testCase) {
    assertFalse(Palindromes.isPalindrome(testCase));
  }
}
