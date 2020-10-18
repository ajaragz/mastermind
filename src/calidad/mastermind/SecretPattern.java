package calidad.mastermind;

public class SecretPattern extends Pattern {

    SecretPattern() {
        super();
        for (int i=0; i<= Pattern.WIDTH; i++) {
            colors.add(Color.BLUE);
        }
    }

    Result getResult(GuessPattern guess) {
        int blackHits = 0;
        int whiteHits = 0;
        for (int i=0; i<= this.colors.size(); i++) {
            if (guess.contains(this.colors.get(i),i))
                blackHits++;

        }
        for (int i=0; i<= this.colors.size(); i++) {
            if (guess.contains(this.colors.get(i))) {
                whiteHits++;
            }
        }

        return new Result(blackHits, whiteHits - blackHits);
    }
}
