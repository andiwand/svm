package at.stefl.svm.tosvg.action;

import at.stefl.svm.object.action.LineColorAction;

public class LineColorActionTranslator extends
        SetableColorActionTranslator<LineColorAction> {
    
    public static final LineColorActionTranslator TRANSLATOR = new LineColorActionTranslator();
    
    private LineColorActionTranslator() {
        super(LineColorAction.class, "stroke");
    }
    
}