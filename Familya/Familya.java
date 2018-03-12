/*
4. Написать программу, симулирующую семью. В семье должно быть от 2 до 5 детей.
   Мама и папа. В выводе члены семьи должны называть свое имя, пол и возраст

   ВВОД:  Сведения о членых семьи введены в классе Familia
   ВЫВОД: Положение в семейной иерархии
       
          Имя: ... Возраст: ... Пол: ...
*/

import javafx.application.Application;
import java.util.ArrayList;

abstract class Human{                                                                          //creating global human class
    private String name;
    private int age;
    private String gender;
    
    protected Human(String s, int a, String g){                                                 //constructor
        name = s;
        age = a;
        gender = g;
    }

    protected void report(){
        System.out.format("Name: %s , Age: %d , Gender: %s \n", name, age, gender); //adding method of reporting parameters
    }
}

class Father extends Human{                                                         //creating Father class while inheriting both constructor and method from human
    public Father(String s, int a, String g){
        super(s, a, g);
    }

    public void report(){
        System.out.println("FATHER \n");                                            //additional FATHER line to distinguish in family report
        super.report();
    }

}

class Mother extends Human{                                                         //same as Father
    public Mother(String s, int a, String g){
        super(s, a, g);
    }

    public void report(){
        System.out.println("MOTHER \n");
        super.report();
    }

}

class Child extends Human{                                                          //same as Father
    public Child(String s, int a, String g){
        super(s, a, g);
    }

    public void report(){
        System.out.println("CHILD \n");
        super.report();
    }

}

class Family {
private Father father;
private Mother mother;
private ArrayList<Child> children;

    public Family(Father f, Mother m, ArrayList<Child> c){                                     //constructor
        father = f;
        mother = m;
        children = c;
    }
    public void report(){                                                               //report method for the family
        father.report();                                                                //reporting both parents
        mother.report();
        for(Child child : children){                                                    //reporting all children from ArrayList
            child.report();
        }
    }
}

class Familia{
    public static void main(String[] args){
        Father father = new Father("Gendo", 48, "male");                                //entering family data
        Mother mother = new Mother("Yui", 44, "female");
        Child child1 = new Child("Rei", 14, "male");
        Child child2 = new Child("Asuka", 14, "male");
        Child child3 = new Child("Shinji", 14, "male");
        ArrayList<Child> children = new ArrayList<Child>();                             //children arraylist
        children.add(child1);
        children.add(child2);
        children.add(child3);                                                           //adding all children
        Family eva = new Family(father, mother, children);                              //creating a family
        eva.report();                                                                   //each member reports
    }
}