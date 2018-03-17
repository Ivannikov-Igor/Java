package HW5;

import java.util.Arrays;

public class Book {
	private static int nextId = 1;
	private final int id = nextId++;
	private final String name;
	private final String[] authors;
	private final String publisher;
	private final int year;
	private final int pages;
	private int price;
	private final String bindingType;

	public Book(String name, String[] authors, String publisher, int year, int pages, int price, String bindingType) {
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.bindingType = bindingType;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String[] getAuthors() {
		return (String[]) authors.clone();
	}

	public String getPublisher() {
		return publisher;
	}

	public int getYear() {
		return year;

	}

	public int getPages() {
		return pages;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public static int getNextId() {
		return nextId;
	}

	public String getBindingType() {
		return bindingType;
	}
		@Override
		public String toString() {
	        return "Book{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", authors=" + Arrays.toString(authors) +
	                ", publisher='" + publisher + '\'' +
	                ", year=" + year +
	                ", pages=" + pages +
	                ", price=" + price +
	                ", bindingType='" + bindingType + '\'' +
	                '}';
	       
	    
	         }
	
	}


// Создать классы, спецификации которых приведены ниже.
// Определить конструкторы и методы setТип(), getТип(), toString(). Определить
// дополнительно
// методы в классе, создающем массив объектов. Задать критерий выбора данных
// и вывести эти данные на консоль. В каждом классе, обладающем информацией,
// должно быть объявлено несколько конструкторов
// Book: id, Название, Автор (ы), Издательство, Год издания, Количество страниц,
// Цена, Тип переплета.
// Создать массив объектов. Вывести:
// a) список книг заданного автора;
// b) список книг, выпущенных заданным издательством;
// c) список книг, выпущенных после заданного года
