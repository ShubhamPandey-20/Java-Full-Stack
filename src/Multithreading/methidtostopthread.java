package Multithreading;

class sp extends Thread{
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(i);


        }
    }
}

public class methidtostopthread {
    //Yield()- Mujhe rok jo aur kisi aur ko chance de do
    //Join()- t1, t2 bhai tera hojayega phir mai chalunga
    //Sleep()- Thodi der ke liye so jata hu

    public static void main(String[] args) throws InterruptedException {
        sp t1 = new sp();
        t1.start();
        Thread.sleep(3000);

        for(int j=0;j<6; j++){
            System.out.println(j);


        }

    }
}
