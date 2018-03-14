package HW5;

import java.util.List;
import java.util.ArrayList;

public class Bookrun {

	public static void main(String[] args) {

		String[] authorsBook1 = { "Claire L.Evans" };
		Book book1 = new Book("Broad Band", authorsBook1, "Umbrella corp", 2018, 442, 532, "hard");

		String[] authorBook2 = { "Candice Fox" };
		Book book2 = new Book("Crimson lake", authorBook2, "Skynet", 2016, 321, 233, "limp");

		String[] authorBook3 = { "Jennifer Clement" };
		Book book3 = new Book("Gun love", authorBook3, "Sensivity", 2001, 541, 182, "hard");

		Book[] books = { book1, book2, book3 };

		System.out.println("Book by Claire L.Evan: " + booksByAuthor("Claire L.Evan", books));
		System.out.println("Book by Skynet: " + booksByPublisher("Skynet", books));
		System.out.println("Book after 2009: " + booksAfterYear(2009, books));

	}

	public static List<Book> booksByAuthor(String author, Book[] books) {
		List<Book> result = new ArrayList<>();

		for (Book book : books) {
			for (String authorBook : book.getAuthors()) {
				if (author.equals(authorBook)) {
					result.add(book);
				}
			}
		}

		return result;
	}

	public static List<Book> booksByPublisher(String publisher, Book[] books) {
		List<Book> result = new ArrayList<>();

		for (Book book : books) {
			if (publisher.equals(book.getPublisher())) {
				result.add(book);
			}
		}

		return result;
	}

	public static List<Book> booksAfterYear(int year, Book[] books) {
		List<Book> result = new ArrayList<>();

		for (Book book : books) {
			if (year < book.getYear()) {
				result.add(book);
			}
		}

		return result;
	}
}
