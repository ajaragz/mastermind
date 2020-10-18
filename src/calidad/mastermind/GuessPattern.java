package calidad.mastermind;

public class GuessPattern extends Pattern {

    public void read() {
        Color readColor = Color.BLACK;
        for (int i=0; i<= Pattern.WIDTH; i++) {
            this.colors.add(readColor);
        }
    }

    public boolean contains(Color color, int position){
        return this.colors.get(position) == color;
    }

    public boolean contains(Color color){
        return this.colors.contains(color);
    }
}
