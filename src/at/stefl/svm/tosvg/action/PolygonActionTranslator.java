package at.stefl.svm.tosvg.action;

import java.io.IOException;

import at.stefl.svm.object.action.PolygonAction;
import at.stefl.svm.tosvg.SVGStateWriter;
import at.stefl.svm.tosvg.SVGUtil;

public class PolygonActionTranslator extends SVGActionTranslator<PolygonAction> {

    public static final PolygonActionTranslator TRANSLATOR = new PolygonActionTranslator();

    private PolygonActionTranslator() {
	super(PolygonAction.class);
    }

    @Override
    protected void translateImpl(PolygonAction action, SVGStateWriter out)
	    throws IOException {
	out.writePolygon(SVGUtil.getPoints(action.getSimplePolygon()));
    }

}