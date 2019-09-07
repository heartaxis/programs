package com.practice.programs.random;


class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;
        
        public SinglyLinkedListNode(int data){
    		this.data=data;
    	}
    }


public class SLL {

	public void add(SinglyLinkedListNode listHead,int data){
		SinglyLinkedListNode temp=new SinglyLinkedListNode(data);
		if(listHead==null){
			listHead=temp;
		}else{
			SinglyLinkedListNode curr=listHead;
			while(curr.next!=null){
				curr=curr.next;
			}
			curr.next=temp;
		}
	}
	public void show(SinglyLinkedListNode listHead){
		if(listHead==null){
			System.out.println(new RuntimeException("show: list is empty"));
			return;
		}else{
			SinglyLinkedListNode temp=listHead;
			while(temp!=null){
				System.out.print(temp.data+"\t");
				temp=temp.next;
			}
		}
		System.out.println();
	}
	
	public static SinglyLinkedListNode removeNodes(SinglyLinkedListNode listHead, int x) {
	    // Write your code here

		if(listHead==null){
			System.out.println(new RuntimeException("remove: list is empty"));
			return null;
		}else{
			SinglyLinkedListNode curr=listHead;
			SinglyLinkedListNode prev=listHead;
			while(curr!=null){
				if(curr.data>x){
					prev.next=curr.next;
					curr=curr.next;
				}else {
					prev=curr;
					curr=curr.next;
				}
			}
	    }
		return listHead;
	}
	
	public static void main(String[] args) {
		SLL sll=new SLL();
		SinglyLinkedListNode listHead=new SinglyLinkedListNode(1);
		sll.add(listHead,2);
		sll.add(listHead,3);
		sll.add(listHead,5);
		sll.add(listHead,4);
		sll.add(listHead,6);
		sll.show(listHead);
		sll.removeNodes(listHead, 5);
		sll.show(listHead);

	}
}
