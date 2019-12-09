package edu.touro.cs.mco264;

import org.w3c.dom.ls.LSOutput;

import static org.junit.jupiter.api.Assertions.*;

class PalindromesTest {

    @org.junit.jupiter.api.Test
    void isPalindromeTest() {
        Palindromes pali = new Palindromes();
         String sample = "rar";
         assertTrue(pali.isPalindrome(sample));
    }


    @org.junit.jupiter.api.Test
    void allPalindromeStrings() {
        Palindromes pali = new Palindromes();
        String test = "abbmomracecar";
        System.out.println(pali.allPalindromeStrings(test));
        String result = pali.allPalindromeStrings(test).toString();
        assertEquals("[bb, mom, cec, aceca, racecar]",result );
    }
}