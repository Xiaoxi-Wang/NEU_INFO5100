package assignment7;

public class Rock extends Tool {
    public Rock (int strength) {
        this.setStrength(strength);
        this.type = 'r';
    }

    public boolean fight (Tool t) {
        if (t.type == 'p') {
            if ((double) strength / 2 > t.strength) {
                return true;
            }
        }
        if (t.type == 's') {
            if (strength * 2 > t.strength) {
                return true;
            }
        }
        return false;
    }
}
