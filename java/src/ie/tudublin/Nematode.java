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

    public void render(NematodeVisualiser pa)
    {
        float bodyRoll = 80;
        float border = (pa.height - (length * bodyRoll)) / 2;
        float x = pa.width / 2;
        float y;
        

        pa.ellipseMode(PApplet.CENTER);
        pa.stroke(255);
        pa.noFill();
        

        //body
        for (int i = 0; i < length; i++)
        {
            y = PApplet.map(i, 0, length, border, pa.height - border);

            // segment
            pa.circle(x, y, bodyRoll);

            // limbs
            if (limbs == true)
            {
                pa.line(x - bodyRoll / 2, y, x - bodyRoll / 2 - 50, y);
                pa.line(x + bodyRoll / 2, y, x + bodyRoll / 2 + 50, y);
            }
            /*
            //gender 
            if (gender ==)
            {

            }
            */
        }

        //eyes
        if (eyes == true)
        {
            
        }
        
        //name
        
        
    }
}
