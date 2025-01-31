package com.programming.class3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDS {
	public static void main(String[] args) {
		LinkedList<String> listStr = new LinkedList<>();
		listStr.add("A");
		listStr.add("A");
		listStr.add("A");
		listStr.add("A");
		listStr.add(null);
		listStr.add(null);
		listStr.add(null);

		
		listStr.addFirst("ABC");
		listStr.addLast("ABC");
		listStr.removeFirstOccurrence("Z");
		listStr.removeLastOccurrence("Z");
		listStr.removeFirst();
		listStr.removeLast();
		
		Object o =listStr.poll();
		o=listStr.pollFirst();
		o=listStr.pollLast();
		
		List<String> listStr2 = new ArrayList<>();
		listStr2.add("P");
		listStr2.add("A");
		listStr2.add("A");
		listStr.set(1, "ABC");// updates the data at the very index
		listStr.addAll(listStr2);
		// listStr.removeAll(listStr2);
		listStr.retainAll(listStr2);
		System.out.println("Size: " + listStr.size());
		Iterator<String> itr = listStr.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

}
