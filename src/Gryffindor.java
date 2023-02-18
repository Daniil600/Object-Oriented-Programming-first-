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

    public void showSkillsFacultet(Gryffindor gryffindor){
        System.out.println(gryffindor.getName() + " имеет следующие характеристики:\n" +
                "Благородство: " + gryffindor.getNobility() + "\n" +
                "Честь: " + gryffindor.getHonor() + "\n" +
                "Храбрость: " + gryffindor.getCourage());
    }


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
