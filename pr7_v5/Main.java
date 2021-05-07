package pr7_v5;

import pr7_v5.lightweight.SpectralType;
import pr7_v5.facade.Facade;
import pr7_v5.lightweight.StarFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Facade example: ");
        Facade facade = new Facade();
        facade.init();
        System.out.println();

        System.out.println("Flyweight example: ");
        StarFactory starFactory = new StarFactory();
        for (int i = 0; i < 10; i++) {
            switch (i % 3) {
                case 0 : starFactory.createStar(SpectralType.M);
                case 1 : starFactory.createStar(SpectralType.G);
                case 2 : starFactory.createStar(SpectralType.A);
            }
        }
    }
}
