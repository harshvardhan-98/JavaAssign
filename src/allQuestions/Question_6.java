package allQuestions;
//Q6. Write a program to find the number of occurrences of the duplicate words in a string and print them?

public class Question_6 {
        public static void main(String[] args) {
            String str = "hi, this is Harsh, this is java code, this is assignment";
            int count;
            String dupli = "";
            String[] words = str.toLowerCase().trim().split(" ");
            for (int i = 0; i < words.length; i++) {
                count = 1;
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                    }
                }
                if (count > 1) {
                    if (dupli.isEmpty()) {
                        dupli += " " + words[i] + " : " + count;
                    }
                    else if (!dupli.matches("(.*) " + words[i] + " (.*)")) {
                        dupli += " " + words[i] + " : " + count;
                    }
                }
            }
            System.out.println(dupli);
        }
}