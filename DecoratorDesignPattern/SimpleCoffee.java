package DecoratorDesignPattern;

public class SimpleCoffee  implements Coffee{
    @Override
    public void getContents() {
        System.out.print(" Made Simple Coffee ");
    }
    
}
