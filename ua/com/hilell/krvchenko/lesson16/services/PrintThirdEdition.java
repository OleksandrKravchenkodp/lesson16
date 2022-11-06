package ua.com.hilell.krvchenko.lesson16.services;

public interface PrintThirdEdition {

    default void printOfBooks (){
        System.out.println("Print four book of author");
    }

    static void listOfAwards (){
        System.out.println("List of author's awards...");
    }

    void favoriteCarOfAuthor ();

    String nameOfAuthorsWife ();

}
