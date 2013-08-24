package at.stefl.svm.tosvg.action;

import at.stefl.svm.object.action.TextColorAction;

public class TextColorActionTranslator extends
        ColorActionTranslator<TextColorAction> {
    
    public static final TextColorActionTranslator TRANSLATOR = new TextColorActionTranslator();
    
    private TextColorActionTranslator() {
        super(TextColorAction.class, "fill");
    }
    
}