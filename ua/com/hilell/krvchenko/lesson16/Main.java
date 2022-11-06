package ua.com.hilell.krvchenko.lesson16;

import ua.com.hilell.krvchenko.lesson16.services.*;

public class Main {

    public static void main(String[] args) {
        PrintFirstEdition.infoAboutAuthor();
        PrintSecondEdition.infoAboutPoems();

        InfoAboutAuthor infoAboutAuthor = new InfoAboutAuthor();
        infoAboutAuthor.printOfBooks();
        infoAboutAuthor.yearOfBirthOfTheAuthor();
        infoAboutAuthor.numberOfAuthorBooks();
        infoAboutAuthor.counryOfAuthor();
        infoAboutAuthor.authorsEducation();

        System.out.println("------------------------------");

        PrintThirdEdition.listOfAwards();
        PrintFourEdition.mostPopularBestseller();

        DetailedInformationAboutAuthor detailedInformationAboutAuthor = new DetailedInformationAboutAuthor();
        detailedInformationAboutAuthor.printOfBooks();
        detailedInformationAboutAuthor.favoriteCarOfAuthor();
        detailedInformationAboutAuthor.nameOfAuthorsWife();
        detailedInformationAboutAuthor.nameOfNewBookOfAuthor();
        detailedInformationAboutAuthor.nameOfLastScreenplayFromAuthor();

        System.out.println("------------------------------");
        System.out.println("------------------------------");

        Helper helper = new Helper();
        System.out.println(helper.checkString("alex@gmail.com").get());
        System.out.println(helper.checkString(null).get());
    }

}
