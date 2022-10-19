package com.rechner.darlehensrechner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    String error = "Bitte füllen Sie alles aus";
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
    private TextField hoechstrate;
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

    //V1
    //Monatsrate = [Kreditsumme + (Kreditsumme x Zinssatz ÷ 100)] ÷ Laufzeit in Monaten.

    //V2
    //Zinsen pro Monat = (Kreditbetrag x Zinssatz) ÷ (100 x 12)

    //V3
    //Anzahl der Raten = (Darlehensbetrag) / ((Höchstrate - (Darlehensbetrag x Zinssatz pro Monat/100))

    //V4
    //Kreditbetrag = Monatliches Finanzierungspotenzial × 12 Monate × 100 / (Zinssatz + Monatliche Rate)

    public void setErgebnisText() {
        ergebnisText.setText("Die monatliche Rate liegt bei " + (String.valueOf((Integer.parseInt(kredit.getText()) + (Integer.parseInt(kredit.getText()) * Integer.parseInt(zinssatz.getText()) / 100)) / Integer.parseInt(laufzeit.getText()))) + " €");
    }

    public void setErgebnisText2() {
        ergebnisText2.setText("Der monatliche Zinssatz liegt bei " + (String.valueOf((Integer.parseInt(kredit2.getText()) * (Integer.parseInt(zinssatz2.getText()) / (100 * Integer.parseInt(laufzeit2.getText())))))) + " €");
    }

    public void setErgebnisText3() {
        ergebnisText3.setText("Die Anzahl der Raten betragen " + String.valueOf((Integer.parseInt(kredit3.getText()) / (Integer.parseInt(hoechstrate.getText()) - (Integer.parseInt(kredit3.getText()) * Integer.parseInt(zinssatz3.getText()) / 100)))));
    }

    public void setErgebnisText4() {
        ergebnisText4.setText("Der Kredit liegt bei " + (String.valueOf((Integer.parseInt(monatlicheRate.getText()) * Integer.parseInt(laufzeit4.getText()) * 100 / (Integer.parseInt(zinssatz.getText()) + Integer.parseInt(monatlicheRate.getText()))) / Integer.parseInt(laufzeit.getText()))) + " €");
    }

    public void onBerechnenButtonClick(ActionEvent actionEvent) {
        if(kredit.getText() != null || zinssatz.getText() != null || laufzeit.getText() != null) {
            setErgebnisText();
        } else {
            ergebnisText.setText(error);
        }
    }

    public void onBerechnenButton2Click(ActionEvent actionEvent) {
        if(kredit2.getText() != null || zinssatz2.getText() != null || laufzeit2.getText() != null) {
            setErgebnisText2();
        } else {
            ergebnisText2.setText(error);
        }
    }

    public void onBerechnenButton3Click(ActionEvent actionEvent) {
        if(kredit3.getText() != null || zinssatz3.getText() != null || hoechstrate.getText() != null) {
            setErgebnisText3();
        } else {
            ergebnisText3.setText(error);
        }
    }

    public void onBerechnenButton4Click(ActionEvent actionEvent) {
        if(monatlicheRate.getText() != null || laufzeit4.getText() != null || zinssatz4.getText() != null) {
            setErgebnisText4();
        } else {
            ergebnisText4.setText(error);
        }
    }
}