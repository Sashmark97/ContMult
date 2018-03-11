/*
Пакет сортировщика
*/

import java.util.ArrayList;
import java.util.Arrays;

class Sort{
    public Object sort(String str, int dir){
                String tempStr;
                int it = 0;
                String[] t1 = str.split(" ");                     // converting string in string array(removing spaces)
                for (int t = 0; t < t1.length - 1; t++){
                    for (int i = 0; i < t1.length - t -1; i++){
                        if((dir % 2) == 0 ? t1[i+1].compareTo(t1[i]) < 0 : t1[i+1].compareTo(t1[i]) > 0) {
                            tempStr = t1[i];
                            t1[i] = t1[i + 1];                    // bubble-sort of integers
                            t1[i + 1] = tempStr;
                            it += 1;                              
                        }
                    }
                }
                String tf = Arrays.toString(t1);                  //converting back to string
                Transfer tr = new Transfer(tf, it);               //creating transfer to return both string and iterator
            return tr;
        }
    }