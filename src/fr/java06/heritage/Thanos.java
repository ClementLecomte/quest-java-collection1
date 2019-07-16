package fr.java06.heritage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Thanos {

    public static void main(String[] args) {


        ArrayList<Avenger> avengers = new ArrayList<>();

        Avenger widow = new Avenger("Black Widow", 34 );
        avengers.add(widow);
        Avenger roggers = new Avenger("Captain America", 100 );
        avengers.add(roggers);
        Avenger vision = new Avenger("Vision", 3 );
        avengers.add(vision);
        Avenger ironMan = new Avenger("Iron Man", 48 );
        avengers.add(ironMan);
        Avenger thor = new Avenger("Thor", 1500 );
        avengers.add(thor);
        Avenger peter = new Avenger("Spider-Man", 18 );
        avengers.add(peter);
        Avenger bruce = new Avenger("Hulk", 49 );
        avengers.add(bruce);
        Avenger strange = new Avenger("Doctor Strange", 42 );
        avengers.add(strange);

        //Anniversaire Thor.

        Avenger newAge = thorBirthday(thor);

        // Je mélange la Liste :

        randomList(avengers);


        System.out.println();


        // Thanos claque des doigts et détruit la moitié des avengers :

         List avengersList = halfList(avengers);


        for (int y = 0; y < avengersList.size() ; y++) {
            System.out.println(avengers.get(y).getName());
        }

    }

    static Avenger thorBirthday(Avenger hero){
        hero.setAge(1501);
        return hero;
    }

    static ArrayList randomList(ArrayList list){
              Collections.shuffle(list);
              return list;
    }

     static List halfList(ArrayList list){
         List newList = list.subList(0,(list.size()/2));
        return newList;

    }


}
