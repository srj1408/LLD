package SankeAndLadder;

public class Board {
    private int boardSize;
    private Cell[][] cells;

    public Board(int boardSize, int snakes, int ladders) {
        this.boardSize = boardSize;
        initializeBoard();
        addSnakes(snakes);
        addLadders(ladders);
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void initializeBoard(){
        cells = new Cell[boardSize][boardSize];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                cells[i][j] = new Cell();
            }
        }
    }

    public void addSnakes(int snakes){
        int range = boardSize*boardSize;
        while(snakes>0){
            int head = (int)(Math.random()*range);
            int tail = (int)(Math.random()*range);
            if(head>tail){
                Jump snake = new Jump(head,tail);
                Cell cell = getCell(head);
                if(cell.getJump() == null) { // avoid duplicates
                    cell.setJump(snake);
                    System.out.println("Snake from cell "+head+" to cell "+tail);
                    snakes--;
                }
            }
        }
    }

    public void addLadders(int ladders){
        int range = boardSize*boardSize;
        while(ladders>0){
            int start = (int)(Math.random()*range);
            int end = (int)(Math.random()*range);
            if(start<end){
                Jump ladder = new Jump(start,end);
                Cell cell = getCell(start);
                if(cell.getJump() == null) { // avoid duplicates
                    cell.setJump(ladder);
                    System.out.println("Ladder from cell "+start+" to cell "+end);
                    ladders--;
                }
            }
        }
    }

    public Cell getCell(int position){
        int row = position/boardSize;
        int col = position%boardSize;
        return cells[row][col];
    }
}
