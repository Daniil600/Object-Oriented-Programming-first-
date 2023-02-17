public class Hogwarts {
    private String name;
    private int character;
    private int magic;
    private int powerOfMagic;
    private int distance;
    private int transgressions;

    public Hogwarts(String name,int character, int magic, int powerOfMagic, int distance, int transgressions) {
        this.name = name;
        this.character = character;
        this.magic = magic;
        this.powerOfMagic = powerOfMagic;
        this.distance = distance;
        this.transgressions = transgressions;
    }

    public int comparisonOfFaculty(Hogwarts hogwarts){
        int hog = hogwarts.getCharacter() + hogwarts.getMagic() + hogwarts.getPowerOfMagic() + hogwarts.getDistance()
                + hogwarts.getTransgressions();
        return hog;
    }

    public void comparisonOfHogwards(Hogwarts hogwart1, Hogwarts hogwart2){
        int hog1 = hogwart1.getPowerOfMagic() + hogwart1.getTransgressions();
        int hog2 = hogwart2.getPowerOfMagic() + hogwart2.getTransgressions();

        if (hog1 > hog2){
            System.out.println( hogwart1.getName() + " обладает большей мощностью магии, чем " + hogwart2.getName());
        }
        if (hog1 < hog2){
            System.out.println( hogwart2.getName() + " обладает большей мощностью магии, чем " + hogwart1.getName());
        }
        if (hog1 == hog2){
            System.out.println("Они равны");
        }
    }
















    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCharacter() {
        return character;
    }

    public void setCharacter(int character) {
        this.character = character;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTransgressions() {
        return transgressions;
    }

    public void setTransgressions(int transgressions) {
        this.transgressions = transgressions;
    }
}
