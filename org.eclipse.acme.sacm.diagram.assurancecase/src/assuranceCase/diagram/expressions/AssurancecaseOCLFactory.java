package assuranceCase.diagram.expressions;

import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.options.ParsingOptions;

/**
 * @generated
 */
public class AssurancecaseOCLFactory {

	/**
	* @generated
	*/
	private final assuranceCase.diagram.expressions.AssurancecaseAbstractExpression[] expressions;

	/**
	* @generated
	*/
	private final String[] expressionBodies;

	/**
	* @generated
	*/
	protected AssurancecaseOCLFactory() {
		this.expressions = new assuranceCase.diagram.expressions.AssurancecaseAbstractExpression[6];
		this.expressionBodies = new String[] {
				"(not self.oclIsTypeOf(AssuranceCasePackageBinding)) and (not self.oclIsTypeOf(AssuranceCasePackageInterface))", //$NON-NLS-1$
//				"(self.oclIsTypeOf(ArgumentPackage))", //$NON-NLS-1$
				"(not self.oclIsTypeOf(ArgumentPackageBinding)) and \n(not self.oclIsTypeOf(ArgumentPackageInterface)) and \n(not self.oclIsTypeOf(gsn::Module)) and \n(not self.oclIsTypeOf(gsn::ContractModule)) and\n(not self.oclIsTypeOf(cae::CAEModule)) and\n(not self.oclIsTypeOf(cae::CAEModuleInterface)) and\n(not self.oclIsTypeOf(cae::CAEModuleBinding))", //$NON-NLS-1$
				"(not self.oclIsTypeOf(gsn::ContractModule)) and\n(not self.oclIsTypeOf(cae::CAEModuleBinding))", //$NON-NLS-1$
				"(not self.oclIsTypeOf(cae::CAEModuleInterface))", //$NON-NLS-1$
				"(not self.oclIsTypeOf(ArtifactPackageBinding)) and (not self.oclIsTypeOf(ArtifactPackageInterface))", //$NON-NLS-1$
				"(not self.oclIsTypeOf(TerminologyPackageBinding)) and (not self.oclIsTypeOf(TerminologyPackageInterface))", //$NON-NLS-1$
		};
	}

	/**
	* @generated
	*/
	private static AssurancecaseOCLFactory getInstance() {
		AssurancecaseOCLFactory instance = assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
				.getAssurancecaseOCLFactory();
		if (instance == null) {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.setAssurancecaseOCLFactory(instance = new AssurancecaseOCLFactory());
		}
		return instance;
	}

	/**
	* @generated
	*/
	public static String getExpressionBody(int index) {
		return getInstance().expressionBodies[index];
	}

	/**
	* @generated
	*/
	public static assuranceCase.diagram.expressions.AssurancecaseAbstractExpression getExpression(int index,
			EClassifier context, Map<String, EClassifier> environment) {
		AssurancecaseOCLFactory cached = getInstance();
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			cached.expressions[index] = getExpression(cached.expressionBodies[index], context,
					environment == null ? Collections.<String, EClassifier>emptyMap() : environment);
		}
		return cached.expressions[index];
	}

	/**
	* This is factory method, callers are responsible to keep reference to the return value if they want to reuse parsed expression
	* @generated
	*/
	public static assuranceCase.diagram.expressions.AssurancecaseAbstractExpression getExpression(String body,
			EClassifier context, Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	* This method will become private in the next release
	* @generated
	*/
	public static assuranceCase.diagram.expressions.AssurancecaseAbstractExpression getExpression(String body,
			EClassifier context) {
		return getExpression(body, context, Collections.<String, EClassifier>emptyMap());
	}

	/**
	* @generated
	*/
	private static class Expression extends assuranceCase.diagram.expressions.AssurancecaseAbstractExpression {

		/**
		* @generated
		*/
		private final org.eclipse.ocl.ecore.OCL oclInstance;

		/**
		* @generated
		*/
		private OCLExpression oclExpression;

		/**
		* @generated
		*/
		public Expression(String body, EClassifier context, Map<String, EClassifier> environment) {
			super(body, context);
			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
			initCustomEnv(oclInstance.getEnvironment(), environment);
			Helper oclHelper = oclInstance.createOCLHelper();
			oclHelper.setContext(context());
			try {
				oclExpression = oclHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (ParserException e) {
				setStatus(IStatus.ERROR, e.getMessage(), e);
			}
		}

		/**
		* @generated
		*/
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
			if (oclExpression == null) {
				return null;
			}
			// on the first call, both evalEnvironment and extentMap are clear, for later we have finally, below.
			EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = oclInstance.getEvaluationEnvironment();
			// initialize environment
			for (Object nextKey : env.keySet()) {
				evalEnv.replace((String) nextKey, env.get(nextKey));
			}
			try {
				Object result = oclInstance.evaluate(context, oclExpression);
				return oclInstance.isInvalid(result) ? null : result;
			} finally {
				evalEnv.clear();
				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
			}
		}

		/**
		* @generated
		*/
		private static void initCustomEnv(Environment<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, ?, ?, ?> ecoreEnv,
				Map<String, EClassifier> environment) {
			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
			ParsingOptions.setOption(ecoreEnv, ParsingOptions.implicitRootClass(ecoreEnv),
					EcorePackage.eINSTANCE.getEObject());
			for (String varName : environment.keySet()) {
				EClassifier varType = environment.get(varName);
				ecoreEnv.addElement(varName, createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		* @generated
		*/
		private static Variable createVar(Environment<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ecoreEnv,
				String name, EClassifier type) {
			Variable var = EcoreFactory.eINSTANCE.createVariable();
			var.setName(name);
			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
			return var;
		}
	}
}
