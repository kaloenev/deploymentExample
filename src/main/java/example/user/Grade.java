package example.user;

public enum Grade {
    Third(3), Fourth(4), Fifth(5), Sixth(6), Seventh(7), Eighth(8), Ninth(9), Tenth(10), Eleventh(11), Twelfth(12),
    Student(13), Other(1);

    Grade(int i) {
        number = i;
    }

    private final int number;

    @Override
    public String toString() {
        return number + "th" + " grade";
    }
}
