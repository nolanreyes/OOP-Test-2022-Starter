package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

//Nematode Class
public class Nematode {

    private String name;
    private int length;
    private Boolean limbs;
    private char gender;
    private Boolean eyes;

    // toString
    @Override
    public String toString() {
        return "Nematode [eyes=" + eyes + ", gender=" + gender + ", length=" + length + ", limbs=" + limbs + ", name="
                + name + "]";
    }

    // TableRow
    public Nematode(TableRow tr) {
        this(tr.getString("name"),
                tr.getInt("length"),
                tr.getInt("limbs") == 1,
                tr.getString("gender").charAt(0),
                tr.getInt("eyes") == 1);

    }

    // Constructors
    public Nematode(String name, int length, Boolean limbs, char gender, Boolean eyes) {
        this.name = name;
        this.length = length;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;
    }

    // Accessors
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Boolean getLimbs() {
        return limbs;
    }

    public void setLimbs(Boolean limbs) {
        this.limbs = limbs;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Boolean getEyes() {
        return eyes;
    }

    public void setEyes(Boolean eyes) {
        this.eyes = eyes;
    }

}
