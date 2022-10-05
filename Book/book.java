import java.util.Scanner;
class BookDemo{
    String bookName,authorName,publisher;
    int isbn;
    private int i = 0;
    Book bookArr[] = new Book[30];
    BookDemo(String bn , String an, String p , int i){
        bookName = bn;
        authorName = an;
        publisher = p;
        isbn = i;
    }
    BookDemo(){
        bookName = "";
        authorName = "";
        publisher = "";
        isbn = 0;
    }
    public String getAuthorName() {
        return authorName;
    }
    public String getBookName() {
        return bookName;
    }
    public int getIsbn() {
        return isbn;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }public void setIsbn(int isbn) {
        this.isbn = isbn;
    } 
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getBookInfo(){
        String info = "ISBN :"+this.isbn+" Book name : "+this.bookName+" Author Name: "+this.authorName+" Publisher : "+this.publisher;
        return info;

    }
    void storeBook(Book ob){
        i = i + 1;
        bookArr[i] = ob;
    }
}

class BookMain {
    public static void main(String[] args) {
        //created a scanner object to take input from users
        Scanner scan = new Scanner(System.in);
        //created two book objects 1) non parametaried 2) zero parametarized
        Book book1 = new BookDemo("The Indian Girl","Chetan Bhagat", "Chetan Publications" , 19125672);
        Book book2 = new BookDemo();
        Book book3 = new BookDemo();
        // setting instances of the objects using set method
        System.out.println("enter the Book name :");
        String bookname = scan.nextLine();
        book1.setBookName(bookname);
        System.out.println("enter the Author name :");
        String authorname = scan.nextLine();
        book2.setAuthorName(authorname);
        System.out.println("enter Publisher name :");
        String pub = scan.nextLine();
        book2.setPublisher(pub);
        System.out.println("enter the ISBN number :");
        int isb = scan.nextInt();
        book2.setIsbn(isb);
        //printing final verdict
        book2.getBookInfo();
        book3.storeBook(book1);
        book3.storeBook(book2);
        for(int i = 0;i<book3.bookArr.length;i++){
            System.out.println(book3.bookArr[i].getBookInfo());
        }
    }
}