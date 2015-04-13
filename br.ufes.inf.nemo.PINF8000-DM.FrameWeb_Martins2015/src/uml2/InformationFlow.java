/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An information flow specifies that one or more information items circulates from its sources to its targets. Information flows require some kind of information channel for transmitting information items from the source to the destination. An information channel is represented in various ways depending on the nature of its sources and targets. It may be represented by connectors, links, associations, or even dependencies. For example, if the source and destination are parts in some composite structure such as a collaboration, then the information channel is likely to be represented by a connector between them. Or, if the source and target are objects (which are a kind of instance specification), they may be represented by a link that joins the two, and so on.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.InformationFlow#getConveyed <em>Conveyed</em>}</li>
 *   <li>{@link uml2.InformationFlow#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link uml2.InformationFlow#getInformationTarget <em>Information Target</em>}</li>
 *   <li>{@link uml2.InformationFlow#getRealization <em>Realization</em>}</li>
 *   <li>{@link uml2.InformationFlow#getRealizingActivityEdge <em>Realizing Activity Edge</em>}</li>
 *   <li>{@link uml2.InformationFlow#getRealizingConnector <em>Realizing Connector</em>}</li>
 *   <li>{@link uml2.InformationFlow#getRealizingMessage <em>Realizing Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getInformationFlow()
 * @model
 * @generated
 */
public interface InformationFlow extends PackageableElement, DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Conveyed</b></em>' reference list.
	 * The list contents are of type {@link uml2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the information items that may circulate on this information flow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyed</em>' reference list.
	 * @see uml2.Uml2Package#getInformationFlow_Conveyed()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getConveyed();

	/**
	 * Returns the value of the '<em><b>Information Source</b></em>' reference list.
	 * The list contents are of type {@link uml2.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines from which source the conveyed InformationItems are initiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information Source</em>' reference list.
	 * @see uml2.Uml2Package#getInformationFlow_InformationSource()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getInformationSource();

	/**
	 * Returns the value of the '<em><b>Information Target</b></em>' reference list.
	 * The list contents are of type {@link uml2.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines to which target the conveyed InformationItems are directed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information Target</em>' reference list.
	 * @see uml2.Uml2Package#getInformationFlow_InformationTarget()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getInformationTarget();

	/**
	 * Returns the value of the '<em><b>Realization</b></em>' reference list.
	 * The list contents are of type {@link uml2.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines which Relationship will realize the specified flow
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realization</em>' reference list.
	 * @see uml2.Uml2Package#getInformationFlow_Realization()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Relationship> getRealization();

	/**
	 * Returns the value of the '<em><b>Realizing Activity Edge</b></em>' reference list.
	 * The list contents are of type {@link uml2.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines which ActivityEdges will realize the specified flow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realizing Activity Edge</em>' reference list.
	 * @see uml2.Uml2Package#getInformationFlow_RealizingActivityEdge()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getRealizingActivityEdge();

	/**
	 * Returns the value of the '<em><b>Realizing Connector</b></em>' reference list.
	 * The list contents are of type {@link uml2.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines which Connectors will realize the specified flow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realizing Connector</em>' reference list.
	 * @see uml2.Uml2Package#getInformationFlow_RealizingConnector()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Connector> getRealizingConnector();

	/**
	 * Returns the value of the '<em><b>Realizing Message</b></em>' reference list.
	 * The list contents are of type {@link uml2.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines which Messages will realize the specified flow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realizing Message</em>' reference list.
	 * @see uml2.Uml2Package#getInformationFlow_RealizingMessage()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Message> getRealizingMessage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An information flow can only convey classifiers that are allowed to represent an information item.
	 * self.conveyed.represented->forAll(p | p->oclIsKindOf(Class) or oclIsKindOf(Interface)
	 *   or oclIsKindOf(InformationItem) or oclIsKindOf(Signal) or oclIsKindOf(Component))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.conveyed.represented->forAll(p | p->oclIsKindOf(Class) or oclIsKindOf(Interface)\r\n  or oclIsKindOf(InformationItem) or oclIsKindOf(Signal) or oclIsKindOf(Component))'"
	 * @generated
	 */
	boolean conveyClassifiers(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sources and targets of the information flow must conform with the sources and targets or conversely the targets and sources of the realization relationships.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean mustConform(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sources and targets of the information flow can only be one of the following kind: Actor, Node, UseCase, Artifact, Class, Component, Port, Property, Interface, Package, ActivityNode, ActivityPartition and InstanceSpecification except when its classifier is a relationship (i.e. it represents a link).
	 * (self.informationSource->forAll(p | p->oclIsKindOf(Actor) or oclIsKindOf(Node) or
	 *   oclIsKindOf(UseCase) or oclIsKindOf(Artifact) or oclIsKindOf(Class) or
	 *   oclIsKindOf(Component) or oclIsKindOf(Port) or oclIsKindOf(Property) or
	 *   oclIsKindOf(Interface) or oclIsKindOf(Package) or oclIsKindOf(ActivityNode) or
	 *   oclIsKindOf(ActivityPartition) or oclIsKindOf(InstanceSpecification))) and
	 *     (self.informationTarget->forAll(p | p->oclIsKindOf(Actor) or oclIsKindOf(Node) or
	 *       oclIsKindOf(UseCase) or oclIsKindOf(Artifact) or oclIsKindOf(Class) or
	 *       oclIsKindOf(Component) or oclIsKindOf(Port) or oclIsKindOf(Property) or
	 *       oclIsKindOf(Interface) or oclIsKindOf(Package) or oclIsKindOf(ActivityNode) or
	 *       oclIsKindOf(ActivityPartition) or oclIsKindOf(InstanceSpecification)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.informationSource->forAll(p | p->oclIsKindOf(Actor) or oclIsKindOf(Node) or\r\n  oclIsKindOf(UseCase) or oclIsKindOf(Artifact) or oclIsKindOf(Class) or\r\n  oclIsKindOf(Component) or oclIsKindOf(Port) or oclIsKindOf(Property) or\r\n  oclIsKindOf(Interface) or oclIsKindOf(Package) or oclIsKindOf(ActivityNode) or\r\n  oclIsKindOf(ActivityPartition) or oclIsKindOf(InstanceSpecification))) and\r\n    (self.informationTarget->forAll(p | p->oclIsKindOf(Actor) or oclIsKindOf(Node) or\r\n      oclIsKindOf(UseCase) or oclIsKindOf(Artifact) or oclIsKindOf(Class) or\r\n      oclIsKindOf(Component) or oclIsKindOf(Port) or oclIsKindOf(Property) or\r\n      oclIsKindOf(Interface) or oclIsKindOf(Package) or oclIsKindOf(ActivityNode) or\r\n      oclIsKindOf(ActivityPartition) or oclIsKindOf(InstanceSpecification)))'"
	 * @generated
	 */
	boolean sourcesAndTargetsKind(DiagnosticChain diagnostics, Map<Object, Object> context);

} // InformationFlow