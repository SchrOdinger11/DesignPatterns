package AbstractDesignPattern;



public class AbstractFactory {
    EmployeFactory obj;
    AbstractFactory(){
        obj=null;
    }
    public EmployeFactory getFactory(String factory){
        if(factory.equals("DeveloperFactory")){
            obj=new DeveloperFactory();
        }
        else if(factory.equals("TesterFactory")){
            obj=new TesteFactory();
        }
        return obj;
    }
    
}
