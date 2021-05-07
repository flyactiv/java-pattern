package pr6.builder;

public class WoodenTable {
    private boolean isFolding;
    private int legsNumber;
    private String tableTop;

    public WoodenTable(boolean isFolding, int legsNumber, String tableTop) {
        this.isFolding = isFolding;
        this.legsNumber = legsNumber;
        this.tableTop = tableTop;
    }

    @Override
    public String toString() {
        return "WoodenTable{" +
                "isFolding=" + isFolding +
                ", legsNumber=" + legsNumber +
                ", tableTop='" + tableTop + '\'' +
                '}';
    }

    public boolean isFolding() {
        return isFolding;
    }

    public void setFolding(boolean folding) {
        isFolding = folding;
    }

    public int getLegsNumber() {
        return legsNumber;
    }

    public void setLegsNumber(int legsNumber) {
        this.legsNumber = legsNumber;
    }

    public String getTableTop() {
        return tableTop;
    }

    public void setTableTop(String tableTop) {
        this.tableTop = tableTop;
    }
}