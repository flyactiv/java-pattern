package pr5;

public class Main {
    public static void main(String[] args) {
        System.out.println(ThirdSingleton.getInstance());
        System.out.println(FirstSingleton.getInstance());
        System.out.println(SecondSingleton.getInstance());
    }
}
