package LogicProgram;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateYear {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite sua data de born (dd/MM/yyyy): ");
            String dataStr = sc.nextLine();

        LocalDate born = null;

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            born = LocalDate.parse(dataStr, formatter);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

            LocalDate today = LocalDate.now();
            Period age = Period.between(born, today);

            System.out.println("\n you alive today for so :");
            System.out.println(age.getYears() + " years");
            System.out.println(age.getMonths() + " month");
            System.out.println(age.getDays() + " dias");
        }
    }