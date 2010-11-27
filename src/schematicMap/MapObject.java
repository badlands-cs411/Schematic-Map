package schematicMap;
import java.awt.Color;

public abstract class MapObject {
	public MapObject(){};
	protected boolean selected;
	protected Color color;
	
	public Color getColor() {
		return null;
	}
	
	public void setColor(Color c) {
		color = c;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public void select() {
		selected = true;
	}
	
	public void deselect() {
		selected = false;
	}
}
