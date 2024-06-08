package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private Integer size = 0;
	@Override
	public boolean add(T item) {
		if (size == items.length) {
			resizeArray();
		}
		items [size++] = item;
		return true;
	}

	private void resizeArray() {
		Object[] newItems = new Object [items.length * 2];
		System.arraycopy(items, 0, newItems, 0, items.length);
		items = newItems;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
