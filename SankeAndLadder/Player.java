package SankeAndLadder;

public class Player {
    private int id;
    private int currentPosition;

    public Player(int id, int position) {
        this.id = id;
        currentPosition = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
