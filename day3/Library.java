package week1.day3;

public class Library {
	
	public String addBook(String bookTitle) {
		
		System.out.println("Book added successfully");
		return  bookTitle;
	}
      
	/* Define a method issueBook().
	 Print the statement "Book issued successfully"*/
	
	public void issueBook() {
		
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[]arrg) {
		
		Library objAddBook = new Library ();
		Library ObjBookIssued = new Library() ;
		
		String book = objAddBook.addBook("Atomic Habbit");
		
		ObjBookIssued.issueBook();
		System.out.println(book);
	}
		
	}
		
	
	

