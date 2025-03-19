package week1.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		
		/* Create an object for the Library class in the main method of LibraryManagement.
		 Call both methods of the Library class from LibraryManagement and execute.*/

		Library objaddbook = new Library() ;
		Library objissuebook = new Library() ;
	
	String book=	objaddbook.addBook("Atomic Habit");
		objissuebook.issueBook();
		System.out.println(book);
	}

}
