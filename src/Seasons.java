package Pr44;

public enum Seasons {
    SPRING(5),
    SUMMER(40) {
        public String getDescription() {
            return ("Жаркое время года");
        }
    },
    AUTUMN(15),
    WINTER(-10);

    Seasons(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getDescription() {
        return ("Холодное время года");
    }

    @Override
    public String toString() {
        return "#" + ordinal() + "{" +
                "averageTemperature = " + averageTemperature + "\u00B0C" +
                '}';
    }

    private double averageTemperature;
}