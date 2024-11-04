
package com.mycompany.assi_phonelist;


public class phonelist {
    node head;
    
    phonelist(){
        head=null;
    }
    public boolean isEmpty(){
         return head==null;
    }
    public void addContact(String name, String phoneNumber){
        node newnode=new node( name, phoneNumber);
        
        if(isEmpty()){
            head=newnode;
        }else{
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            newnode.next=null;
            temp.next=newnode;
        }
        System.out.println("Contact added: " + name + ", " + phoneNumber);
        
    }
    public void  displayList(){
        if (isEmpty()) {
            System.out.println("Phone list is empty.");
        } else {
        node temp = head;
        System.out.print("The Linked List is: \n");
        while (temp != null) {
            System.out.print("Name: "+ temp.name + ", Phone: " + temp.phonenum );
            temp = temp.next;  
            System.out.println();
        }
    System.out.println();
    }
    }
    public void searchContact(String name) {
    node current = head ; 
    boolean found = false;
    while (current != null) {
        if (current.name.equalsIgnoreCase(name)) {
            System.out.println("Contact found: \nName: " + current.name + ", Phone: " + current.phonenum);
            found = true;
            break;
        }
        current = current.next; 
    }
    if (!found) {
        System.out.println("Contact with name '" + name + "' not found.");
    }
    }
    public void deleteContact(String name) {
    if (isEmpty()) {
        System.out.println("Phone list is empty.");
        return;
    }
    if (head.name.equals(name)) {
        head = head.next;
        System.out.println("Deleting contact: " + name);
    } else {
        node temp = head;
        while (temp.next != null && !temp.next.name.equals(name)) {
            temp = temp.next;
        }
        if (temp.next != null && temp.next.name.equals(name)) {
            System.out.println("Deleting contact: " + temp.next.name + ", " + temp.next.phonenum);
            temp.next = temp.next.next;
        } else {
            System.out.println("Contact with name '" + name + "' not found.");
        }
    }
}

}
