package com.cybertek.tests.day14_excel_io;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {

    public static void main(String[] args) throws FileNotFoundException {

        // path to file that we want to read
        String path="shopping_list.txt";
        // File's constructor
        File file =new File(path);
        // check if file exists
        System.out.println(file.exists());

        Scanner scanner =new Scanner(file);
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());

        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }


        //  ===================================================================

        String path2 ="grades.csv";
        File file2 =new File((path2));
        Scanner scanner2 = new Scanner(path2);
        System.out.println(scanner2.nextLine());

    }
}
