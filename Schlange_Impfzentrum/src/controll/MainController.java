package controll;

import jdk.jfr.ContentType;
import model.Person;
import model.Queue;

public class MainController {

    public static void main(String[] args) {
        //Queue<ContentType> person;
        Person p1 = new Person("Hans");
        Person p2 = new Person("Klaus");
        Person p3 = new Person("Hanni");
        Person p4 = new Person("Nanni");

        //Erzeugen einer neuen Schlange
        Queue<Person> myQueue = new Queue<>();


        //Personen der Schlange hinzufügen
        myQueue.enqueue(p1);
        myQueue.enqueue(p2);
        myQueue.enqueue(p3);
        myQueue.enqueue(p4);


        //Namen der ersten Person anzeigen lassen
        System.out.println(myQueue.front().getName());

        //erste Person aus der Schlange entfernen
        myQueue.dequeue();
        System.out.println(myQueue.front().getName());

        //erste Person aus der Schlange entfernen
        myQueue.dequeue();
    }

}
