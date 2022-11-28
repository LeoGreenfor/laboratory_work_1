package main;

public class HelloRunnable implements Runnable {
    public void run() {
        System.out.println("Привіт з потоку!");
    }
    public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
    }
}

