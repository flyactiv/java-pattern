package pr5;

public class FirstSingleton {
    public static final FirstSingleton INSTANCE = new FirstSingleton();

    private FirstSingleton(){};

    public static FirstSingleton getInstance(){
        return INSTANCE;
    }
}
