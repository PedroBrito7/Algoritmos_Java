package LogicProgram;

public class YearsBetween {
    public static void main(String[] args) {
        int francisco = 150;
        int sara = 110;
        int anos = 0;

        while (francisco <= sara) {
            francisco += 2;
            sara += 3;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para Francisco ser maior que Sara.");

    }
}
