/**
 * 
 */
package soot;

/**
 * @author arjun
 * @param <T>
 *
 */
public interface BiFuncOutset<T,K> {
	
	public T getFlowSet();
	
	public void setFlowSet(T flowset);
	
	public void updateFlowSet(K element);
}
