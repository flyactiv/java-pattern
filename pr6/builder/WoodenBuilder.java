package pr6.builder;

public class WoodenBuilder implements Builder {
    private boolean isFolding;
    private int legsNumber;
    private String tableTop;


    @Override
    public void setFolding(boolean isFolding) {
        this.isFolding = isFolding;
    }

    @Override
    public void setLegs(int number) {
        this.legsNumber = number;
    }

    @Override
    public void setTableTop(String top) {
        this.tableTop = top;
    }

    public WoodenTable getResult(){
        return new WoodenTable(isFolding, legsNumber, tableTop);
    }
}