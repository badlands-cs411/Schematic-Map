package schematicMap;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;

import javax.sound.sampled.Line;


public class MapSegment extends MapObject {
	private MapPoint[] endpoints;
	
	/*----------------------------------------
	 * PUBLICLY VISIBLE METHODS
	 * ---------------------------------------
	 */
	
	public Point[] getPoints() {
		Point[] result = new Point[2];
		
		result[0] = endpoints[0].getCoordinates();
		result[1] = endpoints[1].getCoordinates();
		
		return result;
	}
	
	/*----------------------------------------
	 * PROTECTED METHODS
	 * ---------------------------------------
	 */
	
	protected MapSegment(Color c, MapPoint pt1, MapPoint pt2) {
		init(c, pt1, pt2);
	}
	
	protected void init(Color c, MapPoint pt1, MapPoint pt2) {
		endpoints = new MapPoint[2];
		
		if (pt1 == null || pt2 == null) {
			throw new NullPointerException();
		}
		
		endpoints[0] = pt1;
		endpoints[1] = pt2;
	}
	
	
	protected MapPoint getOpposite(MapPoint pt) {
		if (endpoints[0] == pt) {
			return endpoints[1];
		}
		
		if (endpoints[1] == pt) {
			return endpoints[0];
		}
		
		return null;
	}
	
	protected double distanceTo(Point otherPoint) {
		Point myPoint1 = endpoints[0].getCoordinates();
		Point myPoint2 = endpoints[1].getCoordinates();
		
		Line2D.Double ln = new Line2D.Double(myPoint1, myPoint2);
		return ln.ptLineDist(otherPoint);
	}
	
	/*----------------------------------------
	 * PRIVATE METHODS
	 * ---------------------------------------
	 */
}
