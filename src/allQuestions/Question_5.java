package allQuestions;
// factorial of a number
import java.util.*;

public class Question_5 {
    static int firstFactorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * firstFactorial(n-1));
    }
    public static void main(String[] args){
        int fact;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number=sc.nextInt();
        fact = firstFactorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
