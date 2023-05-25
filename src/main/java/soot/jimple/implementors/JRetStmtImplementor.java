/**
 * 
 */
package soot.jimple.implementors;

import soot.Inset;
import soot.Outset;
import soot.jimple.internal.JRetStmt;

/**
 * @author arjun
 *
 */
public abstract class JRetStmtImplementor {

	public abstract Outset<?> performAnalysis(Inset<?> inset,JRetStmt stmt);

}
