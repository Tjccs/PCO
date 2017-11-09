import java.util.ArrayList;
import java.util.Collection;

public class SuperList<E> {
	private ArrayList<E> genericList;

	public  SuperList() {
		genericList = new ArrayList<E>();
	}

	public void add(E i) {
		genericList.add(i);
	}

	public ArrayList<E> get() {
		return genericList;
		
	}

	public boolean isEmpty() {
		return (genericList.isEmpty()) ? true : false;
	}

	public int size() {
		return genericList.size();
	}

	public void remove(int index) {
		genericList.remove(index);
	}

	public boolean contains(E i) {
		return (genericList.contains(i)) ? true : false;
	}

	 public void append(SuperList<? extends E> l) {
		 genericList.addAll((Collection<? extends E>) l);
	 }

	 public static 
}
