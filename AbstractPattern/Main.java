package AbstractPattern;

import java.util.*;

public class Main {
    public static void main(String[] args){
        EmployeeFactory emp= new EmployeeFactory();
        System.out.println("Enter the employee type:");
        Scanner sc= new Scanner(System.in);
        String empType= sc.nextLine();
        if(empType.equals("CEO") || empType.equals("CTO")){
            Employee e= emp.getEmployee(empType);
            e.salary();
        }
        else{
            System.out.println("Invalid Employee type");
        }
      
    }

}
