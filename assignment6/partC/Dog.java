package assignment6.partC;

import java.util.Date;

public class Dog extends Pet implements Boardable {
    // variables
    private String size;
    private Date boardStart;
    private Date boardEnd;

    // constructor
    public Dog(String petName, String ownerName, String color, String size) {
        super(petName, ownerName, color);
        this.size = size;
    }

    // methods
    public String getSize() { return size; }

    @Override
    public void setBoardStart(int month, int day, int year) {
        this.boardStart = new Date(year, month, day);
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        this.boardEnd = new Date(year, month, day);
    }

    @Override
    public boolean boarding(int month, int day, int year) {
        Date checkDate = new Date(year, month, day);
        if (checkDate.after(boardStart) && checkDate.before(boardEnd)) {
            return true;
        } else if (checkDate.equals(boardStart) || checkDate.equals(boardEnd)) {
            return true;
        }
        return false;
    }

    public String toString() {
        try {
            return "\nDOG:\n" + getPetName() + " owned by " + getOwnerName() + "\nColor: " + getColor()
                    + "\nSex: " + getSex() + "\nSize: " + getSize() + "\n";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    // test code
    public static void main(String[] args) {
        Dog dog = new Dog("Spot", "Susan", "White", "Medium");
        dog.setSex(10);
        System.out.println(dog.toString());

        dog.setBoardStart(10, 30, 2018);
        dog.setBoardEnd(11, 25, 2018);
        System.out.println(dog.boarding(11, 26, 2018));
    }
}
