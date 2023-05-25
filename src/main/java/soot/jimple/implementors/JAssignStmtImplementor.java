/**
 * 
 */
package soot.jimple.implementors;

import soot.Inset;
import soot.Outset;
import soot.jimple.internal.JAssignStmt;

/**
 * @author arjun
 *
 */
public abstract class JAssignStmtImplementor {

	public abstract Outset<?> performAnalysis(Inset<?> inset,JAssignStmt stmt);

}
