/**
 * 
 */
package soot.jimple.implementors;

import soot.Inset;
import soot.Outset;
import soot.jimple.internal.JExitMonitorStmt;

/**
 * @author arjun
 *
 */
public abstract class JExitMonitorStmtImplementor {

	public abstract Outset<?> performAnalysis(Inset<?> inset,JExitMonitorStmt stmt);

}
