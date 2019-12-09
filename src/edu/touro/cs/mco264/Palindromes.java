package edu.touro.cs.mco264;


import java.util.ArrayList;

public class Palindromes {

    public boolean isPalindrome(String s) { // Tests to see if String is a palindrome or not

        for (int i = 0; i < s.length()/2; i++)
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        return true;
    }

    public ArrayList<String> allPalindromeStrings(String s) { // Returns an Array List of all palindromes found within String
        boolean keepGoing = true;
        ArrayList<String> paliList = new ArrayList<String>();
        int iterator = 1;

        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                paliList.add(s.substring(i,i+2));
                keepGoing = true;
                iterator = 1;
                while (keepGoing && (i - iterator >= 0) && i + 1 +iterator <= s.length() - 1)  {
                    if (s.charAt(i - iterator) == s.charAt(i + 1 +iterator)) {
                        paliList.add(s.substring(i-iterator,i + 2 + iterator));
                        iterator++;
                    } else {
                        keepGoing = false;
                    }
                }
            }
            else if (s.charAt(i) == s.charAt(i + 2)) {
                paliList.add(s.substring(i,i+3));
                keepGoing = true;
                iterator = 1;
                while (keepGoing && (i - iterator >= 0) && i + 2 +iterator <= s.length() - 1) {
                    if (s.charAt(i - iterator) == s.charAt(i + 2 + iterator)) {
                        paliList.add(s.substring(i - iterator, i + 3 + iterator));
                        iterator++;
                    } else {
                        keepGoing = false;
                    }
                }
            }
        }if ((s.charAt(s.length() -2) == (s.charAt(s.length() -1)))){
            paliList.add(s.substring(s.length() -2, s.length()  ));
        }
        return paliList;
    }
}

