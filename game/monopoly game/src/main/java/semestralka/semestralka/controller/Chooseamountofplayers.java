package semestralka.semestralka.controller;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import semestralka.semestralka.model.Game;

import java.io.IOException;

/**
 * Controller class for the "Choose amount of players" screen.
 * Handles user interaction for selecting the number of players.
 */
public class Chooseamountofplayers {

    @FXML
    private Button btn4;

    @FXML
    private Button btnOne;

    @FXML
    private Button btnThree;

    @FXML
    private Button btnTwo;

    /**
     * Initializes the controller.
     * Sets up event handlers for the buttons.
     */
    @FXML
    void initialize() {
        btnOne.setOnAction(event -> {
            Game.getInstance().setNumberOfPlayers(1);
            loadGameScene();
        });

        btnTwo.setOnAction(event -> {
            Game.getInstance().setNumberOfPlayers(2);
            loadGameScene();
        });

        btnThree.setOnAction(event -> {
            Game.getInstance().setNumberOfPlayers(3);
            loadGameScene();
        });

        btn4.setOnAction(event -> {
            Game.getInstance().setNumberOfPlayers(4);
            loadGameScene();
        });
    }

    /**
     * Loads the game scene after selecting the number of players.
     */
    private void loadGameScene() {
        try {
            Stage previousStage = (Stage) btnOne.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(Chooseamountofplayers.class.getResource("game.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Monopoly");
            previousStage.close();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
