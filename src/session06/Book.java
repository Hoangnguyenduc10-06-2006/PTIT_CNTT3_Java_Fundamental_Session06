package session06;

public class Book {
    private String id;
    private String title;
    private String author;


    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public void printInfo() {
        System.out.println("Mã sách: " + id);
        System.out.println("Tên sách: " + title);
        System.out.println("Tác giả: " + author);
    }
}
