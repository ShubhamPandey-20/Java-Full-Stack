package Multithreading;

// Thread is the smallest unit of the program

 class Multithreading extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);

        }
    }


}
