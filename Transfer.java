/*
Класс для передачи строки и счетчика итераций из sort
(более нормального способа не нашелS)
*/

class Transfer{
    String s;
    int i;

    Transfer(String st, int it){
        s = st;
        i = it;
    }
 
    // This method returns string
    String Retstring()
    {
        return s;
    }
    // This method returns iterator
    int Retint()
    {
        return i;
    }
}