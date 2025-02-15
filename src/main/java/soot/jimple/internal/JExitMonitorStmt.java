package soot.jimple.internal;

/*-
 * #%L
 * Soot - a J*va Optimization Framework
 * %%
 * Copyright (C) 1999 Patrick Lam
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */

import java.util.List;

import soot.BiFuncFlowSet;
import soot.BiFuncInset;
import soot.BiFuncOutset;
import soot.Unit;
import soot.UnitPrinter;
import soot.Value;
import soot.ValueBox;
import soot.baf.Baf;
import soot.jimple.ConvertToBaf;
import soot.jimple.ExitMonitorStmt;
import soot.jimple.Jimple;
import soot.jimple.JimpleToBafContext;
import soot.jimple.Operator;
import soot.jimple.StmtSwitch;
import soot.util.Switch;

public class JExitMonitorStmt extends AbstractOpStmt implements ExitMonitorStmt {

  public JExitMonitorStmt(Value op) {
    this(Jimple.v().newImmediateBox(op));
  }

  protected JExitMonitorStmt(ValueBox opBox) {
    super(opBox);
  }

  @Override
  public Object clone() {
    return new JExitMonitorStmt(Jimple.cloneIfNecessary(getOp()));
  }

  @Override
  public String toString() {
    return Jimple.EXITMONITOR + " " + opBox.getValue().toString();
  }

  @Override
  public void toString(UnitPrinter up) {
    up.literal(Jimple.EXITMONITOR + " ");
    opBox.toString(up);
  }

  @Override
  public void apply(Switch sw) {
    ((StmtSwitch) sw).caseExitMonitorStmt(this);

  }

  @Override
  public void convertToBaf(JimpleToBafContext context, List<Unit> out) {
    ((ConvertToBaf) (getOp())).convertToBaf(context, out);

    Unit u = Baf.v().newExitMonitorInst();
    u.addAllTagsOf(this);
    out.add(u);
  }

  @Override
  public boolean fallsThrough() {
    return true;
  }

  @Override
  public boolean branches() {
    return false;
  }
  
  @Override
  public BiFuncOutset<?,?> performAnalysis(BiFuncInset<?,?> inset,Operator operator) {
	  if(null!=operator && null!=operator.getExitMonitorStmtOperator()) {
		  return operator.getExitMonitorStmtOperator().performAnalysis(inset, this);
	  }
	  return null;
  }
  
  @Override
  public BiFuncFlowSet<?,?,?> performAnalysis(BiFuncFlowSet<?,?,?> flowset,Operator operator) {
	  if(null!=operator && null!=operator.getExitMonitorStmtOperator()) {
		  return operator.getExitMonitorStmtOperator().performAnalysis(flowset, this);
	  }
	  return null;
  }
}
