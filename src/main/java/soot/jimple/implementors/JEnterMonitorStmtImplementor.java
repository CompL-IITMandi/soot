/**
 * 
 */
package soot.jimple.implementors;

import soot.BiFuncFlowSet;
import soot.BiFuncInset;
import soot.BiFuncOutset;
import soot.jimple.internal.JBreakpointStmt;
import soot.jimple.internal.JEnterMonitorStmt;

/**
 * @author arjun
 *
 */
public abstract class JEnterMonitorStmtImplementor {

	public abstract BiFuncOutset<?,?> performAnalysis(BiFuncInset<?,?> inset,JEnterMonitorStmt stmt);
	
	public BiFuncFlowSet<?,?,?> performAnalysis(BiFuncFlowSet<?,?,?> inset,JEnterMonitorStmt stmt){
		return inset.doAnalysis(stmt);
	}
	
}
