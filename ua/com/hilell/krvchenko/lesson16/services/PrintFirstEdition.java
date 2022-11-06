package ua.com.hilell.krvchenko.lesson16.services;

public interface PrintFirstEdition {

    default void printOfBooks (){
        System.out.println("Print first book of author");
    }

    static void infoAboutAuthor (){
        System.out.println("Short biografy of author...");
    }

    int yearOfBirthOfTheAuthor();

    int numberOfAuthorBooks ();
}
