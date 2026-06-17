/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kna.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class MyAlertSingleton {
    private static MyAlertSingleton instance;
    private final Alert alert;
    
    private MyAlertSingleton(){
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("quiz app");
        alert.setHeaderText("Quiz App");
    }   
    
    public static MyAlertSingleton getInstance(){
        if (instance == null) {
            instance = new MyAlertSingleton();
        }
        return instance;
    }
    
    public void showMessage(String content){
        this.alert.setContentText(content);
        this.alert.show();
    }
    
}
