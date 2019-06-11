import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;


enum Route
	{
		GRASS, DESERT, WATER, CAVE, 
	};

	public class Map extends JFrame{

	JLabel CurrentMap;
	
	/*
	 * KEY: 
	 * 0 is Border
	 * 1 is Normal
	 * 2 is Tall Grass
	 * 3 is North Faced Ledge
	 * 4 is West Facing Ledge
	 * 5 is South Facing Ledge
	 * 6 is East Facing Ledge
	 * 7 is trigger
	 * 
	*/
	
	int[][] Route1 = {   {0,0,0,0,0},
	                     {0,1,1,2,0},
	                     {0,1,2,2,0},
	                     {0,1,2,2,0},
	                     {0,0,0,0,0}
	};            
	
	
	
	void MakeTrainerArray() {
		int i = 0;
		int j = 0;
		for (i = 0; i < Route1.length; i++) {
			  for (j = 0; j < Route1[i].length; j++) {
			    }
			  }
		int[][] Route1T = new int[i][j];
		for (int[] row: Route1T)
		    Arrays.fill(row, 0);
		for (int x = 0; x < Route1T.length; x++) {
			  for (int z = 0; z < Route1T[x].length; z++) {
			    System.out.print(Route1T[x][z]);
			    if (z != Route1T[x].length - 1) {
			      System.out.print(",");
			    }
			  }
			  System.out.println();
			}
		}
	
	
	Route R1 = Route.GRASS;
	
	public void DrawMap() {
		MakeTrainerArray();
		JFrame f = new JFrame("Map");
	    f.setSize(250, 250);
	    f.setLocation(300,200);
	    final JTextArea textArea = new JTextArea(10, 40);
	    f.getContentPane().add(BorderLayout.CENTER, textArea);
	    CurrentMap = new JLabel(Arrays.deepToString(Route1).replace("], ", "]\n"));
	    add(CurrentMap);
	    /*final JButton button = new JButton("Click Me");
	    f.getContentPane().add(BorderLayout.SOUTH, button);
	    button.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            textArea.append("Button was clicked\n");

	        }
	    });*/

	    f.setVisible(true);
	}
	
	
}
