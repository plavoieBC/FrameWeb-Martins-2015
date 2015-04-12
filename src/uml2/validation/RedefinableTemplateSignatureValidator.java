/**
 *
 * $Id$
 */
package uml2.validation;

import org.eclipse.emf.common.util.EList;

import uml2.Classifier;
import uml2.RedefinableTemplateSignature;
import uml2.TemplateParameter;

/**
 * A sample validator interface for {@link uml2.RedefinableTemplateSignature}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RedefinableTemplateSignatureValidator {
	boolean validate();

	boolean validateExtendedSignature(EList<RedefinableTemplateSignature> value);
	boolean validateInheritedParameter(EList<TemplateParameter> value);
	boolean validateClassifier(Classifier value);
}