package subclasses;

public class Bedroom extends Room{
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Wardrobe wardrobe;
    Ceiling ceiling;
    Bed bed;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp, Carpet carpet, String name, Wall wall11, Wall wall21, Wall wall31, Wall wall41, Ceiling ceiling1, Bed bed) {
        super(wall1, wall2, wall3, wall4, ceiling, lamp, carpet);
        this.name = name;
        this.wall1 = wall11;
        this.wall2 = wall21;
        this.wall3 = wall31;
        this.wall4 = wall41;
        this.ceiling = ceiling1;
        this.bed = bed;
    }

    public String getName() {
        return name;
    }

    public Bed getBed() {
        return bed;
    }
    public Wardrobe getWardrobe(){
        return wardrobe;
    }

    public void createBedroom(){
        getWall1().create();
        getWall2().create();
        getWall3().create();
        getWall4().create();
        bed.make();
        getCarpet().lying();
        wardrobe.add();
        getLamp().turnOn();
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + name + '\'' +
                ", wall1=" + wall1 +
                ", wall2=" + wall2 +
                ", wall3=" + wall3 +
                ", wall4=" + wall4 +
                ", wardrobe=" + wardrobe +
                ", ceiling=" + ceiling +
                ", bed=" + bed +
                '}';
    }
}
