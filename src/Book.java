public class Book extends Product {

    private String author;
    private int pages;

    Book(){
        System.out.println("This is a Book");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
//    @Override
//    public String toString(){
//        return "Author:                " + author + "\n";
//    }
}