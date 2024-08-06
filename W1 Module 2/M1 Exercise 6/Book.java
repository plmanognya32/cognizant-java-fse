public class Book {
        private String bookId;
        private String title;
        private String author;
    
        public Book(String bookId, String title, String author) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
        }
    
        public String obtainBookId() {
            return bookId;
        }

        public String obtainBookTitle() {
            return title;
        }

        public String obtainBookAuthor() {
            return author;
        }
    
        @Override
        public String toString() {
            return 
                    "bookId='" + bookId + '\'' +", title='" + title + '\'' +", author='" + author + '\'';
        }
    }

