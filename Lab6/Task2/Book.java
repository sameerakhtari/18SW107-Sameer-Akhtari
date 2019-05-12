class Book{
	private String bookName;
	Author [] authors;
	private double price;
	private int qty;
	public Book(String bookName,Author[] authors, double price)
	{
		this.bookName=bookName;
		this.authors=authors;
		this.price=price;
	}
	public Book(String bookName,Author[] authors, double price, int qty)
	{
		this.bookName=bookName;
		this.authors=authors;
		this.price=price;
		this.qty=qty;
	}
	




	public String getName()
	{
		return bookName;
	}
	public Author[] getAuthor()
	{
		return authors;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public int getQty()
	{
		return qty;
	}
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	public String toString()
	{
		return "Book[Name: "+bookName+" Author: "+authors.toString()+" Price: "+price+" Quintity:"+qty+" ]";
	}
}