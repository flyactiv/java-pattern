package pr6.prototype;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("orange");
        circle.setX(50);
        circle.setY(50);
        circle.setRadius(10);

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("black");
        rectangle.setX(10);
        rectangle.setY(20);
        rectangle.setHeight(25);
        rectangle.setWeight(50);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(rectangle);
        shapeList.add(new Circle(circle));
        shapeList.add(new Rectangle(rectangle));
        shapeList.add(circle.clone());
        shapeList.add(rectangle.clone());

        Iterator<Shape> iterator = shapeList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
