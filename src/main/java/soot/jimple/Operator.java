/**
 * 
 */
package soot.jimple;

import soot.jimple.implementors.JAssignStmtImplementor;
import soot.jimple.implementors.JBreakpointStmtImplementor;
import soot.jimple.implementors.JEnterMonitorStmtImplementor;
import soot.jimple.implementors.JExitMonitorStmtImplementor;
import soot.jimple.implementors.JGotoStmtImplementor;
import soot.jimple.implementors.JIdentityStmtImplementor;
import soot.jimple.implementors.JIfStmtImplementor;
import soot.jimple.implementors.JInvokeStmtImplementor;
import soot.jimple.implementors.JLookupSwitchStmtImplementor;
import soot.jimple.implementors.JNopStmtImplementor;
import soot.jimple.implementors.JRetStmtImplementor;
import soot.jimple.implementors.JReturnStmtImplementor;
import soot.jimple.implementors.JReturnVoidStmtImplementor;
import soot.jimple.implementors.JTableSwitchStmtImplementor;
import soot.jimple.implementors.JThrowStmtImplementor;

/**
 * @author arjun
 *
 */
public final class Operator {
	
	private JAssignStmtImplementor assignmentOperator;
	private JBreakpointStmtImplementor breakPointOperator;
	private JIdentityStmtImplementor identityOperator;
	private JIfStmtImplementor ifStmtOperator;
	private JInvokeStmtImplementor invokeOperator;
	private JGotoStmtImplementor gotoStmt;
	private JLookupSwitchStmtImplementor lookupSwitchStmtOperator;
	private JExitMonitorStmtImplementor exitMonitorStmtOperator;
	private JEnterMonitorStmtImplementor enterMonitorStmtOperator;
	private JNopStmtImplementor nopStmtOperator;
	private JRetStmtImplementor retStmtOperator;
	private JReturnStmtImplementor returnStmtOperator;
	private JReturnVoidStmtImplementor returnVoidStmtOperator;
	private JTableSwitchStmtImplementor tableSwitchStmtOperator;
	private	JThrowStmtImplementor throwStmtOperator;
	/**
	 * @param assignmentOperator
	 * @param breakPointOperator
	 * @param identityOperator
	 * @param ifStmtOperator
	 * @param invokeOperator
	 * @param gotoStmt
	 * @param lookupSwitchStmtOperator
	 * @param exitMonitorStmtOperator
	 * @param enterMonitorStmtOperator
	 * @param jNopStmtOperator
	 * @param retStmtOperator
	 * @param returnStmtOperator
	 * @param returnVoidStmtOperator
	 * @param tableSwitchStmtOperator
	 * @param throwStmtOperator
	 */
	public Operator(JAssignStmtImplementor assignmentOperator, JBreakpointStmtImplementor breakPointOperator,
			JIdentityStmtImplementor identityOperator, JIfStmtImplementor ifStmtOperator,
			JInvokeStmtImplementor invokeOperator, JGotoStmtImplementor gotoStmt,
			JLookupSwitchStmtImplementor lookupSwitchStmtOperator, JExitMonitorStmtImplementor exitMonitorStmtOperator,
			JEnterMonitorStmtImplementor enterMonitorStmtOperator, JNopStmtImplementor nopStmtOperator,
			JRetStmtImplementor retStmtOperator, JReturnStmtImplementor returnStmtOperator,
			JReturnVoidStmtImplementor returnVoidStmtOperator, JTableSwitchStmtImplementor tableSwitchStmtOperator,
			JThrowStmtImplementor throwStmtOperator) {
		this.assignmentOperator = assignmentOperator;
		this.breakPointOperator = breakPointOperator;
		this.identityOperator = identityOperator;
		this.ifStmtOperator = ifStmtOperator;
		this.invokeOperator = invokeOperator;
		this.gotoStmt = gotoStmt;
		this.lookupSwitchStmtOperator = lookupSwitchStmtOperator;
		this.exitMonitorStmtOperator = exitMonitorStmtOperator;
		this.enterMonitorStmtOperator = enterMonitorStmtOperator;
		this.nopStmtOperator = nopStmtOperator;
		this.retStmtOperator = retStmtOperator;
		this.returnStmtOperator = returnStmtOperator;
		this.returnVoidStmtOperator = returnVoidStmtOperator;
		this.tableSwitchStmtOperator = tableSwitchStmtOperator;
		this.throwStmtOperator = throwStmtOperator;
	}
	
	/**
	 * 
	 */
	public Operator() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the assignmentOperator
	 */
	public JAssignStmtImplementor getAssignmentOperator() {
		return assignmentOperator;
	}
	/**
	 * @param assignmentOperator the assignmentOperator to set
	 */
	public void setAssignmentOperator(JAssignStmtImplementor assignmentOperator) {
		this.assignmentOperator = assignmentOperator;
	}
	/**
	 * @return the breakPointOperator
	 */
	public JBreakpointStmtImplementor getBreakPointOperator() {
		return breakPointOperator;
	}
	/**
	 * @param breakPointOperator the breakPointOperator to set
	 */
	public void setBreakPointOperator(JBreakpointStmtImplementor breakPointOperator) {
		this.breakPointOperator = breakPointOperator;
	}
	/**
	 * @return the identityOperator
	 */
	public JIdentityStmtImplementor getIdentityOperator() {
		return identityOperator;
	}
	/**
	 * @param identityOperator the identityOperator to set
	 */
	public void setIdentityOperator(JIdentityStmtImplementor identityOperator) {
		this.identityOperator = identityOperator;
	}
	/**
	 * @return the ifStmtOperator
	 */
	public JIfStmtImplementor getIfStmtOperator() {
		return ifStmtOperator;
	}
	/**
	 * @param ifStmtOperator the ifStmtOperator to set
	 */
	public void setIfStmtOperator(JIfStmtImplementor ifStmtOperator) {
		this.ifStmtOperator = ifStmtOperator;
	}
	/**
	 * @return the invokeOperator
	 */
	public JInvokeStmtImplementor getInvokeOperator() {
		return invokeOperator;
	}
	/**
	 * @param invokeOperator the invokeOperator to set
	 */
	public void setInvokeOperator(JInvokeStmtImplementor invokeOperator) {
		this.invokeOperator = invokeOperator;
	}
	/**
	 * @return the gotoStmt
	 */
	public JGotoStmtImplementor getGotoStmtOperator() {
		return gotoStmt;
	}
	/**
	 * @param gotoStmt the gotoStmt to set
	 */
	public void setGotoStmtOperator(JGotoStmtImplementor gotoStmt) {
		this.gotoStmt = gotoStmt;
	}
	/**
	 * @return the lookupSwitchStmtOperator
	 */
	public JLookupSwitchStmtImplementor getLookupSwitchStmtOperator() {
		return lookupSwitchStmtOperator;
	}
	/**
	 * @param lookupSwitchStmtOperator the lookupSwitchStmtOperator to set
	 */
	public void setLookupSwitchStmtOperator(JLookupSwitchStmtImplementor lookupSwitchStmtOperator) {
		this.lookupSwitchStmtOperator = lookupSwitchStmtOperator;
	}
	/**
	 * @return the exitMonitorStmtOperator
	 */
	public JExitMonitorStmtImplementor getExitMonitorStmtOperator() {
		return exitMonitorStmtOperator;
	}
	/**
	 * @param exitMonitorStmtOperator the exitMonitorStmtOperator to set
	 */
	public void setExitMonitorStmtOperator(JExitMonitorStmtImplementor exitMonitorStmtOperator) {
		this.exitMonitorStmtOperator = exitMonitorStmtOperator;
	}
	/**
	 * @return the enterMonitorStmtOperator
	 */
	public JEnterMonitorStmtImplementor getEnterMonitorStmtOperator() {
		return enterMonitorStmtOperator;
	}
	/**
	 * @param enterMonitorStmtOperator the enterMonitorStmtOperator to set
	 */
	public void setEnterMonitorStmtOperator(JEnterMonitorStmtImplementor enterMonitorStmtOperator) {
		this.enterMonitorStmtOperator = enterMonitorStmtOperator;
	}
	/**
	 * @return the jNopStmtOperator
	 */
	public JNopStmtImplementor getNopStmtOperator() {
		return nopStmtOperator;
	}
	/**
	 * @param jNopStmtOperator the jNopStmtOperator to set
	 */
	public void setNopStmtOperator(JNopStmtImplementor jNopStmtOperator) {
		nopStmtOperator = jNopStmtOperator;
	}
	/**
	 * @return the retStmtOperator
	 */
	public JRetStmtImplementor getRetStmtOperator() {
		return retStmtOperator;
	}
	/**
	 * @param retStmtOperator the retStmtOperator to set
	 */
	public void setRetStmtOperator(JRetStmtImplementor retStmtOperator) {
		this.retStmtOperator = retStmtOperator;
	}
	/**
	 * @return the returnStmtOperator
	 */
	public JReturnStmtImplementor getReturnStmtOperator() {
		return returnStmtOperator;
	}
	/**
	 * @param returnStmtOperator the returnStmtOperator to set
	 */
	public void setReturnStmtOperator(JReturnStmtImplementor returnStmtOperator) {
		this.returnStmtOperator = returnStmtOperator;
	}
	/**
	 * @return the returnVoidStmtOperator
	 */
	public JReturnVoidStmtImplementor getReturnVoidStmtOperator() {
		return returnVoidStmtOperator;
	}
	/**
	 * @param returnVoidStmtOperator the returnVoidStmtOperator to set
	 */
	public void setReturnVoidStmtOperator(JReturnVoidStmtImplementor returnVoidStmtOperator) {
		this.returnVoidStmtOperator = returnVoidStmtOperator;
	}
	/**
	 * @return the tableSwitchStmtOperator
	 */
	public JTableSwitchStmtImplementor getTableSwitchStmtOperator() {
		return tableSwitchStmtOperator;
	}
	/**
	 * @param tableSwitchStmtOperator the tableSwitchStmtOperator to set
	 */
	public void setTableSwitchStmtOperator(JTableSwitchStmtImplementor tableSwitchStmtOperator) {
		this.tableSwitchStmtOperator = tableSwitchStmtOperator;
	}
	/**
	 * @return the throwStmtOperator
	 */
	public JThrowStmtImplementor getThrowStmtOperator() {
		return throwStmtOperator;
	}
	/**
	 * @param throwStmtOperator the throwStmtOperator to set
	 */
	public void setThrowStmtOperator(JThrowStmtImplementor throwStmtOperator) {
		this.throwStmtOperator = throwStmtOperator;
	}
	
}
