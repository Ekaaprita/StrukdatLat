package javaapplication2;
import java.util.LinkedList;
import java.util.Queue;

public class Tugas {

        public void queueExample(){

            Queue my = new LinkedList();
            my.add("Java");
            my.add("Dotnet");
            my.offer("Php");
            my.offer("Html");

            System.out.println("List " +my);


            System.out.println("remove: " + my.remove());
            System.out.println("element: " + my.element());
            System.out.println("poll: " + my.poll());
            System.out.println("peek: " + my.peek());
        }

        public static void main(String[] args){
            new Tugas().queueExample();

        }
}