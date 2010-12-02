package testing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import schematicMap.*;

public class GraphicalMap extends Canvas {
	
	private static final long serialVersionUID = 1L;
	SchematicMap map;
	int width;
	int height;
	
	public GraphicalMap(SchematicMap _map) {
		width = 640;
		height = 480;
		
		map = _map;
	}
	
	public void update(Graphics g) {
		paint(g);
	}
	
	public void paint(Graphics g) {
		updateMap(g);
	}
	
	public void updateMap(Graphics graphics) {
		
		MapObject[] state = map.getMapState();
		
		for (MapObject curObj : state) {
			
			if (curObj.isPoint()) {
				MapPoint curPoint = (MapPoint) curObj;
				Point coords = curPoint.getCoordinates();
				
				graphics.setColor(curPoint.getColor());
				graphics.drawOval(coords.x, coords.y, 5, 5);
			}
			
			else if (curObj.isSegment()) {
				MapSegment curSeg = (MapSegment) curObj;
				Point[] coords = curSeg.getPoints();
				
				graphics.setColor(curSeg.getColor());

				graphics.drawLine(coords[0].x, coords[0].y, coords[1].x, coords[1].y);
			}
		}		
	}
}