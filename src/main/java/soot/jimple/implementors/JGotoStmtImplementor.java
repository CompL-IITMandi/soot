/**
 * 
 */
package soot.jimple.implementors;

import soot.Inset;
import soot.Outset;
import soot.jimple.internal.JGotoStmt;

/**
 * @author arjun
 *
 */
public abstract class JGotoStmtImplementor {

	public abstract Outset<?> performAnalysis(Inset<?> inset,JGotoStmt stmt);

}
