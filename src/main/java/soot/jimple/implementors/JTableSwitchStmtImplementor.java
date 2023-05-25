/**
 * 
 */
package soot.jimple.implementors;

import soot.Inset;
import soot.Outset;
import soot.jimple.internal.JTableSwitchStmt;

/**
 * @author arjun
 *
 */
public abstract class JTableSwitchStmtImplementor {

	public abstract Outset<?> performAnalysis(Inset<?> inset,JTableSwitchStmt stmt);

}
