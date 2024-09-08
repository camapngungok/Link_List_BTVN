package mylinkedlist;



public class MyLinkedList {
    private Node head;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            head = newNode;
            return;
        }
        while(null != temp.next){
            temp = temp.next;
        }
        temp.next = newNode;
        
    }
    
    public void addPosition(int index, int data){
        Node newNode = new Node (data);
        if(index == 0){
            newNode.next = head;
            head = newNode; 
            return;
        } else{
            Node temp = new Node();
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            Node current = temp.next;
            temp.next = newNode;
            newNode.next = current;
        }   
    }
    /*
    viet code cho ham sau
            1.public int length():
            2. public void display()
            3. public void deleteFirst()

    */
    
    public int length(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count ++;
            temp = temp.next;
        }
        return count;
    }
    
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public void deleteFirst(){
        if(head == null){
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        
    }
    
    public void deleteFirst2(){
        if(head == null){
            return;
        }
        head = head.next;
    }
    
    public void deleteLast(){
        if(head == null){
            return;
        }
        Node current = head;
        Node previous = null;
        while(current.next!= null){
            previous = current;
            current = current.next;
        }
        previous.next = null; 
    }
    
    public void delete(int index){
        if(index == 0){
            head = head.next;
            return;
        } 
        else if (index == length() - 1){
            deleteLast();
            return;
        }
        else{
            Node previous = head;
            for(int i = 0; i < index - 1; i++){
                previous = previous.next;
            }  
            Node current = previous.next;
            previous.next = current.next; 
        }
         
    }
    
    public boolean search (int data){
        if(head == null){
            return false;
        }
        Node temp = head;
        while (temp != null){
            if(temp.data == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    
    public Node searchPosition(int index){
        if(index < 0 || index >= length()){
            return null;
        }
        int count =0;
        Node temp = head;
        while (count < index){
            temp = temp.next;
            count ++;
        }
        return temp; 
    }
    
    
    //BTVN 1:
    public void delete1(int index){
        if(index == 0){
            head = head.next;
            return;
        } else{
            int count = 0;
            Node previous = head;
            while(count < index - 1){
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            previous.next = current.next;
        }  
    }
    
    //BTVN 2: Viet ham sort().
    public void sort(){
        if(head == null || head.next == null){
            return;
        }
        Node i, j;
        for(i = head; i != null ; i = i.next){
            for(j = i.next; j != null ; j = j.next){
                if(i.data > j.data){
                    //swap data node i voi j
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        } 
    }
    
}
