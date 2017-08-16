/** 
** Add method in liniked List
**/
/*************************** Add last *****************************************/
    public class SinglyLinkedList {
      …
 
      public void addLast(SinglyLinkedListNode newNode) {
            if (newNode == null)
                  return;
            else {
                  newNode.next = null;
                  if (head == null) {
                        head = newNode;
                        tail = newNode;
                  } else {
                        tail.next = newNode;
                        tail = newNode;
                  }
            }
      }
/*************************** Add First *****************************************/
    public void addFirst(SinglyLinkedListNode newNode) {
            if (newNode == null)
                  return;
            else {
                  if (head == null) {
                        newNode.next = null;
                        head = newNode;
                        tail = newNode;
                  } else {
                        newNode.next = head;
                        head = newNode;
                  }
            }
      }
 /*************************** Insert After *****************************************/
    public void insertAfter(SinglyLinkedListNode previous,
                  SinglyLinkedListNode newNode) {
            if (newNode == null)
                  return;
            else {
                  if (previous == null)
                        addFirst(newNode);
                  else if (previous == tail)
                        addLast(newNode);
                  else {
                        SinglyLinkedListNode next = previous.next;
                        previous.next = newNode;
                        newNode.next = next;
                  }
            }
      }
}
