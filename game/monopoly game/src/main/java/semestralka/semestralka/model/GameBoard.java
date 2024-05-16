package semestralka.semestralka.model;

/**
 * Represents the game board in the Monopoly game.
 */
public class GameBoard{
    /** Array representing the cells on the game board. */
    public Cell[] game_board = new Cell[40];
    /**
     * Constructor for the GameBoard class.
     * Initializes the game board with various types of cells.
     */
    public GameBoard()
    {
        game_board[0] = new StartCell();
        game_board[1] = new Avenue("Mediterranean Avenue", 60, new int[]{2,10,30,90,160,250}, 1,50);
        game_board[2] = new CommunityChest();
        game_board[3] = new Avenue("Baltic Avenue", 60, new int[]{4,20,60,180,320,450},1,50);
        game_board[4] = new TaxCell("Income tax");
        game_board[5] = new Station("Reading station", 200,new int[]{25,50,100,200},9);
        game_board[6] = new Avenue("Oriental Avenue",100,new int[]{6,30,90,270,400,550},2,50);
        game_board[7] = new ChanceCard();
        game_board[8] = new Avenue("Vermont Avenue", 100,new int[]{6,30,90,270,400,550},2,50);
        game_board[9] = new Avenue("Connecticut Avenue", 120,new int[]{8, 40,100,300,450,600},2,50);
        game_board[10] = new Jail();
        game_board[11] = new Avenue("St. Charles Place", 140,new int[]{10,50,150,450,625,750},3,100);
        game_board[12] = new CommunityService("Electric company",150,new int[]{4,10},10);
        game_board[13] = new Avenue("States Avenue", 140,new int[]{10,50,150,450,625,750},3,100);
        game_board[14] = new Avenue("Virginia Avenue", 160,new int[]{12,60,180,500,700,900},3,100);
        game_board[15] = new Station("Pensylvania station",200,new int[]{25,50,100,200},9);
        game_board[16] = new Avenue("St. James Place", 180,new int[]{14,70,200,550,700,950},4,100);
        game_board[17] = new CommunityChest();
        game_board[18] = new Avenue("Tennessee Avenue", 180,new int[]{14,70,200,550,700,950},4,100);
        game_board[19] = new Avenue("New York Avenue", 200,new int[]{16,80,220,600,800,1000},4,100);
        game_board[20] = new ParkingCell();
        game_board[21] = new Avenue("Kentucky Avenue" ,220,new int[]{18,90,250,700,875,1050},5,150);
        game_board[22] = new ChanceCard();
        game_board[23] = new Avenue("Indiana Avenue", 220,new int[]{18,90,250,700,875,1050},5,150);
        game_board[24] = new Avenue("Illinois Avenue", 240,new int[]{20,100,300,750,925,1100},5,150);
        game_board[25] = new Station("B. & O. station",200,new int[]{25,50,100,200},9);
        game_board[26] = new Avenue("Atlantic Avenue", 260,new int[]{22,110,330,800,975,1150},6,150);
        game_board[27] = new Avenue("Ventnor Avenue", 260,new int[]{22,110,330,800,975,1150},6,150);
        game_board[28] = new CommunityService("Water works", 150,new int[]{4,10},10);
        game_board[29] = new Avenue("Marvin Gardens", 280,new int[]{24,120,360,850,1025,1200},6,150);
        game_board[30] = new GoToJail();
        game_board[31] = new Avenue("Pacific Avenue", 300,new int[]{26,130,390,900,1100,1275},7,200);
        game_board[32] = new Avenue("North Carolina Avenue", 300,new int[]{26,130,390,900,1100,1275},7,200);
        game_board[33] = new CommunityChest();
        game_board[34] = new Avenue("Pennsylvania Avenue", 320,new int[]{28,150,450,1000,1200,1400},7,200);
        game_board[35] = new Station("Shortline station",200,new int[]{25,50,100,200},9);
        game_board[36] = new ChanceCard();
        game_board[37] = new Avenue("Park Place", 350,new int[]{35,175,500,1100,1300,1500},8,200);
        game_board[38] = new TaxCell("Luxury tax");
        game_board[39] = new Avenue("Boardwalk", 400,new int[]{50,200,600,1400,1700,2000},8,200);
    }
}
