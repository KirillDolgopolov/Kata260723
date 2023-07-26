package org.example;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cuantos symbolos quieres?");
        Scanner sc = new Scanner(System.in);
        int lg= sc.nextInt();

        String password = RandomStringUtils.randomAlphanumeric(lg*5);
        String chars = "'!','@','#','$','%','^','&','*','(',')','{','}','[',']','=','<','>'";

        chars = chars.replaceAll("'", "");
        chars = chars.replaceAll(",", "");

        String passwordAll = password + chars;


        List<String> list = new ArrayList<>();

        for (int i = 0; i < passwordAll.length(); i++) {
            list.add(passwordAll.substring(i, i+1));
        }

                Collections.shuffle(list);


        System.out.println("Tu password es: ");
    for (int i=0; i<lg;i++){
        System.out.print(list.get(i));
    }



    }
}