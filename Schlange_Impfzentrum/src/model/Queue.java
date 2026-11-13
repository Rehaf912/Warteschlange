package model;

import jdk.jfr.ContentType;

public class Queue<ContentType> {
    //TODO 1: Klasse Queue fertigstellen. Es fehlen: isEmpty(), enqueue(Person p), dequeue(), front()
    private Node head;
    private Node tail;



    /**
     * Eine leere Schlange wird erzeugt.
     * Objekte, die in dieser Schlange verwaltet werden, muessen vom Typ
     * Person sein.
     */

    public Queue(){
        head=null;
        tail=null;
    }

    /**
     * Die Anfrage liefert den Wert true, wenn die Schlange keine Objekte enthaelt,
     * sonst liefert sie den Wert false.
     *
     * @return true, falls die Schlange leer ist, sonst false
     */
    public boolean isEmpty(){
        return head == null;
    }

    /**
     * Das Objekt p wird an die Schlange angehaengt.
     * Falls p gleich null ist, bleibt die Schlange unveraendert.
     *
     * @param pContent das anzuhaengende Objekt vom Typ Person
     */
    public void enqueue(ContentType pContent){
        if(pContent == null) return;

        Node newNode = new Node(pContent);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    /**
     * Das erste Objekt wird aus der Schlange entfernt.
     * Falls die Schlange leer ist, wird sie nicht veraendert.
     */
    public void dequeue(){
        if(isEmpty()) return;
        head = head.getNext();

        if (head == null) {
            tail = null;
        }

    }

    /**
     * Die Anfrage liefert das erste Objekt der Schlange.
     * Die Schlange bleibt unveraendert.
     * Falls die Schlange leer ist, wird null zurueckgegeben.
     *
     * @return das erste Objekt der Schlange vom Typ Person oder null, falls die Schlange leer ist
     */
    public Person front(){
        if (isEmpty()) return null;
        return (Person) head.getContent();
    }


    private class Node {
        private ContentType content = null;
        private Node next = null;

        /**
         * Ein neues Objekt vom Typ Node wird erschaffen.
         * Der Inhalt wird per Parameter gesetzt. Der Verweis ist leer.
         *
         * @param pContent das Inhaltselement des Knotens vom Typ Person
         */

        public Node(ContentType pContent){
            this.content = pContent;
            this.next = null;
        }

        /**
         * Liefert das naechste Element des aktuellen Knotens.
         *
         * @return das Objekt vom Typ Node, auf das der aktuelle Verweis zeigt
         */

        public Node getNext() {
            return next;
        }

        /**
         * Der Verweis wird auf das Objekt, das als Parameter uebergeben wird,
         * gesetzt.
         *
         * @param pNext der Nachfolger der Node
         */

        public void setNext(Node pNext) {
            this.next = pNext;
        }

        /**
         * Liefert das Inhaltsobjekt des Knotens vom Typ Person.
         *
         * @return das Inhaltsobjekt des Knotens
         */

        public ContentType getContent() {
            return content;
        }
    }


}
