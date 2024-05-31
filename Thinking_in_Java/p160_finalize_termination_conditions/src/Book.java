public class Book {
    boolean checkedOut = false;
    Book (boolean checkOut) {
        checkedOut = checkOut;
    }
    void checkIn() {
        checkedOut = false;
    }
    @Override
    public void finalize() throws Throwable {
        if (checkedOut) {
            System.out.println("Error: checkedOut");
        } else {
            super.finalize();
        }
        // usually it makes like that
        // super.finalize();
    }
}
