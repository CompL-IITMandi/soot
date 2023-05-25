/**
 * 
 */
package soot;

/**
 * @author arjun
 * @param <T>
 *
 */
public interface BiFuncInset<T,K> {
	
	public T getFlowSet();
	
	public void setFlowSet(T flowset);
	
	public void updateFlowSet(K element);
}
