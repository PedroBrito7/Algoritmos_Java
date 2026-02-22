package LogicProgram;

public class Gravity {
    public static double solution(double[] arrVal, String[] arrUnit) {

        double m1 = convertMass(arrVal[0], arrUnit[0]);
        double m2 = convertMass(arrVal[1], arrUnit[1]);
        double r = convertDistance(arrVal[2], arrUnit[2]);

        double G = 6.67e-11;

        return G * (m1 * m2) / (r * r);
    }

    private static double convertMass(double value, String unit) {
        switch (unit) {
            case "kg":
                return value;
            case "g":
                return value / 1000;
            case "mg":
                return value / 1_000_000;
            case "μg":
                return value / 1_000_000_000;
            case "lb":
                return value * 0.453592;
        }
        return value;
    }

    private static double convertDistance(double value, String unit) {
        switch (unit) {
            case "m":
                return value;
            case "cm":
                return value / 100;
            case "mm":
                return value / 1000;
            case "μm":
                return value / 1_000_000;
            case "ft":
                return value * 0.3048;
        }
        return value;
    }
}
