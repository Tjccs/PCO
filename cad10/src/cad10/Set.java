package cad10;

import java.util.Iterator;


public class Set<E> implements ISet<E> {
	private Node<E> head;
	private int size;

	class Node<E> {
		private E element;
		Node<E> next;

		public Node (E e) {
			element = e;
			next = null;
		}
	}

	public Set() {
		head = null;
		size = 0;
	}

	@Override
	public void insert(E x) {
		if(!isIn(x)) {
			Node <E> novo = new Node<>(x);
			novo.next = head;
			head = novo;
			size++;
		}
	}

	@Override
	public void remove(E x) {
		Node<E> n = head;
		Node<E> nBefore = null;
		while(n!=null) {
			if(n.element.equals(x)) {
				if(nBefore==null) {
					head = n.next;
				}else {
					nBefore.next = n.next;
				}
			}
			nBefore = n;
			n = n.next;
		}
	}

	@Override
	public E get(int i) {
		Node<E> n = head;
		int k = 0;
		while(n != null) {
			if(k==i) {
				return n.element;
			}
			n = n.next;
			k++;
		}
		throw new IndexOutOfBoundsException();
	}
	
	@Override
	public boolean isIn(E x) {
		Node<E> n = head;
		while (n != null) {
			if(n.element.equals(x)) {
				return true;
			}
			n = n.next;
		}
		return false;
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size==0) ? true : false;
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	@Override
	public boolean subSet(ISet<? extends E> other) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new SetIterator();
	}
	
	class SetIterator<E> implements Iterator<E> {
		private Node<E> current;
		
		SetIterator() {
			//current = head;
		}
		public E next() {
			return null;
		}
		
		public boolean hasNext() {
			return false;
		}
	}
}
