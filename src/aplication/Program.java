package aplication;

import entities.Fibonacci;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Fibonacci numbers do you want to see?");
        int n = sc.nextInt();

        Fibonacci fibo = new Fibonacci(1,0,1);


        for (int i = 0; i < n; i++) {
            fibo.next = fibo.current + fibo.previous;
            fibo.previous = fibo.current;
            fibo.current = fibo.next;
            System.out.println(fibo.next);
        }
        sc.close();
    }
}
