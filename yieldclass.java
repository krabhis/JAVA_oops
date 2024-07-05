/*
 yield ():-  which stops the current executing thread and give a chance to other threads for execution.

 =>(Working):-Thread provide the hint to thread scheduler , then it depends on thread scheduler to accept or ignore the hint.

 => Output may vary(different)

 =>Method:- public sgtatic native void yield();

 */


 public class yieldclass extends Thread
 {
    @Override
    public void run()
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println(Thread.currentThread().getName()+" - "+i);
        }
    }
    public static void main(String[] args) 
    {
        yieldclass t=new yieldclass();
        t.start();

        for(int i=1 ; i<=3 ;i++)
        {
            System.out.println(Thread.currentThread().getName()+" - " + i);

        }
    }
 }