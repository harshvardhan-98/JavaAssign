package allQuestions;

import java.util.*;


public class Question_21 {

    int empid;
    String name;
    float salary;

    public void getInput() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the empid :: ");
        empid = in.nextInt();
        System.out.print("Enter the name :: ");
        name = in.next();
        System.out.print("Enter the salary :: ");
        salary = in.nextFloat();
    }

    public void display() {

        System.out.println("Employee id = " + empid);
        System.out.println("Employee name = " + name);
        System.out.println("Employee salary = " + salary);
    }

    public static void main(String[] args) {

        Question_21[] e = new Question_21[5];
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no of employees in Company: ");
        int n=sc.nextInt();
        for(int i=0; i<n; i++) {

            e[i] = new Question_21();
            e[i].getInput();
        }

        System.out.println("**** Details of Employees are: ****");

        for(int i=0; i<5; i++) {

            e[i].display();
        }
    }
}
