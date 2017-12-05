package cad10;

import java.util.Iterator;

/**
*The objects of this type represent mutable and unbounded sets of elements of type E.
*
*/
public interface ISet<E> extends Iterable<E> {
	
	/**
	*@param x The element to be inserted
	*@requires x!=null
	*/
	public void insert(E x);
	
	
	/**
	 *Removes a given element from the set.
	 *@param x The element to be removed
	 *@requires x!=null
	 */
	public void remove(E x);
	
	/**
	 *Returns an element of the set.
	 *@param i
	 *@return
	 *@requires 0 <= i < size()
	 */
	public E get(int i);
	
	/**
	*Returns true if the element is in the set and false otherwise.
	*@param x The element
	*@return if the element is in the set
	*@requires x!=null
	*/
	public boolean isIn(E x);
	
	/**
	*Returns true if the set is empty and false otherwise.
	*@return if the set is empty
	*/
	public boolean isEmpty();
	
	/**
	*Returns the cardinality of the set
	*@return the number of elements in the set
	*/
	public int size();
	
	/**
	*Returns true if other is s subset of this and false otherwise.
	*@param other The other set
	*@return if the set is subset of this
	*/
	public boolean subSet(ISet<?extends E> other);
	
	/**
	*Returns a generator that produces all elements of the set,
	*exactly once in arbitrary order
	*@return an iterator of the elements in the set
	*@requires this not be modified while the generator is used
	*/
	public Iterator<E> iterator();
}
