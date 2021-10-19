package allQuestions.Question_16;

public class UsingCopy
{
    private double Salary;
    private String Name;

    UsingCopy(double salary, String Name)
    {
        Salary = salary;
        this.Name = Name;
    }
    //creating a copy constructor
    UsingCopy(UsingCopy ob)
    {
        System.out.println("\nAfter invoking the Copy Constructor:\n");
        Salary = ob.Salary;
        Name = ob.Name;
    }
    //creating a method that returns the salary of the employee
    double showSalary()
    {
        return Salary;
    }
    //creating a method that returns the name of the employee
    String showName()
    {
        return Name;
    }
    //class to create employee object and print salary and name of the employee
    public static void main(String[] args)
    {
        UsingCopy f1 = new UsingCopy(15000, "Harsh Vardhan");
        System.out.println("Name of the first employee: "+ f1.showName());
        System.out.println("Salary of the first employee: "+ f1.showSalary());
//passing the parameters to the copy constructor
        UsingCopy f2 = new UsingCopy(f1);
        System.out.println("Name of the second employee: "+ f2.showName());
        System.out.println("Salary of the second employee: "+ f2.showSalary());
    }
}
