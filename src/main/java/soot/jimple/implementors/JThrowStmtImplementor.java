/**
 * 
 */
package soot.jimple.implementors;

import soot.Inset;
import soot.Outset;
import soot.jimple.internal.JThrowStmt;

/**
 * @author arjun
 *
 */
public abstract class JThrowStmtImplementor {

	public abstract Outset<?> performAnalysis(Inset<?> inset,JThrowStmt stmt);

}
