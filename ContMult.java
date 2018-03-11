/*
2. Создайте массив целых чисел (размер 7 элементов), заполните его только четными
   числами, а затем каждый второй элемент умножьте на предыдущий

ВВОД:  без ввода, числа генерируются случайным образом
ВЫВОД: Сгенерированный массив
       ----------------------
       Массив перемноженных чисел
*/

class ContMult {
    public static void main(String[] args) {
        int size = 7;             
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            int temp  = (int)(Math.random()*100);
            array[i] = temp * 2;                // entering random even numbers in array
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);       // print array in order to check
            System.out.print(" ");
        }
        System.out.println("");
        System.out.println("--------------------------------"); // just a fancy divider for arrays
    
        for (int i = 0; i < size; i++) {
            if (i % 2 != 0){
                array[i] *= array[i-1];         // multiplying each second int by the previous int
            }
            
        }
        for (int j = 0; j < size; j++) {
            System.out.print(array[j]);       // printing final version
            System.out.print(" ");
        }
        System.out.println("");
    }
}
