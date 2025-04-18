package Multithreading;

public class Safety {
    //Synchronisation Synchronise keyword or block
    //public synchronized void m1(){}
    //synchronise block is better
    //But we cannot change the run method of the Thread class
    //This how we can understand that the string buffer is thread safe


    //Inter thread commnication this will all happen in the synchronisation method or block
    //wait()
    //notify()
    //notifyall()
    //This all release the lock in the object
    // As synchronised will apply lock and this three method will release the lock in the synchronised method or block

    //wait()- wait until other thread notify it


    public static void main(String[] args) throws InterruptedException {
        sps s1 = new sps();

        s1.start();
        synchronized (s1){
            System.out.println("Main threas calling wait");
            s1.wait();
            System.out.println("Main thread got notification");
        }

    }




}

class sps extends Thread{
    int ssum=0;
    @Override
    public void run() {
        synchronized (this){
            System.out.println("Start counting");
            for(int i=0; i<8; i++){
                ssum = ssum +i;

            }
            System.out.println("Sum is sum" +ssum);
            System.out.println("Child thread notify");
            this.notify();
        }
    }
}
