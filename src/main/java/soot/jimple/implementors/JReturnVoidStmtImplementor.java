/**
 * 
 */
package soot.jimple.implementors;

import soot.Inset;
import soot.Outset;
import soot.jimple.internal.JReturnVoidStmt;

/**
 * @author arjun
 *
 */
public abstract class JReturnVoidStmtImplementor {

	public abstract Outset<?> performAnalysis(Inset<?> inset,JReturnVoidStmt stmt);

}
