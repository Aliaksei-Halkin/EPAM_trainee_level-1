package module.fourth.task15;

public enum TourType {
    RECREATION,
    EXCURSION,
    TREATMENT,
    SHOPPING,
    CRUISE;
    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
