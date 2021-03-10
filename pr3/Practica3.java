package pr3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Practica3 {
    private static final Semaphore semaphore = new Semaphore(2);
    private static final ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();
    private static final Lock lock = new ReentrantLock();
    private static List<Integer> list = Collections.synchronizedList(new ArrayList<>());
    static void getId(int a){
        try{
            semaphore.acquire();
            System.out.println("Значение по ключу " + a + ": " + hashMap.get(a));
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    static void getElement(int a){
        lock.lock();
        System.out.println("Элемент под номером " + a + ": " + list.get(a));
        lock.unlock();
    }
    public static void main(String[] args) throws InterruptedException {
        hashMap.put(0, "0key");
        hashMap.put(1, "1key");
        hashMap.put(2, "2key");
        hashMap.put(3, "3key");
        hashMap.put(4, "4key");
        hashMap.put(5, "5key");
        Thread one = new Thread(() -> {
            for (int i = 0; i < hashMap.size(); i++) getId(i);
        });
        Thread two = new Thread(() -> {
            for (int i = 0; i < hashMap.size(); i++) getId(i);
        });
        System.out.println("Разрешений Semaphore: 2");

        one.start();
        two.start();
        Thread.sleep(3000);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        one = new Thread(() -> {
            for (int i = 0; i < list.size(); i++) getElement(i);
        });
        two = new Thread(() -> {
            for (int i = 0; i < list.size(); i++) getElement(i);
        });
        System.out.println();
        one.start();
        two.start();
        Thread.sleep(3000);
    }
}
