package allAdvanceQuestion;
import java.io.*;
import java.util.*;
public class Employee {

    private Integer empID ;
    private String empName ;
    private String empCity ;


    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }


    public Employee() {
    }

    public static void main(String[] args) {
        try {
            ArrayList<Employee> empList = new ArrayList<>() ;
            File file = new File ( "/home/knoldus/Assignments/src/12.rtf") ;

            if ( file.exists() )
            {
                Scanner inFile = new Scanner( file );
                inFile.useDelimiter("[;]");
                while ( inFile.hasNext() )
                {
                    String line = inFile.next() ;
                    line = line.trim().replaceAll("\n", "");
                    line = line.trim().replaceAll("\t", "");
                    line = line.trim().replaceAll(" ", "");
                    if ( line.length() > 0 ) {
                        String delims = "[,]+";
                        String[] tokens = line.split(delims);
                        Employee emp = new Employee() ;
                        emp.setEmpID(Integer.parseInt(tokens[0]));
                        emp.setEmpName(tokens[1]);
                        emp.setEmpCity(tokens[2]);

                        empList.add(emp) ;
                    }
                }

                inFile.close();

            }
            else {
                System.out.println( "File Not Found");
            }
            int rec = 0 ;
            for (Employee employee : empList) {
                System.out.println( "Employee-"+ ++rec +":");
                System.out.println( "ID = " + employee.getEmpID());
                System.out.println( "Name = " + employee.getEmpName());
                System.out.println( "City = " + employee.getEmpCity());
            }
        }
        catch ( FileNotFoundException e) {
            System.out.println( "File Not Found Exception");
        }

    }

}