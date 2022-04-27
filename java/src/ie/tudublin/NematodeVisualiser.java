package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet {
	// Nematode array
	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();

	public void keyPressed() {
		if (keyCode == LEFT) {
		}
	}

	public void settings() {
		size(800, 800);

	}

	public void setup() {
		colorMode(HSB);
		background(0);
		smooth();
		loadNematodes();
		printData();
	}

	public void loadNematodes() {
		// load the data
		Table table = loadTable("nematodes.csv", "header");

		for (TableRow r : table.rows()) {
			Nematode nematode = new Nematode(r);
			nematodes.add(nematode);
		}
	}

	public void printData() {
		for (Nematode nematode : nematodes) {
			System.out.println(nematode);
		}
	}

	public void draw() {
		drawNematodes();
	}

	public void drawNematodes() {
		nematodes.get(0).render(this);
	}

}
