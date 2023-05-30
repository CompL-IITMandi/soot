/**
 * 
 */
package soot;

import soot.jimple.internal.JAssignStmt;
import soot.jimple.internal.JBreakpointStmt;
import soot.jimple.internal.JEnterMonitorStmt;
import soot.jimple.internal.JExitMonitorStmt;
import soot.jimple.internal.JGotoStmt;
import soot.jimple.internal.JIdentityStmt;
import soot.jimple.internal.JIfStmt;
import soot.jimple.internal.JInvokeStmt;
import soot.jimple.internal.JLookupSwitchStmt;
import soot.jimple.internal.JNopStmt;
import soot.jimple.internal.JRetStmt;
import soot.jimple.internal.JReturnStmt;
import soot.jimple.internal.JReturnVoidStmt;
import soot.jimple.internal.JTableSwitchStmt;
import soot.jimple.internal.JThrowStmt;

/**
 * @author arjun
 * @param <T>
 *
 */
public interface BiFuncFlowSet<T,K,A> {
	
	public T getFlowSet();
	
	public void setFlowSet(T flowset);
	
	public A getAuxilliaryObject();
	
	public void setAuxilliaryObject(A auxObject);
	
	public PointsToAnalysis getP2Set();
	
	public void setP2Set(PointsToAnalysis p2Set);

	public BiFuncFlowSet<?, ?, ?> doAnalysis(JAssignStmt stmt);

	public BiFuncFlowSet<?, ?, ?> doAnalysis(JBreakpointStmt stmt);

	public BiFuncFlowSet<?, ?, ?> doAnalysis(JEnterMonitorStmt stmt);

	public BiFuncFlowSet<?, ?, ?> doAnalysis(JExitMonitorStmt stmt);
	
	public BiFuncFlowSet<?, ?, ?> doAnalysis(JGotoStmt stmt);

	public BiFuncFlowSet<?, ?, ?> doAnalysis(JIdentityStmt stmt);

	public BiFuncFlowSet<?, ?, ?> doAnalysis(JIfStmt stmt);

	public BiFuncFlowSet<?, ?, ?> doAnalysis(JInvokeStmt stmt);

	public BiFuncFlowSet<?, ?, ?> doAnalysis(JLookupSwitchStmt stmt);

	public BiFuncFlowSet<?, ?, ?> doAnalysis(JNopStmt stmt);

	public BiFuncFlowSet<?, ?, ?> doAnalysis(JRetStmt stmt);

	public BiFuncFlowSet<?, ?, ?> doAnalysis(JReturnStmt stmt);

	public BiFuncFlowSet<?, ?, ?> doAnalysis(JReturnVoidStmt stmt);

	public BiFuncFlowSet<?, ?, ?> doAnalysis(JTableSwitchStmt stmt);

	public BiFuncFlowSet<?, ?, ?> doAnalysis(JThrowStmt stmt);
	
}
