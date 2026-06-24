package com.kna.quizapp;

import com.kna.utils.MyAlertSingleton;
import com.kna.utils.MyStageSingleton;
import com.kna.utils.themes.ThemeTypes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable{
    @FXML private ComboBox<ThemeTypes> cbThemes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }
    public void manageQuestion(ActionEvent e){
        MyStageSingleton.getInstance().showStage("questions");
    }
    
    public void practice(ActionEvent e){
        MyAlertSingleton.getInstance().showMessage("[practice] Comming Soon ....");
    }
    
    public void exam(ActionEvent e){
        MyAlertSingleton.getInstance().showMessage("[exam] Comming Soon ....");
    }
    
    public void changeThemes(ActionEvent e){
        this.cbThemes.getSelectionModel().getSelectedItem().updateTheme(this.cbThemes.getScene());
    }
}
