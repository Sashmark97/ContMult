import java.util.Scanner;

class Summ{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int sum = 0;
        int N = input.nextInt();             // reading the number from keyboard
        while(N > 0){
            sum += (N % 10);                 //summ of the bits
            N /= 10;                         //proceed with removing the last bit of the number
        }
        System.out.println(sum);
    }
}