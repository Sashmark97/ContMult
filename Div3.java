import java.io.Reader;
import java.util.Scanner;

class Div3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int size = input.nextInt();             // reading size of the array
        int array[] = new int[size];            // creating array of size
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();         // inputting numbers in array
        }
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0 && array[i] % 3 ==0){
                System.out.println(array[i]);   // printing numbers according to logical conditions
            }
        }
    }
}