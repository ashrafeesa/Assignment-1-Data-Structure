
package com.mycompany.assi_phonelist;


public class node {
    String phonenum;
    String name;
    node next;
    
    node(){
        phonenum=null;
        name=null;
    }
    node(String name,String phonenum){
        this.phonenum=phonenum;
        this.name=name;
    }
    
}
