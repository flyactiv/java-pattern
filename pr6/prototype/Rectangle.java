package pr6.prototype;

public class Rectangle extends Shape{
    private int height;
    private int weight;

    public Rectangle(Rectangle rectangle){
        super(rectangle);

        if(rectangle != null){
            this.height = rectangle.height;
            this.weight = rectangle.weight;
        }
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Rectangle(){}


    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
