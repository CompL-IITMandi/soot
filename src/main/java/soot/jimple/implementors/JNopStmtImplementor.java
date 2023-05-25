/**
 * 
 */
package soot.jimple.implementors;

import soot.Inset;
import soot.Outset;
import soot.jimple.internal.JNopStmt;

/**
 * @author arjun
 *
 */
public abstract class JNopStmtImplementor {

	public abstract Outset<?> performAnalysis(Inset<?> inset,JNopStmt stmt);

}
