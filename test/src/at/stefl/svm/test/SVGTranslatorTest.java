package at.stefl.svm.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.swing.JFileChooser;

import at.stefl.svm.tosvg.SVGTranslator;

public class SVGTranslatorTest {
    
    public static void main(String[] args) throws Throwable {
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        InputStream in = new FileInputStream(chooser.getSelectedFile());
        
        // InputStream in =
        // SVMListingTest.class.getResourceAsStream("test.svm");
        
        File file = File.createTempFile("svm2svg", ".svg");
        OutputStream out = new FileOutputStream(file);
        
        SVGTranslator.TRANSLATOR.translate(in, out);
        
        Runtime.getRuntime().exec("google-chrome " + file.getAbsolutePath());
    }
    
}