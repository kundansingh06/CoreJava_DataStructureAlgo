package com.kundan.list;
import java.util.Arrays;
public class MyList {
	private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    
    public void add(Object e) {
        if (size == elements.length) {
        	ensureCapacity();
        }
        elements[size] = e;
        size=size+1;
    }
    
    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    
    public Object get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return elements[i];
    }
    
    public static void main(String[] args) {
    	MyList list = new MyList();
    	list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        
        Integer i = (Integer) list.get(4);
        System.out.println(i);
	}
    
}
