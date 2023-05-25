/**
 * 
 */
package soot.jimple.implementors;

import soot.Inset;
import soot.Outset;
import soot.jimple.internal.JBreakpointStmt;

/**
 * @author arjun
 *
 */
public abstract class JBreakpointStmtImplementor {

	public abstract Outset<?> performAnalysis(Inset<?> inset,JBreakpointStmt stmt);

}
