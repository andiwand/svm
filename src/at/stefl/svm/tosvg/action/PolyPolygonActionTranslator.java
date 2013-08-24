package at.stefl.svm.tosvg.action;

import java.io.IOException;
import java.util.List;

import at.stefl.commons.math.vector.Vector2i;
import at.stefl.svm.object.action.PolyPolygonAction;
import at.stefl.svm.tosvg.SVGStateWriter;
import at.stefl.svm.tosvg.SVGUtil;

public class PolyPolygonActionTranslator extends
        SVGActionTranslator<PolyPolygonAction> {
    
    public static final PolyPolygonActionTranslator TRANSLATOR = new PolyPolygonActionTranslator();
    
    private PolyPolygonActionTranslator() {
        super(PolyPolygonAction.class);
    }
    
    @Override
    protected void translateImpl(PolyPolygonAction action, SVGStateWriter out)
            throws IOException {
        for (List<Vector2i> points : action.getSimplePolyPolygon()) {
            out.writePolygon(SVGUtil.getPoints(points));
        }
    }
    
}