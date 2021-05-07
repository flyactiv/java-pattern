package pr8_v8;
import pr8_v8.strategy.*;
import pr8_v8.templateMethod.BiletPhysics;
import pr8_v8.templateMethod.BiletTemplate;

public class Test {
    public static void main(String[] args) {
        Operation addOp = new Operation(new Plus());
        System.out.println("76,5 + 83 = " + addOp.chooseOperation(76.5,83));

        addOp = new Operation(new Divide());
        System.out.println("100 / 58 = " + addOp.chooseOperation(100, 58));

        addOp = new Operation(new SquareRootsSum());
        System.out.println("sqrt(678) + sqrt(1246) = " + addOp.chooseOperation(678, 1246));

        addOp = new Operation(new Power());
        System.out.println("7^8 = " + addOp.chooseOperation(7, 8));

        System.out.println(" ");

        BiletTemplate bilet = new BiletPhysics("Physics", 15);
        bilet.writeBilet();
    }
}
