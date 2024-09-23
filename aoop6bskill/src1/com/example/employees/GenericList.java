package com.example.employees;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;
public class GenericList<T extends Comparable<T> & Cloneable> implements Iterable<T> {
	 private List<T> items;

	    public GenericList() {
	        this.items = new ArrayList<>();
	    }

	    public void addItem(T item) {
	        items.add(item);
	    }

	    public void sortByComparator(Comparator<T> comparator) {
	        items.sort(comparator);
	    }

	    public void sortByNaturalOrder() {
	        items.sort(null); // Uses the natural ordering (Comparable)
	    }

	    @SuppressWarnings("unchecked")
		public T cloneItem(T item) {
	        try {
	            return (T) item.getClass().getMethod("clone").invoke(item);
	        } catch (Exception e) {
	            throw new RuntimeException("Cloning not supported", e);
	        }
	    }

	    @Override
	    public Iterator<T> iterator() {
	        return items.iterator();
	    }
}
