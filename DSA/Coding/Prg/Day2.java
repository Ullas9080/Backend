


import java.util.LinkedList;
import java.util.Queue;

class Animals{
    int age;
String name;

public Animals(int age,String name)
{
this.age=age;
this.name=name;

}



@Override
public String toString() {
    return "Animals [age=" + age + ", name=" + name + "]";
}}

public class Day2 {

    public static void main(String[] args) {
        
Queue<Animals> queue= new LinkedList<>();

queue.offer(new Animals(10, "Tiger"));
queue.offer(new Animals(30, "Lion"));
queue.offer(new Animals(50, "Blue Whale"));
queue.offer(new Animals(70, "Bird"));

queue.offer(1);
queue.offer(11);
queue.offer(31);
queue.offer(901);

queue.remove();

System.out.println(queue.peek());

System.out.println(queue);

    }
}