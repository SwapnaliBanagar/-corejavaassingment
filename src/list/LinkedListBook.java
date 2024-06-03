package list;
import java.util.LinkedList;

	class Book{
		int id;
		String bookName;
		String authorName;
		int price;
		int quntity;
		public Book(int id,String bookName, String authorName,int price,int quantity)
		{
			this.id=id;
			this.bookName=bookName;
			this.authorName=authorName;
			this.price=price;
			this.quntity=quantity;
						
		}
		
	}
	public class LinkedListBook {
	public static void main(String[] args) {
		LinkedList<Book>list=new LinkedList<>();
		Book b1=new Book(101 , "Java", "GamesGosling",500, 10);
		Book b2=new Book(102 , "OOps", "Swapnali",90, 7);

		list.add(b1);
		list.add(b2);
		
	for(Book b:list)
	{
		System.out.println("id:"+b.id+" |"+"bookName:"+b.bookName+" |"+"authorName:"+b.authorName+" |"+"price:"+b.price+" |"+"quantity:"+b.quntity);
		System.out.println("_______________________________________________________________________________________________________________");
	}
	}

}
