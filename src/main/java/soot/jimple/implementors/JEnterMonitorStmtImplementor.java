/**
 * 
 */
package soot.jimple.implementors;

import soot.Inset;
import soot.Outset;
import soot.jimple.internal.JEnterMonitorStmt;

/**
 * @author arjun
 *
 */
public abstract class JEnterMonitorStmtImplementor {

	public abstract Outset<?> performAnalysis(Inset<?> inset,JEnterMonitorStmt stmt);

}
