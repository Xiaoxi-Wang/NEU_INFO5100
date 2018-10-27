public class PsychiatristExamineMoodTest {
    public static void main(String[] args) {
        PsychiatristObject psychiatristObject = new PsychiatristObject();

        MoodyObject sadObject = new SadObject();
        MoodyObject happyObject = new HappyObject();

        psychiatristObject.examine(happyObject);
        psychiatristObject.observe(happyObject);
        psychiatristObject.examine(sadObject);
        psychiatristObject.observe(sadObject);

    }
}
