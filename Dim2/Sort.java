/*
Пакет сортировщика
*/

import java.util.ArrayList;
import java.util.Arrays;

class Sort implements ISort{
    private int it;
    private int[] str;
    public int[] sort(int[] str, boolean dir){
                int temp = 0;
                for (int t = 0; t < str.length - 1; t++){
                    for (int i = 0; i < str.length - t -1; i++){
                        if(dir ? str[i+1] < str[i] : str[i] < str[i+1] ) {
                            temp = str[i];
                            str[i] = str[i + 1];                    // bubble-sort of integers
                            str[i + 1] = temp;
                            it += 1;                              
                        }
                    }
                }
            return str;
        }

        int GetIter(){
            return it;
        }
    }