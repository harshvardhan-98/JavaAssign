package allQuestions;

//Q1.Write a Java program to return true if a given string contain the string 'pop',
// but the middle 'o' also may other character.

import java.util.Scanner;

public class Question1 {
    public boolean checkString(String s)
    {
        int len = s.length();
        for (int i = 0; i < len - 2; i++)
        {
            if (s.charAt(i) == 'p' && s.charAt(i+2) == 'p')
                return true;
        }
        return false;
    }
    public static void main (String[] args)
    {
        Question1 question1= new Question1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str1 =  sc.nextLine();
        System.out.println("The given string is: "+str1);
        System.out.println("Is pop/p*p appear in the given string? "+question1.checkString(str1));
    }
}
