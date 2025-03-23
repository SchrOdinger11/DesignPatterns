package SingletonPattern;
class Main {
    public static void main(String[] args) {
        SingletonObj obj1 = SingletonObj.getInstance();
        SingletonObj obj2 = SingletonObj.getInstance();
        System.out.println(obj1 == obj2);
    }
}
