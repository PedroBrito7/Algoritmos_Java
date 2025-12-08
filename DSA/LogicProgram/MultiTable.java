package LogicProgram;

public class MultiTable {
    public static void showTableAllNumbers(){
        for (int i = 1; i < 11; i++) {
            System.out.println("----table " + i + " ----");
            for (int j = 1; j <11 ; j++) {
                System.out.println(i * j);
            }
        }
    }

    public static void showTable(int number){
        for (int i = 1; i < 11; i++) {
            System.out.println(number * i);
        }
    }
    public static void main(String[] args) {
      showTableAllNumbers();
        System.out.println("--------------");
      showTable(8);
    }
}
