module com.library.hashtable {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.hashtable to javafx.fxml;
    exports com.hashtable;
}