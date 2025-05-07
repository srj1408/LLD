package SankeAndLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private Board board;
    private Dice dice;
    private Deque<Player> players;
    private Player winner;

    public Game() {
        board = new Board(10,5,4);
        dice = new Dice(1);
        players = new LinkedList<>();
        winner = null;
    }

    public void addPlayers(int n){
        for(int i=1; i<=n; i++) players.add(new Player(i,0));
    }

    public void start() {
        while(true){ // one of the player wins
            Player player = getPlayerTurn(); // player turn
            int move = dice.rollDice(); //roll the dice;
            System.out.println("Player "+player.getId()+" turn with move "+move);
            int position = player.getCurrentPosition()+move;
            System.out.println("Move from position "+player.getCurrentPosition()+" to position "+position);
            if(position >= board.getBoardSize()*board.getBoardSize()){
                winner = player;
                break;
            }
            position = checkJump(position); // check if there is a ladder or a snake
            player.setCurrentPosition(position); // set the position of player
        }
        System.out.println("Winner is player "+winner.getId());
    }

    private int checkJump(int position) {
        Cell cell = board.getCell(position);
        Jump jump =  cell.getJump();
        if(jump != null){
            System.out.println("Jump to position "+jump.getEnd());
            return jump.getEnd();
        }
        return position;
    }

    public Player getPlayerTurn(){
        Player player = players.getFirst();
        players.addLast(player);
        players.removeFirst();
        return player;
    }
}
