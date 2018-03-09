import java.util.Scanner;
import java.lang.String;

class Polyndrom{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String phrase = scanner.nextLine();
        String phrasenospace = phrase.replaceAll(" ", "").toLowerCase(); //removing spaces and transforming to lover case
        StringBuilder reversed = new StringBuilder(phrasenospace);       //converting to Stringbuilder to use "reverse"
        reversed.reverse();

        if(reversed.toString().equals(phrasenospace)){                   //comparing reversed to the initial one
            System.out.println("Полиндром");
        }
        else{
            System.out.println("Не Полиндром");
        }
    }
}