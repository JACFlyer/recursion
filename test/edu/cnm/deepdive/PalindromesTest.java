package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromesTest {

  static final String[] positiveTestData = {
      "racecar",
      "Race car",
      "radar",
      "",
      "x",
      "Xx",
      "A man, a plan, a canal - Panama",
  };

  static final String[] negativeTestData = {
      "xy",
      "sonar",
      "Madame I'm Adam",
      "Burrito dog",
  };

  @Test
  void isPalindrome() {
    for (String testCase  : positiveTestData) {
      assertTrue(Palindromes.isPalindrome(testCase));
    }
    for (String testCase : negativeTestData) {
      assertFalse(Palindromes.isPalindrome(testCase));
    }
  }
}