package assignment6.partC;

public abstract class Pet {
    // variables
    private String petName;
    private String ownerName;
    private String color;
    protected int sex;

    // how to connect these four variables with sex?
    public static final int MALE = 00;
    public static final int FEMALE = 01;
    public static final int SPAYED = 10;
    public static final int NEUTERED = 11;

    // constructor
    public Pet(String petName, String ownerName, String color) {
        this.petName = petName;
        this.ownerName = ownerName;
        this.color = color;
    }

    // methods
    public String getPetName() { return petName; }

    public String getOwnerName() {
        return ownerName;
    }

    public String getColor() { return color; }

    public void setSex(int sexID) { this.sex = sexID; }

    public String getSex() throws Exception {
        if (this.sex == MALE) {
            return "Male";
        } else if (this.sex == FEMALE) {
            return "Female";
        } else if (this.sex == SPAYED) {
            return "Spayed";
        } else if (this.sex == NEUTERED) {
            return "Neutered";
        }
        throw new Exception("There is NO matching sex");
    }

    public String toString() {
        try {
            return "\n" + petName + " owned by " + ownerName + "\nColor: " + getColor() + "\nSex: " + getSex();
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
