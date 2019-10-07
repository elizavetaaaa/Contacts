package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    public ListView <Book> listViiew;

    @FXML
    private ImageView imageView;
    @FXML
    private Button addButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button editButton;

    @FXML
    private TextField namerEntry;

    @FXML
    private TextField surnameEntry;

    @FXML
    private TextField mobileEntry;

    @FXML//lets to improve the  data
    void edit(ActionEvent event) {
        namerEntry.setEditable(true);
        surnameEntry.setEditable(true);
        mobileEntry.setEditable(true);

    }

    @FXML//adding impovements from user
    void add (ActionEvent event) {
       String newName =  namerEntry.getText();
        String newSurName = surnameEntry.getText();
        String newMobile = mobileEntry.getText();
        listViiew.getSelectionModel().getSelectedItem().setName(newName);
        listViiew.getSelectionModel().getSelectedItem().setSurname(newSurName);
        listViiew.getSelectionModel().getSelectedItem().setMobile(newMobile);
        //listViiew.setItems(books);
    }

    @FXML//clears all fields
    void clear(ActionEvent event) {
        namerEntry.clear();
        surnameEntry.clear();
        mobileEntry.clear();
        imageView.setVisible(false);

    }




    // stores the list of Book Objects
        private final ObservableList <Book> books = FXCollections.observableArrayList();
        Image first= new Image("/sample/index.jpeg");
        Image second =new Image("/sample/index1.jpeg");
        Image third =new Image("/sample/index2.jpeg");
        Image forth =new Image("/sample/index3.jpeg");
        Image fifth = new Image("/sample/index4.jpg");

    // initialize controller

        public void initialize() {
            // populate the ObservableList<Book>
            books.add(new Book("Ann ",
                    "Williams", "0556344422", first));
            books.add(new Book("Holly",
                    "Molly", "0778665544",second));
            books.add(new Book("Ahmed",
                    "Habibulaev", "0554332210",third));
            books.add(new Book("Erika",
                    "Fox", "0555991023",forth));
            books.add(new Book("Nurlan",
                    "Shaidullaev", "0555790259",fifth));


            listViiew.setItems(books); // bind booksListView to books

        //takes the data from listview and sets into fields
        listViiew.setOnMouseClicked(e ->{

                imageView.setVisible(true);//in case "clear button" was clicked before
                namerEntry.setText(listViiew.getSelectionModel().getSelectedItem().getName());
                surnameEntry.setText(listViiew.getSelectionModel().getSelectedItem().getSurname());
                mobileEntry.setText(listViiew.getSelectionModel().getSelectedItem().getMobile());
                imageView.setImage(listViiew.getSelectionModel().getSelectedItem().getMyImage());
                namerEntry.setEditable(false);
                surnameEntry.setEditable(false);
                mobileEntry.setEditable(false);
        });


    }}
