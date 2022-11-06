package ua.com.hilell.krvchenko.lesson16.services;

public class DetailedInformationAboutAuthor implements PrintThirdEdition, PrintFourEdition {
    @Override
    public void printOfBooks() {
        PrintFourEdition.super.printOfBooks();
    }

    @Override
    public void favoriteCarOfAuthor() {
        System.out.println("Favorite car of author is old BMW");
    }

    @Override
    public String nameOfAuthorsWife() {
        String nameOfAuthorsWife = "Scarlett";
        return nameOfAuthorsWife;
    }

    @Override
    public String nameOfNewBookOfAuthor() {
        String nameOfNewBookOfAuthor = "Another world";
        return nameOfNewBookOfAuthor;
    }

    @Override
    public String nameOfLastScreenplayFromAuthor() {
        String nameOfLastScreenplayFromAuthor = "Screenplay from \"Another world\"";
        return nameOfLastScreenplayFromAuthor;
    }
}
