package mylinkedlist;

public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();    
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        System.out.print("Display: ");
        linkedList.display();
        // 1 --> 2 --> 3 --> 4 --> null
        
        System.out.println("Length: " + linkedList.length());
        
        System.out.print("Delete First : ");
        linkedList.deleteFirst(); 
        linkedList.display();
        // 2 --> 3 --> 4 --> null
        
        System.out.print("Delete Last: ");
        linkedList.deleteLast();
        linkedList.display();
        // 2 --> 3 --> null
        
        MyLinkedList ld1 = new MyLinkedList(); 
        ld1.addLast(1);
        ld1.addLast(2);
        ld1.addLast(3);
        ld1.addLast(4);
        ld1.addLast(5);
        ld1.addLast(6);
        System.out.print ("Delete Position: ");
        ld1.delete(3);
        // 1 --> 2 --> 3 --> 5 --> 6 --> null
        ld1.display();
        
        MyLinkedList ld2 = new MyLinkedList(); 
        ld2.addLast(1);
        ld2.addLast(2);
        ld2.addLast(3);
        ld2.addLast(4);
        ld2.addLast(5);
        System.out.println("Search: " + ld2.search(4));
        // true
        
        System.out.println("Data Search position: " + ld2.searchPosition(3).data);
        // 4
        
        //sort
        MyLinkedList sort1 = new MyLinkedList(); 
        sort1.addLast(5);
        sort1.addLast(2);
        sort1.addLast(1);
        sort1.addLast(3);
        sort1.addLast(4);
        System.out.print("Before sort: ");
        sort1.display();
        sort1.sort();
        System.out.print("After Sort: ");
        sort1.display();
       
        
        
    }
    
    
}
