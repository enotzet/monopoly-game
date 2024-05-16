import com.fasterxml.jackson.databind.annotation.JsonAppend;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semestralka.semestralka.controller.GameController;
import semestralka.semestralka.model.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class TestGameController {
    public GameController gameController;
    @BeforeAll
    public static void initJFX() throws InterruptedException {
        System.out.println("Starting JavaFX...");
        Thread t = new Thread("JavaFX Init Thread") {
            public void run() {
                Application.launch(JavaFXTestDummy.class);
            }
        };
        t.setDaemon(true);
        t.start();
        Thread.sleep(3000);
        System.out.println("JavaFX started.");
    }
    @BeforeEach
    public void ConfigureGameController()
    {
        ArrayList<Circle> PlayerCircles = new ArrayList<>();
        PlayerCircles.add(mock(Circle.class));
        PlayerCircles.add(mock(Circle.class));
        PlayerCircles.add(mock(Circle.class));
        PlayerCircles.add(mock(Circle.class));
        gameController = new GameController();
        gameController.priceOfCellsText = new Text[]{new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text(),new Text()};
        gameController.textConsole = new TextArea();
        gameController.MoneyTextFields = new TextField[]{new TextField(),new TextField()};
        gameController.PlayerCircles=PlayerCircles;
        gameController.btnStart = mock(Button.class);
        Scene sc = mock(Scene.class);
        Pane pane = mock(Pane.class);
        when(gameController.btnStart.getScene()).thenReturn(sc);
        when(gameController.btnStart.getScene().getRoot()).thenReturn(pane);
        when(pane.getChildren()).thenReturn(FXCollections.observableArrayList(PlayerCircles));
        gameController.CellInfoRectangle = mock(Rectangle.class);
        gameController.CellInfoTextField = mock(TextArea.class);
        gameController.UpgradeButton = mock(Button.class);
        gameController.PledgeButton = mock(Button.class);
        gameController.CellsRectanles = new Rectangle[]{new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle()};
    }
    @Test
    public void demolishHouseTest() {
        Game gameMock = mock(Game.class);
        Avenue avenueMock = mock(Avenue.class);
        gameMock.game_board = new GameBoard();
        avenueMock.level_of_property = 1;
        avenueMock.price_of_rent = new int[]{1,2,3,4,5};
        Rectangle mockRect = mock(Rectangle.class);
        avenueMock.houses = new Rectangle[]{mockRect};
        gameMock.game_board.game_board[0] = avenueMock;
        Player playerMock = mock(Player.class);
        playerMock.name = "Player1";
        gameMock.players = new ArrayList<>();
        gameMock.players.add(playerMock);
        System.out.println(((Avenue)gameMock.game_board.game_board[0]).houses[0]);
        gameController.DemolishHouse(gameMock, 0);
        assertEquals(0, avenueMock.level_of_property);
        verify(playerMock).AddMoneyToPlayer(avenueMock.getPrice_of_building());
        assertEquals("Player1 sold his hotel and got 0$\n",gameController.textConsole.getText());
        assertFalse(((Avenue) gameMock.game_board.game_board[0]).houses[0].isVisible());
    }
    @Test
    public void ShowDealWindowTest() {
        Rectangle dealRectangleMock = mock(Rectangle.class);
        Text dealHeaderMock = mock(Text.class);
        TextArea dealTxtArea1Mock = mock(TextArea.class);
        TextArea dealTxtArea2Mock = mock(TextArea.class);
        Text DealMoneytxt1 = mock(Text.class);
        Text DealMoneytxt2 = mock(Text.class);
        TextField DealMoneyFill1 = mock(TextField.class);
        TextField DealMoneyFill2 = mock(TextField.class);
        Button DealSendButton = mock(Button.class);
        Button DealCloseButton = mock(Button.class);
        gameController.DealRectangle = dealRectangleMock;
        gameController.DealHeader = dealHeaderMock;
        gameController.DealTxtArea1 = dealTxtArea1Mock;
        gameController.DealTxtArea2 = dealTxtArea2Mock;
        gameController.DealMoneytxt1 = DealMoneytxt1;
        gameController.DealMoneytxt2 = DealMoneytxt2;
        gameController.DealMoneyFill1 = DealMoneyFill1;
        gameController.DealMoneyFill2 = DealMoneyFill2;
        gameController.DealSendButton = DealSendButton;
        gameController.DealCloseButton = DealCloseButton;
        gameController.ShowDealWindow();
        verify(dealRectangleMock).setVisible(true);
        verify(dealHeaderMock).setVisible(true);
        verify(dealTxtArea1Mock).setVisible(true);
        verify(dealTxtArea2Mock).setVisible(true);
        verify(DealMoneytxt1).setVisible(true);
        verify(DealMoneytxt2).setVisible(true);
        verify(DealMoneyFill1).setVisible(true);
        verify(DealMoneyFill2).setVisible(true);
        verify(DealSendButton).setVisible(true);
        verify(DealCloseButton).setVisible(true);
        verify(DealSendButton).setText("Send deal");
        verify(DealCloseButton).setText("Close deal");
    }
    @Test
    public void CloseDealWindowTest()
    {
        Rectangle dealRectangleMock = mock(Rectangle.class);
        Text dealHeaderMock = mock(Text.class);
        TextArea dealTxtArea1Mock = mock(TextArea.class);
        TextArea dealTxtArea2Mock = mock(TextArea.class);
        Text DealMoneytxt1 = mock(Text.class);
        Text DealMoneytxt2 = mock(Text.class);
        TextField DealMoneyFill1 = mock(TextField.class);
        TextField DealMoneyFill2 = mock(TextField.class);
        Button DealSendButton = mock(Button.class);
        Button DealCloseButton = mock(Button.class);
        gameController.DealRectangle = dealRectangleMock;
        gameController.DealHeader = dealHeaderMock;
        gameController.DealTxtArea1 = dealTxtArea1Mock;
        gameController.DealTxtArea2 = dealTxtArea2Mock;
        gameController.DealMoneytxt1 = DealMoneytxt1;
        gameController.DealMoneytxt2 = DealMoneytxt2;
        gameController.DealMoneyFill1 = DealMoneyFill1;
        gameController.DealMoneyFill2 = DealMoneyFill2;
        gameController.DealSendButton = DealSendButton;
        gameController.DealCloseButton = DealCloseButton;
        gameController.CloseDealWindow();
        verify(dealRectangleMock).setVisible(false);
        verify(dealHeaderMock).setVisible(false);
        verify(dealTxtArea1Mock).setVisible(false);
        verify(dealTxtArea2Mock).setVisible(false);
        verify(DealMoneytxt1).setVisible(false);
        verify(DealMoneytxt2).setVisible(false);
        verify(DealMoneyFill1).setVisible(false);
        verify(DealMoneyFill2).setVisible(false);
        verify(DealSendButton).setVisible(false);
        verify(DealCloseButton).setVisible(false);
        verify(dealTxtArea1Mock).setText("");
        verify(dealTxtArea2Mock).setText("");
    }
    @Test
    public void PlayerHasLostTest()
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("Player1");
        Game game = new Game(1,names);
        gameController.PlayerHasLost(game,game.players.get(0));
        assertFalse(game.players.get(0).isActive());
        assertEquals(3,game.count_of_active_players);
        assertEquals("Player1 didn't have enough money to pay and lost!\n", gameController.textConsole.getText());
        verify(gameController.PlayerCircles.get(0)).setVisible(false);
    }
    @Test
    public void BotSellingHousesTest()
    {
        Game game = mock(Game.class);
        game.game_board = new GameBoard();
        Player player = mock(Player.class);
        player.name = "Player1";
        player.property = new ArrayList<PropertyCell>();
        game.players = new ArrayList<>();
        game.players.add(player);
        Avenue avenue = mock(Avenue.class);
        avenue.level_of_property = 1;
        avenue.owner = player;
        avenue.price_of_rent= new int[]{1,2,3,4};
        Rectangle mockRect = mock(Rectangle.class);
        avenue.houses = new Rectangle[]{mockRect};
        game.game_board.game_board[0] = avenue;
        gameController.BotPledgeProperty(game,game.players.get(0));
        assertEquals(0,avenue.level_of_property);
        assertFalse(avenue.houses[0].isVisible());
    }
    @Test
    public void TestGameCircleAndCrossingStart()
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("Player1");
        Dices dice = mock(Dices.class);
        dice.dice1 = dice.dice2 = 5;
        Game game = new Game(1,names);
        game.dices = dice;
        gameController.MakeMove(game.players.get(0),game);
        assertEquals(10, game.players.get(0).current_position);
        gameController.MakeMove(game.players.get(1),game);
        gameController.MakeMove(game.players.get(0),game);
        gameController.MakeMove(game.players.get(1),game);
        gameController.MakeMove(game.players.get(0),game);
        gameController.MakeMove(game.players.get(1),game);
        gameController.MakeMove(game.players.get(0),game);
        gameController.MakeMove(game.players.get(1),game);
        gameController.MakeMove(game.players.get(0),game);
        assertEquals(10, game.players.get(0).current_position);
        assertEquals(0, game.players.get(1).current_position);
        assertEquals(1700,game.players.get(0).getMoney());
        assertEquals(1700,game.players.get(1).getMoney());
    }
    @Test
    public void TestingBotUpgradingCells()
    {
        ArrayList<Circle> PlayerCircles = new ArrayList<>();
        PlayerCircles.add(mock(Circle.class));
        AnchorPane anchorPane = mock(AnchorPane.class);
        when(anchorPane.getChildren()).thenReturn(FXCollections.observableArrayList(PlayerCircles));
        when(gameController.btnStart.getScene().getRoot()).thenReturn(anchorPane);
        ArrayList<String> names = new ArrayList<>();
        names.add("Player1");
        Game game = new Game(1,names);
        gameController.BuyProperty(game,game.players.get(1), (PropertyCell) game.game_board.game_board[1]);
        gameController.BuyProperty(game,game.players.get(1), (PropertyCell) game.game_board.game_board[3]);
        assertEquals(1,game.players.get(1).player_streets.get(0));//testing if street was added to player's streets list
        gameController.currentPlayerIndex = 1;
        gameController.updateUIForCurrentPlayer(game);
        assertEquals(1,((PropertyCell) game.game_board.game_board[1]).level_of_property);//asserting that only one cell is updated during 1 step
        assertEquals(0,((PropertyCell) game.game_board.game_board[3]).level_of_property);
        assertEquals(1330,game.players.get(1).getMoney());//asserting that bot spent money to upgrade cell
        gameController.updateUIForCurrentPlayer(game);
        assertEquals(1,((PropertyCell) game.game_board.game_board[1]).level_of_property);
        assertEquals(1,((PropertyCell) game.game_board.game_board[3]).level_of_property);//asserting that cells are updated 1 by 1 and only one cell is updated during step
        game.players.get(1).TakeMoneyFromPlayer(1280);
        gameController.updateUIForCurrentPlayer(game);
        assertEquals(1,((PropertyCell) game.game_board.game_board[1]).level_of_property);
        assertEquals(1,((PropertyCell) game.game_board.game_board[3]).level_of_property);//asserting that cells aren't updated if bot has no money to update
        game.players.get(1).AddMoneyToPlayer(1000);
        ((PropertyCell) game.game_board.game_board[1]).level_of_property = 4;
        gameController.updateUIForCurrentPlayer(game);
        assertEquals(4,((PropertyCell) game.game_board.game_board[1]).level_of_property);
        assertEquals(2,((PropertyCell) game.game_board.game_board[3]).level_of_property);
        gameController.updateUIForCurrentPlayer(game);
        assertEquals(4,((PropertyCell) game.game_board.game_board[1]).level_of_property);
        assertEquals(3,((PropertyCell) game.game_board.game_board[3]).level_of_property);//asserting that cell can't be updated when there is difference in level between level of another cell on the street
        ((PropertyCell) game.game_board.game_board[1]).level_of_property = 5;
        ((PropertyCell) game.game_board.game_board[3]).level_of_property = 5;
        gameController.updateUIForCurrentPlayer(game);
        assertEquals(5,((PropertyCell) game.game_board.game_board[1]).level_of_property);
        assertEquals(5,((PropertyCell) game.game_board.game_board[3]).level_of_property);//asserting that cells can't be updated after reaching max level of cell(the max level is 5)
    }
    @Test
    public void TestingSettingPlayerInJailAndGettingOut()
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("Player1");
        Dices dice = mock(Dices.class);
        dice.dice1 = 1;
        dice.dice2 = 5;
        Game game = new Game(1,names);
        game.dices = dice;
        gameController.PlayerStoodOnCell(game.players.get(0),game.game_board.game_board[30],game );//simulating situation when player stood on 30-th cell which is cell "go to the Jail"
        assertEquals(1,game.players.get(0).inJail);
        game.players.get(1).card_get_out_of_jail=1;
        gameController.PlayerStoodOnCell(game.players.get(1),game.game_board.game_board[30],game );//getting out from jail when player has chance card "get out of jail"
        assertEquals(0,game.players.get(1).inJail);
        assertEquals(0,game.players.get(1).card_get_out_of_jail);//test if count of card "get out of jail decreased"
        gameController.PlayerStoodOnCell(game.players.get(1),game.game_board.game_board[30],game );
        assertEquals(1,game.players.get(1).inJail);
        assertEquals(1500,game.players.get(1).getMoney());
        gameController.MakeMove(game.players.get(1),game); //test situation when bot is in the jail, he makes move, and he is paying to getting out
        assertEquals(1400,game.players.get(1).getMoney());
        assertEquals(0,game.players.get(1).inJail);
        game.players.get(1).TakeMoneyFromPlayer(1400);
        gameController.PlayerStoodOnCell(game.players.get(1),game.game_board.game_board[30],game );
        assertEquals(1,game.players.get(1).inJail);//setting this player in the Jail again
        gameController.MakeMove(game.players.get(1),game);
        gameController.MakeMove(game.players.get(1),game);//testing situation when bot doesn't have money to getting out fast from the jail and he needs to throw dices to try to get out from the jail
        assertEquals(4,game.players.get(1).inJail);
        gameController.MakeMove(game.players.get(1),game);
        assertFalse(game.players.get(1).isActive());//testing if he looses when he doesn't have money to pay
    }
    @Test
    public void TestingPayingToOwnerCases()
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("Player1");
        Game game = new Game(1,names);
        assertEquals(1500,game.players.get(0).getMoney());
        assertEquals(1500,game.players.get(1).getMoney());
        ((PropertyCell)game.game_board.game_board[6]).owner = game.players.get(0);
        gameController.PlayerStoodOnCell(game.players.get(1),game.game_board.game_board[6],game);
        assertEquals(1506,game.players.get(0).getMoney());
        assertEquals(1494,game.players.get(1).getMoney());
        ((PropertyCell) game.game_board.game_board[6]).isPledged = true;
        gameController.PlayerStoodOnCell(game.players.get(1),game.game_board.game_board[6],game);//testing situation when this cell is pledged(no need to pay to owner)
        assertEquals(1506,game.players.get(0).getMoney());
        assertEquals(1494,game.players.get(1).getMoney());
        ((PropertyCell) game.game_board.game_board[6]).isPledged = false;
        game.players.get(0).inJail=1;//setting owner to the Jail
        gameController.PlayerStoodOnCell(game.players.get(1),game.game_board.game_board[6],game);//testing situation when owner of the cell is in the Jail(no need to pay to owner)
        assertEquals(1506,game.players.get(0).getMoney());
        assertEquals(1494,game.players.get(1).getMoney());
        game.players.get(0).inJail=0;
        gameController.PlayerStoodOnCell(game.players.get(1),game.game_board.game_board[6],game);//testing situation when owner of the cell got out of the Jail(there is need to pay to owner)
        assertEquals(1512,game.players.get(0).getMoney());
        assertEquals(1388,game.players.get(1).getMoney());
    }
    @Test
    public void TestingBotPledgingPropertyAndBotLoosing()
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("Player1");
        Game game = new Game(1,names);
        ((PropertyCell)game.game_board.game_board[39]).owner = game.players.get(0);
        ((PropertyCell)game.game_board.game_board[39]).level_of_property = 1;
        game.players.get(1).TakeMoneyFromPlayer(1500);
        ((PropertyCell)game.game_board.game_board[39]).owner = game.players.get(0);
        ((PropertyCell)game.game_board.game_board[27]).owner = game.players.get(1);
        ((PropertyCell)game.game_board.game_board[29]).owner = game.players.get(1);
        ((PropertyCell)game.game_board.game_board[31]).owner = game.players.get(1);
        ((PropertyCell)game.game_board.game_board[32]).owner = game.players.get(1);
        game.players.get(1).property.add(((PropertyCell)game.game_board.game_board[27]));
        game.players.get(1).property.add(((PropertyCell)game.game_board.game_board[29]));
        game.players.get(1).property.add(((PropertyCell)game.game_board.game_board[31]));
        game.players.get(1).property.add(((PropertyCell)game.game_board.game_board[32]));
        gameController.PlayerStoodOnCell(game.players.get(1),game.game_board.game_board[39],game);
        assertEquals(70,game.players.get(1).getMoney());
        assertEquals(1700,game.players.get(0).getMoney());//testing if player paid to the player
        assertTrue(((PropertyCell)game.game_board.game_board[27]).isPledged);//testing if player pledged certainly that amount of property to have enough money to pay
        assertTrue(((PropertyCell)game.game_board.game_board[29]).isPledged);
        assertFalse(((PropertyCell)game.game_board.game_board[31]).isPledged);
        assertFalse(((PropertyCell)game.game_board.game_board[32]).isPledged);
        gameController.PlayerStoodOnCell(game.players.get(1),game.game_board.game_board[39],game);
        assertEquals(20,game.players.get(1).getMoney());
        assertTrue(((PropertyCell)game.game_board.game_board[31]).isPledged);
        assertFalse(((PropertyCell)game.game_board.game_board[32]).isPledged);
        gameController.PlayerStoodOnCell(game.players.get(1),game.game_board.game_board[39],game);//testing if player looses when he has nothing to pledge
        assertEquals(3,game.count_of_active_players);
        assertFalse(game.players.get(1).isActive());
        assertEquals(null,((PropertyCell) game.game_board.game_board[27]).owner);//asserting resetting property cells which owned player who lost
        assertEquals(null,((PropertyCell) game.game_board.game_board[29]).owner);
        assertEquals(null,((PropertyCell) game.game_board.game_board[31]).owner);
        assertEquals(null,((PropertyCell) game.game_board.game_board[32]).owner);
        assertFalse(((PropertyCell)game.game_board.game_board[27]).isPledged);
        assertFalse(((PropertyCell)game.game_board.game_board[29]).isPledged);
        assertFalse(((PropertyCell)game.game_board.game_board[31]).isPledged);
        assertFalse(((PropertyCell)game.game_board.game_board[32]).isPledged);
    }
}
