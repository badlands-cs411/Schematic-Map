package schematicMap;
import java.awt.Color;
import java.awt.Point;
import java.util.LinkedList;


public class MapPoint extends MapObject implements Comparable {
	private Point coordinates;
	private LinkedList<MapSegment> adjacencies;
	
	protected double dijDistance;
	protected MapSegment dijPreviousHop;
	
	protected MapPoint(int x, int y, Color c) {
		init(x, y, c, null);
	}
	
	public boolean isPoint() {
		return true;
	}
	
	protected MapPoint(int x, int y, Color c, MapSegment adj) {
		init(x, y, c, adj);
	}
	
	private void init(int x, int y, Color c, MapSegment adj) {
		adjacencies = new LinkedList<MapSegment>();
		
		selected = false;
		
		coordinates = new Point(x, y);
		
		if (c != null) {
			color = c;
		}
		
		if (adj != null) {
			adjacencies.add(adj);
		}
	}
	
	public LinkedList<MapSegment> getAdjacencies() {
		return adjacencies;
	}
	
	protected void addAdjacency(MapSegment seg) {
		adjacencies.add(seg);
	}
	
	protected void removeAdjacency(MapSegment seg) {
		adjacencies.remove(seg);
	}
	
	public Point getCoordinates() {
		return coordinates;
	}
	
	public void setCoordinates(Point p) {
		coordinates = p;
	}
	
	public void setCoordinates(int x, int y) {
		coordinates = new Point(x,y);
	}
	
	public String toString() {
		String result =  "MapPoint (" + coordinates.x + ", " + coordinates.y + ") " + color.toString(); 
		
		if (selected) {
			result += " selected";
		}
		
		return result;
	}

	/*
	 * compareTo() - allows points to be sorted in a priority
	 *    queue in the implementation of Dijkstra's algorithm
	 *    
	 */
	public int compareTo(Object o) {
		MapPoint other = (MapPoint) o;
		if (this.dijDistance > other.dijDistance) {
			return 1;
		}
		
		if (this.dijDistance < other.dijDistance) {
			return -1;
		}
		
		return 0;
	}
	
}
