class Score {
    private int points;

    public Score(int p) {
        points = p;
    }

    public int getPoints() {
        return points;
    }
}

public class main {
    public static void main(String[] args) {
        Score s = new Score(80);
        System.out.println(s.getPoints());
    }
}