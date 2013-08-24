package at.stefl.svm.tosvg.action;

import at.stefl.svm.object.action.SetableColorAction;

public class SetableColorActionTranslator<T extends SetableColorAction> extends
        ColorActionTranslator<T> {
    
    public SetableColorActionTranslator(Class<T> actionClass,
            String colorElement) {
        super(actionClass, colorElement);
    }
    
    @Override
    protected boolean isColorSet(T action) {
        return action.isSet();
    }
    
}