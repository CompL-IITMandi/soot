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
public abstract class Inset<T> {
	
	protected Vector<T> inputVector;
	protected List<T> inputList;
	protected Map<T,T> inputMap;
	protected Set<T> inputSet;
	
	public Vector<T> getInputVector() {
		return inputVector;
	}
	
	public void setInputVector(Vector<T> inputVector) {
		this.inputVector = inputVector;
	}
	
	public List<T> getInputList() {
		return inputList;
	}
	
	public void setInputList(List<T> inputList) {
		this.inputList = inputList;
	}
	
	public Map<T, T> getInputMap() {
		return inputMap;
	}
	
	public void setInputMap(Map<T, T> inputMap) {
		this.inputMap = inputMap;
	}
	
	public Set<T> getInputSet() {
		return inputSet;
	}
	
	public void setInputSet(Set<T> inputSet) {
		this.inputSet = inputSet;
	}
	
}
