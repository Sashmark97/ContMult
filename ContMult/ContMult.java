class ContMult {
    public static void main(String[] args) {
        int size = 7;             
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            int temp  = (int)(Math.random()*100);
            array[i] = temp * 2;                // Заполняем массив случайными четными числами
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);       // Вывод чисел для проверки
        }

        System.out.println("----------------");
        
        for (int i = 0; i < size; i++) {
            if (i % 2 != 0){
                array[i] *= array[i-1];         // Домножаем каждое второе на предыдущее
            }
            
        }
        for (int j = 0; j < size; j++) {
            System.out.println(array[j]);       // Вывод для проверки
        }
    }
}
