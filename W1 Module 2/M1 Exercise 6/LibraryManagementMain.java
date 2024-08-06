import java.util.Arrays;

public class LibraryManagementMain {
    public static void main(String[] args) {
        Book[] books = {
            new Book("B43473", "The White Tiger", "Aravind Adiga"),
            new Book("B54920", "A Suitable Boy", "Vikram Seth"),
            new Book("B45860", "The God of Small Things", "Arundhati Roy"),
            new Book("B57392", "A Fine Balance", "Rohinton Mistry")
        };

        LibraryManagementSearch librarySearch = new LibraryManagementSearch();

        Book foundBook = librarySearch.linearSearch(books, "A Suitable Boy");
        System.out.println("Linear Search: Found " + foundBook);

        Arrays.sort(books, (b1, b2) -> b1.obtainBookTitle().compareToIgnoreCase(b2.obtainBookTitle()));

        foundBook = librarySearch.binarySearch(books, "The White Tiger");
        System.out.println("Binary Search: Found " + foundBook);
    }
}

