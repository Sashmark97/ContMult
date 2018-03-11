/*
3. Дано натуральное число N. Вычислите сумму его цифр. При решении этой задачи
   нельзя использовать строки, списки, массивы (ну и циклы, разумеется)
   ВВОД:  Число
   ВЫВОД: Сумма разрядов числа
*/

import java.util.Scanner;

class Summ{
    static int Summa(int N){
        if(N < 10){
            return N;                        //recursion breaks
        }
        return N % 10 + Summa(N / 10);         //recursion proceeds while summing previous byte
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int sum = 0;
        int N = input.nextInt();             // reading the number from keyboard
        sum = Summa(N);
        System.out.println(sum);
    }
}