package LogicProgram;

public class DrawStairs {
    public static void main(String[] args) {
        System.out.println(draw(3));
    }
    public static String draw(int n) {
        String resultado = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                resultado += " ";
            }
            resultado += "I";
            if (i < n - 1) {
                resultado += "\n";
            }
        }
        return resultado;
    }
}
// melhor jeito - >
// import static java.util.stream.Collectors.joining;
//import static java.util.stream.IntStream.range;
//
//interface Stairs {
//  static String draw(int n) {
//    return range(0, n).mapToObj(i -> " ".repeat(i) + "I").collect(joining("\n"));
//  }
//}