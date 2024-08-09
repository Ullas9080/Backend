package Backend.Code;

// class Counter {
//     int count;

//     public synchronized void increment() {
//         count++;
//     }
// }

// public class Race {

//     public static void main(String[] args) throws InterruptedException {
//         Counter counter = new Counter();

//         Runnable runA = () -> {

//             for (int i = 0; i < 10000; i++) {
//                 counter.increment();
//             }
//         };

//         Runnable runB = () -> {
//             for (int i = 0; i < 10000; i++) {
//                 counter.increment();
//             }
//         };

//         Runnable runC = () -> {
//             for (int i = 0; i < 10000; i++) {
//                 counter.increment();
//             }
//         };

//         Thread t1 = new Thread(runA);
//         Thread t2 = new Thread(runB);

//         Thread t3 = new Thread(runC);

//         t1.start();
//         t2.start();

//         t3.start();

//         t1.join();
//         t2.join();
//         t3.join();

//         System.out.println(counter.count);
//     }

// }
