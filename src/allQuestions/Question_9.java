package allQuestions;
//Create 3 subclasses of bank SBI, BOI, ICICI all 4 should have a method called get details
// which provide there specific details like rate of interest etc, print details of every bank.
import com.sun.org.apache.xml.internal.serialize.Printer;

import java.io.*;
import java.util.Scanner;

class SBI extends Bank{
    public String name;
    public String branch;
    public double roi;
    SBI(String name, String branch, double roi){
        this.name=name;
        this.branch=branch;
        this.roi=roi;
    }

    @Override
    public void getDetails() {
        System.out.println("Bank Name: "+name+"\nBranch: "+branch+"\nRate of Interest: "+roi);
    }
}

class BOI extends Bank{
    BOI(String name, String branch, double roi){
        this.name=name;
        this.branch=branch;
        this.roi=roi;
    }

    public String name;
    public String branch;
    public double roi;

    @Override
    public void getDetails() {
        System.out.println("Bank Name: "+name+"\nBranch: "+branch+"\nRate of Interest: "+roi);
    }
}

class  ICICI extends Bank{
    ICICI(String name, String branch, double roi){
        this.name=name;
        this.branch=branch;
        this.roi=roi;
    }

    public String name;
    public String branch;
    public double roi;

    @Override
    public void getDetails() {
        System.out.println("Bank Name: "+name+"\nBranch: "+branch+"\nRate of Interest: "+roi);
    }
}


class Question_9{
    public static void main(String[] args) {
        Bank sbi = new SBI("State Bank Of India", "Hapur", 12.0);
        Bank boi = new SBI("Bank Of India", "Hapur", 13.0);
        Bank icici = new SBI("ICICI Bank", "Hapur", 11.5);
        sbi.getDetails();
        boi.getDetails();
        icici.getDetails();
    }
}