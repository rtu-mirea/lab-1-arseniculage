package com.company;
import java.util.Scanner;
import java.util.Arrays;
import com.company.Array;

public class Menu {

    public void initMenu() {
        Array arr = new Array(0);

        Scanner in = new Scanner(System.in);

        int menu_input;
        while (true) {
            System.out.println("1.input array  \n2. append to array \n3. pop from array \n4. find if max bigger than input \n5. order by last digit \n6 diplay array");

            menu_input = in.nextInt();

            switch (menu_input) {
                case (1):
                    int size = in.nextInt();
                    arr.input(size, in);
                    break;
                case (2):
                    int input = in.nextInt();
                    arr.append(input);
                    break;
                case (3):
                    int index = in.nextInt();
                    arr.pop(index);
                    break;
                case (4):
                    arr.check_maxBiggerInput(in);
                    break;
                case (5):
                    arr.orderByLastDigit();
                    break;
                case (6):
                    arr.print_string();
                    break;

            }
            System.out.println();


        }


    }
}