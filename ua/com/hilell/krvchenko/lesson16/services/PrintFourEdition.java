package ua.com.hilell.krvchenko.lesson16.services;

public interface PrintFourEdition extends PrintThirdEdition { //тут просто для разнообразия решаем проблему
    //множественного наследования путем насдедования интерфейсов друг от друга.

    default void printOfBooks (){
        System.out.println("Print first book of author");
    }

    static void mostPopularBestseller (){
        System.out.println("Most popular book by the author...");
    }

    String nameOfNewBookOfAuthor ();

    String nameOfLastScreenplayFromAuthor ();

}
