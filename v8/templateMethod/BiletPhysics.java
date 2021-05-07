package pr8.v8.templateMethod;

public class BiletPhysics extends BiletTemplate{
    public BiletPhysics(String name, int number) {
        super(name, number);
    }

    @Override
    void themeOfBilet() {
        System.out.println("Molecular physics");
    }
}
