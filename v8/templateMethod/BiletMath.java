package pr8.v8.templateMethod;

public class BiletMath extends BiletTemplate{
    public BiletMath(String name, int number) {
        super(name, number);
    }

    @Override
    void themeOfBilet() {
        System.out.println("Integrals");
    }
}
