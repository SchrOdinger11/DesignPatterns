package DecoratorDesignPattern;

public class AddMilkDecorator extends AbstractDecorator{
    public AddMilkDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public void getContents() {
        super.getContents();
        System.out.print(" Added Milk");
    }
    
}
