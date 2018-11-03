package assignment7;

public class Paper extends Tool {
    public Paper (int strength) {
        this.setStrength(strength);
        this.type = 'p';
    }

    public boolean fight (Tool t) {
        if (t.type == 'r') {
            if (strength * 2 > t.strength) {
                return true;
            }
        }
        if (t.type == 's') {
            if ((double) strength / 2 > t.strength) {
                return true;
            }
        }
        return false;
    }
}
