package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");

        float in = 70;
        float in2 = 60;
        float expected = 1;
        float testE = Converter.rubleToEuro(in);
        float testD = Converter.rubleToDollar(in2);
        boolean passed = expected == testE;
        boolean passed1 = expected == testD;
        System.out.println("70 rubles are 1 eu. Test result : " + passed);
        System.out.println("60 rubles are 1 doll. Test result : " + passed1);

    }
}