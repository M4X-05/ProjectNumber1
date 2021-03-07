package com.company;

import java.util.Arrays;

public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s) {
        int answer = 0;
        //Creating an Array called Vowels
        String[] vowels = {"a", "e", "i", "o", "u"};
        //A loop to find all the vowels in a given sequence of letters
        for (int i = 0; i < s.length(); i++) {
            String j = s.substring(i, i + 1);
            for (int n = 0; n < vowels.length; n++) {
                if (j.equals(vowels[n])) {
                    //When a vowel is found, it is added to the counter
                    answer++;
                }

            }
        }
        return answer;
    }

    //Code you problem number two here
    static int problemTwo(String s) {
        int answer = 0;
        //Creating an Array called name
        String[] name = {"bob"};
        //A loop to find the name in a given sequence of letters
        for (int i = 0; i < s.length() - 2; i++) {
            //This searches for the word bob
            String bobSearch = s.substring(i, i + 3);
            {
                if (bobSearch.equals(name[0])) {
                    //When a bob is found then it is added to the counter
                    answer++;
                }
            }
        }
        return answer;
    }


    //Code your solution to problem number 3 here
    static String problemThree(String s) {

        //Creating a string called alphalong that tracks the length of characters in string s in alphabetical order
        //Sets alphalong as blank
        String alphalong = "";
        //Creating a string called alphalonger as a temporary holder for the longest string in alphabetical order
        //Sets alphalonger as blank
        String alphalonger = "";
        //Creating a string called alphalongest that is the longest string of characters in alphabetical order
        //Sets the alphalongest to the first character in string s
        String alphalongest = s.substring(0,1);

        //A loop that compares 2 consecutive characters to check if they are in alphabetical order
        for (int i = 0; i < s.length()-1; i++) {

            //grabs a character in string s
            String a1 = s.substring(i, i + 1);
            //grabs the character beside "a1" in string s
            String b2 = s.substring(i + 1, i + 2);
            //Compares a1 and b2 lexicographically
            int compare = a1.compareTo(b2);
            //If statement that determines if compare is less then zero then "a1" and "b2" are in alphabetical order
            if (compare <= 0) {
                //if alphabetical then add the character to alphalong
                alphalong = alphalong + a1;
                //if the end of the string is reached and still in alphabetical order then add the last character to alphalong
                if (i == s.length()-2) {
                    alphalong = alphalong + b2;
                }
                //Checks length of current set of alphabetical string to the temp string
                if (alphalong.length() > alphalonger.length()) {
                    alphalonger = alphalong;
                    //Checks length of the temp string to the longest string
                    if (alphalonger.length() > alphalongest.length()) {
                        alphalongest = alphalonger;}
                }
            }
            //Once alphabetical order is broken then the temp string is compared with the current longest string
            //If the current one is longer, it becomes the longest one and alphalong and alphalonger are reset
            else {
                alphalonger = alphalong + a1;
                if (alphalonger.length() > alphalongest.length()) {
                    alphalongest = alphalonger;
                }
                alphalong = "";
                alphalonger = "";
            }
        }
        //sets s to alphalongest and returned to main
        s = alphalongest;
        return s;
    }

    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        int answer;
        String s = "abcdagbobhiacdopa";

        //prints out the input and the answers to all 3 problems
        System.out.println("input: " + s);
        System.out.println("Number of vowels: " + problemOne(s));
        System.out.println("Number of times bob occurs: " + problemTwo(s));
        System.out.println("Longest substring in alphabetical order is: " + problemThree(s));
    }
}

