package pr6.builder;

public class Director {
    public void createIronTable(Builder builder){
        builder.setLegs(1);
        builder.setTableTop("Покрашенная крышка стола");
        builder.setFolding(true);
    }

    public void createWoodenTable(Builder builder){
        builder.setLegs(4);
        builder.setTableTop("Залакировання крышка стола");
        builder.setFolding(false);
    }
}