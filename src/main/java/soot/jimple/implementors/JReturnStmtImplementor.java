/**
 * 
 */
package soot.jimple.implementors;

import soot.BiFuncFlowSet;
import soot.BiFuncInset;
import soot.BiFuncOutset;
import soot.jimple.internal.JBreakpointStmt;
import soot.jimple.internal.JReturnStmt;

/**
 * @author arjun
 *
 */
public abstract class JReturnStmtImplementor {

	public abstract BiFuncOutset<?,?> performAnalysis(BiFuncInset<?,?> inset,JReturnStmt stmt);
	
	public BiFuncFlowSet<?,?,?> performAnalysis(BiFuncFlowSet<?,?,?> inset,JReturnStmt stmt){
		return inset.doAnalysis(stmt);
	}
}
