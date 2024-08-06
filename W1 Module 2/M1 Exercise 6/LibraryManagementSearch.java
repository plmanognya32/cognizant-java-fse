public class LibraryManagementSearch {
    public Book linearSearch(Book[] books, String title) {
        for (Book book : books) {
            if (book.obtainBookTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        System.out.println("The book titled " + title + " not found.");
        return null;
    }

    public Book binarySearch(Book[] books, String title) {
        int left = 0, right = books.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (books[mid].obtainBookTitle().equalsIgnoreCase(title)) {
                return books[mid];
            } else if (books[mid].obtainBookTitle().compareToIgnoreCase(title) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Book titled " + title + " not found.");
        return null;
    }
}
