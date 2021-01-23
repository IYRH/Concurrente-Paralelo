//package Synchronization;

public class ConditionVariable { // not yet implemented

   public void waitCV(Object monitor) {try {monitor.wait();}
                                       catch (InterruptedException e){System.out.println("error "+e.toString());}
                                       }

   public void notifyCV(Object monitor) {monitor.notify();}

   public boolean emptyCV(Object monitor) {return true;}
}
