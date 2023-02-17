public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int character, int magic, int powerOfMagic, int distance, int transgressions, int nobility, int honor, int courage) {
        super(name, character, magic, powerOfMagic, distance, transgressions);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public void comparison(Gryffindor gryffindor1, Gryffindor gryffindor2){
        int gryf1 = comparisonOfFaculty(gryffindor1) + gryffindor1.getNobility() + gryffindor1.getHonor()
                + gryffindor1.getCourage();
        int gryf2 = comparisonOfFaculty(gryffindor2) + gryffindor2.getNobility() + gryffindor2.getHonor()
                + gryffindor2.getCourage();

        if (gryf1 > gryf2){
            System.out.println(gryffindor1.getName() + " лучший Гриффиндорец, чем " + gryffindor2.getName());
        }
        if (gryf1 < gryf2){
            System.out.println( gryffindor2.getName() + " лучший Гриффиндорец, чем " + gryffindor1.getName());
        }
        if (gryf1 == gryf2){
            System.out.println("Они равны");
        }

    }



/*
    int grif1 = gryffindor1.getCharacter() + gryffindor1.getMagic() + gryffindor1.getPowerOfMagic()
            + gryffindor1.getDistance() + gryffindor1.getTransgressions()
            + gryffindor1.getNobility() + ;
    int grif2 = gryffindor2.getCharacter() + gryffindor2.getMagic() + gryffindor2.getPowerOfMagic()
            + gryffindor2.getDistance() + gryffindor2.getTransgressions()
            + gryffindor2.getNobility() + gryffindor2.getNobility() + gryffindor2.getHonor() + gryffindor2.getCourage();
        if (grif1 > grif2){
        System.out.println(gryffindor1.getName() + " лучший Гриффиндорец, чем " + gryffindor2.getName());
    }
*/















    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
}
