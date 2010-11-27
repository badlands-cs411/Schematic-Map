package schematicMap;
import java.awt.Color;
import java.awt.Point;
import java.util.LinkedList;


public class MapPoint extends MapObject {
	private Point coordinates;
	private LinkedList<MapSegment> adjacencies;
	
	public MapPoint(int x, int y, Color c) {
		init(x, y, c, null);
	}
	
	public MapPoint(int x, int y, Color c, MapSegment adj) {
		init(x, y, c, adj);
	}
	
	private void init(int x, int y, Color c, MapSegment adj) {
		adjacencies.add(adj);
		
		selected = true;
		
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
	
	public void addAdjacency(MapSegment seg) {
		adjacencies.add(seg);
	}
	
	public void removeAdjacency(MapSegment seg) {
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
	
}
