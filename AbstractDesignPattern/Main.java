package AbstractDesignPattern;

 class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        AbstractFactory factory= new AbstractFactory();
        Employee emp1=factory.getFactory("DeveloperFactory").get("Developer1");
        emp1.salary();
        Employee emp2=factory.getFactory("TesterFactory").get("Tester2");
        emp2.salary();

    }
}
