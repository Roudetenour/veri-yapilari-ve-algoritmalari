/**
 * Created by Nur Nabhan on 8/4/2017.
 */
public class LinkedList {
    private LinkedList next;
    private final String word;
    // constructor
    public LinkedList(String word, LinkedList next) {
        this.word = word;
        this.next = next;
    }