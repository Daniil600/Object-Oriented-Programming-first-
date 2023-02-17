public class Ravenclaw extends Hogwarts {
    private int intelligent;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, int character, int magic, int powerOfMagic, int distance, int transgressions, int intelligent, int wise, int witty, int creativity) {
        super(name, character, magic, powerOfMagic, distance, transgressions);
        this.intelligent = intelligent;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }




    public void comparison(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2){
        int raven1 = ravenclaw1.comparisonOfFaculty(ravenclaw1) + ravenclaw1.getIntelligent() + ravenclaw1.getWise()
                + ravenclaw1.getWitty() + ravenclaw1.getCreativity();
        int raven2 = ravenclaw2.comparisonOfFaculty(ravenclaw2) + ravenclaw2.getIntelligent() + ravenclaw2.getWise()
                + ravenclaw2.getWitty() + ravenclaw2.getCreativity();
        if (raven1 > raven2){
            System.out.println(ravenclaw1.getName() + " лучший Когтевранец, чем " + ravenclaw2.getName());
        }
        if (raven1 < raven2){
            System.out.println( ravenclaw2.getName() + " лучший Когтевранец, чем " + ravenclaw1.getName());
        }
        if (raven1 == raven2){
            System.out.println("Они равны");
        }

    }

    public int getIntelligent() {
        return intelligent;
    }

    public void setIntelligent(int intelligent) {
        this.intelligent = intelligent;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}
