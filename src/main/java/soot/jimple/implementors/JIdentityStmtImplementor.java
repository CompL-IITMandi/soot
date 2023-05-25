/**
 * 
 */
package soot.jimple.implementors;

import soot.Inset;
import soot.Outset;
import soot.jimple.internal.JIdentityStmt;

/**
 * @author arjun
 *
 */
public abstract class JIdentityStmtImplementor {

	public abstract Outset<?> performAnalysis(Inset<?> inset,JIdentityStmt stmt);

}
