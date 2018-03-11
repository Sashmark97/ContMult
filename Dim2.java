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
            int itt = 0;                                          //temporary counter of iterations to recieve value from transfer
            Transfer tr = new Transfer("0", 0);                   //transfer to return string and iterator from sort
            tr = (Transfer)sor.sort(str, dir);
            itt = tr.Retint();                                    //assigning returned number of iterations
            tf = tr.Retstring();                                  //assigning returned string
            fin.add(tf);                                          //adding string to final array
            dir += 1;                                             //changing from even to odd or vice versa
            it += itt;                                            //increasing global iteration counter
        }
        Print pr = new Print();
        pr.printm(fin, it);                                       //printing the array and iterations
        }
    }