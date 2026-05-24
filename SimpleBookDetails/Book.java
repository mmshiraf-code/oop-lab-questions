/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimpleBookDetails;

/**
 *
 * @author Shiraf
 */
class Book {

    private String bookTitle;
    private String writerName;
    private int pageCount;

    public Book(String bookTitle, String writerName, int pageCount) {
        this.bookTitle = bookTitle;
        this.writerName = writerName;
        this.pageCount = pageCount;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getWriterName() {
        return writerName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getBookType() {

        if (pageCount < 100) {
            return "Short Book";
        } else {
            return "Regular Book";
        }

    }
}