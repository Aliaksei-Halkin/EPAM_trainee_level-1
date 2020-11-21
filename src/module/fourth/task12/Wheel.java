package module.fourth.task12;

import java.util.Objects;

public class Wheel {
    private String diameter;
    private int width;
    private int heightProfil;
    private String season;

    public Wheel(String diameter, int width, int heightProfil, String season) {
        this.diameter = diameter;
        this.width = width;
        this.heightProfil = heightProfil;
        this.season = season;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return width == wheel.width &&
                heightProfil == wheel.heightProfil &&
                diameter.equals(wheel.diameter) &&
                season.equals(wheel.season);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter, width, heightProfil, season);
    }
}
