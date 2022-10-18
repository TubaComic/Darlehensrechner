module com.rechner.darlehensrechner {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rechner.darlehensrechner to javafx.fxml;
    exports com.rechner.darlehensrechner;
}