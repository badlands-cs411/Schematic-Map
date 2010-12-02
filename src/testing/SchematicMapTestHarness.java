package testing;
import java.util.concurrent.*;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import schematicMap.*;

public class SchematicMapTestHarness extends JFrame {
	GraphicalMap graph;
	SchematicMap map;

	public static void main(String[] args) {
		(new SchematicMapTestHarness()).runTest();
	}
	
	public SchematicMapTestHarness() {
		super("Test Harness");
		
		map = new SchematicMap();
		graph = new GraphicalMap(map);

		addWindowListener( new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		} );

		setSize(640, 480);

		add(graph, "Center");

		//setVisible(true);
	}
	
	public void runTest() {
		
		/*
		 * ----------------------------------
		 * TEST 1
		 * ----------------------------------
		 * 
		 */
		map.addPoint(100, 100, Color.red);
		
		map.addPoint(100, 150, Color.green);
		
		map.connectPoints(100, 100, 100, 150, Color.blue);
		
		MapObject[] state = map.getMapState();
		
		for (MapObject obj : state) {
			System.out.println(obj.toString());
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		/*
		 * ----------------------------------
		 * TEST 2
		 * ----------------------------------
		 * 
		 */
		
		map.selectPoint(100, 100);
		map.removeSelection();
		
		
		System.out.println("\n\n\n");
		
		state = map.getMapState();
		
		for (MapObject obj : state) {
			System.out.println(obj.toString());
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		/*
		 * ----------------------------------
		 * TEST 3
		 * ----------------------------------
		 * 
		 */
		
		map.addPoint(320, 300, Color.green);
		map.connectPoints(100, 150, 320, 300, Color.cyan);
		
		map.addPoint(400, 540, Color.DARK_GRAY);
		map.connectPoints(320, 300, 400, 540, Color.black);
		
		map.connectPoints(320, 300, 100, 150, Color.blue);
		
		System.out.println("\n\n\n");
		
		state = map.getMapState();
		
		for (MapObject obj : state) {
			System.out.println(obj.toString());
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		/*
		 * ----------------------------------
		 * TEST 4
		 * ----------------------------------
		 * 
		 */
		
		map.selectPoint(100, 150);
		map.updateSelectionLoc(-30, -50);
		
		System.out.println("\n\n\n");
		
		state = map.getMapState();
		
		for (MapObject obj : state) {
			System.out.println(obj.toString());
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		/*
		 * ----------------------------------
		 * TEST 5
		 * ----------------------------------
		 * 
		 */
		
		map.deselectAll();
		map.selectSeries(70, 100, 400, 540);
		
		System.out.println("\n\n\n");
		
		state = map.getMapState();
		
		for (MapObject obj : state) {
			System.out.println(obj.toString());
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
