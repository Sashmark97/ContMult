import javafx.application.Application;
import java.util.ArrayList;

class Human{                                                                          //creating global human class
    public String name;
    public int age;
    public String gender;
    
    Human(String s, int a, String g){                                                 //constructor
        name = s;
        age = a;
        gender = g;
    }

    public void report(){
        System.out.format("Name: %s , Age: %d , Gender: %s \n", name, age, gender); //adding method of reporting parameters
    }
}

class Father extends Human{                                                         //creating Father class while inheriting both constructor and method from human
    Father(String s, int a, String g){
        super(s, a, g);
    }

    public void report(){
        System.out.println("FATHER \n");                                            //additional FATHER line to distinguish in family report
        super.report();
    }

}

class Mother extends Human{                                                         //same as Father
    Mother(String s, int a, String g){
        super(s, a, g);
    }

    public void report(){
        System.out.println("MOTHER \n");
        super.report();
    }

}

class Child extends Human{                                                          //same as Father
    Child(String s, int a, String g){
        super(s, a, g);
    }

    public void report(){
        System.out.println("CHILD \n");
        super.report();
    }

}

class Family {
public Father father;
public Mother mother;
public ArrayList<Child> children;

    Family(Father f, Mother m, ArrayList<Child> c){                                     //constructor
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