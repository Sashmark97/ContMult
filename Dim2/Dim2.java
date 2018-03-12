/*
1. Дан двумерный массив, необходимо вывести двумерный массив у которого четные строки
   отсортированы по возрастанию, а нечетные по убыванию. Так же в консоль необходимо
   вывести количество итераций, которое было потрачено при сортировке.
   
ВВОД:  Массив построчечно, числа через пробел. В конце ввода ввести пустую строку
ВЫВОД: Отсортированный массив построчечно
       Количество итераций
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class Dim2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();          //initial array
        ArrayList<String> fin = new ArrayList<String>();          //final array
        String buff = input.nextLine();                           //buffer for the lines
        arr.add(buff);
        while(true){
            buff = input.nextLine();
            if(buff.equals("")){                                  //reading the array
                break;
            }
            arr.add(buff);
        }              
        int dir = 1;                                              //if the row is even or odd
        int it = 0;                                               //global number of iterations
        for( String str : arr){
            Sort sor = new Sort();
            String tf = new String();
            String[] tsplit = str.split(" ");
            boolean dirbool;
            int[] num = new int[tsplit.length];
            int[] tr;
            for(int j = 0; j < tsplit.length; j++ ){
                num[j] = Integer.parseInt(tsplit[j]);
            }
            if(dir % 2 == 0){
                dirbool = true;
            }
            else{
                dirbool = false;
            }
            tr = sor.sort(num, dirbool);
            int itt = sor.GetIter();                                            //assigning returned strin
            tf = Arrays.toString(tr);
            fin.add(tf);                                          //adding string to final array
            dir += 1;                                             //changing from even to odd or vice versa
            it += itt;                                            //increasing global iteration counter
        }
        Print pr = new Print();
        pr.printm(fin, it);                                       //printing the array and iterations
        }
    }