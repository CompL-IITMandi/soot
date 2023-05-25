/**
 * 
 */
package soot.jimple.implementors;

import soot.Inset;
import soot.Outset;
import soot.jimple.internal.JLookupSwitchStmt;

/**
 * @author arjun
 *
 */
public abstract class JLookupSwitchStmtImplementor {

	public abstract Outset<?> performAnalysis(Inset<?> inset,JLookupSwitchStmt stmt);

}
