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
	
	public void addToFlowSet(K element);
	
	public PointsToAnalysis getP2Set();
	
	public void setP2Set(PointsToAnalysis p2Set);
}
