package AbstractDesignPattern;

public class DeveloperFactory implements EmployeFactory {
   @Override
    public Employee get(String type) {
        if(type.equals("Developer1")){
            return new Developer1();
        }
        else if(type.equals("Developer2")){
            return new Developer2();
        }
        return null;
    }
    
}
