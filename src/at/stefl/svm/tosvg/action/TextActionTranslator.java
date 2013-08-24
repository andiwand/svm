package at.stefl.svm.tosvg.action;

import java.io.IOException;

import at.stefl.svm.object.action.TextAction;
import at.stefl.svm.tosvg.SVGStateWriter;

public class TextActionTranslator extends SVGActionTranslator<TextAction> {
    
    public static final TextActionTranslator TRANSLATOR = new TextActionTranslator();
    
    private TextActionTranslator() {
        super(TextAction.class);
    }
    
    @Override
    protected void translateImpl(TextAction action, SVGStateWriter out)
            throws IOException {
        out.writeText(
                action.getPoint().getAsVector2d(),
                action.getString().substring(action.getIndex(),
                        action.getIndex() + action.getLength()));
    }
    
}