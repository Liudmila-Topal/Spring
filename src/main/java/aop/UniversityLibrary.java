package aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary{

    @Override
    public void getBook(){
        System.out.println("We get book from university");
    }

    public String returnBook(){
        System.out.println("We returned book to university");
        return "War and Piece";
    }

    public void getMagazine(){
        System.out.println("We get magazine from University");
        System.out.println("------------------------------");
    }

    public void returnMagazine(){
        System.out.println("We returned magazine to university");
        System.out.println("------------------------------");
    }

    public void addBook(String personName, Book book){
        System.out.println("We add book to university");
        System.out.println("------------------------------");
    }

    public void addMagazine(){
        System.out.println("We add magazine to university");
        System.out.println("------------------------------");
    }

//    public void getBookWithParameter(Book book){
//        System.out.println("We get book from university: " + book.getName());
//    }
//
//    public void getBookWithString(String book){
//        System.out.println("We get book from university: " + book);
//    }
}
