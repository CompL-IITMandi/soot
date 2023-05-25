/**
 * 
 */
package soot;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

/**
 * @author arjun
 * @param <T>
 *
 */
public abstract class Outset<T> {
	
	protected Vector<T> outputVector;
	protected List<T> outputList;
	protected Map<T,T> outputMap;
	protected Set<T> outputSet;
	
	public Vector<T> getOutputVector() {
		return outputVector;
	}
	
	public void setOutputVector(Vector<T> outputVector) {
		this.outputVector = outputVector;
	}
	
	public List<T> getOutputList() {
		return outputList;
	}
	
	public void setOutputList(List<T> outputList) {
		this.outputList = outputList;
	}
	
	public Map<T, T> getOutputMap() {
		return outputMap;
	}
	
	public void setOutputMap(Map<T, T> outputMap) {
		this.outputMap = outputMap;
	}
	
	public Set<T> getOutputSet() {
		return outputSet;
	}
	
	public void setOutputSet(Set<T> outputSet) {
		this.outputSet = outputSet;
	}
	
}
