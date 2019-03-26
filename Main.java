import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void getInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        input = scanner.nextLine();
        Scanner tokenizer = new Scanner(input);
        while( tokenizer.hasNext() ) {
            System.out.println( tokenizer.next() );
        }
    }
}
