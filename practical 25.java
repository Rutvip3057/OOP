class Table {
    public synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class ThreadA extends Thread {
    Table t;

    ThreadA(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class ThreadB extends Thread {
    Table t;

    ThreadB(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(7);
    }
}

public class Main {
    public static void main(String[] args) {
        Table obj = new Table();

        ThreadA t1 = new ThreadA(obj);
        ThreadB t2 = new ThreadB(obj);

        t1.start();
        t2.start();
    }
}