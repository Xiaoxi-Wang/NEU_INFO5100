package assignment6.partC;

import java.util.Date;

public class Cat extends Pet implements Boardable{
    // variable
    private String hairLength;
    private Date boardStart;
    private Date boardEnd;

    // constructor
    public Cat(String petName, String ownerName, String color, String hairLength) {
        super(petName, ownerName, color);
        this.hairLength = hairLength;
    }

    // methods
    public String getHairLength() { return hairLength; }

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
            return "\nCAT:\n" + getPetName() + " owned by " + getOwnerName() + "\nColor: " + getColor()
                    + "\nSex: " + getSex() + "\nHair: " + getHairLength() + "\n";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    // test code
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", "Bob", "Black", "Short");
        cat.setSex(10);
        System.out.println(cat.toString());

        cat.setBoardStart(11, 01, 2018);
        cat.setBoardEnd(11, 15, 2018);
        System.out.println(cat.boarding(11, 15, 2018));
    }
}
