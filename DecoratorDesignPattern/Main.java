package DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
    Coffee coffee= new SimpleCoffee();
    coffee.getContents();

    coffee=new AddMilkDecorator(coffee);
    coffee.getContents();

    coffee = new AddSugarDecorator(coffee);
    coffee.getContents();
    }

}
