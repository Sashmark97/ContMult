/*
Пакет вывода матрицы и кол-ва итераций
*/

import java.util.ArrayList;
import java.util.Arrays;


class Print{
    public void printm(ArrayList<String> fin, int it){
        for(String str : fin){
            System.out.format("%s\n", str);                       //printing final array
        }
        System.out.format("Количество итераций %d\n", it);        //printing number of iterations
    }
}