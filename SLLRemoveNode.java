package com.programs.hackerrank;


class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;
        
        public SinglyLinkedListNode(int data){
    		this.data=data;
    	}
    }


public class SLLRemoveNode {

	public void add(SinglyLinkedListNode listHead, int data){
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
	
	public static SinglyLinkedListNode removeNodesGreaterThanX(SinglyLinkedListNode listHead, int x) {
	    // Write your code here
		if(listHead==null){
			System.out.println(new RuntimeException("remove: list is empty"));
			return null;
		}else{
			SinglyLinkedListNode curr=listHead;
			SinglyLinkedListNode prev=listHead;
			int cntr=0;
			while(curr!=null){
				if(curr.data>x){
					if(cntr==0) {
						listHead = listHead.next;
						curr = listHead;
					}else{
						prev.next = curr.next;
						curr = curr.next;
					}
				}else {
					prev=curr;
					curr=curr.next;
					cntr++;
				}
			}
	    }
		return listHead;
	}
	
	public static void main(String[] args) {
		SLLRemoveNode sll=new SLLRemoveNode();
		SinglyLinkedListNode listHead=new SinglyLinkedListNode(15);
		sll.add(listHead,59);
		sll.add(listHead,88);
		sll.add(listHead,69);
		sll.add(listHead,86);
		sll.add(listHead,86);
		sll.add(listHead,96);
		sll.add(listHead,17);
		sll.add(listHead,100);
		sll.add(listHead,81);
		sll.add(listHead,89);
		sll.add(listHead,45);
		sll.add(listHead,16);
		sll.add(listHead,45);
		sll.add(listHead,9);
		sll.add(listHead,13);
		sll.add(listHead,97);
		sll.add(listHead,36);
		sll.add(listHead,84);
		sll.add(listHead,56);
		sll.add(listHead,94);
		sll.add(listHead,27);
		sll.add(listHead,100);
		sll.add(listHead,15);
		sll.add(listHead,32);
		sll.add(listHead,2);
		sll.add(listHead,1);
		sll.add(listHead,25);
		sll.add(listHead,72);
		sll.add(listHead,60);
		sll.add(listHead,34);
		sll.add(listHead,17);
		sll.add(listHead,65);
		sll.add(listHead,53);
		sll.add(listHead,66);
		sll.add(listHead,16);
		sll.add(listHead,73);
		sll.add(listHead,37);
		sll.add(listHead,66);
		sll.add(listHead,67);
		sll.add(listHead,88);
		sll.add(listHead,45);
		sll.add(listHead,8);
		sll.add(listHead,53);
		sll.add(listHead,86);
		sll.add(listHead,76);
		sll.add(listHead,24);
		sll.add(listHead,97);
		sll.add(listHead,19);
		sll.add(listHead,88);
		SinglyLinkedListNode listHead1=new SinglyLinkedListNode(3);

		sll.add(listHead1,2);
		sll.add(listHead1,1);
		sll.add(listHead1,4);
		sll.add(listHead1,5);
		sll.add(listHead1,6);
		sll.show(listHead);

		sll.show(sll.removeNodesGreaterThanX(listHead, 9));

	}
}
