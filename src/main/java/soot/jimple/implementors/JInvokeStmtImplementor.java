/**
 * 
 */
package soot.jimple.implementors;

import soot.Inset;
import soot.Outset;
import soot.jimple.internal.JInvokeStmt;

/**
 * @author arjun
 *
 */
public abstract class JInvokeStmtImplementor {

	public abstract Outset<?> performAnalysis(Inset<?> inset,JInvokeStmt stmt);

}
