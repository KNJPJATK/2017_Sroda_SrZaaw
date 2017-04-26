package eu.barcikowski;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String test = "Ala ma                           kota a kot ma ale";
        System.out.println(test);
        String[] splitText = test.split("\\s+(?=k)");
            // \s
            // ""
        for (String text :
                splitText) {
            System.out.println(text);
        }

        String patternString = "12";
        String newTes = "12312112123123111231231211231";
        Pattern pattern = Pattern.compile(patternString);
        Matcher m = pattern.matcher(newTes);
        int counter = 0;
while (m.find()){
    counter++;
}
        System.out.println(counter);

        System.out.println("------ LIST ------");
        List<String> myList = new ArrayList<>();
        myList.add("tekst1");
        myList.add("tekst1");
        myList.add("tekst3");
        myList.add("tekst5");
        myList.add("tekst7");


        for (String text :
                myList) {
            System.out.println(text);
        }

        System.out.println("----- SET -----");
        Set<String> mySet = new HashSet<>();

        mySet.add("setTest");
        mySet.add("setTest");
        mySet.add("setTest");
        mySet.add("setTest");
        mySet.add("setTest2");


        for (String text :
                mySet) {
            System.out.println(text);
        }


        System.out.println("---- MAP ------");

        Map<String,String> myMap = new HashMap<>();

        myMap.put("Castle", "Zamek");
        myMap.put("Lock", "Zamek");
        //myMap.put("Castle","cos");

        System.out.println(myMap.get("Castle"));
        System.out.println(myMap);



    }
}
