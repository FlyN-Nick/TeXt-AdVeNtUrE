import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static String[] getInput() {
        String[] outputs = new String[2];
        Scanner scanner = new Scanner(System.in);
        String input;
        input = scanner.nextLine();
        Scanner tokenizer = new Scanner(input);
        int i=0;
        while( tokenizer.hasNext() ) {
            System.out.println(i);
            String placeholder=tokenizer.next();
            //System.out.println( tokenizer.next() );
            outputs[i]=placeholder;
            System.out.println(outputs[0]);
            i=i+1;
        }
        return outputs;
    }
}
