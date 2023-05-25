/**
 * 
 */
package soot.jimple.implementors;

import soot.BiFuncFlowSet;
import soot.BiFuncInset;
import soot.BiFuncOutset;
import soot.jimple.internal.JExitMonitorStmt;

/**
 * @author arjun
 *
 */
public abstract class JExitMonitorStmtImplementor {

	public abstract BiFuncOutset<?,?> performAnalysis(BiFuncInset<?,?> inset,JExitMonitorStmt stmt);
	
	public abstract BiFuncFlowSet<?,?> performAnalysis(BiFuncFlowSet<?,?> inset,JExitMonitorStmt stmt);

}
