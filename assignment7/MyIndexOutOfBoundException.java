package assignment7;

public class MyIndexOutOfBoundException{
    int index;
    int lowerBound;
    int upperBound;

    public MyIndexOutOfBoundException(int index, int lowerBound, int upperBound) {
        this.index = index;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public void checkIndex() throws Exception {
        if (index > lowerBound && index < upperBound) {
            System.out.println("Correct");
        }
        else {
            String message = "Error Message: Index: " + this.index + ", but Lower bound: " + this.lowerBound + ", Upper bound: " + this.upperBound;
            throw new Exception(message);
        }
    }


    public static void main(String[] args) {
        try {
            MyIndexOutOfBoundException test = new MyIndexOutOfBoundException(10, 0, 9);
            test.checkIndex();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
