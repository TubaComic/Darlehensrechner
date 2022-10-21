package com.rechner.darlehensrechner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MainController {
    @FXML
    private Text ergebnisText12;
    @FXML
    private Text ergebnisText22;
    @FXML
    private TextField monatlicheRate;
    @FXML
    private TextField zinssatz4;
    @FXML
    private TextField laufzeit4;
    @FXML
    private Text ergebnisText4;
    @FXML
    private TextField kredit2;
    @FXML
    private TextField zinssatz2;
    @FXML
    private TextField laufzeit2;
    @FXML
    private Text ergebnisText2;
    @FXML
    private TextField kredit3;
    @FXML
    private TextField zinssatz3;
    @FXML
    private TextField monatlicheRate3;
    @FXML
    private Text ergebnisText3;
    @FXML
    private Tab monatlicheRateTab;
    @FXML
    private Tab EffektivzinsTab;
    @FXML
    private Text ergebnisText;
    @FXML
    private TextField kredit;
    @FXML
    private TextField zinssatz;
    @FXML
    private TextField laufzeit;

    Alert a = new Alert(Alert.AlertType.ERROR);

    //V1
    //Monatsrate = [Kreditsumme + (Kreditsumme x Zinssatz ÷ 100)] ÷ Laufzeit in Monaten.

    //V2
    //Zinsen pro Monat = (Kreditbetrag x Zinssatz) ÷ (100 x 12)

    //V3
    //Anzahl der Raten = (Darlehensbetrag) / ((Höchstrate - (Darlehensbetrag x Zinssatz pro Monat/100))

    //V4
    //Kreditbetrag = Monatliches Finanzierungspotenzial × 12 Monate × 100 / (Zinssatz + Monatliche Rate)

    public void setErgebnisText() {
        if(!kredit.getText().equals("") && !zinssatz.getText().equals("") && !laufzeit.getText().equals("")) {
            ergebnisText.setText("Die monatliche Rate liegt bei " + ((Double.parseDouble(kredit.getText()) + (Double.parseDouble(kredit.getText()) * Double.parseDouble(zinssatz.getText()) / 100)) / Double.parseDouble(laufzeit.getText())) + " €");
            ergebnisText12.setText("Die monatliche Rate ohne Zinsen liegt bei " + ((Double.parseDouble(kredit.getText())) / Double.parseDouble(laufzeit.getText())) + " €");
        } else {
            a.setContentText("Bitte füllen Sie alles aus!");
            a.show();
        }
    }

    public void setErgebnisText2() {
        if(!kredit2.getText().equals("") && !zinssatz2.getText().equals("") && !laufzeit2.getText().equals("")) {
            ergebnisText2.setText("Der monatliche Zinssatz liegt bei " + (Double.parseDouble(kredit2.getText()) * (Double.parseDouble(zinssatz2.getText()) / 100)) + " €");
            ergebnisText22.setText("und Sie geben " + (Double.parseDouble(kredit2.getText()) * (Double.parseDouble(zinssatz2.getText()) / 100) * Double.parseDouble(laufzeit2.getText())) + " € an Zinsen insgesamt aus");
        } else {
            a.setContentText("Bitte füllen Sie alles aus!");
            a.show();
        }
    }

    public void setErgebnisText3() {
        if(!kredit3.getText().equals("") && !zinssatz3.getText().equals("") && !monatlicheRate3.getText().equals("")) {
            ergebnisText3.setText("Die Anzahl der Raten betragen " + Double.parseDouble(kredit3.getText()) / (Double.parseDouble(monatlicheRate3.getText()) + (Double.parseDouble(kredit3.getText()) * (Double.parseDouble(zinssatz3.getText()) / 100))));
        } else {
            a.setContentText("Bitte füllen Sie alles aus!");
            a.show();
        }
    }


    public void setErgebnisText4() {
        if(!monatlicheRate.getText().equals("") && !laufzeit4.getText().equals("") && !zinssatz4.getText().equals("")) {
            ergebnisText4.setText("Der Kredit liegt bei " + (Double.parseDouble(monatlicheRate.getText()) * Double.parseDouble(laufzeit4.getText()) + (Double.parseDouble(laufzeit4.getText()) * (Double.parseDouble(monatlicheRate.getText()) * ((Double.parseDouble(zinssatz4.getText()) / 100))))) + " €");
        } else {
            a.setContentText("Bitte füllen Sie alles aus!");
            a.show();
        }
    }

    public void onBerechnenButtonClick(ActionEvent actionEvent) {
        setErgebnisText();
    }

    public void onBerechnenButton2Click(ActionEvent actionEvent) {
        setErgebnisText2();
    }

    public void onBerechnenButton3Click(ActionEvent actionEvent) {
        setErgebnisText3();
    }

    public void onBerechnenButton4Click(ActionEvent actionEvent) {
        setErgebnisText4();
    }
}