/**
 * 
 */
package soot.jimple.implementors;

import soot.Inset;
import soot.Outset;
import soot.jimple.internal.JIfStmt;

/**
 * @author arjun
 *
 */
public abstract class JIfStmtImplementor {

	public abstract Outset<?> performAnalysis(Inset<?> inset,JIfStmt stmt);

}
