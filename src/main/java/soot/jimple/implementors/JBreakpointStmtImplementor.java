/**
 * 
 */
package soot.jimple.implementors;

import soot.BiFuncFlowSet;
import soot.BiFuncInset;
import soot.BiFuncOutset;
import soot.jimple.internal.JAssignStmt;
import soot.jimple.internal.JBreakpointStmt;

/**
 * @author arjun
 *
 */
public abstract class JBreakpointStmtImplementor {

	public abstract BiFuncOutset<?,?> performAnalysis(BiFuncInset<?,?> inset,JBreakpointStmt stmt);
	
	public BiFuncFlowSet<?,?,?> performAnalysis(BiFuncFlowSet<?,?,?> inset,JBreakpointStmt stmt){
		return inset.doAnalysis(stmt);
	}
}
