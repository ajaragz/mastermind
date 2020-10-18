package calidad.mastermind;

public enum Color {
    WHITE,
    BLACK,
    YELLOW,
    BLUE,
    RED,
    GREEN,
    BROWN,
    ORANGE,
    NULL;

    static Color get(int index){
        return Color.values()[index];
    }
}
