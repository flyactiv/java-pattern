package pr8.v8.templateMethod;

public abstract class BiletTemplate {
    private String name;
    private int number;

    public BiletTemplate(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public final void writeBilet() {
        themeOfBilet();
        checkConsp();
        checkGoogle();
        writeMainInfo();
        writeAddInfo();
    }

    void checkConsp() { System.out.println("Checking conspects"); }

    void checkGoogle() { System.out.println("Checking Google"); }

    void writeMainInfo() { System.out.println("Introducing topic"); }

    void writeAddInfo() { System.out.println("Concluding topic");}

    abstract void themeOfBilet();
}
