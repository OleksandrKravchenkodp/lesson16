package ua.com.hilell.krvchenko.lesson16.services;

public interface PrintSecondEdition {

    default void printOfBooks (){
        System.out.println("Print second book of author");
    }

    static void infoAboutPoems (){
        System.out.println("List all poems of author...");
    }

    String counryOfAuthor();

    String authorsEducation ();

}
