package AbstractDesignPattern;

public class TesteFactory implements   EmployeFactory{
   @Override
    public Employee  get(String type){
            if(type.equals("Tester1")){
                return new Tester1();
            }
            else if(type.equals("Tester2")){
                return new Tester2();
            }
            return null;
        }
    
}
