/**
 * 
 */
package soot;

/**
 * @author arjun
 * @param <T>
 *
 */
public interface BiFuncFlowSet<T,K> {
	
	public T getFlowSet();
	
	public void setFlowSet(T flowset);
	
	public void updateFlowSet(K element);
	
	public void addToFlowSet(K element);
	
	public PointsToAnalysis getP2Set();
	
	public void getP2Set(PointsToAnalysis p2Set);
	
}
