package at.stefl.svm.test;

import java.io.FileWriter;

import at.stefl.commons.math.vector.Vector2d;
import at.stefl.svm.tosvg.SVGStateWriter;

public class SVGStateWriterTest {

    public static void main(String[] args) throws Throwable {
	String fileName = "/home/andreas/svg.svg";

	FileWriter writer = new FileWriter(fileName);
	SVGStateWriter out = new SVGStateWriter(writer);

	out.writeHeader();

	out.addCurrentStyle("fill", "rgb(255, 0, 0)");
	out.writeCircle(new Vector2d(50, 50), 50);

	out.writeFooter();
	out.close();

	Runtime.getRuntime().exec("google-chrome " + fileName);
    }

}