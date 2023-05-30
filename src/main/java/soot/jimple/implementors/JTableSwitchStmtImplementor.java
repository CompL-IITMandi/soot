/**
 * 
 */
package soot.jimple.implementors;

import soot.BiFuncFlowSet;
import soot.BiFuncInset;
import soot.BiFuncOutset;
import soot.jimple.internal.JBreakpointStmt;
import soot.jimple.internal.JTableSwitchStmt;

/**
 * @author arjun
 *
 */
public abstract class JTableSwitchStmtImplementor {

	public abstract BiFuncOutset<?,?> performAnalysis(BiFuncInset<?,?> inset,JTableSwitchStmt stmt);
	
	public BiFuncFlowSet<?,?,?> performAnalysis(BiFuncFlowSet<?,?,?> inset,JTableSwitchStmt stmt){
		return inset.doAnalysis(stmt);
	}
}
