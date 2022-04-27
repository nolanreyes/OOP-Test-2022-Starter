package ie.tudublin;

import processing.data.TableRow;

public class Nematode {

    private String name;
    private int length;
    private Boolean limbs;
    private String gender;
    private Boolean eyes;

    public Nematode(TableRow tr)
    {
        this(   tr.getString("name"),
                tr.getInt("length"),
                tr.getInt("limbs") == 1,
                tr.getString("gender"),
                tr.getInt("eyes") == 1 
            );

    }

    public Nematode(String name, int length, Boolean limbs, String gender, Boolean eyes) {
        this.name = name;
        this.length = length;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;
    }
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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Boolean getEyes() {
        return eyes;
    }
    public void setEyes(Boolean eyes) {
        this.eyes = eyes;
    }

    
}