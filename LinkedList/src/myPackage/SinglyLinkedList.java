package myPackage;

import java.util.Scanner;

public class SinglyLinkedList{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		LinkedList list = new LinkedList();
		
		System.out.println("Singly Linked List  Test\n");
		char ch;
		
		do{
			System.out.println("\n Singly Linked list operation\n");
			System.out.println("1. insert at beginning");
			System.out.println("2. insert at end");
			System.out.println("3. insert at position");
			System.out.println("4: delete at position");
			System.out.println("5: check empty");
			System.out.println("6: get size");
			System.out.println("7: Reverse the Linked List");
			int choice = scan.nextInt();
			
			switch(choice){
			case 1:
				System.out.println("Enter integer element to insert");
				list.insertAtStart(scan.nextInt());
				break;
			case 2:
				System.out.println("Enter integer element to insert ");
				list.insertAtEnd(scan.nextInt());
				break;
			case 3: 
				System.out.println("Enter integer element to insert");
				int val = scan.nextInt();
				System.out.println("Enter the position");
				int pos = scan.nextInt();
				if(pos <=1 || pos > list.getSize())
					System.out.println("Invalid Position\n");
				else
					list.insertAtPos(val, pos);
				break;
			case 4:
				System.out.println("Enter the position");
				int p = scan.nextInt();
				if(p <=1 || p > list.getSize())
					System.out.println("Invalid position\n");
				else
					list.deleteAtPos(p);
				break;
			case 5 : 
				System.out.println("List status = " + list.isEmpty());
				break;
			case 6:
				System.out.println("List size = " + list.getSize());
				break;
			case 7:
				System.out.println("Reversed Linked List");
				list.reverseList();
				break;
			default:
				System.out.println("Wrong Entry\n");
				break;
			}
			list.display();
			System.out.println("\n Do you want to continue(Type y or n)\n");
			ch = scan.next().charAt(0);
		}
		while(!(ch=='N' || ch == 'n'));
	}
	
}