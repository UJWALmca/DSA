package linked_list;

 class Linkedlist {

    Node head;
    Node tail;

    public void insertfirst(int val){
        Node s = new Node(val);
        s.next=head;
        head =s;

        if(tail == null){
         tail=head;
        }
    }
   public void  display(){
    Node temp = head;
    while(temp!=null){
        System.out.print(+temp.value+"->");
        temp = temp.next;
    }
   }

    

    
 class Node{
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
    

    

   
 }
    
}
