/**
 * 
 */
package soot.jimple.implementors;

import soot.BiFuncFlowSet;
import soot.BiFuncInset;
import soot.BiFuncOutset;
import soot.jimple.internal.JBreakpointStmt;
import soot.jimple.internal.JRetStmt;

/**
 * @author arjun
 *
 */
public abstract class JRetStmtImplementor {

	public abstract BiFuncOutset<?,?> performAnalysis(BiFuncInset<?,?> inset,JRetStmt stmt);
	
	public BiFuncFlowSet<?,?,?> performAnalysis(BiFuncFlowSet<?,?,?> inset,JRetStmt stmt){
		return inset.doAnalysis(stmt);
	}
}
