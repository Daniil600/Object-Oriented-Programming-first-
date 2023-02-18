public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int character, int magic, int powerOfMagic, int distance, int transgressions, int hardworking, int loyal, int honest) {
        super(name, character, magic, powerOfMagic, distance, transgressions);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;

    }

    public void comparison(Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        int huff1 = hufflepuff1.comparisonOfFaculty(hufflepuff1) + hufflepuff1.getHardworking() + hufflepuff1.getLoyal()
                + hufflepuff1.getHonest();
        int huff2 = hufflepuff2.comparisonOfFaculty(hufflepuff2) + hufflepuff2.getHardworking() + hufflepuff2.getLoyal()
                + hufflepuff2.getHonest();

        if (huff1 > huff2){
            System.out.println(hufflepuff1.getName() + " лучший Пуффендуец, чем " + hufflepuff2.getName());
        }
        if (huff1 < huff2){
            System.out.println( hufflepuff2.getName() + " лучший Пуффендуец, чем " + hufflepuff1.getName());
        }
        if (huff1 == huff2){
            System.out.println("Они равны");
        }

    }


    public void showSkillsFacultet(Hufflepuff hufflepuff){
        System.out.println(hufflepuff.getName() + " имеет следующие характеристики:\n" +
                "Трудолюбие: " + hufflepuff.getHardworking() + "\n" +
                "Верность: " + hufflepuff.getLoyal() + "\n" +
                "Честность: " + hufflepuff.getHonest());
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
}
