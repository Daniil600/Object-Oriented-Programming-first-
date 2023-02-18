public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness ;
    private int lustForPower;

    public Slytherin(String name, int character, int magic, int powerOfMagic, int distance, int transgressions, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, character, magic, powerOfMagic, distance, transgressions);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public void comparison(Slytherin slytherin1, Slytherin slytherin2){
        int slyther1 = slytherin1.comparisonOfFaculty(slytherin1) + slytherin1.getCunning() + slytherin1.getDetermination()
                + slytherin1.getAmbition() + slytherin1.getResourcefulness() + slytherin1.getLustForPower();
        int slyther2 = slytherin2.comparisonOfFaculty(slytherin2) + slytherin2.getCunning() + slytherin2.getDetermination()
                + slytherin2.getAmbition() + slytherin2.getResourcefulness() + slytherin2.getLustForPower();
        if (slyther1 > slyther2){
            System.out.println(slytherin1.getName() + " лучший Слизеринец, чем " + slytherin2.getName());
        }
        if (slyther1 < slyther2){
            System.out.println( slytherin2.getName() + " лучший Слизеринец, чем " + slytherin1.getName());
        }
        if (slyther1 == slyther2){
            System.out.println("Они равны");
        }
    }

    public void showSkillsFacultet(Slytherin slytherin){
        System.out.println(slytherin.getName() + " имеет следующие характеристики:\n" +
                "Хитрость: " + slytherin.getCunning() + "\n" +
                "Решительность: " + slytherin.getDetermination() + "\n" +
                "Амбициозность: " + slytherin.getAmbition() + "\n" +
                "Находчивость   " + slytherin.getResourcefulness() + "\n" +
                "Жажда власти " + slytherin.lustForPower);
    }


    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }


}
