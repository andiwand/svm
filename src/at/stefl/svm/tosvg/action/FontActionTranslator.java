package at.stefl.svm.tosvg.action;

import java.io.IOException;

import at.stefl.svm.object.action.FontAction;
import at.stefl.svm.object.basic.FontDefinition;
import at.stefl.svm.tosvg.SVGStateWriter;

public class FontActionTranslator extends SVGActionTranslator<FontAction> {
    
    public static final FontActionTranslator TRANSLATOR = new FontActionTranslator();
    
    private FontActionTranslator() {
        super(FontAction.class);
    }
    
    @Override
    protected void translateImpl(FontAction action, SVGStateWriter out)
            throws IOException {
        FontDefinition f = action.getFontDefinition();
        
        out.addCurrentStyle("font-family", "" + f.getFamilyName());
        out.addCurrentStyle("font-size", "" + f.getSize().getY());
    }
    
}