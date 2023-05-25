/**
 * 
 */
package soot.jimple.implementors;

import soot.Inset;
import soot.Outset;
import soot.jimple.internal.JReturnStmt;

/**
 * @author arjun
 *
 */
public abstract class JReturnStmtImplementor {

	public abstract Outset<?> performAnalysis(Inset<?> inset,JReturnStmt stmt);

}
