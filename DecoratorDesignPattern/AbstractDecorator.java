package DecoratorDesignPattern;

public class AbstractDecorator implements Coffee{
    Coffee coffee;
    public AbstractDecorator(Coffee coffee){
        this.coffee=coffee;
    }
    @Override
    public void getContents() {
       coffee.getContents();
    }
}
