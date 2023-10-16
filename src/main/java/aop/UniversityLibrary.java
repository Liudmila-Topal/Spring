package aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary{

    @Override
    public void getBook(){
        System.out.println("We get book from university");
    }

    public void returnBook(){
        System.out.println("We returned book to university");
    }

    public void getMagazine(){
        System.out.println("We get magazine from University");
    }

    public void returnMagazine(){
        System.out.println("We returned magazine to university");
    }

    public void addBook(){
        System.out.println("We add book to university");
    }

    public void addMagazine(){
        System.out.println("We add magazine to university");
    }

//    public void getBookWithParameter(Book book){
//        System.out.println("We get book from university: " + book.getName());
//    }
//
//    public void getBookWithString(String book){
//        System.out.println("We get book from university: " + book);
//    }
}
