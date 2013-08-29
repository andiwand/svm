package at.stefl.svm.test;

import java.io.InputStream;
import java.util.EnumSet;
import java.util.Set;

import at.stefl.svm.enumeration.ActionType;
import at.stefl.svm.io.SVMReader;
import at.stefl.svm.object.SVMHeader;
import at.stefl.svm.object.action.SVMAction;
import at.stefl.svm.object.action.UnsupportedAction;

public class SVMListingTest {

    public static void main(String[] args) throws Throwable {
	InputStream in = SVMListingTest.class.getResourceAsStream("test.svm");
	SVMReader reader = new SVMReader(in);

	SVMHeader header = reader.readHeader();
	System.out.println(header);
	System.out.println();

	Set<ActionType> supportedActions = EnumSet.noneOf(ActionType.class);
	Set<ActionType> unsupportedActions = EnumSet.noneOf(ActionType.class);

	for (int i = 0; i < header.getActionCount(); i++) {
	    SVMAction actionObject = reader.readAction();

	    if (actionObject instanceof UnsupportedAction)
		unsupportedActions.add(actionObject.getActionType());
	    else
		supportedActions.add(actionObject.getActionType());

	    System.out.println(actionObject);
	}

	System.out.println();
	System.out.println();

	System.out.println("supported actions: " + supportedActions);
	System.out.println("unsupported actions: " + unsupportedActions);
    }

}