public abstract class MoodyObject {
    // super methods
    protected abstract String getMood();
    protected abstract void expressFeelings();
    public void queryMood() {System.out.println("I feel " + getMood() + " today!");}
}

class SadObject extends MoodyObject {
    // methods
    protected String getMood() {
        String mood = "sad";
        return mood;
    }
    public void expressFeelings() {System.out.println("'wah' 'boo boo 'weep' 'sob' 'weep'");}
    public String toString() {
        String message = "Observation: Subject cries a lot";
        System.out.println(message);
        return message;
    }
}

class HappyObject extends MoodyObject {
    // methods
    protected String getMood() {
        String mood = "happy";
        return mood;
    }
    public void expressFeelings() {
        System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");
    }
    public String toString() {
        String message = "Observation: Subject laughs a lot";
        System.out.println(message);
        return message;
    }
}
