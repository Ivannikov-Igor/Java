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


// ������� ������, ������������ ������� ��������� ����.
// ���������� ������������ � ������ set���(), get���(), toString(). ����������
// �������������
// ������ � ������, ��������� ������ ��������. ������ �������� ������ ������
// � ������� ��� ������ �� �������. � ������ ������, ���������� �����������,
// ������ ���� ��������� ��������� �������������
// Book: id, ��������, ����� (�), ������������, ��� �������, ���������� �������,
// ����, ��� ���������.
// ������� ������ ��������. �������:
// a) ������ ���� ��������� ������;
// b) ������ ����, ���������� �������� �������������;
// c) ������ ����, ���������� ����� ��������� ����
