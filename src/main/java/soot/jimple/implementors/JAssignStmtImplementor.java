/**
 * 
 */
package soot.jimple.implementors;

import soot.BiFuncFlowSet;
import soot.BiFuncInset;
import soot.BiFuncOutset;
import soot.jimple.internal.JAssignStmt;

/**
 * @author arjun
 *
 */
public abstract class JAssignStmtImplementor {

	public abstract BiFuncOutset<?,?> performAnalysis(BiFuncInset<?,?> inset,JAssignStmt stmt);
	
	public abstract BiFuncFlowSet<?,?> performAnalysis(BiFuncFlowSet<?,?> inset,JAssignStmt stmt);

}
