package com.programming.class3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListForCustomClasses {

	public static void main(String[] args) {
		List<Book> listBook = new ArrayList<>();
		Book b1 = new Book(123, "A", "B", "C", 1000);
		Book b2 = new Book(124, "N", "B", "C", 1500);
		Book b3 = new Book(125, "M", "B", "C", 2000);

		listBook.add(b1);
		listBook.add(b1);
		listBook.add(b1);
		listBook.add(b3);
		listBook.add(b2);

//		Iterator<Book> itr = listBook.iterator();
//		while (itr.hasNext()) {
//			Book b = itr.next();
//			System.out.println(
//					b.bookId + " " + b.bookName + " " + b.bookAuthor + " " + b.bookPublisher + " " + b.bookQuantity);
//		}
		for (Book b : listBook) {
			System.out.println(
					b.bookId + " " + b.bookName + " " + b.bookAuthor + " " + b.bookPublisher + " " + b.bookQuantity);
		}

	}

}
