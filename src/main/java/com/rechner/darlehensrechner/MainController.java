package com.rechner.darlehensrechner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MainController {
    @FXML
    private Label formel;
    @FXML
    private Button infoButton;
    @FXML
    private Button berechnenButton;
    @FXML
    private Text ergebnisText;
    @FXML
    private TextField kredit;
    @FXML
    private TextField zinssatz;
    @FXML
    private TextField laufzeit;

    public void setKredit() {
        kredit.setPromptText("Kreditsumme in Euro");
    }

    public void setZinssatz() {
        zinssatz.setPromptText("Zinssatz in Prozent");
    }

    public void setLaufzeit() {
        laufzeit.setPromptText("Laufzeit in Monaten");
    }

    public void setErgebnisText() {
        ergebnisText.setText(String.valueOf((Integer.parseInt(kredit.getText()) + (Integer.parseInt(kredit.getText()) * Integer.parseInt(zinssatz.getText()) / 100)) / Integer.parseInt(laufzeit.getText())));
    }

    public void onInfoButtonClick(ActionEvent actionEvent) {
        setLaufzeit();
        setKredit();
        setZinssatz();
        formel.setText("[Kreditsumme + (Kreditsumme x Zinssatz ÷ 100)] ÷ Laufzeit in Monaten");
    }

    public void onBerechnenButtonClick(ActionEvent actionEvent) {
        setErgebnisText();
    }
}