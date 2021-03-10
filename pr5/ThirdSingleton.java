package pr5;

public class ThirdSingleton {
    private static ThirdSingleton instance;
    public void print(){
        System.out.println("First");
    }

    public static synchronized ThirdSingleton getInstance() {
        if (instance == null) {
            instance = new ThirdSingleton();
            return instance;
        }
        return instance;
    }
}
