package sample;


import javafx.scene.image.Image;

public class Book {
    private String Name;
    private String Surname;
    private String Mobile;
    private Image MyImage;


    Book(String name, String surname, String mobile, Image image) {

        Name = name;
        Surname = surname;
        Mobile = mobile;
        MyImage = image;

    }

    String getName() {
        return Name;
    }

    String getSurname() {
        return Surname;
    }

    String getMobile() {
        return Mobile;
    }

    Image getMyImage() {
        return MyImage;
    }

     String setName(String newName) {
        this.Name = newName;
        return newName;
    }

    String setSurname(String newSurname) {
        this.Surname = newSurname;
        return newSurname;
    }

    String setMobile(String newMobile) {
        this.Mobile = newMobile;
        return newMobile;
    }

    @Override
    public String toString() {
        return Name + " " + Surname;
    }
}







