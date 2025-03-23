package AbstractPattern;

public class EmployeeFactory {
    Employee obj;
    EmployeeFactory(){
        obj = null;
    }
    public Employee getEmployee(String emp){
        if(emp.equals("CEO")){
            obj = new EmployeeCEO();
        }
        else if(emp.equals("CTO")){
            obj = new EmployeeCTO();
        }
        return obj;
    }

}
