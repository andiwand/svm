package at.stefl.svm.test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import at.stefl.commons.math.vector.Vector2d;
import at.stefl.svm.tosvg.SVGStateWriter;
import at.stefl.svm.tosvg.SVGStateWriter.StyleCallback;

public class SVGStateWriterTest {
    
    public static void main(String[] args) throws Throwable {
        String fileName = "/home/andreas/svg.svg";
        
        FileWriter writer = new FileWriter(fileName);
        SVGStateWriter out = new SVGStateWriter(writer);
        
        out.writeHeader();
        
        out.writeCircle(new Vector2d(50, 50), 50, new StyleCallback() {
            @Override
            public void writeStyle(Writer out) throws IOException {
                out.write("fill:rgb(255, 0, 0);");
            }
        });
        
        out.writeFooter();
        out.close();
        
        Runtime.getRuntime().exec("google-chrome " + fileName);
    }
    
}