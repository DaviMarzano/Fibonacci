package entities;

public class Fibonacci {
    public  int current = 1 ;
    public  int next = 1 ;
    public  int previous = 0;

    public Fibonacci(int current, int previous, int next) {
        this.current = current;
        this.previous = previous;
        this.next = next;
    }

}
