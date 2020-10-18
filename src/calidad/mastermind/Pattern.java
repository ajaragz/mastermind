package calidad.mastermind;

import java.util.ArrayList;
import java.util.List;

public abstract class Pattern {
    public static final int WIDTH = 4;
    protected List<Color> colors;

    protected Pattern() {
        this.colors = new ArrayList<Color>();
    }

}
