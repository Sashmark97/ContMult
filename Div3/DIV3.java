import java.io.Reader;

import java.util.Scanner;

class div3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int size = input.nextInt();             // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size];            
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();         // Заполняем массив элементами, введёнными с клавиатуры
        }
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0 && array[i] % 3 ==0){
                System.out.println(array[i]);   // Выводим числа по условиям
            }
        }
    }
}