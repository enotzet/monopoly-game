package semestralka.semestralka.controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;
import semestralka.semestralka.model.*;
import semestralka.semestralka.model.Cell;

import java.util.logging.Level;
import java.util.logging.Logger;


import java.io.*;
import java.nio.file.Paths;
import java.util.*;
/**
 * Controller class for the game window of the Monopoly game.
 * Handles user interaction during the game.
 */
public class GameController {
    @FXML
    private Rectangle PlayerRecnangle1;

    @FXML
    private Rectangle PlayerRectangle2;

    @FXML
    private Rectangle PlayerRectangle3;

    @FXML
    private Rectangle PlayerRectangle4;
    @FXML
    public Button btnStart;
    @FXML
    private TextField firMoneytxt;

    @FXML
    private TextField firNametxt;

    @FXML
    private TextField fouMoneytxt;
    @FXML
    private TextField MakeADealTxt1;

    @FXML
    private TextField MakeADealTxt2;

    @FXML
    private TextField MakeADealTxt3;

    @FXML
    private TextField MakeADealTxt4;

    @FXML
    private TextField fouNametxt;

    @FXML
    private Text priceOfCellTex10;

    @FXML
    private Text priceOfCellText1;

    @FXML
    private Text priceOfCellText11;

    @FXML
    private Text priceOfCellText12;

    @FXML
    private Text priceOfCellText13;

    @FXML
    private Text priceOfCellText14;

    @FXML
    private Text priceOfCellText15;

    @FXML
    private Text priceOfCellText16;

    @FXML
    private Text priceOfCellText17;

    @FXML
    private Text priceOfCellText18;

    @FXML
    private Text priceOfCellText19;

    @FXML
    private Text priceOfCellText2;

    @FXML
    private Text priceOfCellText20;

    @FXML
    private Text priceOfCellText21;

    @FXML
    private Text priceOfCellText22;

    @FXML
    private Text priceOfCellText23;

    @FXML
    private Text priceOfCellText24;

    @FXML
    private Text priceOfCellText25;

    @FXML
    private Text priceOfCellText26;

    @FXML
    private Text priceOfCellText28;

    @FXML
    private Text priceOfCellText29;

    @FXML
    private Text priceOfCellText3;

    @FXML
    private Text priceOfCellText4;

    @FXML
    private Text priceOfCellText5;

    @FXML
    private Text priceOfCellText6;

    @FXML
    private Text priceOfCellText7;

    @FXML
    private Text priceOfCellText8;

    @FXML
    private Text priceOfCellText9;

    @FXML
    private TextField secMoneytxt;

    @FXML
    private TextField secNametxt;

    @FXML
    private TextField thiMoneytxt;

    @FXML
    private TextField thiNametxt;
    @FXML
    private Rectangle rect1;

    @FXML
    private Rectangle rect11;

    @FXML
    private Rectangle rect12;

    @FXML
    private Rectangle rect13;

    @FXML
    private Rectangle rect14;

    @FXML
    private Rectangle rect15;

    @FXML
    private Rectangle rect16;

    @FXML
    private Rectangle rect18;

    @FXML
    private Rectangle rect19;

    @FXML
    private Rectangle rect2;

    @FXML
    private Rectangle rect21;

    @FXML
    private Rectangle rect23;

    @FXML
    private Rectangle rect24;

    @FXML
    private Rectangle rect25;
    @FXML
    private Text CellText1;

    @FXML
    private Text CellText10;

    @FXML
    private Text CellText11;

    @FXML
    private Text CellText12;

    @FXML
    private Text CellText13;

    @FXML
    private Text CellText14;

    @FXML
    private Text CellText15;

    @FXML
    private Text CellText16;

    @FXML
    private Text CellText17;

    @FXML
    private Text CellText18;

    @FXML
    private Text CellText19;

    @FXML
    private Text CellText2;

    @FXML
    private Text CellText20;

    @FXML
    private Text CellText21;

    @FXML
    private Text CellText22;

    @FXML
    private Text CellText23;

    @FXML
    private Text CellText24;

    @FXML
    private Text CellText25;

    @FXML
    private Text CellText26;

    @FXML
    private Text CellText27;

    @FXML
    private Text CellText28;

    @FXML
    private Text CellText3;

    @FXML
    private Text CellText4;

    @FXML
    private Text CellText5;

    @FXML
    private Text CellText6;

    @FXML
    private Text CellText7;

    @FXML
    private Text CellText8;

    @FXML
    private Text CellText9;

    @FXML
    private Rectangle rect26;

    @FXML
    private Rectangle rect27;

    @FXML
    private Rectangle rect28;

    @FXML
    private Rectangle rect29;

    @FXML
    private Rectangle rect3;

    @FXML
    private Rectangle rect31;

    @FXML
    private Rectangle rect32;

    @FXML
    private Rectangle rect34;

    @FXML
    private Rectangle rect35;

    @FXML
    private Rectangle rect37;

    @FXML
    private Rectangle rect39;

    @FXML
    private Rectangle rect5;
    @FXML
    private Rectangle rect6;
    @FXML
    public Rectangle CellInfoRectangle;
    @FXML
    private Rectangle rect8;
    @FXML
    private Rectangle rect9;
    @FXML
    public TextArea textConsole;
    @FXML
    public Button PledgeButton;
    @FXML
    public Rectangle DealRectangle;
    @FXML
    public Text DealHeader;
    @FXML
    public TextArea DealTxtArea1;
    @FXML
    public
    TextArea DealTxtArea2;
    @FXML
    public Text DealMoneytxt1;
    @FXML
    public Text DealMoneytxt2;
    @FXML
    public TextField DealMoneyFill1;
    @FXML
    public TextField DealMoneyFill2;
    @FXML
    public Button DealSendButton;
    @FXML
    public Button DealCloseButton;
    @FXML
    private Button btnConfigureGame;
    @FXML
    private Button buttonLog;
    @FXML
    public ArrayList<Circle> PlayerCircles;
    private TextField[] NameTextFields;
    public TextField[] MoneyTextFields;
    public Text[] priceOfCellsText;
    public Rectangle[] CellsRectanles;
    @FXML
    private Button btnSaveGame;
    @FXML
    public TextArea CellInfoTextField;
    private ArrayList<Rectangle> PlayersRectangles;
    private TextField[] MakeADealTexts;
    private Text[] CellsText;
    @FXML
    private AnchorPane AnchorPaneMain;
    @FXML
    public Button UpgradeButton;
    @FXML
    private Text t1;
    int RectIt = 0;
    /**Represents the index of the player whose throw is now*/
    public int currentPlayerIndex = 0;
    /**Represents a visible property of "Show cell info" rectangle*/
    boolean ShowCellInfo = false;
    /**Represents a visible property of "Upgrade cell" button on the "Show cell info" rectangle*/
    boolean ShowUpgradeButton = false;
    /**Shows if was update of property during 1 throw*/
    boolean IsCellUpdated = false;
    /**Represents a visible property of "Deal" rectangle*/
    boolean ShowDeal = false;
    /**Represents colors of players tokens*/
    Color[] colors = new Color[]{Color.RED,Color.LIGHTBLUE, Color.LIGHTGREEN, Color.PURPLE};
    /**Helps to provide that houses on the one avenue will be added to the scene only one time*/
    Set<Node> addedHouses = new HashSet<>();
    /**Helps to provide that it can be only one current deal in the game*/
    Deal deal;
    private final static Logger LOGGER = Logger.getLogger(GameController.class.getName());
    /**
     * Initializes the controller.
     * Sets up event handlers for all interactive elements.
     */
    @FXML
    void initialize()
    {
        PlayerCircles = new ArrayList<>();
        PlayersRectangles = new ArrayList<>();
        PlayersRectangles.add(PlayerRecnangle1);
        PlayersRectangles.add(PlayerRectangle2);
        PlayersRectangles.add(PlayerRectangle3);
        PlayersRectangles.add(PlayerRectangle4);
        CellsRectanles = new Rectangle[]{rect2, rect1,rect2,rect3,rect2,rect5,rect6,rect2,rect8,rect9,rect2,rect11,rect12,rect13,rect14,rect15,rect16,rect2,rect18,rect19,rect2,rect21,rect2,rect23,rect24,rect25,rect26,rect27,rect28,rect29,rect2,rect31,rect32,rect2,rect34,rect35,rect2,rect37,rect2,rect39};
        priceOfCellsText = new Text[]{priceOfCellText9,priceOfCellText1,priceOfCellText9,priceOfCellText2,priceOfCellText9,priceOfCellText3, priceOfCellText4,priceOfCellText9, priceOfCellText5,priceOfCellText6,priceOfCellText9, priceOfCellText7, priceOfCellText8,priceOfCellText9,priceOfCellTex10,priceOfCellText11,priceOfCellText12,priceOfCellText9,priceOfCellText13, priceOfCellText14,priceOfCellText9, priceOfCellText15,priceOfCellText9,priceOfCellText16, priceOfCellText17, priceOfCellText18,priceOfCellText19,priceOfCellText20,priceOfCellText21,priceOfCellText22,priceOfCellText9,priceOfCellText23, priceOfCellText24,priceOfCellText9, priceOfCellText25,priceOfCellText26,priceOfCellText9, priceOfCellText28,priceOfCellText9,priceOfCellText29};
        NameTextFields = new TextField[]{firNametxt, secNametxt, thiNametxt, fouNametxt};
        MoneyTextFields = new TextField[]{firMoneytxt, secMoneytxt, thiMoneytxt, fouMoneytxt};
        MakeADealTexts = new TextField[]{MakeADealTxt1,MakeADealTxt2,MakeADealTxt3,MakeADealTxt4};
        CellsText = new Text[]{t1,CellText1,t1,CellText2,t1,CellText3,CellText4,t1,CellText5,CellText6,t1,CellText7,CellText8,CellText9,CellText10,CellText11,CellText12,t1,CellText13,CellText14,t1,CellText15,t1,CellText16,CellText17,CellText18,CellText19,CellText20,CellText21,CellText22,t1,CellText23,CellText24,t1,CellText25,CellText26,t1,CellText27,t1,CellText28};
        Game g = Game.getInstance();
        int number_of_players = g.getNumberOfPlayers();
        ArrayList<String> names = new ArrayList<String>();
        for (int i = 0; i < number_of_players; i++) {
            TextInputDialog dialog = new TextInputDialog();
            dialog.setTitle("Enter "+(i+1)+" player name");
            dialog.setHeaderText(null);
            dialog.setContentText("Please enter name of "+(i+1)+" player:");
            Optional<String> result = dialog.showAndWait();
            if(result.isPresent()) {
                String playername = result.get();
                if (playername.length()<3||playername.length()>10) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Invalid Name");
                    alert.setHeaderText(null);
                    alert.setContentText("Name length must be between 3 and 10 characters.");
                    alert.showAndWait();
                    i--;
                }
                else
                {
                    boolean flag = false;
                    for (int j = 0; j < names.size(); j++) {
                        if (Objects.equals(names.get(j), playername))
                            flag = true;
                    }
                    if (flag)
                    {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Invalid Name");
                        alert.setHeaderText(null);
                        alert.setContentText("Player names must be unique");
                        alert.showAndWait();
                        i--;
                    }
                    else
                        names.add(playername);
                }
            }
            else{
                Stage stage = (Stage) dialog.getDialogPane().getScene().getWindow();
                stage.close();
            }
        }
        PlayersInfoToSave pl1 = new PlayersInfoToSave();
        Game g1 = new Game();
        if (g.getIsGameLoaded())
        {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Choose file JSON");
            File file = fileChooser.showOpenDialog(new Stage());
            if (file != null) {
                String fileName = file.getName();
                if (fileName.endsWith(".json")) {
                    try {
                        ObjectMapper objectMapper = new ObjectMapper();
                        pl1 = objectMapper.readValue(file, PlayersInfoToSave.class);
                        g1 = new Game(pl1.players);
                        btnStart.setText("Load game");
                        for (int i = 0; i < g1.game_board.game_board.length; i++) {
                            if (g1.game_board.game_board[i] instanceof PropertyCell)
                            {
                                for (int j = 0; j < g1.players.size(); j++) {
                                    if (g1.players.get(j).isActive())
                                    {
                                        if (g1.players.get(j).IsHisTurn)
                                            currentPlayerIndex = j;
                                        g1.players.get(j).first_positionX=g1.players.get(j).positionX[g1.players.get(j).current_position];
                                        g1.players.get(j).first_positionY=g1.players.get(j).positionY[g1.players.get(j).current_position];
                                        for (int k = 0; k < g1.players.get(j).property.size(); k++) {
                                            if (Objects.equals(g1.players.get(j).property.get(k).name_of_cell, g1.game_board.game_board[i].name_of_cell))
                                            {
                                                ((PropertyCell) g1.game_board.game_board[i]).owner = g1.players.get(j);
                                                ((PropertyCell) g1.game_board.game_board[i]).isPledged = g1.players.get(j).property.get(k).isPledged;
                                                ((PropertyCell) g1.game_board.game_board[i]).level_of_property = g1.players.get(j).property.get(k).level_of_property;
                                                if (!((PropertyCell) g1.game_board.game_board[i]).isPledged)
                                                {
                                                    CellsRectanles[i].setFill(colors[g1.players.get(j).number]);
                                                    if (g1.game_board.game_board[i] instanceof CommunityService)
                                                    {
                                                        priceOfCellsText[i].setText(Integer.toString(((PropertyCell) g1.game_board.game_board[i]).price_of_rent[((PropertyCell) g1.game_board.game_board[i]).level_of_property])+"x");
                                                    }
                                                    else
                                                    {
                                                        priceOfCellsText[i].setText(Integer.toString(((PropertyCell) g1.game_board.game_board[i]).price_of_rent[((PropertyCell) g1.game_board.game_board[i]).level_of_property])+"$");
                                                    }
                                                }
                                                else
                                                {
                                                    CellsRectanles[i].setFill(Color.LIGHTGRAY);
                                                    priceOfCellsText[i].setText(("0$"));
                                                }
                                                if (g1.players.get(j).property.get(k) instanceof Station)
                                                    UpdateCommunityAndStationCells(g1, g1.players.get(j));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText(null);
                    alert.setContentText("Chosen file must be in JSON format.");
                    alert.showAndWait();
                    initialize();
                }
            }
            else{
                Stage stage = (Stage)btnStart.getScene().getWindow();
                stage.close();
            }
        }
        else
        {
            g1 =  new Game(number_of_players,names);
        }
        Game game = g1;
        System.out.println(game.players.size());
        for (int i = 0; i < game.players.size(); i++) {
            Circle circ = new Circle();
            circ.setRadius(16);
            circ.setLayoutX(game.players.get(i).positionX[game.players.get(i).current_position]);
            circ.setLayoutY(game.players.get(i).positionY[game.players.get(i).current_position]);
            circ.setStroke(Color.BLACK);
            circ.setStrokeWidth(2);
            circ.setFill(colors[i]);
            PlayerCircles.add(circ);
            NameTextFields[i].setText(game.players.get(i).name);
            if (game.players.get(i).isActive())
                MoneyTextFields[i].setText(Integer.toString(game.players.get(i).getMoney())+"$");
            else
                MoneyTextFields[i].setText("looser");
            if (!game.players.get(i).isActive())
                circ.setVisible(false);
        }
        btnStart.setOnMouseClicked(event ->
        {
            Scene scene = AnchorPaneMain.getScene();
            Pane rootPane = (Pane) scene.getRoot();
            rootPane.getChildren().addAll(PlayerCircles);
            Stage stage = (Stage) scene.getWindow();
            for (int i = 0; i < game.game_board.game_board.length; i++) {
                if (game.game_board.game_board[i] instanceof Avenue&&((Avenue) game.game_board.game_board[i]).level_of_property>0)
                {
                    for (int l = 0; l < ((Avenue) game.game_board.game_board[i]).level_of_property; l++) {
                        BuildHouse(game, i);
                    }
                }
            }
            if (Objects.equals(btnStart.getText(), "Load game"))
            {
                textConsole.appendText("\n\n\n\n\n\nGame has been successfully uploaded!\n");
            }
            else
            {
                textConsole.appendText("\n\n\n\n\n\nGame has started!\n");
            }
            StartGame(game);
            btnStart.setVisible(false);
        });
        btnSaveGame.setOnMouseClicked(event ->
            {
                if (ShowCellInfo)
                {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Save confirmation");
                    alert.setHeaderText("Do you really want to save this game?");
                    ButtonType buttonTypeYes = new ButtonType("Yes");
                    ButtonType buttonTypeNo = new ButtonType("No");
                    alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeNo);
                    alert.showAndWait().ifPresent(response -> {
                        if (response == buttonTypeYes) {
                            SaveGame(game);
                        }
                    });
                }
            });
        buttonLog.setOnMouseClicked(event -> {
            if (Objects.equals(buttonLog.getText(), "LOG"))
            {
                LOGGER.setLevel(Level.OFF);
                buttonLog.setText("NO LOG");
            }
            else
            {
                LOGGER.setLevel(Level.ALL);
                buttonLog.setText("LOG");
            }
        });
        btnConfigureGame.setOnMouseClicked(event -> {
            if (!btnStart.isVisible())
            {
                Stage popupStage = new Stage();
                popupStage.initModality(Modality.APPLICATION_MODAL);
                popupStage.initOwner(btnConfigureGame.getScene().getWindow());
                popupStage.setTitle("Выберите действие");
                VBox popupLayout = new VBox(10);
                popupLayout.setAlignment(Pos.CENTER);
                popupLayout.setPadding(new Insets(20));
                Button btnAddMoney = new Button("Add money to player");
                Button btnTakeMoney = new Button("Take money from player");
                Button btnCancel = new Button("Cancel");
                btnAddMoney.setOnAction(e -> {
                    TextInputDialog addMoneyDialog = new TextInputDialog();
                    addMoneyDialog.setTitle("Add money");
                    addMoneyDialog.setHeaderText(null);
                    addMoneyDialog.setContentText("");
                    TextField moneyField = new TextField();
                    moneyField.setPromptText("Enter amount of money");
                    GridPane.setConstraints(moneyField, 0, 1);
                    TextField nameField = new TextField();
                    nameField.setPromptText("Enter player's name");
                    GridPane.setConstraints(moneyField, 0, 1);
                    GridPane grid = new GridPane();
                    grid.addRow(1, new Label("Player`s name:"), nameField);
                    grid.addRow(1, new Label("Amount of money:"), moneyField);
                    addMoneyDialog.getDialogPane().setContent(grid);
                    addMoneyDialog.setResultConverter(dialogButton -> {
                        if (dialogButton == ButtonType.OK) {
                            String playerName = nameField.getText();
                            int money = Integer.parseInt(moneyField.getText());
                            Boolean flag = false;
                            int num = -1;
                            for (int i = 0; i < game.players.size(); i++) {
                                if (Objects.equals(game.players.get(i).name, playerName))
                                {
                                    flag = true;
                                    num = i;
                                    break;
                                }
                            }
                            if (flag)
                            {
                                if (money<=0)
                                {
                                    Alert alert = new Alert(Alert.AlertType.ERROR);
                                    alert.setTitle("Incorrect money amount");
                                    alert.setHeaderText(null);
                                    alert.setContentText("Amount of money must be a natural number");
                                    alert.showAndWait();
                                }
                                else if(!game.players.get(num).isActive())
                                {
                                    Alert alert = new Alert(Alert.AlertType.ERROR);
                                    alert.setTitle("User is out");
                                    alert.setHeaderText(null);
                                    alert.setContentText("This user is not active");
                                    alert.showAndWait();
                                }
                                else {
                                    game.players.get(num).AddMoneyToPlayer(money);
                                    textConsole.appendText(money+"$ were added to "+playerName+"\n");
                                    MoneyTextFields[num].setText(game.players.get(num).getMoney()+"$");
                                    popupStage.close();
                                }
                            }
                            else
                            {
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setTitle("Incorrect player name");
                                alert.setHeaderText(null);
                                alert.setContentText("There are no players with this name");
                                alert.showAndWait();
                            }
                        }
                        return null;
                    });
                    addMoneyDialog.showAndWait();
                });
                btnTakeMoney.setOnAction(e -> {
                    TextInputDialog addMoneyDialog = new TextInputDialog();
                    addMoneyDialog.setTitle("Take money");
                    addMoneyDialog.setHeaderText(null);
                    addMoneyDialog.setContentText("");
                    TextField moneyField = new TextField();
                    moneyField.setPromptText("Enter amount of money");
                    GridPane.setConstraints(moneyField, 0, 1);
                    TextField nameField = new TextField();
                    nameField.setPromptText("Enter player's name");
                    GridPane.setConstraints(moneyField, 0, 1);
                    GridPane grid = new GridPane();
                    grid.addRow(1, new Label("Player`s name:"), nameField);
                    grid.addRow(1, new Label("Amount of money:"), moneyField);
                    addMoneyDialog.getDialogPane().setContent(grid);
                    addMoneyDialog.setResultConverter(dialogButton -> {
                        if (dialogButton == ButtonType.OK) {
                            String playerName = nameField.getText();
                            int money = Integer.parseInt(moneyField.getText());
                            Boolean flag = false;
                            int num = -1;
                            for (int i = 0; i < game.players.size(); i++) {
                                if (Objects.equals(game.players.get(i).name, playerName))
                                {
                                    flag = true;
                                    num = i;
                                    break;
                                }
                            }
                            if (flag)
                            {
                                if (money<=0||!game.players.get(num).PlayerHasEnoughMoney(money))
                                {
                                    Alert alert = new Alert(Alert.AlertType.ERROR);
                                    alert.setTitle("Incorrect money amount");
                                    alert.setHeaderText(null);
                                    alert.setContentText("Amount of money must be a natural number and mustn't be bigger than player's money");
                                    alert.showAndWait();
                                }
                                else if(!game.players.get(num).isActive())
                                {
                                    Alert alert = new Alert(Alert.AlertType.ERROR);
                                    alert.setTitle("User is out");
                                    alert.setHeaderText(null);
                                    alert.setContentText("This user is not active");
                                    alert.showAndWait();
                                }
                                else
                                {
                                    game.players.get(num).TakeMoneyFromPlayer(money);
                                    textConsole.appendText(money+"$ were taken from "+playerName+"\n");
                                    MoneyTextFields[num].setText(game.players.get(num).getMoney()+"$");
                                    popupStage.close();
                                }
                            }
                            else
                            {
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setTitle("Incorrect player name");
                                alert.setHeaderText(null);
                                alert.setContentText("There are no players with this name");
                                alert.showAndWait();
                            }
                        }
                        return null;
                    });
                    addMoneyDialog.showAndWait();
                });
                btnCancel.setOnMouseClicked(e ->
                {
                    popupStage.close();
                });
                popupLayout.getChildren().addAll(btnAddMoney, btnTakeMoney, btnCancel);
                Scene popupScene = new Scene(popupLayout);
                popupStage.setScene(popupScene);
                popupStage.showAndWait();
            }
        });
        for (int i = 0; i < NameTextFields.length; i++) {
            int finalI = i;
            NameTextFields[i].setOnMouseClicked(event ->
            {
                if (game.players.size()-1>=finalI&&game.players.get(finalI).isActive()&&game.players.get(finalI)!=game.players.get(currentPlayerIndex))
                {
                    if(ShowDeal)
                    {
                        for (int j = 0; j < MakeADealTexts.length; j++) {
                            if(j==finalI)
                                MakeADealTexts[j].setVisible(true);
                            else
                                MakeADealTexts[j].setVisible(false);
                        }
                        MakeADealTexts[finalI].setOnMouseClicked(event1 ->
                        {
                            MakeADealTexts[finalI].setVisible(false);
                            deal = new Deal(game.players.get(currentPlayerIndex),game.players.get(finalI));
                            CloseDealWindow();
                            ShowDealWindow();
                            for (int j = 0; j < CellsText.length; j++) {
                                int finalJ = j;
                                CellsText[j].setOnMouseClicked(event2 ->
                                {
                                    PropertyCell cell = (PropertyCell) game.game_board.game_board[finalJ];
                                    if (cell.owner==game.players.get(currentPlayerIndex))
                                    {
                                        if (cell instanceof Avenue&&cell.level_of_property>0&&DealRectangle.isVisible())
                                        {
                                            Alert alert = new Alert(Alert.AlertType.ERROR);
                                            alert.setTitle("Mistake");
                                            alert.setHeaderText(null);
                                            alert.setContentText("You can't trade upgraded property");
                                            alert.showAndWait();
                                        }
                                        else
                                        {
                                            if (deal.property1.contains(cell))
                                            {
                                                deal.property1.remove(cell);
                                            }
                                            else
                                            {
                                                deal.property1.add(cell);
                                            }
                                            DealTxtArea1.setText("You give: \n");
                                            for (int k = 0; k < deal.property1.size(); k++) {
                                                DealTxtArea1.appendText(deal.property1.get(k).name_of_cell+"\n");
                                            }
                                        }
                                    }
                                    else if(cell.owner==game.players.get(finalI))
                                    {
                                        if (cell instanceof Avenue&&cell.level_of_property>0)
                                        {
                                            Alert alert = new Alert(Alert.AlertType.ERROR);
                                            alert.setTitle("Mistake");
                                            alert.setHeaderText(null);
                                            alert.setContentText("You can't trade upgraded property");
                                            alert.showAndWait();
                                        }
                                        else
                                        {
                                            if (deal.property2.contains(cell))
                                            {
                                                deal.property2.remove(cell);
                                            }
                                            else
                                            {
                                                deal.property2.add(cell);
                                            }
                                            DealTxtArea2.setText("You receive: \n");
                                            for (int k = 0; k < deal.property2.size(); k++) {
                                                DealTxtArea2.appendText(deal.property2.get(k).name_of_cell+"\n");
                                            }
                                        }
                                    }
                                });
                            }
                        });
                    }
                    DealSendButton.setOnMouseClicked(event1 ->
                    {
                        boolean SendDeal = true;
                        int m1=0,m2=0;
                        if (!DealMoneyFill1.getText().isEmpty())
                        {
                            if (DealMoneyFill1.getText().matches("\\d+"))
                            {
                                m1 = Integer.parseInt(DealMoneyFill1.getText());
                            }
                            else
                            {
                                SendDeal = false;
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setTitle("Mistake");
                                alert.setHeaderText(null);
                                alert.setContentText("Inputed value must be a natural number");
                                alert.showAndWait();
                            }
                        }
                        if (!DealMoneyFill2.getText().isEmpty())
                        {
                            if (DealMoneyFill2.getText().matches("\\d+"))
                            {
                                m2 = Integer.parseInt(DealMoneyFill2.getText());
                            }
                            else
                            {
                                SendDeal = false;
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setTitle("Mistake");
                                alert.setHeaderText(null);
                                alert.setContentText("Inputed value must be a natural number");
                                alert.showAndWait();
                            }
                        }
                        if (!deal.player1.PlayerHasEnoughMoney(m1))
                        {
                            SendDeal = false;
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Mistake");
                            alert.setHeaderText(null);
                            alert.setContentText("You don't have inputed amount of money");
                            alert.showAndWait();
                        }
                        if (!deal.player2.PlayerHasEnoughMoney(m2))
                        {
                            SendDeal = false;
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Mistake");
                            alert.setHeaderText(null);
                            alert.setContentText("Second player doesn't have inputed amount of money");
                            alert.showAndWait();
                        }
                        deal.money1 = m1;
                        deal.money2 = m2;
                        if (SendDeal)
                        {
                            if (deal.property1.isEmpty() && deal.property2.isEmpty() &&m1==0&&m2==0)
                            {
                                CloseDealWindow();
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setTitle("Mistake");
                                alert.setHeaderText(null);
                                alert.setContentText("You can't send an empty deal!");
                                alert.showAndWait();
                            }
                            else
                            {
                                CloseDealWindow();
                                if (Objects.equals(DealSendButton.getText(), "Send deal"))
                                {
                                    if (deal.player2.isBot)
                                    {
                                        if (deal.IsDealProfitable())
                                        {
                                            PlayerAcceptedDeal(game);
                                        }
                                        else
                                        {
                                            textConsole.appendText(deal.player2.name+" rejected deal!\n");
                                        }
                                    }
                                    else
                                    {
                                        ShowDealToSecondPlayer();
                                    }
                                }
                                else
                                {
                                    PlayerAcceptedDeal(game);
                                }
                            }
                        }
                    });
                    DealCloseButton.setOnMouseClicked(event1 ->
                    {
                        if (Objects.equals(DealCloseButton.getText(), "Reject"))
                            textConsole.appendText(deal.player2.name+" rejected deal!\n");
                        CloseDealWindow();
                    });
                    AnchorPaneMain.setOnMouseClicked(event1 ->
                    {
                        MakeADealTexts[finalI].setVisible(false);
                    });
                }
            });
        }
        for (int i = 0; i < priceOfCellsText.length; i++) {
            int finalI = i;
            priceOfCellsText[i].setOnMouseClicked(event ->
            {
                RectIt=0;
                if (ShowCellInfo)
                {
                    CellInfoRectangle.setLayoutX(priceOfCellsText[finalI].getLayoutX());
                    if (CellInfoRectangle.getLayoutX()<443)
                    {
                        CellInfoRectangle.setLayoutX(443);
                    } else if (CellInfoRectangle.getLayoutX()>752) {
                        CellInfoRectangle.setLayoutX(752);
                    }
                    CellInfoRectangle.setLayoutY(priceOfCellsText[finalI].getLayoutY()-29);
                    if (CellInfoRectangle.getLayoutY()<168)
                    {
                        CellInfoRectangle.setLayoutY(168);
                    } else if (CellInfoRectangle.getLayoutY()>442) {
                        CellInfoRectangle.setLayoutY(442);
                    }
                    CellInfoTextField.setLayoutX(CellInfoRectangle.getLayoutX());
                    CellInfoTextField.setLayoutY(CellInfoRectangle.getLayoutY());
                    PledgeButton.setLayoutX(CellInfoRectangle.getLayoutX()+90);
                    PledgeButton.setLayoutY(CellInfoRectangle.getLayoutY()+162);
                    UpgradeButton.setLayoutX(PledgeButton.getLayoutX()-89);
                    UpgradeButton.setLayoutY(PledgeButton.getLayoutY());
                    CellInfoRectangle.setVisible(true);
                    CellInfoTextField.setVisible(true);
                    int a = finalI;
                    if (a==38)
                    {
                        a=13;
                    }
                    if (game.game_board.game_board[a] instanceof Avenue)
                    {
                        boolean flag = false;
                        for (int j = 0; j < game.players.get(currentPlayerIndex).player_streets.size(); j++) {
                            if (((Avenue) game.game_board.game_board[a]).number_of_street==game.players.get(currentPlayerIndex).player_streets.get(j))
                            {
                                flag = true;
                            }
                        }
                        if (flag&&ShowUpgradeButton)
                        {
                            UpgradeButton.setVisible(true);
                        }
                        else
                        {
                            UpgradeButton.setVisible(false);
                        }
                        if (((Avenue) game.game_board.game_board[a]).level_of_property==5||((Avenue) game.game_board.game_board[a]).isPledged)
                        {
                            UpgradeButton.setVisible(false);
                        }
                    }
                    else
                        UpgradeButton.setVisible(false);
                    UpgradeButton.setOnMouseClicked(event2 ->
                    {
                        if (finalI==38)
                        {
                            if(game.players.get(currentPlayerIndex).PlayerHasEnoughMoney(((Avenue)game.game_board.game_board[13]).price_of_building))
                            {
                                if (!IsCellUpdated)
                                {
                                    if (CanUpgradeLevelOfCell(game, game.players.get(currentPlayerIndex),(((PropertyCell)game.game_board.game_board[13]))))
                                    {
                                        int num = -1;
                                        for (int j = 0; j < game.players.get(currentPlayerIndex).property.size(); j++) {
                                            if (Objects.equals(game.game_board.game_board[13].name_of_cell, game.players.get(currentPlayerIndex).property.get(j).name_of_cell))
                                                num = j;
                                        }
                                        ((Avenue)game.game_board.game_board[13]).level_of_property++;
                                        PledgeButton.setText("Sell");
                                        BuildHouse(game,13);
                                        game.players.get(currentPlayerIndex).property.get(num).level_of_property= ((Avenue)game.game_board.game_board[13]).level_of_property;

                                        IsCellUpdated=true;
                                        priceOfCellsText[13].setText(((PropertyCell)game.game_board.game_board[13]).price_of_rent[((PropertyCell)game.game_board.game_board[13]).level_of_property]+"$");
                                        game.players.get(currentPlayerIndex).TakeMoneyFromPlayer(((Avenue)game.game_board.game_board[13]).price_of_building);
                                        MoneyTextFields[currentPlayerIndex].setText(game.players.get(currentPlayerIndex).getMoney()+"$");
                                        textConsole.appendText(game.players.get(currentPlayerIndex).name+" spent "+((Avenue)game.game_board.game_board[13]).price_of_building+"$ and upgraded "+game.game_board.game_board[13].name_of_cell+"\n");
                                    }
                                    else
                                    {
                                        textConsole.appendText("To upgrade all cells on the street must have the same level and you need to own the whole street!\n");
                                    }
                                }
                                else {
                                    textConsole.appendText("You can make only 1 upgrade during 1 step\n");
                                }
                            }
                            else
                            {
                                textConsole.appendText("You don't have enough money to upgrade this cell\n");
                            }
                        }
                        else
                        {
                            if(game.players.get(currentPlayerIndex).PlayerHasEnoughMoney(((Avenue)game.game_board.game_board[finalI]).price_of_building))
                            {
                                if (!IsCellUpdated)
                                {
                                    if(CanUpgradeLevelOfCell(game, game.players.get(currentPlayerIndex),(((PropertyCell)game.game_board.game_board[finalI]))))
                                    {
                                        IsCellUpdated=true;
                                        int num = -1;
                                        for (int j = 0; j < game.players.get(currentPlayerIndex).property.size(); j++) {
                                            if (Objects.equals(game.game_board.game_board[finalI].name_of_cell, game.players.get(currentPlayerIndex).property.get(j).name_of_cell))
                                                num = j;
                                        }
                                        ((Avenue)game.game_board.game_board[finalI]).level_of_property++;
                                        PledgeButton.setText("Sell");
                                        BuildHouse(game,finalI);
                                        game.players.get(currentPlayerIndex).property.get(num).level_of_property= ((Avenue)game.game_board.game_board[finalI]).level_of_property;
                                        priceOfCellsText[finalI].setText(((PropertyCell)game.game_board.game_board[finalI]).price_of_rent[((PropertyCell)game.game_board.game_board[finalI]).level_of_property]+"$");
                                        game.players.get(currentPlayerIndex).TakeMoneyFromPlayer(((Avenue)game.game_board.game_board[finalI]).price_of_building);
                                        MoneyTextFields[currentPlayerIndex].setText(game.players.get(currentPlayerIndex).getMoney()+"$");
                                        textConsole.appendText(game.players.get(currentPlayerIndex).name+" spent "+((Avenue)game.game_board.game_board[finalI]).price_of_building+"$ and upgraded "+game.game_board.game_board[finalI].name_of_cell+"\n");
                                    }
                                    else {
                                        textConsole.appendText("To upgrade all cells on the street must have the same level!\n");
                                    }
                                }
                                else
                                {
                                    textConsole.appendText("You can make only 1 upgrade during 1 step\n");
                                }
                            }
                            else
                            {
                                textConsole.appendText("You don't have enough money to upgrade this cell\n");
                            }
                        }

                    });
                    if (game.game_board.game_board[a] instanceof PropertyCell&&((PropertyCell)game.game_board.game_board[a]).owner!=null&&((PropertyCell)game.game_board.game_board[a]).owner==game.players.get(currentPlayerIndex))
                    {
                        PledgeButton.setVisible(true);
                    }
                    else
                    {
                        PledgeButton.setVisible(false);
                    }
                    if (game.game_board.game_board[a] instanceof Avenue&&((PropertyCell)game.game_board.game_board[a]).level_of_property>0)
                    {
                        PledgeButton.setText("Sell");
                    }
                    else if(((PropertyCell)game.game_board.game_board[a]).isPledged)
                    {
                        PledgeButton.setText("Buyout");
                    }
                    else
                    {
                        PledgeButton.setText("Pledge");
                    }
                    PledgeButton.setOnMouseClicked(event1 ->
                    {
                        if (finalI==38)
                        {
                            if (((PropertyCell)game.game_board.game_board[13]).level_of_property>0)
                            {
                                int num = -1;
                                for (int j = 0; j < game.players.get(currentPlayerIndex).property.size(); j++) {
                                    if(Objects.equals(game.players.get(currentPlayerIndex).property.get(j).name_of_cell, game.game_board.game_board[13].name_of_cell))
                                        num = j;
                                }
                                DemolishHouse(game,13);
                                if (((PropertyCell)game.game_board.game_board[13]).level_of_property==0)
                                    PledgeButton.setText("Pledge");
                            }
                            else
                            {
                                if (((PropertyCell)game.game_board.game_board[13]).isPledged)
                                {
                                    if(game.players.get(currentPlayerIndex).PlayerHasEnoughMoney((int) (((PropertyCell)game.game_board.game_board[13]).price_of_buying*0.6)))
                                    {
                                        PledgeButton.setText("Pledge");
                                        CellsRectanles[13].setFill(colors[game.players.get(currentPlayerIndex).number]);
                                        priceOfCellsText[13].setText(((PropertyCell)game.game_board.game_board[13]).price_of_rent[((PropertyCell)game.game_board.game_board[13]).level_of_property]+"$");
                                        ((PropertyCell)game.game_board.game_board[13]).isPledged=false;
                                        textConsole.appendText(game.players.get(currentPlayerIndex).name+" bought out "+game.game_board.game_board[13].name_of_cell+" \n");
                                        game.players.get(currentPlayerIndex).TakeMoneyFromPlayer((int) (((PropertyCell)game.game_board.game_board[13]).price_of_buying*0.6));
                                        MoneyTextFields[currentPlayerIndex].setText(game.players.get(currentPlayerIndex).getMoney()+"$");
                                    }
                                    else
                                    {
                                        textConsole.appendText("You don't have enough money to buyout this property\n");
                                    }
                                }
                                else {
                                    PledgeButton.setText("Buyout");
                                    CellsRectanles[13].setFill(Color.LIGHTGRAY);
                                    priceOfCellsText[13].setText(("0$"));
                                    ((PropertyCell)game.game_board.game_board[13]).isPledged=true;
                                    textConsole.appendText(game.players.get(currentPlayerIndex).name+" pledged "+game.game_board.game_board[13].name_of_cell+" and got "+(int)(((PropertyCell) game.game_board.game_board[13]).price_of_buying*0.5)+"$\n");
                                    game.players.get(currentPlayerIndex).AddMoneyToPlayer((int)(((PropertyCell) game.game_board.game_board[13]).price_of_buying*0.5));
                                    MoneyTextFields[currentPlayerIndex].setText(game.players.get(currentPlayerIndex).getMoney()+"$");
                                }
                            }
                        }
                        else
                        {
                            if (game.game_board.game_board[finalI]instanceof Avenue&&((PropertyCell)game.game_board.game_board[finalI]).level_of_property>0)
                            {
                                int num = -1;
                                for (int j = 0; j < game.players.get(currentPlayerIndex).property.size(); j++) {
                                    if(Objects.equals(game.players.get(currentPlayerIndex).property.get(j).name_of_cell, game.game_board.game_board[finalI].name_of_cell))
                                        num = j;
                                }
                                DemolishHouse(game,finalI);
                                if (((PropertyCell)game.game_board.game_board[finalI]).level_of_property==0)
                                    PledgeButton.setText("Pledge");
                            }
                            else
                            {
                                if (((PropertyCell)game.game_board.game_board[finalI]).isPledged)
                                {
                                    if(game.players.get(currentPlayerIndex).PlayerHasEnoughMoney((int) (((PropertyCell)game.game_board.game_board[finalI]).price_of_buying*0.6)))
                                    {
                                        PledgeButton.setText("Pledge");
                                        CellsRectanles[finalI].setFill(colors[game.players.get(currentPlayerIndex).number]);
                                        priceOfCellsText[finalI].setText(((PropertyCell)game.game_board.game_board[finalI]).price_of_rent[((PropertyCell)game.game_board.game_board[finalI]).level_of_property]+"$");
                                        ((PropertyCell)game.game_board.game_board[finalI]).isPledged=false;
                                        textConsole.appendText(game.players.get(currentPlayerIndex).name+" bought out "+game.game_board.game_board[finalI].name_of_cell+" \n");
                                        game.players.get(currentPlayerIndex).TakeMoneyFromPlayer((int) (((PropertyCell)game.game_board.game_board[finalI]).price_of_buying*0.6));
                                        MoneyTextFields[currentPlayerIndex].setText(game.players.get(currentPlayerIndex).getMoney()+"$");
                                        UpdateCommunityAndStationCells(game,game.players.get(currentPlayerIndex));
                                    }
                                    else
                                    {
                                        textConsole.appendText("You don't have enough money to buyout this property\n");
                                    }
                                }
                                else {
                                    PledgeButton.setText("Buyout");
                                    CellsRectanles[finalI].setFill(Color.LIGHTGRAY);
                                    priceOfCellsText[finalI].setText(("0$"));
                                    ((PropertyCell)game.game_board.game_board[finalI]).isPledged=true;
                                    textConsole.appendText(game.players.get(currentPlayerIndex).name+" pledged "+game.game_board.game_board[finalI].name_of_cell+" and got "+(int)(((PropertyCell) game.game_board.game_board[finalI]).price_of_buying*0.5)+"$\n");
                                    game.players.get(currentPlayerIndex).AddMoneyToPlayer((int)(((PropertyCell) game.game_board.game_board[finalI]).price_of_buying*0.5));
                                    MoneyTextFields[currentPlayerIndex].setText(game.players.get(currentPlayerIndex).getMoney()+"$");
                                    UpdateCommunityAndStationCells(game,game.players.get(currentPlayerIndex));
                                }
                            }

                        }
                    });
                    if (finalI==38)
                    {
                        Avenue pr = (Avenue) game.game_board.game_board[13];
                        CellInfoTextField.setText(pr.name_of_cell+"\nBasic rent : "+pr.price_of_rent[0] +"$\nwith 1 upgrade : "+pr.price_of_rent[1]+"$\nwith 2 upgrades : "+pr.price_of_rent[2]+"$\nwith 3 upgrades : "+pr.price_of_rent[3]+"$\nwith 4 upgrades : "+pr.price_of_rent[4]+"$\nwith 5 upgrades : "+pr.price_of_rent[5]+"$\nField's cost : "+pr.price_of_buying+"$\nField's pledge : "+(int)(pr.price_of_buying*0.5)+"$\nField's buyout : "+(int)(pr.price_of_buying*0.6)+"$\nPrice of building : "+pr.price_of_building+"$");
                    }
                    else if(finalI==12||finalI==28)
                    {
                        CommunityService pr = (CommunityService) game.game_board.game_board[finalI];
                        CellInfoTextField.setText(pr.name_of_cell+"\nwith 1 field : "+pr.price_of_rent[0] +"*player's throw\nwith 2 field's : "+pr.price_of_rent[1]+"*player's throw\nField's cost : "+pr.price_of_buying+"$\nField's pledge : "+(int)(pr.price_of_buying*0.5)+"$\nField's buyout : "+(int)(pr.price_of_buying*0.6)+"$");
                    } else if (finalI==5||finalI==15||finalI==25||finalI==35) {
                        Station pr = (Station) game.game_board.game_board[finalI];
                        CellInfoTextField.setText(pr.name_of_cell+"\nwith 1 field : "+pr.price_of_rent[0] +"$\nwith 2 fields : "+pr.price_of_rent[1]+"$\nwith 3 fields : "+pr.price_of_rent[2]+"$\nwith 4 fields : "+pr.price_of_rent[3]+"$\nField's cost : "+pr.price_of_buying+"$\nField's pledge : "+(int)(pr.price_of_buying*0.5)+"$\nField's buyout : "+(int)(pr.price_of_buying*0.6)+"$");
                    } else {
                        Avenue pr = (Avenue) game.game_board.game_board[finalI];
                        CellInfoTextField.setText(pr.name_of_cell+"\nBasic rent : "+pr.price_of_rent[0] +"$\nwith 1 upgrade : "+pr.price_of_rent[1]+"$\nwith 2 upgrades : "+pr.price_of_rent[2]+"$\nwith 3 upgrades : "+pr.price_of_rent[3]+"$\nwith 4 upgrades : "+pr.price_of_rent[4]+"$\nwith 5 upgrades : "+pr.price_of_rent[5]+"$\nField's cost : "+pr.price_of_buying+"$\nField's pledge : "+(int)(pr.price_of_buying*0.5)+"$\nField's buyout : "+(int)(pr.price_of_buying*0.6)+"$\nPrice of building : "+pr.price_of_building+"$");
                    }
                }
            });
        }
        AnchorPaneMain.setOnMouseClicked(event -> {
            if(RectIt>=1)
            {
                CellInfoRectangle.setVisible(false);
                CellInfoTextField.setVisible(false);
                PledgeButton.setVisible(false);
                UpgradeButton.setVisible(false);
            }
            else
                RectIt++;
        });
    }
    /**
     * Starts the game by updating the UI for the current player.
     *
     * @param game The instance of the game to start.
     */
    public void StartGame(Game game) {
        LOGGER.info("Game has started");
        updateUIForCurrentPlayer(game);
    }

    /**
     * Moves the game to the next player's turn and updates the UI accordingly.
     *
     * @param game The instance of the game.
     */
    private void moveToNextPlayer(Game game) {
        currentPlayerIndex = (currentPlayerIndex + 1) % game.players.size();
        updateUIForCurrentPlayer(game);
    }
    /**
     * Updates the UI elements based on the current player's turn and game state.
     *
     * @param game The instance of the game.
     */
    public void updateUIForCurrentPlayer(Game game) {
        IsCellUpdated=false;
        ShowDeal = true;
        Player currentPlayer = game.players.get(currentPlayerIndex);
        for (int i = 0; i < game.players.size(); i++) {
            if (i==currentPlayerIndex)
                game.players.get(i).IsHisTurn=true;
            else
                game.players.get(i).IsHisTurn=false;
        }
        if (currentPlayer.isActive()&&game.count_of_active_players!=1) {
            if (currentPlayer.inJail>0)
            {
                MakeMove(currentPlayer,game);
            }
            else {
                if (game.players.get(currentPlayerIndex).isBot)
                {
                    BotBuyoutProperty(game,game.players.get(currentPlayerIndex));
                    BotUpgradeCell(game);
                    MakeMove(currentPlayer, game);
                }
                else
                {
                    Rectangle rectangle = createRectangle(444,168,481,100,Color.DARKGRAY);
                    Button button = createButton("Throw dices", "lightgreen", 455, 210,460,24);
                    button.setTextFill(Color.WHITE);
                    Text txt1 = createText(currentPlayer.name+"'s turn",450,200,"bold",22);
                    ShowCellInfo=true;
                    ShowUpgradeButton = true;
                    button.setTextFill(Color.WHITE);
                    Pane root = new Pane();
                    root.getChildren().addAll(rectangle, button,txt1);

                    Pane rootPane = (Pane) btnStart.getScene().getRoot();
                    rootPane.getChildren().addAll(rectangle, button, txt1);
                    CellInfoRectangle.toFront();
                    CellInfoTextField.toFront();
                    PledgeButton.toFront();
                    UpgradeButton.toFront();
                    button.setOnAction(event ->
                    {
                        ShowCellInfo=false;
                        ShowUpgradeButton = false;
                        CellInfoRectangle.setVisible(false);
                        CellInfoTextField.setVisible(false);
                        PledgeButton.setVisible(false);
                        UpgradeButton.setVisible(false);
                        ShowDeal = false;
                        for (int i = 0; i < MakeADealTexts.length; i++) {
                            MakeADealTexts[i].setVisible(false);
                        }
                        rootPane.getChildren().removeAll(rectangle, button, txt1);
                        MakeMove(currentPlayer, game);
                    });
                }
            }
        } else {
           if (game.count_of_active_players<=1)
           {
               String name="";
               for (int i = 0; i < game.players.size(); i++) {
                   if(game.players.get(i).isActive())
                       name=game.players.get(i).name;
               }
               Rectangle rectangle = createRectangle(444,168,481,100,Color.DARKGRAY);
               Button button = createButton("Play again", "green", 455, 210,220,24);
               button.setTextFill(Color.WHITE);
               Button button2 = createButton("Exit", "red", 675, 210,220,24);
               button2.setTextFill(Color.WHITE);

               Text txt1 = createText(name+" has won!",450,200,"bold",26);
               LOGGER.info(name+" has won!");
               Pane root = new Pane();
               root.getChildren().addAll(rectangle, button, button2, txt1);

               Scene scene = btnStart.getScene();
               Pane rootPane = (Pane) scene.getRoot();
               rootPane.getChildren().add(root);
               button.setOnAction(event ->{
                   try {
                       Stage previousStage = (Stage) PlayerRecnangle1.getScene().getWindow();
                       FXMLLoader loader = new FXMLLoader(firstWindow.class.getResource("chooseamountofplayers.fxml"));
                       Parent root1 = loader.load();
                       Scene scene1 = new Scene(root1);
                       Stage stage = new Stage();
                       stage.setScene(scene1);
                       stage.setTitle("Choose amount of players");
                       previousStage.close();
                       stage.show();
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               });
               button2.setOnAction(event ->
               {
                   Stage stage = (Stage) button2.getScene().getWindow();
                   stage.close();
               });
           }
           else
           {
               moveToNextPlayer(game);
           }
        }
    }
    /**
     * Moves the player in the game based on dice roll and updates the game state.
     *
     * @param player The player making the move.
     * @param game   The instance of the game.
     */
    public void MakeMove(Player player, Game game)
    {
        if (player.inJail == 0)
        {
            textConsole.appendText(player.name+" throws dices\n");
            game.dices.ThrowDices();
            textConsole.appendText(player.name+" got "+game.dices.dice1+ " and " + game.dices.dice2+"\n");
            int step = game.dices.dice1 + game.dices.dice2;
            if (player.count_of_doubles_in_a_row>=2&&game.dices.dice1==game.dices.dice2) {
                player.count_of_doubles_in_a_row = 0;
                textConsole.appendText(player.name + " got in Jail for cheating(3 doubles in a row)\n");
                SetPlayerInJail(player, game);
            }
            else {
                if(player.current_position+step>=40)
                {
                    player.current_position+=step-40;
                    PlayerCrossedStart(player);
                }
                else
                    player.current_position+=step;
                AnimatePlayerToken(player);
                Timer timer = new Timer();
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        Platform.runLater(() -> {
                            PlayerStoodOnCell( player, game.game_board.game_board[player.current_position],game);
                        });
                    }
                };
                timer.schedule(task, 1000);
            }
           }
        else{
            if (player.isBot)
            {
                if (player.PlayerHasEnoughMoney(100))
                {
                    player.TakeMoneyFromPlayer(100);
                    MoneyTextFields[player.number].setText(player.getMoney()+"$");
                    LOGGER.info(player.name+" paid 100$ and got out of Jail");
                    textConsole.appendText(player.name+" paid 100$ and got out of Jail\n");
                    player.inJail=0;
                    updateUIForCurrentPlayer(game);
                } else if (player.inJail >= 4) {
                    if (!player.ComparePlayersPossessions(100))
                    {
                        PlayerHasLost(game,player);
                        moveToNextPlayer(game);
                    } else if (player.PlayerHasEnoughMoney(100)) {
                        player.TakeMoneyFromPlayer(100);
                        MoneyTextFields[player.number].setText(player.getMoney()+"$");
                        LOGGER.info(player.name+" paid 100$ and got out of Jail");
                        textConsole.appendText(player.name+" paid 100$ and got out of Jail\n");
                        player.inJail=0;
                        updateUIForCurrentPlayer(game);
                    }
                    else
                    {
                        BotPledgeProperty(game,player);
                        MakeMove(player, game);
                    }
                }
                else
                {
                    game.dices.ThrowDices();
                    textConsole.appendText(player.name+" got "+game.dices.dice1+ " and " + game.dices.dice2+"\n");
                    if (game.dices.dice1==game.dices.dice2)
                    {
                        LOGGER.info(player.name+" got out of Jail");
                        textConsole.appendText(player.name+" got out of Jail\n");
                        player.count_of_doubles_in_a_row--;
                        player.inJail=0;
                        MakingNextStep(game,player);
                    }
                    else {
                        textConsole.appendText(player.name+" didn't get out of Jail\n");
                        player.inJail++;
                        MakingNextStep(game,player);
                    }
                }
            }
            else
            {
                ShowCellInfo = true;
                textConsole.appendText(player.name + " is in the Jail.\n");
                Rectangle rectangle = createRectangle(444,168,481,100,Color.DARKGRAY);

                Button button = createButton("Throw", "green", 455, 210,220,24);
                button.setTextFill(Color.WHITE);
                Button button2 = createButton("Pay", "red", 675, 210,220,24);
                button2.setTextFill(Color.WHITE);
                Text txt1 = createText("To get out you need to throw a double(you can try to do it 3 times) or pay 100$",450,200,"bold",12);
                Pane root = new Pane();
                root.getChildren().addAll(rectangle, button, button2, txt1);

                Pane rootPane = (Pane) btnStart.getScene().getRoot();
                rootPane.getChildren().addAll(rectangle, button, button2, txt1);
                CellInfoRectangle.toFront();
                CellInfoTextField.toFront();
                PledgeButton.toFront();
                UpgradeButton.toFront();
                button.setOnAction(event ->
                {
                    rootPane.getChildren().removeAll(rectangle, button,button2, txt1);
                    if (player.inJail >= 4)
                    {
                        textConsole.appendText("You don't have any tries, now you need to pay 100$\n");
                        Rectangle rectangle1 = createRectangle(444,168,481,100,Color.DARKGRAY);
                        Button button1 = createButton("Pay", "lightgreen",455,210,460,24);
                        button1.setTextFill(Color.WHITE);
                        Text txt = createText("Pay 100$?",450, 200,"bold",24 );
                        Pane root1 = new Pane();
                        root.getChildren().addAll(rectangle1, button1,txt);

                        Pane rootPane1 = (Pane) btnStart.getScene().getRoot();
                        rootPane.getChildren().addAll(rectangle1, button1,txt);
                        CellInfoRectangle.toFront();
                        CellInfoTextField.toFront();
                        PledgeButton.toFront();
                        UpgradeButton.toFront();
                        button1.setOnAction(event1 ->
                        {
                            if (player.PlayerHasEnoughMoney(100))
                            {
                                rootPane1.getChildren().removeAll(rectangle1, button1, txt);
                                player.TakeMoneyFromPlayer(100);
                                MoneyTextFields[player.number].setText(player.getMoney()+"$");
                                LOGGER.info(player.name+" paid 100$ and got out of Jail");
                                textConsole.appendText(player.name+" paid 100$ and got out of Jail\n");
                                player.inJail=0;
                                CellInfoRectangle.setVisible(false);
                                CellInfoTextField.setVisible(false);
                                PledgeButton.setVisible(false);
                                UpgradeButton.setVisible(false);
                                updateUIForCurrentPlayer(game);
                            }
                            else
                            {
                                if (player.ComparePlayersPossessions(100)) {
                                    textConsole.appendText("You don't have money, but you can pledge your property and pay\n");
                                } else {
                                    rootPane1.getChildren().removeAll(rectangle, button, txt1);
                                    player.TakeMoneyFromPlayer(100);
                                    CellInfoRectangle.setVisible(false);
                                    CellInfoTextField.setVisible(false);
                                    PledgeButton.setVisible(false);
                                    UpgradeButton.setVisible(false);
                                    PlayerHasLost(game, player);
                                    MakingNextStep(game, player);
                                }
                            }
                        });
                    }
                    else
                    {
                        game.dices.ThrowDices();
                        rootPane.getChildren().removeAll(rectangle, button, txt1);
                        textConsole.appendText(player.name+" got "+game.dices.dice1+ " and " + game.dices.dice2+"\n");
                        if (game.dices.dice1==game.dices.dice2)
                        {
                            LOGGER.info(player.name+"got out of Jail");
                            textConsole.appendText(player.name+" got out of Jail\n");
                            player.count_of_doubles_in_a_row--;
                            player.inJail=0;
                            MakingNextStep(game,player);
                        }
                        else {
                            textConsole.appendText(player.name+" didn't get out of Jail\n");
                            player.inJail++;
                            MakingNextStep(game,player);
                        }
                    }
                });
                button2.setOnAction(event ->
                {
                    if (player.PlayerHasEnoughMoney(100))
                    {
                        rootPane.getChildren().removeAll(rectangle, button,button2, txt1);
                        player.TakeMoneyFromPlayer(100);
                        LOGGER.info(player.name+" paid 100$ and got out of Jail");
                        MoneyTextFields[player.number].setText(player.getMoney()+"$");textConsole.appendText(player.name+" paid 100$ and got out of Jail\n");
                        player.inJail=0;
                        CellInfoRectangle.setVisible(false);
                        CellInfoTextField.setVisible(false);
                        PledgeButton.setVisible(false);
                        UpgradeButton.setVisible(false);
                        updateUIForCurrentPlayer(game);
                    }
                    else
                    {
                        textConsole.appendText("You don't have enough money\n");
                    }
                });
            }
        }
    }
    /**
     * Handles the actions when a player stands on a particular cell.
     *
     * @param player The player standing on the cell.
     * @param cell   The cell the player is standing on.
     * @param game   The instance of the game.
     */
    public void PlayerStoodOnCell(Player player, Cell cell, Game game)
    {
        if (cell instanceof PropertyCell)
        {
            PlayerStoodOnPropertyCell(player, (PropertyCell) cell, game);
        } else if (cell instanceof TaxCell) {
            PlayerStoodOnTaxCell(player, game);
        }
        else if (cell instanceof GoToJail)
        {
            SetPlayerInJail(player,game);
        }
        else if(cell instanceof Jail )
        {
            // Player attends jail, no action needed
            textConsole.appendText(player.name+" attends Jail (only visit)\n");
            MakingNextStep(game,player);
        } else if (cell instanceof ParkingCell) {
            MakingNextStep(game,player);
        } else if(cell instanceof ChanceCard)
        {
            PlayerStoodOnChanceCard(player,game);
        } else if (cell instanceof CommunityChest) {
            PlayerStoodOnCommunityChest(player,game);
        } else if (cell instanceof StartCell) {
            // Player landed on Start cell, no action needed
            MakingNextStep(game,player);
        }
    }
    /**
     * Sets the player in jail and handles the actions related to being in jail.
     *
     * @param player The player to be set in jail.
     * @param game   The instance of the game.
     */
    public void SetPlayerInJail(Player player, Game game)
    {
        player.current_position=10;
        AnimatePlayerToken(player);
        textConsole.appendText(player.name+ " got in Jail\n");
        // Check if the player has a 'Get Out of Jail Free' card
        if(player.card_get_out_of_jail>0)
        {
            player.card_get_out_of_jail--;
            textConsole.appendText(player.name+" got card 'get out of Jail for free'\n");
            textConsole.appendText(player.name+" got out of Jail\n");
        }
        else {
            player.inJail=1;
        }
        moveToNextPlayer(game);
    }
    /**
     * Handles the actions when a player stood on the community chest cell.
     *
     * @param player The player standing on the cell.
     * @param game   The instance of the game.
     */
    public void PlayerStoodOnCommunityChest(Player player, Game game)
    {
        Random random = new Random();
        int res = random.nextInt(0,16);
        CommunityChest cc = new CommunityChest();
        textConsole.appendText(player.name+" got community chest card -> "+cc.getCommunityChestCard(res)+"\n");
        switch (res)
        {
            case 0:
                player.current_position=0;
                AnimatePlayerToken(player);
                PlayerCrossedStart(player);
                MakingNextStep(game,player);
                break;
            case 1:
                player.AddMoneyToPlayer(200);
                textConsole.appendText(player.name+" got 200$\n");
                MoneyTextFields[player.number].setText(player.getMoney()+"$");
                MakingNextStep(game,player);
                break;
            case 2:
                player.AddMoneyToPlayer(50);
                textConsole.appendText(player.name+" got 50$\n");
                MoneyTextFields[player.number].setText(player.getMoney()+"$");
                MakingNextStep(game,player);
                break;
            case 3:
                player.card_get_out_of_jail++;
                MakingNextStep(game,player);
                break;
            case 4:
                SetPlayerInJail(player,game);
                break;
            case 5:
                player.AddMoneyToPlayer(100);
                textConsole.appendText(player.name+" got 100$\n");
                MoneyTextFields[player.number].setText(player.getMoney()+"$");
                MakingNextStep(game,player);
                break;
            case 6:
                player.AddMoneyToPlayer(20);
                textConsole.appendText(player.name+" got 20$\n");
                MoneyTextFields[player.number].setText(player.getMoney()+"$");MakingNextStep(game,player);
                break;
            case 7:
                player.AddMoneyToPlayer(30);
                textConsole.appendText(player.name+" got 30$ for his birthday\n");
                MoneyTextFields[player.number].setText(player.getMoney()+"$");
                MakingNextStep(game,player);
                break;
            case 8:
                player.AddMoneyToPlayer(100);
                textConsole.appendText(player.name+" got 100$\n");
                MoneyTextFields[player.number].setText(player.getMoney()+"$");
                MakingNextStep(game,player);
                break;
            case 9:
                UIPaySmth(game, player, "Pay 100$ hospital fees?",100);
                break;
            case 10,11:
                UIPaySmth(game ,player, "Pay 50$?",50);
                break;
            case 12:
                player.AddMoneyToPlayer(25);
                textConsole.appendText(player.name+" got 25$\n");
                MoneyTextFields[player.number].setText(player.getMoney()+"$");
                MakingNextStep(game,player);
                break;
            case 13:
                int hou=0,hotel = 0;
                for (int i = 0; i < player.property.size(); i++) {
                    if (player.property.get(i)instanceof Avenue)
                    {
                        if(player.property.get(i).level_of_property==5)
                            hotel+=1;
                        else
                            hou+=player.property.get(i).level_of_property;
                    }
                }
                if (hou==0&&hotel==0)
                    MakingNextStep(game,player);
                else
                    UIPaySmth(game,player,"You need to pay "+40*hou+"$ for houses and "+115*hotel+"$ for hotels",40*hou+115*hotel);
                break;
            case 14:
                player.AddMoneyToPlayer(10);
                textConsole.appendText(player.name+" got 10$ like a prize in a beauty contest\n");
                MoneyTextFields[player.number].setText(player.getMoney()+"$");
                MakingNextStep(game,player);
                break;
            case 15:
                player.AddMoneyToPlayer(100);
                textConsole.appendText(player.name+" inherited 100$\n");
                MoneyTextFields[player.number].setText(player.getMoney()+"$");
                MakingNextStep(game,player);
                break;
        }

    }
    /**
     * Handles the actions when a player stood on the Chance card cell.
     *
     * @param player The player standing on the cell.
     * @param game   The instance of the game.
     */
    public void PlayerStoodOnChanceCard(Player player, Game game)
    {
        Random random = new Random();
        int res = random.nextInt(0,16);
        ChanceCard cc = new ChanceCard();
        textConsole.appendText(player.name+" got a chance card("+cc.getChanceCard(res)+")\n");
        switch (res)
        {
            case 0:
                player.current_position=0;
                AnimatePlayerToken(player);
                PlayerCrossedStart(player);
                MakingNextStep(game,player);
                break;
            case 1:
                if (player.current_position>8)
                {
                    PlayerCrossedStart(player);
                }
                player.current_position=8;
                AnimatePlayerToken(player);
                PlayerStoodOnCell(player, game.game_board.game_board[8],game);
                break;
            case 2:
                player.current_position=39;
                AnimatePlayerToken(player);
                PlayerStoodOnCell(player, game.game_board.game_board[39],game);
                break;
            case 3:
                if (player.current_position>16)
                {
                    PlayerCrossedStart(player);
                }
                player.current_position=16;
                AnimatePlayerToken(player);
                PlayerStoodOnCell(player, game.game_board.game_board[16],game);
                break;
            case 4:
                if (player.current_position==36)
                {
                    player.current_position=35;
                    AnimatePlayerToken(player);
                    PlayerStoodOnCell(player, game.game_board.game_board[35],game);
                } else if (player.current_position==22) {
                    player.current_position=25;
                    AnimatePlayerToken(player);
                    PlayerStoodOnCell(player, game.game_board.game_board[25],game);
                } else
                {
                    player.current_position = 5;
                    AnimatePlayerToken(player);
                    PlayerStoodOnCell(player, game.game_board.game_board[5],game);
                }
                break;
            case 5:
                if (player.current_position==36||player.current_position==22)
                {
                    player.current_position=28;
                    AnimatePlayerToken(player);
                    PropertyCell property_cell = (PropertyCell)game.game_board.game_board[player.current_position];
                    if (property_cell.owner != player) {
                        if (property_cell.owner != null) {
                            Rectangle rectangle = createRectangle(444,168,481,100,Color.DARKGRAY);
                            Button button = createButton("Throw dices", "lightgreen",455,210,460,24);
                            button.setTextFill(Color.WHITE);
                            Text txt1 = createText("Throw dices to find out how much to pay",450,200,"bold",18 );
                            if (player.isBot)
                            {
                                textConsole.appendText(player.name+" throws dices\n");
                                game.dices.ThrowDices();
                                textConsole.appendText(player.name+" got "+game.dices.dice1+ " and " + game.dices.dice2+"\n");
                                int step = game.dices.dice1 + game.dices.dice2;
                                UIPayToOwner(game, player,property_cell,10*step);
                            }
                            else
                            {
                                Pane root = new Pane();
                                root.getChildren().addAll(rectangle, button,txt1);Scene scene = btnStart.getScene();
                                Pane rootPane = (Pane) scene.getRoot();
                                rootPane.getChildren().add(root);
                                button.setOnAction(event ->
                                {
                                    root.getChildren().removeAll(rectangle, button, txt1);
                                    textConsole.appendText(player.name+" throws dices\n");
                                    game.dices.ThrowDices();
                                    textConsole.appendText(player.name+" got "+game.dices.dice1+ " and " + game.dices.dice2+"\n");
                                    int step = game.dices.dice1 + game.dices.dice2;
                                    UIPayToOwner(game, player,property_cell,10*step);
                                });
                            }
                        }
                        else
                        {
                            if(player.PlayerHasEnoughMoney(property_cell.price_of_buying)) {
                                UIBuyProperty(game, player);
                            }
                            else
                            {
                                MakingNextStep(game, player);
                            }
                        }
                    }
                    else {
                        MakingNextStep(game,player);
                    }
                }
                else
                {
                    player.current_position = 12;
                    AnimatePlayerToken(player);
                    PropertyCell property_cell = (PropertyCell)game.game_board.game_board[player.current_position];
                    if (property_cell.owner != player) {
                        if (property_cell.owner != null) {
                            Rectangle rectangle = createRectangle(444,168,481,100,Color.DARKGRAY);
                            Button button = createButton("Throw dices", "lightgreen", 455, 210,460,24);
                            Text txt1 = createText("Throw dices to find out how much to pay", 450, 200, "bold",18);
                            if (player.isBot)
                            {
                                textConsole.appendText(player.name+" throws dices\n");
                                game.dices.ThrowDices();
                                textConsole.appendText(player.name+" got "+game.dices.dice1+ " and " + game.dices.dice2+"\n");
                                int step = game.dices.dice1 + game.dices.dice2;
                                UIPayToOwner(game, player,property_cell,10*step);
                            }
                            else
                            {
                                Pane root = new Pane();
                                root.getChildren().addAll(rectangle, button,txt1);Scene scene = btnStart.getScene();
                                Pane rootPane = (Pane) scene.getRoot();
                                rootPane.getChildren().add(root);
                                button.setOnAction(event ->
                                {
                                    root.getChildren().removeAll(rectangle, button, txt1);
                                    textConsole.appendText(player.name+" throws dices\n");
                                    game.dices.ThrowDices();
                                    textConsole.appendText(player.name+" got "+game.dices.dice1+ " and " + game.dices.dice2+"\n");
                                    int step = game.dices.dice1 + game.dices.dice2;
                                    UIPayToOwner(game, player,property_cell,10*step);
                                });
                            }

                        }
                        else
                        {
                            if(player.PlayerHasEnoughMoney(property_cell.price_of_buying)) {
                                UIBuyProperty(game ,player);
                            }
                        }
                    }
                    else
                    {
                        MakingNextStep(game, player);
                    }
                }
                break;
            case 6:
                if (player.current_position==36||player.current_position==22)
                {
                    player.current_position = 38;
                    AnimatePlayerToken(player);
                    PlayerStoodOnTaxCell(player,game);
                }
                else
                {
                    player.current_position = 4;
                    AnimatePlayerToken(player);
                    PlayerStoodOnTaxCell(player,game);
                }
                break;
            case 7:
                player.AddMoneyToPlayer(50);
                textConsole.appendText(player.name+" got 50$ dividends from Bank\n");
                MoneyTextFields[player.number].setText(player.getMoney()+"$");
                MakingNextStep(game,player);
                break;
            case 8:
                player.card_get_out_of_jail++;
                MakingNextStep(game,player);
                break;
            case 9:
                player.current_position-=3;
                AnimatePlayerToken(player);
                PlayerStoodOnCell(player,game.game_board.game_board[player.current_position],game);
                break;
            case 10:
                SetPlayerInJail(player,game);
                break;
            case 11:
                int hou=0,hotel = 0;
                for (int i = 0; i < player.property.size(); i++) {
                    if (player.property.get(i)instanceof Avenue)
                    {
                        if(player.property.get(i).level_of_property==5)
                            hotel+=1;
                        else
                            hou+=player.property.get(i).level_of_property;
                    }
                }
                UIPaySmth(game,player,"You need to pay "+25*hou+"$ for houses and "+40*hotel+"$ for hotels",25*hou+40*hotel);
                break;
            case 12:
                UIPaySmth(game,player,"Pay 15$ speeding fine?",15);
                break;
            case 13:
                player.current_position = 5;
                AnimatePlayerToken(player);
                if (player.current_position==36||player.current_position==22)
                {
                    PlayerCrossedStart(player);
                }
                PlayerStoodOnPropertyCell(player,(PropertyCell) game.game_board.game_board[5],game);
                break;
            case 14:
                Random rand = new Random();
                res = rand.nextInt(0,game.count_of_active_players);
                while(game.players.get(res)==player)
                {
                    res = rand.nextInt(0,game.count_of_active_players);
                }
                Player owner = game.players.get(res);
                if (player.isBot)
                {
                    if (player.PlayerHasEnoughMoney(150))
                    {
                        player.TakeMoneyFromPlayer(150);
                        owner.AddMoneyToPlayer(150);
                        textConsole.appendText(player.name + " gifted " + 150 + "$ to " + owner.name + "\n");
                        MoneyTextFields[player.number].setText(Integer.toString(player.getMoney())+"$");
                        MoneyTextFields[owner.number].setText(Integer.toString(owner.getMoney())+"$");
                        MakingNextStep(game, player);
                    } else if (player.ComparePlayersPossessions(150)) {
                        BotPledgeProperty(game, player);
                        BotPledgeProperty(game, player);
                        BotPledgeProperty(game, player);
                        player.TakeMoneyFromPlayer(150);
                        owner.AddMoneyToPlayer(150);
                        textConsole.appendText(player.name + " gifted " + 150 + "$ to " + owner.name + "\n");
                        MoneyTextFields[player.number].setText(Integer.toString(player.getMoney())+"$");
                        MoneyTextFields[owner.number].setText(Integer.toString(owner.getMoney())+"$");
                        MakingNextStep(game, player);
                    }
                    else
                    {
                        PlayerHasLost(game,player);
                        moveToNextPlayer(game);
                    }
                }
                else
                {
                    Rectangle rectangle = createRectangle(444,168,481,100,Color.DARKGRAY);
                    Button button = createButton("PAY", "green", 455, 210,460,24);
                    Text txt1 = createText("Pay 150$ to "+owner.name+"?", 450, 200, "bold",22);
                    button.setTextFill(Color.WHITE);
                    Pane root = new Pane();
                    Pane root1 = new Pane();
                    root1.getChildren().addAll(rectangle, button,txt1);

                    Pane rootPane = (Pane) btnStart.getScene().getRoot();
                    rootPane.getChildren().addAll(rectangle, button, txt1);
                    CellInfoRectangle.toFront();
                    CellInfoTextField.toFront();
                    PledgeButton.toFront();
                    button.setOnAction(event -> {
                        if (player.PlayerHasEnoughMoney(150)) {
                            rootPane.getChildren().removeAll(rectangle, button, txt1);
                            player.TakeMoneyFromPlayer(150);
                            owner.AddMoneyToPlayer(150);
                            textConsole.appendText(player.name + " gifted " + 150 + "$ to " + owner.name + "\n");
                            MoneyTextFields[player.number].setText(Integer.toString(player.getMoney())+"$");
                            MoneyTextFields[owner.number].setText(Integer.toString(owner.getMoney())+"$");
                            MakingNextStep(game, player);
                        } else {
                            if (player.ComparePlayersPossessions(150)) {
                                textConsole.appendText("You don't have money, but you can pledge your property and pay\n");
                            } else {
                                rootPane.getChildren().removeAll(rectangle, button, txt1);
                                player.TakeMoneyFromPlayer(150);
                                CellInfoRectangle.setVisible(false);
                                CellInfoTextField.setVisible(false);
                                PledgeButton.setVisible(false);
                                PlayerHasLost(game, player);
                                MakingNextStep(game, player);
                            }
                        }
                    });
                }
                break;
            default:
                player.AddMoneyToPlayer(150);
                MoneyTextFields[player.number].setText(player.getMoney()+"$");
                textConsole.appendText(player.name+" got 150$ building loan matures\n");
                MakingNextStep(game,player);
                break;
        }
    }
    /**
     * Handles the actions when a player stood on the instance of property cell.
     *
     * @param player The player standing on the cell.
     * @param game   The instance of the game.
     */
    public void PlayerStoodOnPropertyCell(Player player, PropertyCell property_cell, Game game)
    {
        if (property_cell.owner != player){
            if (property_cell.owner != null)
            {
                if (property_cell.owner.inJail!=0)
                {
                    textConsole.appendText(player.name+" stood on the "+property_cell.owner.name+"'s property, but "+property_cell.owner.name+" is in the Jail, so no need to pay\n");
                    MakingNextStep(game,player);
                } else if (property_cell.isPledged) {
                    textConsole.appendText(player.name+" stood on the "+property_cell.owner.name+"'s property, but this field is pledged, so no need to pay\n");
                    MakingNextStep(game,player);
                } else
                {
                    int price = property_cell.price_of_rent[property_cell.level_of_property];
                    if (property_cell instanceof CommunityService)
                        price*=(game.dices.dice1+game.dices.dice2);
                    UIPayToOwner(game ,player,property_cell, price);
                }
            }
            else
            {
                if(player.PlayerHasEnoughMoney(property_cell.price_of_buying))
                {
                    UIBuyProperty(game, player);
                }
                else
                {
                    MakingNextStep(game,player);
                }
            }
        }
        else {
            MakingNextStep(game,player);
        }
    }
    /**
     * Handles the actions when a player stood on the tax cell.
     *
     * @param player The player standing on the cell.
     * @param game   The instance of the game.
     */
    public void PlayerStoodOnTaxCell(Player player, Game game) {
        UIPaySmth(game, player, "Pay 150$ tax?", 150);
    }
    /**
     * Handles the process of a player buying a property in the game.
     *
     * @param game           The instance of the game.
     * @param buyer          The player buying the property.
     * @param buyed_property The property being bought.
     */
    public void BuyProperty(Game game, Player buyer, PropertyCell buyed_property)
    {
        buyer.TakeMoneyFromPlayer(buyed_property.price_of_buying);
        buyer.AddProperty(buyed_property);
        buyed_property.owner = buyer;
        CellsRectanles[buyer.current_position].setFill(colors[buyer.number]);
        int money = buyer.getMoney();
        MoneyTextFields[buyer.number].setText(money+"$");
        if (buyed_property instanceof CommunityService)
        {
            priceOfCellsText[buyer.current_position].setText(Integer.toString(buyed_property.price_of_rent[buyed_property.level_of_property])+"x");
        }
        else
        {
            priceOfCellsText[buyer.current_position].setText(Integer.toString(buyed_property.price_of_rent[buyed_property.level_of_property])+"$");
        }
        UpdateCommunityAndStationCells(game, buyer);
    }
    /**
     * Handles the actions to be taken after a player makes a move.
     *
     * @param game   The instance of the game.
     * @param player The player who made the move.
     */
    public void MakingNextStep(Game game, Player player)
    {
        if (game.dices.dice1 == game.dices.dice2&&player.count_of_doubles_in_a_row<=2)
        {
            player.count_of_doubles_in_a_row++;
            textConsole.appendText(player.name+" got double, so he throws dices one more time!\n");
            updateUIForCurrentPlayer(game);
        } else if (player.count_of_doubles_in_a_row>=3) {
            player.count_of_doubles_in_a_row = 0;
            textConsole.appendText(player.name+ " got in Jail for cheating(3 doubles in a row)\n");
            SetPlayerInJail(player,game);
        } else {
            player.count_of_doubles_in_a_row = 0;
            moveToNextPlayer(game);
        }
    }
    /**
     * Handles the actions when a player crosses the Start cell.
     *
     * @param player The player who crossed the Start cell.
     */
    public void PlayerCrossedStart(Player player)
    {
        LOGGER.info(player.name+" crossed Start and got 200$");
        textConsole.appendText(player.name+" crossed Start and got 200$\n");
        player.AddMoneyToPlayer(200);
        MoneyTextFields[player.number].setText(Integer.toString(player.getMoney())+"$");
    }
    /**
     * Animates the movement of the player token on the game board.
     * @param player The player whose token is being animated.
     */
    public void AnimatePlayerToken(Player player)
    {
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(1));
        transition.setNode(PlayerCircles.get(player.number));
        transition.setToX(player.positionX[player.current_position]-player.first_positionX);
        transition.setToY(player.positionY[player.current_position]-player.first_positionY);
        transition.play();
    }
    /**
     * Handles the user interface interactions for a player to buy a property.
     *
     * @param game   The instance of the game.
     * @param player The player attempting to buy a property.
     */
    public void UIBuyProperty(Game game, Player player)
    {
        PropertyCell property_cell =(PropertyCell) game.game_board.game_board[player.current_position];
        if(player.isBot)
        {
            BuyProperty(game, player, property_cell);
            LOGGER.info(player.name + " bought " + property_cell.name_of_cell);
            textConsole.appendText(player.name + " bought " + property_cell.name_of_cell + "\n");
            MakingNextStep(game, player);
        }
        else
        {
            Button button = createButton("Yes", "green", 455, 210,220,24);
            Button button2 = createButton("No", "red", 675, 210,220,24);
            Rectangle rectangle = createRectangle(444,168,481,100,Color.DARKGRAY);
            button.setTextFill(Color.WHITE);
            button2.setTextFill(Color.WHITE);
            Text txt1 = createText("Do you want ot buy " + property_cell.name_of_cell + "?",450,200,"bold",22);
            Pane root = new Pane();
            root.getChildren().addAll(rectangle, button, button2, txt1);
            Scene scene = btnStart.getScene();
            Pane rootPane = (Pane) scene.getRoot();
            rootPane.getChildren().add(root);
            button.setOnAction(event ->
            {
                root.getChildren().removeAll(rectangle, button, button2, txt1);
                BuyProperty(game, player, property_cell);
                LOGGER.info(player.name + " bought " + property_cell.name_of_cell);
                textConsole.appendText(player.name + " bought " + property_cell.name_of_cell + "\n");
                MakingNextStep(game, player);
            });
            button2.setOnAction(event -> {
                root.getChildren().removeAll(rectangle, button,button2, txt1);
                MakingNextStep(game, player);
            });
        }
    }
    /**
     * Handles the user interface interactions for a player to pay rent to another player.
     *
     * @param game           The instance of the game.
     * @param player         The player paying the rent.
     * @param property_cell  The property for which rent is being paid.
     * @param money          The amount of money to be paid as rent.
     */
    public void UIPayToOwner(Game game, Player player, PropertyCell property_cell, int money){
        if (player.isBot)
        {
            if (player.PlayerHasEnoughMoney(money))
            {
                player.TakeMoneyFromPlayer(money);
                property_cell.owner.AddMoneyToPlayer(money);
                LOGGER.info(player.name + " paid " + money + "$ rent to " + property_cell.owner.name);
                textConsole.appendText(player.name + " paid " + money + "$ rent to " + property_cell.owner.name + "\n");
                MoneyTextFields[player.number].setText(Integer.toString(player.getMoney())+"$");
                MoneyTextFields[property_cell.owner.number].setText(Integer.toString(property_cell.owner.getMoney())+"$");
                MakingNextStep(game, player);
            } else
            {
                if (player.ComparePlayersPossessions(money)) {
                    BotPledgeProperty(game,player);
                    UIPayToOwner(game,player,property_cell,money);
                }
                else
                {
                    PlayerHasLost(game, player);
                    moveToNextPlayer(game);
                }
            }
        }
        else
        {
            ShowCellInfo=true;
            Rectangle rectangle = createRectangle(444,168,481,100,Color.DARKGRAY);
            Button button = createButton("PAY", "green", 455, 210,460,24);
            button.setTextFill(Color.WHITE);
            Text txt1 = createText("Pay "+money+"$ to "+property_cell.owner.name+"?",450,200,"bold",22);
            Pane root = new Pane();
            Pane root1 = new Pane();
            root1.getChildren().addAll(rectangle, button,txt1);

            Pane rootPane = (Pane) btnStart.getScene().getRoot();
            rootPane.getChildren().addAll(rectangle, button, txt1);
            CellInfoRectangle.toFront();
            CellInfoTextField.toFront();
            PledgeButton.toFront();
            button.setOnAction(event -> {
                if (player.PlayerHasEnoughMoney(money)) {
//                ShowCellInfo=false;
                    CellInfoRectangle.setVisible(false);
                    CellInfoTextField.setVisible(false);
                    PledgeButton.setVisible(false);
                    rootPane.getChildren().removeAll(rectangle, button, txt1);
                    player.TakeMoneyFromPlayer(money);
                    property_cell.owner.AddMoneyToPlayer(money);
                    LOGGER.info(player.name + " paid " + money + "$ rent to " + property_cell.owner.name);
                    textConsole.appendText(player.name + " paid " + money + "$ rent to " + property_cell.owner.name + "\n");
                    MoneyTextFields[player.number].setText(Integer.toString(player.getMoney())+"$");
                    MoneyTextFields[property_cell.owner.number].setText(Integer.toString(property_cell.owner.getMoney())+"$");
                    MakingNextStep(game, player);
                } else {
                    if (player.ComparePlayersPossessions(money)) {
                        textConsole.appendText("You don't have money, but you can pledge your property and pay\n");
                    } else {
                        rootPane.getChildren().removeAll(rectangle, button, txt1);
                        player.TakeMoneyFromPlayer(money);
                        CellInfoRectangle.setVisible(false);
                        CellInfoTextField.setVisible(false);
                        PledgeButton.setVisible(false);
                        PlayerHasLost(game, player);
                        moveToNextPlayer(game);
                    }
                }
            });
        }
    }
    /**
     * Handles the user interface interactions for a player to pay a specified amount.
     *
     * @param game   The instance of the game.
     * @param player The player paying the amount.
     * @param text   The text to display prompting the payment.
     * @param price  The amount of money to be paid.
     */
    public void UIPaySmth(Game game, Player player, String text, int price)
    {
        if (player.isBot)
        {
            if (player.PlayerHasEnoughMoney(price))
            {
                player.TakeMoneyFromPlayer(price);
                LOGGER.info(player.name + " paid "+price+"$ to the Bank");
                textConsole.appendText(player.name + " paid "+price+"$ to the Bank\n");
                MoneyTextFields[player.number].setText(Integer.toString(player.getMoney())+"$");
                MakingNextStep(game, player);
            } else if (player.ComparePlayersPossessions(price)) {
                BotPledgeProperty(game,player);
                UIPaySmth(game,player,text,price);
            }
            else
            {
                PlayerHasLost(game, player);
                moveToNextPlayer(game);
            }
        }
        else
        {
            ShowCellInfo=true;
            Rectangle rectangle = createRectangle(444,168,481,100,Color.DARKGRAY);
            Button button = createButton("PAY", "green", 455, 210,460,24);
            button.setTextFill(Color.WHITE);
            Text txt1 = createText(text,450,200,"bold",22);
            button.setTextFill(Color.WHITE);
            button.setFont(Font.font(24));
            Pane root = new Pane();
            root.getChildren().addAll(rectangle, button,txt1);
            Pane rootPane = (Pane) btnStart.getScene().getRoot();
            rootPane.getChildren().addAll(rectangle, button, txt1);
            CellInfoRectangle.toFront();
            CellInfoTextField.toFront();
            PledgeButton.toFront();
            button.setOnAction(event -> {
                if (player.PlayerHasEnoughMoney(price)) {
                    rootPane.getChildren().removeAll(rectangle, button, txt1);
                    player.TakeMoneyFromPlayer(price);
                    LOGGER.info(player.name + " paid "+price+"$ to the Bank");
                    textConsole.appendText(player.name + " paid "+price+"$ to the Bank\n");
                    MoneyTextFields[player.number].setText(Integer.toString(player.getMoney())+"$");
                    //ShowCellInfo=false;
                    CellInfoRectangle.setVisible(false);
                    CellInfoTextField.setVisible(false);
                    PledgeButton.setVisible(false);
                    MakingNextStep(game, player);
                } else {
                    if (player.ComparePlayersPossessions(price)) {
                        textConsole.appendText("You don't have money, but you can pledge your property and pay\n");
                    } else {
                        rootPane.getChildren().removeAll(rectangle, button, txt1);
                        player.TakeMoneyFromPlayer(price);
                        CellInfoRectangle.setVisible(false);
                        CellInfoTextField.setVisible(false);
                        PledgeButton.setVisible(false);
                        PlayerHasLost(game, player);
                        MakingNextStep(game, player);
                    }
                }
            });
        }
    }
    /**
     * Handles the scenario when a player has lost.
     * Updates the game state and UI accordingly.
     *
     * @param game   The current game instance
     * @param player The player who has lost
     */
    public void PlayerHasLost(Game game, Player player)
    {
        LOGGER.info(player.name + " didn't have enough money to pay and lost!");
        textConsole.appendText(player.name + " didn't have enough money to pay and lost!\n");
        game.count_of_active_players--;
        player.active = false;
        PlayerCircles.get(player.number).setVisible(false);
        MoneyTextFields[player.number].setText("looser");
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < game.game_board.game_board.length; i++) {
            for (int j = 0; j < player.property.size(); j++) {
                if (Objects.equals(game.game_board.game_board[i].name_of_cell, player.property.get(j).name_of_cell)) {
                    nums.add(i);
                    if (game.game_board.game_board[i] instanceof Avenue && ((Avenue)game.game_board.game_board[i]).level_of_property>0)
                    {
                        for (int k = 0; k < ((Avenue)game.game_board.game_board[i]).houses.length; k++) {
                            ((Avenue)game.game_board.game_board[i]).houses[k].setVisible(false);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < nums.size(); i++) {
            CellsRectanles[nums.get(i)].setFill(Color.WHITE);
            ((PropertyCell)game.game_board.game_board[nums.get(i)]).owner=null;
            if(((PropertyCell)game.game_board.game_board[nums.get(i)])instanceof Avenue)
            {
                ((Avenue)game.game_board.game_board[nums.get(i)]).level_of_property=0;
            }
            ((PropertyCell)game.game_board.game_board[nums.get(i)]).isPledged=false;
            priceOfCellsText[nums.get(i)].setText(((PropertyCell)game.game_board.game_board[nums.get(i)]).price_of_buying+"$");
        }
    }

    /**
     * Updates the levels and prices of community and station cells based on the ownership and pledging status.
     *
     * @param game   The current game instance
     * @param player The player whose properties are being updated
     */
    public void UpdateCommunityAndStationCells(Game game, Player player)
    {
        if (((PropertyCell) game.game_board.game_board[12]).owner!=null&&((PropertyCell) game.game_board.game_board[12]).owner == ((PropertyCell) game.game_board.game_board[28]).owner)
        {
            ((PropertyCell) game.game_board.game_board[12]).level_of_property=1;
            ((PropertyCell) game.game_board.game_board[28]).level_of_property=1;
            priceOfCellsText[12].setText("10x");
            priceOfCellsText[28].setText("10x");
            if (((PropertyCell) game.game_board.game_board[12]).isPledged)
            {
                if(!((PropertyCell) game.game_board.game_board[28]).isPledged)
                    priceOfCellsText[28].setText("4x");
                ((PropertyCell) game.game_board.game_board[12]).level_of_property=0;
                ((PropertyCell) game.game_board.game_board[28]).level_of_property=0;
                priceOfCellsText[12].setText("0$");
            }
            if(((PropertyCell) game.game_board.game_board[28]).isPledged)
            {
                if(!((PropertyCell) game.game_board.game_board[12]).isPledged)
                    priceOfCellsText[12].setText("4x");
                ((PropertyCell) game.game_board.game_board[12]).level_of_property=0;
                ((PropertyCell) game.game_board.game_board[28]).level_of_property=0;
                priceOfCellsText[28].setText("0$");
            }
        }
        Station[] sts = new Station[]{(Station) game.game_board.game_board[5],(Station) game.game_board.game_board[15],(Station) game.game_board.game_board[25],(Station) game.game_board.game_board[35]};
        int count = -1;
        for (int i = 0; i < sts.length; i++) {
            if(sts[i].owner==player&&!sts[i].isPledged)
                count++;
        }
        if (((Station) game.game_board.game_board[5]).owner==player)
        {
            if (!((Station) game.game_board.game_board[5]).isPledged)
            {
                ((Station) game.game_board.game_board[5]).level_of_property=count;
                priceOfCellsText[5].setText(((PropertyCell) game.game_board.game_board[5]).price_of_rent[((Station) game.game_board.game_board[5]).level_of_property]+"$");
            }
            else
            {
                priceOfCellsText[5].setText("0$");

            }
        }
        if (((Station) game.game_board.game_board[15]).owner==player)
        {
            if (!((Station) game.game_board.game_board[15]).isPledged)
            {
                ((Station) game.game_board.game_board[15]).level_of_property=count;
                priceOfCellsText[15].setText(((PropertyCell) game.game_board.game_board[15]).price_of_rent[((Station) game.game_board.game_board[15]).level_of_property]+"$");
            }
            else
            {
                priceOfCellsText[15].setText("0$");

            }
        }
        if (((Station) game.game_board.game_board[25]).owner==player) {
            if (!((Station) game.game_board.game_board[25]).isPledged)
            {
                ((Station) game.game_board.game_board[25]).level_of_property=count;
                priceOfCellsText[25].setText(((PropertyCell) game.game_board.game_board[25]).price_of_rent[((Station) game.game_board.game_board[25]).level_of_property]+"$");
            }
            else
            {
                priceOfCellsText[25].setText("0$");

            }
        }
        if (((Station) game.game_board.game_board[35]).owner==player)
        {
            if (!((Station) game.game_board.game_board[35]).isPledged)
            {
                ((Station) game.game_board.game_board[35]).level_of_property=count;
                priceOfCellsText[35].setText(((PropertyCell) game.game_board.game_board[35]).price_of_rent[((Station) game.game_board.game_board[35]).level_of_property]+"$");
            }
            else
            {
                priceOfCellsText[35].setText("0$");

            }
        }
    }
    /**
     * Checks if the level of the cell can be upgraded based on the levels of neighbour cells.
     *
     * @param game   The current game instance
     * @param player The player attempting to upgrade the cell
     * @param pr     The property cell to be upgraded
     * @return true if the cell can be upgraded, false otherwise
     */
    public boolean CanUpgradeLevelOfCell(Game game, Player player, PropertyCell pr)
    {
        for (int i = 0; i < game.game_board.game_board.length; i++) {
            if(game.game_board.game_board[i] instanceof Avenue && ((Avenue)game.game_board.game_board[i]).number_of_street==pr.number_of_street)
            {
                if (pr.level_of_property-((PropertyCell) game.game_board.game_board[i]).level_of_property>=1)
                    return false;
            }
        }
        return true;
    }
    /**
     * Builds a house on the specified property cell and updates the UI accordingly.
     *
     * @param game The current game instance
     * @param pos The number of property cell on the gameboard
     */
    public void BuildHouse(Game game, int pos)
    {
        Scene scene = btnStart.getScene();
        AnchorPane rootPane = (AnchorPane) scene.getRoot();
        for (int i = 0; i < game.game_board.game_board.length; i++) {
            if (game.game_board.game_board[i] instanceof Avenue) {
                for (Node node : ((Avenue) game.game_board.game_board[i]).houses) {
                    if (!addedHouses.contains(node)) {
                        rootPane.getChildren().add(node);
                        addedHouses.add(node);
                    }
                }
            }
        }
        for (int l = 0; l < ((Avenue)game.game_board.game_board[pos]).level_of_property; l++) {
            ((Avenue)game.game_board.game_board[pos]).houses[l].setVisible(true);
            ((Avenue)game.game_board.game_board[pos]).houses[l].toFront();
            if(pos>=1&&pos<10)
            {
                ((Avenue)game.game_board.game_board[pos]).houses[l].setLayoutX(priceOfCellsText[pos].getLayoutX()-11+11*(l+1));
                ((Avenue)game.game_board.game_board[pos]).houses[l].setLayoutY(priceOfCellsText[pos].getLayoutY()+8);
            } else if (pos>=11&&pos<20) {
                ((Avenue)game.game_board.game_board[pos]).houses[l].setLayoutX(priceOfCellsText[pos].getLayoutX()+2);
                ((Avenue)game.game_board.game_board[pos]).houses[l].setLayoutY(priceOfCellsText[pos].getLayoutY()-43+11*(l+1));
            } else if (pos>=21&&pos<30) {
                ((Avenue)game.game_board.game_board[pos]).houses[l].setLayoutX(priceOfCellsText[pos].getLayoutX()-11+11*(l+1));
                ((Avenue)game.game_board.game_board[pos]).houses[l].setLayoutY(priceOfCellsText[pos].getLayoutY()-29);
            } else
            {
                ((Avenue)game.game_board.game_board[pos]).houses[l].setLayoutX(priceOfCellsText[pos].getLayoutX()+40);
                ((Avenue)game.game_board.game_board[pos]).houses[l].setLayoutY(priceOfCellsText[pos].getLayoutY()-43+11*(l+1));
            }
        }
    }
    /**
     * Demolishes a house on the property cell and updates the UI accordingly.
     *
     * @param game The current game instance
     * @param pos The number of property cell on the gameboard
     */
    public void DemolishHouse(Game game,int pos )
    {
        ((Avenue)game.game_board.game_board[pos]).level_of_property--;
        ((Avenue)game.game_board.game_board[pos]).houses[((Avenue)game.game_board.game_board[pos]).level_of_property].setVisible(false);
        priceOfCellsText[pos].setText(((Avenue)game.game_board.game_board[pos]).price_of_rent[((Avenue)game.game_board.game_board[pos]).level_of_property]+"$");
        LOGGER.info(game.players.get(currentPlayerIndex).name+" sold his hotel and got "+(int)(((Avenue) game.game_board.game_board[pos]).price_of_building)+"$");
        textConsole.appendText(game.players.get(currentPlayerIndex).name+" sold his hotel and got "+(int)(((Avenue) game.game_board.game_board[pos]).price_of_building)+"$\n");
        game.players.get(currentPlayerIndex).AddMoneyToPlayer((int)(((Avenue) game.game_board.game_board[pos]).price_of_building));
        MoneyTextFields[currentPlayerIndex].setText(game.players.get(currentPlayerIndex).getMoney()+"$");
    }
    /**
     * Shows the deal window UI components.
     */
    public void ShowDealWindow()
    {
        DealRectangle.setVisible(true);
        DealHeader.setVisible(true);
        DealTxtArea1.setVisible(true);
        DealTxtArea2.setVisible(true);
        DealMoneytxt1.setVisible(true);
        DealMoneytxt2.setVisible(true);
        DealTxtArea1.setText("You give:\n");
        DealTxtArea2.setText("You receive:\n");
        DealMoneyFill1.setVisible(true);
        DealMoneyFill1.setEditable(true);
        DealMoneyFill2.setVisible(true);
        DealMoneyFill2.setEditable(true);
        DealSendButton.setText("Send deal");
        DealSendButton.setVisible(true);
        DealCloseButton.setText("Close deal");
        DealCloseButton.setVisible(true);
        DealRectangle.toFront();
        DealHeader.toFront();
        DealTxtArea1.toFront();
        DealTxtArea2.toFront();
        DealMoneytxt1.toFront();
        DealMoneytxt2.toFront();
        DealMoneyFill1.toFront();
        DealMoneyFill2.toFront();
        DealSendButton.toFront();
        DealCloseButton.toFront();
    }
    /**
     * Hides the deal window UI components.
     */
    public void CloseDealWindow()
    {
        DealRectangle.setVisible(false);
        DealHeader.setVisible(false);
        DealTxtArea1.setText("");
        DealTxtArea2.setText("");
        DealTxtArea1.setVisible(false);
        DealTxtArea2.setVisible(false);
        DealMoneytxt1.setVisible(false);
        DealMoneytxt2.setVisible(false);
        DealMoneyFill1.setVisible(false);
        DealMoneyFill1.setText("");
        DealMoneyFill2.setText("");
        DealMoneyFill2.setVisible(false);
        DealSendButton.setVisible(false);
        DealCloseButton.setVisible(false);
    }
    /**Changes the deal window elements and shows it to second person in this deal*/
    public void ShowDealToSecondPlayer()
    {
        DealRectangle.setVisible(true);
        DealHeader.setVisible(true);
        DealTxtArea1.setVisible(true);
        DealTxtArea2.setVisible(true);
        DealMoneytxt1.setVisible(true);
        DealMoneytxt2.setVisible(true);
        DealMoneyFill1.setVisible(true);
        DealMoneyFill1.setEditable(false);
        DealMoneyFill2.setVisible(true);
        DealMoneyFill2.setEditable(false);
        DealSendButton.setText("Accept");
        DealSendButton.setVisible(true);
        DealCloseButton.setText("Reject");
        DealCloseButton.setVisible(true);
        DealTxtArea1.setText("You receive:\n");
        for (int i = 0; i < deal.property1.size(); i++) {
            DealTxtArea1.appendText(deal.property1.get(i).name_of_cell+"\n");
        }
        DealTxtArea2.setText("You give:\n");
        for (int i = 0; i < deal.property2.size(); i++) {
            DealTxtArea2.appendText(deal.property2.get(i).name_of_cell+"\n");
        }
        DealMoneyFill1.setText(String.valueOf(deal.money1));
        DealMoneyFill2.setText(String.valueOf(deal.money2));
        DealRectangle.toFront();
        DealHeader.toFront();
        DealTxtArea1.toFront();
        DealTxtArea2.toFront();
        DealMoneytxt1.toFront();
        DealMoneytxt2.toFront();
        DealMoneyFill1.toFront();
        DealMoneyFill2.toFront();
        DealSendButton.toFront();
        DealCloseButton.toFront();
    }
    /**
     * Handles the actions to be taken when a player accepts a deal.
     * Updates player balances, transfers properties, and updates the UI accordingly.
     *
     * @param game The current game instance
     */
    public void PlayerAcceptedDeal(Game game)
    {
        CloseDealWindow();
        LOGGER.info(deal.player2.name+" accepted deal");
        textConsole.appendText(deal.player2.name+" accepted deal\n");
        game.players.get(game.players.indexOf(deal.player1)).AddMoneyToPlayer(deal.money2);
        game.players.get(game.players.indexOf(deal.player2)).AddMoneyToPlayer(deal.money1);
        game.players.get(game.players.indexOf(deal.player1)).TakeMoneyFromPlayer(deal.money1);
        game.players.get(game.players.indexOf(deal.player2)).TakeMoneyFromPlayer(deal.money2);
        MoneyTextFields[game.players.indexOf(deal.player1)].setText(Integer.toString(game.players.get(game.players.indexOf(deal.player1)).getMoney())+"$");
        MoneyTextFields[game.players.indexOf(deal.player2)].setText(Integer.toString(game.players.get(game.players.indexOf(deal.player2)).getMoney())+"$");
        for (int i = 0; i < deal.property1.size(); i++) {
            game.players.get(game.players.indexOf(deal.player2)).AddProperty(deal.property1.get(i));
            game.players.get(game.players.indexOf(deal.player1)).RemoveProperty(deal.property1.get(i));
            for (int j = 0; j < game.game_board.game_board.length; j++) {
                if (game.game_board.game_board[j] instanceof PropertyCell&& Objects.equals(game.game_board.game_board[j].name_of_cell, deal.property1.get(i).name_of_cell))
                {
                    ((PropertyCell) game.game_board.game_board[j]).owner =  game.players.get(game.players.indexOf(deal.player2));
                    CellsRectanles[j].setFill(colors[game.players.get(game.players.indexOf(deal.player2)).number]);
                }
            }
        }
        for (int i = 0; i < deal.property2.size(); i++) {
            game.players.get(game.players.indexOf(deal.player1)).AddProperty(deal.property2.get(i));
            game.players.get(game.players.indexOf(deal.player2)).RemoveProperty(deal.property2.get(i));
            for (int j = 0; j < game.game_board.game_board.length; j++) {
                if (game.game_board.game_board[j] instanceof PropertyCell&& Objects.equals(game.game_board.game_board[j].name_of_cell, deal.property2.get(i).name_of_cell))
                {
                    ((PropertyCell) game.game_board.game_board[j]).owner =  game.players.get(game.players.indexOf(deal.player1));
                    CellsRectanles[j].setFill(colors[game.players.get(game.players.indexOf(deal.player1)).number]);
                }
            }
        }
        UpdateCommunityAndStationCells(game,game.players.get(game.players.indexOf(deal.player1)));
        UpdateCommunityAndStationCells(game,game.players.get(game.players.indexOf(deal.player2)));
    }

    /**
     * Implements logic when bot doesn't have enough money to pay and starts pledging his property.
     * If no properties are available to pledge, no action is taken.
     *
     * @param game The current game instance
     * @param player The bot player
     */
    public void BotPledgeProperty(Game game, Player player)
    {
        for (int i = 0; i < game.game_board.game_board.length; i++) {
            if(game.game_board.game_board[i] instanceof PropertyCell&&((PropertyCell)game.game_board.game_board[i]).owner==player&&!((PropertyCell)game.game_board.game_board[i]).isPledged)
            {
                int num = -1;
                for (int j = 0; j < player.property.size(); j++) {
                    if(Objects.equals(player.property.get(j).name_of_cell, game.game_board.game_board[i].name_of_cell))
                        num = j;
                }
                if (game.game_board.game_board[i] instanceof Avenue&&((Avenue)game.game_board.game_board[i]).level_of_property>0)
                {
                    DemolishHouse(game,i);
                }
                else
                {
                    player.property.get(num).isPledged = true;
                    CellsRectanles[i].setFill(Color.LIGHTGRAY);
                    priceOfCellsText[i].setText(("0$"));
                    ((PropertyCell)game.game_board.game_board[i]).isPledged=true;
                    LOGGER.info(game.players.get(currentPlayerIndex).name+" pledged "+game.game_board.game_board[i].name_of_cell+" and got "+(int)(((PropertyCell) game.game_board.game_board[i]).price_of_buying*0.5)+"$");
                    textConsole.appendText(game.players.get(currentPlayerIndex).name+" pledged "+game.game_board.game_board[i].name_of_cell+" and got "+(int)(((PropertyCell) game.game_board.game_board[i]).price_of_buying*0.5)+"$\n");
                    player.AddMoneyToPlayer((int)(((PropertyCell) game.game_board.game_board[i]).price_of_buying*0.5));
                    MoneyTextFields[currentPlayerIndex].setText(game.players.get(currentPlayerIndex).getMoney()+"$");
                    UpdateCommunityAndStationCells(game,game.players.get(currentPlayerIndex));
                }
                break;
            }
        }
    }
    /**
     * Implements logic when bot has got some money and starts buying out his pledged property.
     * If no pledged properties are available, no action is taken.
     *
     * @param game The current game instance
     * @param player The bot player
     */
    public void BotBuyoutProperty(Game game, Player player)
    {
        for (int i = 0; i < game.game_board.game_board.length; i++) {
            if(game.game_board.game_board[i] instanceof PropertyCell&&((PropertyCell)game.game_board.game_board[i]).owner==player&&((PropertyCell)game.game_board.game_board[i]).isPledged&&player.PlayerHasEnoughMoney((int) (((PropertyCell) game.game_board.game_board[i]).price_of_buying*0.6)))
            {
                    CellsRectanles[i].setFill(colors[player.number]);
                    priceOfCellsText[i].setText(((PropertyCell)game.game_board.game_board[i]).price_of_rent[((PropertyCell)game.game_board.game_board[i]).level_of_property]+"$");
                    ((PropertyCell)game.game_board.game_board[i]).isPledged=false;
                    LOGGER.info(player.name+" bought out "+game.game_board.game_board[i].name_of_cell);
                    textConsole.appendText(player.name+" bought out "+game.game_board.game_board[i].name_of_cell+" \n");
                    player.TakeMoneyFromPlayer((int) (((PropertyCell)game.game_board.game_board[i]).price_of_buying*0.6));
                    MoneyTextFields[currentPlayerIndex].setText(game.players.get(currentPlayerIndex).getMoney()+"$");
            }
        }
    }
    /**
     * Initiates the process of upgrading a property by a bot player.
     * If the bot player has enough money and the property can be upgraded, it upgrades the property by building a house.
     *
     * @param game The current game instance.
     */
    public void BotUpgradeCell(Game game)
    {
        for (int i = 0; i < game.game_board.game_board.length; i++) {
            if(game.game_board.game_board[i] instanceof Avenue&&game.players.get(currentPlayerIndex).PlayerHasEnoughMoney(((Avenue)game.game_board.game_board[i]).price_of_building)&&((Avenue)game.game_board.game_board[i]).level_of_property<=4) {
                if (!IsCellUpdated&&game.players.get(currentPlayerIndex).player_streets.contains(((Avenue) game.game_board.game_board[i]).number_of_street)) {
                    if (CanUpgradeLevelOfCell(game, game.players.get(currentPlayerIndex), (((PropertyCell) game.game_board.game_board[i])))) {
                        int num = -1;
                        for (int j = 0; j < game.players.get(currentPlayerIndex).property.size(); j++) {
                            if (Objects.equals(game.game_board.game_board[i].name_of_cell, game.players.get(currentPlayerIndex).property.get(j).name_of_cell))
                                num = j;
                        }
                        ((Avenue)game.game_board.game_board[i]).level_of_property++;
                        BuildHouse(game,i);
                        game.players.get(currentPlayerIndex).property.get(num).level_of_property= ((Avenue)game.game_board.game_board[i]).level_of_property;
                        IsCellUpdated = true;
                        priceOfCellsText[i].setText(((PropertyCell) game.game_board.game_board[i]).price_of_rent[((PropertyCell) game.game_board.game_board[i]).level_of_property] + "$");
                        game.players.get(currentPlayerIndex).TakeMoneyFromPlayer(((Avenue) game.game_board.game_board[i]).price_of_building);
                        MoneyTextFields[currentPlayerIndex].setText(game.players.get(currentPlayerIndex).getMoney() + "$");
                        LOGGER.info(game.players.get(currentPlayerIndex).name + " spent " + ((Avenue) game.game_board.game_board[i]).price_of_building + "$ and upgraded " + game.game_board.game_board[i].name_of_cell);
                        textConsole.appendText(game.players.get(currentPlayerIndex).name + " spent " + ((Avenue) game.game_board.game_board[i]).price_of_building + "$ and upgraded " + game.game_board.game_board[i].name_of_cell + "\n");
                    }
                }
            }
        }
    }
    /**
     * Saves the current state of the game to a JSON file.
     * Allows the user to specify the file name and location.
     *
     * @param game The current game instance to be saved.
     */
    private void SaveGame(Game game) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Save game info");
        dialog.setHeaderText(null);
        dialog.setContentText("Input name of file in which you want to save game:");
        String fileName = dialog.showAndWait().orElse(null);
        PlayersInfoToSave pls = new PlayersInfoToSave(game.players);
        ObjectMapper objectMapper = new ObjectMapper();
        if (fileName != null && !fileName.trim().isEmpty()) {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save game");
            fileChooser.setInitialFileName(fileName + ".json");
            File file = fileChooser.showSaveDialog(null);
            if (file != null) {
                try {
                    objectMapper.writeValue(file, pls);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private Rectangle createRectangle(double x, double y, double width, double height, Color color) {
        Rectangle rectangle = new Rectangle();
        rectangle.setX(x);
        rectangle.setY(y);
        rectangle.setWidth(width);
        rectangle.setHeight(height);
        rectangle.setFill(color);
        return rectangle;
    }
    private Button createButton(String text, String color, double layoutX, double layoutY, double width, double fontSize) {
        Button button = new Button(text);
        button.setStyle("-fx-background-color: " + color + ";");
        button.setCursor(Cursor.HAND);
        button.setPrefWidth(width);
        button.setLayoutX(layoutX);
        button.setLayoutY(layoutY);
        button.setTextFill(Color.WHITE);
        button.setFont(Font.font(fontSize));
        return button;
    }
    private Text createText(String content, double layoutX, double layoutY, String fontWeight, double fontSize) {
        Text text = new Text();
        text.setText(content);
        text.setFont(Font.font(fontWeight, fontSize));
        text.setLayoutX(layoutX);
        text.setLayoutY(layoutY);
        return text;
    }
}