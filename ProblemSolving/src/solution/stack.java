package solution;

import java.util.EmptyStackException;

public class stack {
	  public class node{
		  Object element;
		  node next;
	  }
	  private int size;
	  private node head;
	  public stack() {
		   head = null;
		   size = 0;
	  }
	  
	  
		public boolean isEmpty() {
		   if(size == 0) {
			   return true;
		   }
			return false ;
		}
		
		
		public int size() {
			return size;
		}
		
		
		public Object pop()throws EmptyStackException {
			if(isEmpty()==true) {
				throw new EmptyStackException();
			}else {
				Object p = head.element;
				head = head.next;
				size--;
				return p;
			}
		}
		
		
		public void push(Object element) {
			node d = new node();
			d.element = element;
			if(isEmpty() == true) {
				 head = d;
			}else {
				d.next = head;
				head = d;
			}
			
			size++;
		}
		
		public Object peek()throws EmptyStackException {
			    if(isEmpty() == true) {
			    	throw new EmptyStackException();
			    }else {
			    	return head.element;
			    }
			 }
		}
		  
	
	
	

