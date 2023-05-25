/**
 * 
 */
package soot.jimple.implementors;

import soot.BiFuncFlowSet;
import soot.BiFuncInset;
import soot.BiFuncOutset;
import soot.jimple.internal.JIfStmt;

/**
 * @author arjun
 *
 */
public abstract class JIfStmtImplementor {

	public abstract BiFuncOutset<?,?> performAnalysis(BiFuncInset<?,?> inset,JIfStmt stmt);
	
	public abstract BiFuncFlowSet<?,?> performAnalysis(BiFuncFlowSet<?,?> inset,JIfStmt stmt);

}
