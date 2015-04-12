/**
 *
 * $Id$
 */
package uml2.validation;

import org.eclipse.emf.common.util.EList;

import uml2.Constraint;
import uml2.DataType;
import uml2.Interface;
import uml2.Operation;
import uml2.Type;

/**
 * A sample validator interface for {@link uml2.Operation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface OperationValidator {
	boolean validate();

	boolean validateBodyCondition(Constraint value);
	boolean validateClass(uml2.Class value);
	boolean validateDatatype(DataType value);
	boolean validateInterface(Interface value);
	boolean validateIsOrdered(Boolean value);
	boolean validateIsQuery(Boolean value);
	boolean validateIsUnique(Boolean value);
	boolean validateLower(Integer value);
	boolean validatePostcondition(EList<Constraint> value);
	boolean validatePrecondition(EList<Constraint> value);
	boolean validateRedefinedOperation(EList<Operation> value);
	boolean validateType(Type value);
	boolean validateUpper(Integer value);
}