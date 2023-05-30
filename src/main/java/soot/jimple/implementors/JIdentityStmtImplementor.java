/**
 * 
 */
package soot.jimple.implementors;

import soot.BiFuncFlowSet;
import soot.BiFuncInset;
import soot.BiFuncOutset;
import soot.jimple.internal.JBreakpointStmt;
import soot.jimple.internal.JIdentityStmt;

/**
 * @author arjun
 *
 */
public abstract class JIdentityStmtImplementor {

	public abstract BiFuncOutset<?,?> performAnalysis(BiFuncInset<?,?> inset,JIdentityStmt stmt);
	
	public BiFuncFlowSet<?,?,?> performAnalysis(BiFuncFlowSet<?,?,?> inset,JIdentityStmt stmt){
		return inset.doAnalysis(stmt);
	}
}
