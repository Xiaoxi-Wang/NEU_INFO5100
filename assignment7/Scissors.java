package assignment7;

public class Scissors extends Tool {
    public Scissors (int strength) {
        this.setStrength(strength);
        this.type = 's';
    }

    public boolean fight (Tool t) {
        if (t.type == 'p') {
            if (strength * 2 > t.strength) {
                return true;
            }
        }
        if (t.type == 'r') {
            if ((double) strength / 2 > t.strength) {
                return true;
            }
        }
        return false;
    }
}
