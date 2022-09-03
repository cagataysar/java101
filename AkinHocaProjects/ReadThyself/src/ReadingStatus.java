public class ReadingStatus {

    String readingStatus;
    Book book;

    public ReadingStatus() {
    }

    public ReadingStatus(String readingStatus, Book book) {
        this.readingStatus = readingStatus;
        this.book = book;
    }

    public String getReadingStatus() {
        return readingStatus;
    }

    public void setReadingStatus(String readingStatus) {
        this.readingStatus = readingStatus;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    void readingStatus() {
        if (book.currentPage == 0) {
            this.readingStatus = "okuyacak.";
        } else if (book.currentPage > 0) {
            this.readingStatus = "okuyor.";
        } else if (book.page - book.currentPage == 0) {
            this.readingStatus = "okudu.";
        }
    }
}
