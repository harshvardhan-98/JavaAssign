package allQuestions.Question8;

class StaticBlock {
    static int age;
    static String firstName, lastName;

    static {
        age=22;
        firstName="Harsh";
        lastName="Vardhan";
    }
}
class Sol{
    public static void main(String[] args) {
        System.out.println("Age: "+ StaticBlock.age);
        System.out.println("First Name: "+ StaticBlock.firstName);
        System.out.println("Last Name: "+ StaticBlock.lastName);
    }
}
