package Chap4;

import java.util.Scanner;

class Book7 {
    String title, author;
    public Book7(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class BookArray {
    public static void main(String[] args) {
        Book7[] book7s = new Book7[2];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < book7s.length; i++) {
            System.out.print("제목>>");
            String title = scanner.nextLine();
            System.out.print("저자>>");
            String author = scanner.nextLine();
            book7s[i] = new Book7(title, author);
        }

        for (int i = 0; i < book7s.length; i++)
            System.out.print("(" + book7s[i].title + ", " + book7s[i].author + ")");

        scanner.close();
    }
}

