package org.example;

public class Book {
    public String name;
    public int pageCont;

    public void Info(){
        System.out.println("имя - "+this.name+" "+this.pageCont+" страниц");
    }
    public Book(String name, int pageCont) {
        this.name = name;
        this.pageCont = pageCont;
    }

    public static void main(String[] args) {
        Book myBook = new Book("Му-му", 12);
        myBook.Info();
        Cats cat = new Cats("Мурз", "Мурзилка", 4);
        cat.Info();
        System.out.println(cat.getName());
    }
}
