package LogicProgram;

public class TriangleTypes {

    public static void main(String[] args) {

        int[] triangle1 = {5, 5, 5};
        int[] triangle2 = {5, 5, 7};
        int[] triangle3 = {3, 10, 0};

        calculateTriangle(triangle1);
        calculateTriangle(triangle2);
        calculateTriangle(triangle3);
    }

    public static void calculateTriangle(int[] t) {

        // Equilateral: 3 equal sides
        if (t[0] == t[1] && t[1] == t[2]) {
            System.out.println("Equilateral");

//            Isosceles: 2 equal sides
        } else if (t[0] == t[1] || t[0] == t[2] || t[1] == t[2]) {
            System.out.println("Isosceles");

            // Scalene: 3 different
        } else {
            System.out.println("Scalene");
        }
    }
}
