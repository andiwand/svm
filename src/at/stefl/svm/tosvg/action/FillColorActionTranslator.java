package at.stefl.svm.tosvg.action;

import at.stefl.svm.object.action.FillColorAction;

public class FillColorActionTranslator extends
        SetableColorActionTranslator<FillColorAction> {
    
    public static final FillColorActionTranslator TRANSLATOR = new FillColorActionTranslator();
    
    private FillColorActionTranslator() {
        super(FillColorAction.class, "fill");
    }
    
}