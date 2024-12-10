//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        printSquareStar(5);
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            for (int i = 1; i <= number; i++) {

                for (int currentColumn = 1; currentColumn <= number; currentColumn++) {
                    if ((i == 1) || (currentColumn == 1) || (i == number) || (currentColumn == number) || (i == currentColumn) || (currentColumn == number - i + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}