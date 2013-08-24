package at.stefl.svm.tosvg.action;

import java.io.IOException;

import at.stefl.svm.object.action.PolyLineAction;
import at.stefl.svm.tosvg.SVGStateWriter;
import at.stefl.svm.tosvg.SVGUtil;

public class PolyLineActionTranslator extends
        SVGActionTranslator<PolyLineAction> {
    
    public static final PolyLineActionTranslator TRANSLATOR = new PolyLineActionTranslator();
    
    private PolyLineActionTranslator() {
        super(PolyLineAction.class);
    }
    
    @Override
    protected void translateImpl(PolyLineAction action, SVGStateWriter out)
            throws IOException {
        out.writePolyLine(SVGUtil.getPoints(action.getSimplePolygon()));
    }
    
}