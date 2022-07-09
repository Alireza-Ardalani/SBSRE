package gr.uom.java.ast.decomposition.cfg;

import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.VariableDeclaration;

public abstract class AbstractVariable {
	//protected VariableDeclaration name;
	protected String variableBindingKey;
	protected String variableName;
	protected String variableType;
	protected boolean isField;
	protected boolean isParameter;
	protected boolean isStatic;
	//SBSRE => add new
	protected boolean isFainal;
	
	public AbstractVariable(VariableDeclaration name) {
		IVariableBinding variableBinding = name.resolveBinding();
		this.variableBindingKey = variableBinding.getKey();
		this.variableName = variableBinding.getName();
		this.variableType = variableBinding.getType().getQualifiedName();
		this.isField = variableBinding.isField();
		this.isParameter = variableBinding.isParameter();
		this.isStatic = (variableBinding.getModifiers() & Modifier.STATIC) != 0;
		this.isFainal = (variableBinding.getModifiers() & Modifier.FINAL)  != 0;

	}

	public AbstractVariable(IVariableBinding variableBinding) {
		this(variableBinding.getKey(), variableBinding.getName(), variableBinding.getType().getQualifiedName(),
				variableBinding.isField(), variableBinding.isParameter(), (variableBinding.getModifiers() & Modifier.STATIC) != 0, (variableBinding.getModifiers() & Modifier.FINAL)  != 0);
	}

	public AbstractVariable(String variableBindingKey, String variableName, String variableType, boolean isField, boolean isParameter, boolean isStatic, boolean isFainal) {
		this.variableBindingKey = variableBindingKey;
		this.variableName = variableName;
		this.variableType = variableType;
		this.isField = isField;
		this.isParameter = isParameter;
		this.isStatic = isStatic;
		this.isFainal =isFainal;
	}

	public String getVariableBindingKey() {
		return variableBindingKey;
	}

	public String getVariableName() {
		return variableName;
	}

	public String getVariableType() {
		return variableType;
	}

	public boolean isField() {
		return isField;
	}

	public boolean isParameter() {
		return isParameter;
	}

	public boolean isStatic() {
		return isStatic;
	}
	public boolean isFainal(){
		return isFainal;
	}

	public abstract boolean containsPlainVariable(PlainVariable variable);
	public abstract boolean startsWithVariable(AbstractVariable variable);
	public abstract PlainVariable getInitialVariable();
}
