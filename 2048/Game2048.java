import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Game2048 extends JPanel{

  int myScore = 0;
  boolean myWin = false;
  boolean myLose = false;
  private Tile[] myTiles;
  

  public Game2048(){
    setFocusable(true);

    resetGame();

  }

  private void resetGame() {
    myScore = 0;
    myWin = false;
    myLose = false;
    myTiles = new Tile[4*4];
    for(int i =0; i<myTiles.length; i++){
      myTiles[i] = new Tile();
    }
    addTile();
    addTile();

    
  }

  private void addTile() {
    List<Tile> list = availableSpace();
    if(!availableSpace().isEmpty()){
      int idx = (int)(Math.random() * list.size()) % list.size();
      Tile emptyTile = list.get(idx);
      emptyTile.value = Math.random() < 0.9 ? 2 : 4;

    }
    
  }

 

  private List<Tile> availableSpace() {

    final List<Tile> list = new ArrayList<Tile>(16);
    for(Tile t : myTiles){
      if(t.isEmpty()){
        list.add(t);
      }
    }
    return list;
  }

  static class Tile{
    int value;
    
    public Tile(){
      this(0);
    }

    public Tile(int num) {
      value = num;
    }

    public boolean isEmpty(){
      return (value == 0);
    }


    private void drawTile(Graphics g2, Tile tile, int x, int y){
      Graphics2D g = ((Graphics2D)g2);
      int value = tile.value;
      int xOffset = offsetColors(x);
      int yOffset = offsetColors(y);


    }

    private int offsetColors(int x) {
      return 0;
    }



  }

  public static void main(String []args){
    JFrame game = new JFrame("2048");
    game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    game.setSize(340, 420);
    game.setResizable(false);
    game.setLocationRelativeTo(null);

    game.add(new Game2048());
    
    game.setVisible(true);

  }
}