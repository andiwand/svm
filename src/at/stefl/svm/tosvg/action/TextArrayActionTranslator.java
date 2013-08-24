package at.stefl.svm.tosvg.action;

import java.io.IOException;

import at.stefl.svm.object.action.TextArrayAction;
import at.stefl.svm.tosvg.SVGStateWriter;

public class TextArrayActionTranslator extends
        SVGActionTranslator<TextArrayAction> {
    
    public static final TextArrayActionTranslator TRANSLATOR = new TextArrayActionTranslator();
    
    private TextArrayActionTranslator() {
        super(TextArrayAction.class);
    }
    
    // TODO: implement dx
    @Override
    protected void translateImpl(TextArrayAction action, SVGStateWriter out)
            throws IOException {
        out.writeText(
                action.getStartPoint().getAsVector2d(),
                action.getString().substring(action.getIndex(),
                        action.getIndex() + action.getLength()));
    }
    
}