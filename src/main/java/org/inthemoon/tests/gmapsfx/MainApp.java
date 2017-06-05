package org.inthemoon.tests.gmapsfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Dims on 05.06.2017.
 */
public class MainApp extends Application {
   @Override
   public void start(Stage primaryStage) throws Exception {
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getClassLoader().getResource("mapwindow.fxml"));
      loader.load();

      Scene scene = new Scene(loader.getRoot(), 800, 600);
      primaryStage.setScene(scene);
      primaryStage.show();

   }
}
