package com.xwork.math;
//Count the Number of Vowels, Consonants, Digits, and Whitespaces in a String
public class CharacterCounter {
    public static void main(String[] args) {
        String input ="this is mahesh A V 2003";
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int whitespaces = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= '0' && ch <= '9'){
                digits++;
            } 
            else if (ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r') {
                whitespaces++;
            }
            else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (ch =='a' || ch == 'e'||ch=='i' || ch=='o' || ch=='u'|| ch =='A' || ch == 'E'||ch=='I' || ch=='O' || ch=='U')
                {
                    vowels++;
                }

                else  {
                 consonants++;
                }

            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Whitespaces: " + whitespaces);
        }

    }
