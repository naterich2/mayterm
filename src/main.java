/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Platform;
import nathanr15979.mayterm.gui.MainView;
/**
 *
 * @author nathan richman
 */
public class main {
    public static void main(String [] args){
         MainView mainview = new MainView();
        Platform.runLater(mainview);
    }
}
