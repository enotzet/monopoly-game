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
 * Controller class for the first window of the Monopoly game.
 * Handles user interaction for starting a new game, loading a saved game, and exiting the application.
 */
public class firstWindow {

    @FXML
    private Button btnExit;

    @FXML
    private Button btnLoadGame;

    @FXML
    private Button btnPlay;

    /**
     * Initializes the controller.
     * Sets up event handlers for the buttons.
     */
    @FXML
    void initialize() {
        btnPlay.setOnAction(event -> {
            try {
                loadChooseAmountOfPlayersScene();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        btnLoadGame.setOnMouseClicked(event -> {
            try {
                loadSavedGame();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        btnExit.setOnMouseClicked(e -> {
            Stage previousStage = (Stage) btnPlay.getScene().getWindow();
            previousStage.close();
        });
    }

    /**
     * Loads the "Choose amount of players" scene.
     * @throws IOException if an error occurs while loading the FXML file
     */
    private void loadChooseAmountOfPlayersScene() throws IOException {
        Stage previousStage = (Stage) btnPlay.getScene().getWindow();
        Game g = Game.getInstance();
        g.setIsGameLoaded(false);
        FXMLLoader loader = new FXMLLoader(firstWindow.class.getResource("chooseamountofplayers.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Choose amount of players");
        previousStage.close();
        stage.show();
    }

    /**
     * Loads the saved game.
     * @throws IOException if an error occurs while loading the FXML file
     */
    private void loadSavedGame() throws IOException {
        Game g = Game.getInstance();
        g.setIsGameLoaded(true);
        Stage previousStage = (Stage) btnPlay.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(firstWindow.class.getResource("game.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        previousStage.close();
        stage.show();
    }
}
