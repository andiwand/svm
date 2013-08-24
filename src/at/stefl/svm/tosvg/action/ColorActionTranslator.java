package at.stefl.svm.tosvg.action;

import java.io.IOException;

import at.stefl.svm.object.action.ColorAction;
import at.stefl.svm.tosvg.SVGStateWriter;
import at.stefl.svm.tosvg.SVGUtil;

public abstract class ColorActionTranslator<T extends ColorAction> extends
        SVGActionTranslator<T> {
    
    private static final String OPACITY_ELEMENT_SUFFIX = "-opacity";
    
    private final String colorElement;
    private final String opacityElement;
    
    public ColorActionTranslator(Class<T> actionClass, String colorElement) {
        super(actionClass);
        
        this.colorElement = colorElement;
        this.opacityElement = colorElement + OPACITY_ELEMENT_SUFFIX;
    }
    
    @Override
    protected void translateImpl(T action, SVGStateWriter out)
            throws IOException {
        out.addCurrentStyle(colorElement,
                SVGUtil.getColorAttribute(action.getColor()));
        
        if (isColorSet(action)) {
            out.removeCurrentStyle(opacityElement);
        } else {
            out.addCurrentStyle(opacityElement, "0.0");
        }
    }
    
    protected boolean isColorSet(T action) {
        return true;
    }
    
}