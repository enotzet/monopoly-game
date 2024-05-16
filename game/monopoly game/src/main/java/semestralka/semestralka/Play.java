package semestralka.semestralka;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The main class to launch the Monopoly game.
 */
public class Play extends Application {

    /**
     * Starts the Monopoly game application.
     *
     * @param stage The primary stage for this application.
     * @throws IOException If an error occurs during loading the FXML file.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Play.class.getResource("firstWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1100, 700);
        stage.setTitle("Monopoly");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main method to launch the Monopoly game.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        launch();
    }
}
