package DecoratorDesignPattern;

public class AddSugarDecorator extends AbstractDecorator{
    public AddSugarDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public void getContents() {
        super.getContents();
        System.out.print(" Added Sugar");
    }
    
}
