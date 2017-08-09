/**
 * Created by Nur Nabhan on 8/9/2017
 * A list implemented using a singly-linked list
 */

public class LinkedListAddMethod<E> {

    // here, include the LinkedNode definition

    /**
     * A node in a singly-linked list

     */

    private static class LinkedNode<T> {
        private T item;
        private LinkedNode<T> next;


        /**
         * constructor to build a node with no successor
         */
        private LinkedNode(T value) {
            item = value;
            next = null;
        }


        /**
         * constructor to build a node with specified (maybe null) successor

         */
        private LinkedNode(T value, LinkedNode<T> reference) {
            item = value;
            next = reference;
        }
    }
    // end of the LinkedNode definition
/*****************************************************************************************************************************************************/

    // this is the start of the linked list.  If the list is empty, it is null
    protected LinkedNode<E> head;
    // this is the end of the linked list.  If the list is empty, it is null
    protected LinkedNode<E> tail;
    protected int size;


    // there are some relationships between the class variables.  This
    // method checks that these relationships always hold.  Any
    // property that always holds is called an invariant.

    // the property may not hold in the middle of a method,
    // so only call this at the beginning or end of a public method.




    /**
     * initializes an empty linked list
     */
    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
        // one of the constructor's jobs is to make sure that the invariants hold.
        checkInvariants();
    }



    // these private (helper) methods simplify implementation of
    // the public "add" methods
    // the helper methods never modify "size", the public methods
    // take care of that, so the invariants probably do not hold at the end of
    // a helper methods

    /**
     * adds at the head of the list
     */
    private void addAtFront(E value) {
        head = new LinkedNode<E>(value, head);
        if (tail == null) {
            tail = head;
        }
    }


    /**
     * adds at the tail of the list.  Assumes (and checks) that tail is not null
     */
    private void addAtEnd(E value) {
        if (tail == null) {
            throw new RuntimeException ("invalid call to addAtEnd, tail is null");
        }
        LinkedNode<E> newNode = new LinkedNode<E>(value);
        tail.next = newNode;
        tail = newNode;
    }


    /**
     * adds a value to the list after the given node
     */
    private void addAfter(LinkedNode<E> reference, E value) {
        LinkedNode<E> newNode = new LinkedNode<E>(value, reference.next);
        reference.next = newNode;
        if (reference == tail) {  // if added at end, update tail value
            tail = newNode;
        }
    }


    /**
     * adds a value to the end of the list
     */
    public boolean add(E value) {
        checkInvariants();  // useful for debugging
        if (head != null) {
            addAtEnd (value);
        } else {
            addAtFront (value);
        }
        size++;
        checkInvariants();  // invariants valid at start, are they still valid?
        // i.e., did this method break the invariants?
        return true;
    }


    /**
     * adds a value to the list, in the given position
     */
    public void add(int index, E value) {
        checkInvariants();
        if ((index < 0) || (index > size)) {
            String badIndex =
                    new String ("index " + index + " must be between 0 and " + size);
            throw new IndexOutOfBoundsException(badIndex);
        }
        if (index == 0) {
            addAtFront (value);
        } else {
            addAfter (nodeAtPosition (index - 1), value);
        }
        size++;
        checkInvariants();
    }


    /**
     * concatenates the elements of the linked list, separated by " ==> "
     */
    public String toString() {
        checkInvariants();
        LinkedNode<E> node = head;
        StringBuffer result = new StringBuffer();
        while (node != null) {
            result.append (node.item.toString());
            node = node.next;
            if (node != null) {
                result.append (" ==> ");
            }
        }
        checkInvariants();   // make sure we didn't break anything
        return result.toString();
    }


    /**
     * unit test method -- basic testing of the functionality
     */
    public static void main (String [] arguments) {
        LinkedList<String> ll = new LinkedList<String>();
        System.out.println (ll);
        ll.add ("foo");
        System.out.println (ll);
        ll.add (1, "bar");
        System.out.println (ll);
        ll.add ("baz");
        System.out.println (ll);
        ll.add (0, "hello");
        System.out.println (ll);
        ll.add (1, "world");
        System.out.println (ll);
    }

}
