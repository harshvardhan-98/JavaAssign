package allQuestions;
//Q15. WAP to create a singleton class.
public class Question_15 {
    private static Question_15 single_instance = null;
    public String s;

    private Question_15()
    {
        s = "Hello I am a string part of Singleton class";
    }

    public static Question_15 getInstance()
    {
        if (single_instance == null)
            single_instance = new Question_15();

        return single_instance;
    }
}

class Ans {
    public static void main(String args[])
    {
        // Instantiating Singleton class with variable x
        Question_15 x = Question_15.getInstance();

        // Instantiating Singleton class with variable y
        Question_15 y = Question_15.getInstance();

        // Instantiating Singleton class with variable z
        Question_15 z = Question_15.getInstance();

        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());

        // Condition check
        if (x == y && y == z) {

            // Print statement
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        }

        else {
            // Print statement
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }
    }
}