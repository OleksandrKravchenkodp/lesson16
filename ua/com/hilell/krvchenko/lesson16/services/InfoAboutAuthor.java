package ua.com.hilell.krvchenko.lesson16.services;

public class InfoAboutAuthor  implements PrintFirstEdition, PrintSecondEdition {
    @Override
    public void printOfBooks() { //в этом классе просто переопределяем метод при конфликте двух дефолтных методов из
        //разных интерфейсов
        System.out.println("Print first book of author");
    }

    @Override
    public int yearOfBirthOfTheAuthor() {
        int yearOfBirth = 1985;
        return yearOfBirth;
    }

    @Override
    public int numberOfAuthorBooks() {
        int numberOfBooks = 32;
        return numberOfBooks;
    }

    @Override
    public String counryOfAuthor() {
        String counryOfAuthor = "Australia";
        return counryOfAuthor;
    }

    @Override
    public String authorsEducation() {
        String authorsEducation = "Master degree";
        return authorsEducation;
    }
}
