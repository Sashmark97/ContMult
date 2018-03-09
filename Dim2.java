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
        int count = 1;                                            // even or odd string in Array list
        int it = 0;                                               // number of iterations
        for(String str : arr){
            if(count % 2 == 0){                                   //sorting even rows
                String tempStr;
                String[] t1 = str.split(" ");                     // converting string in string array(removing spaces)
                for (int t = 0; t < t1.length - 1; t++) {
                    for (int i= 0; i < t1.length - t -1; i++) {
                        if(t1[i+1].compareTo(t1[i])<0) {
                            tempStr = t1[i];
                            t1[i] = t1[i + 1];                    // bubble-sort of integers
                            t1[i + 1] = tempStr;
                            it += 1;                              
                        }
                    }
                }
                String tf = Arrays.toString(t1);                  //converting back to string
                fin.add(tf);                                      //adding string to final array
            }
            else{                                                 //pretty much the same for the odd rows in array
                String tempStr;
                String[] t1 = str.split(" ");
                for (int t = 0; t < t1.length - 1; t++) {
                    for (int i= 0; i < t1.length - t -1; i++) {
                        if(t1[i+1].compareTo(t1[i])>0) {
                            tempStr = t1[i];
                            t1[i] = t1[i + 1];
                            t1[i + 1] = tempStr;
                            it += 1;
                        }
                    }
                }
                String tf = Arrays.toString(t1);
                fin.add(tf);
            }
        count += 1;                                               //increase the counter of the row
        }

        for(String str : fin){
            System.out.format("%s\n", str);                       //printing final array
        }
        System.out.format("%d\n", it);                            //printing number of iterations
        

        }
    }