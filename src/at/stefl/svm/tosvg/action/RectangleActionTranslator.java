package at.stefl.svm.tosvg.action;

import java.io.IOException;

import at.stefl.svm.object.action.RectangleAction;
import at.stefl.svm.tosvg.SVGStateWriter;

public class RectangleActionTranslator extends
        SVGActionTranslator<RectangleAction> {
    
    public static final RectangleActionTranslator TRANSLATOR = new RectangleActionTranslator();
    
    private RectangleActionTranslator() {
        super(RectangleAction.class);
    }
    
    @Override
    protected void translateImpl(RectangleAction action, SVGStateWriter out)
            throws IOException {
        out.writeRectange(action.getRectangle().getAsRectangleD());
    }
    
}