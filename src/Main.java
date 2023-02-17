import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 7, 9,10,9,10,10,10, 10),
                new Gryffindor("Гермиона Грейнджер",6, 4,7,5,3,7,9, 6),
                new Gryffindor("Рон Уизли",3, 5,8,7,6,3,4, 3)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 5, 4,10,6,5,5,4, 7),
                new Hufflepuff("Седрик Диггори",6, 3,7,5,3,9,3, 5),
                new Hufflepuff("Джастин Финч-Флетчли",5, 8,6,7,5,3,8, 4)
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 5, 4,10,6,5,5,5,5,6),
                new Ravenclaw("Падма Патил",6, 5,7,5,3,9, 4,9,8),
                new Ravenclaw("Маркус Белби",9, 8,4,7,5,3, 2,4,3 )
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 5, 4,10,6,5,5,5,5,6,5),
                new Slytherin("Грэхэм Монтегю",6, 8,7,5,3,9, 4,9,8,8),
                new Slytherin("Грегори Гойл",5, 5,6,7,5,3, 2,4,3,5 )
        };

        gryffindors[0].comparison(gryffindors[0],gryffindors[1]);

        System.out.println();

        hufflepuffs[0].comparison(hufflepuffs[1],hufflepuffs[2]);

        System.out.println();

        ravenclaws[0].comparison(ravenclaws[1],ravenclaws[0]);

        System.out.println();

        slytherins[0].comparison(slytherins[0],slytherins[2]);

        System.out.println();

        gryffindors[0].comparisonOfHogwards(slytherins[0],ravenclaws[1]);

    }
}
