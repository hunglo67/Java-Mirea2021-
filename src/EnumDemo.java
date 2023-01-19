package Pr44;

public class EnumDemo {
    public static void main(String[] args) {
        System.out.print("Любимое время года: ");
        printInfo(Seasons.valueOf("SPRING"));
        print(Seasons.valueOf("SPRING"));
        for (Seasons season : Seasons.values()) {
            printInfo(season);
        }
    }
    public static void print(Seasons season){
        switch(season){
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void printInfo(Seasons season) {
        /*System.out.printf(Locale.ROOT, "%s %s, ", season.name(), season);
        season.getDescription();*/
        System.out.println( season.name() + " {" + "averageTemperature = " + season.getAverageTemperature() + "\u00B0C" + "," +season.getDescription()+"}");
    }
}
