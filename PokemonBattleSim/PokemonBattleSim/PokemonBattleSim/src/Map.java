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
	Route R1 = Route.GRASS;
	
	//String Maps = (Arrays.deepToString(Route1).replace("], ", "]\n"));
	
	public void DrawMap() {
		JFrame f = new JFrame("Map");
	    f.setSize(250, 250);
	    f.setLocation(300,200);
	    final JTextArea textArea = new JTextArea(60, 40);
	    textArea.append(Arrays.deepToString(Route1).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
	    textArea.setEditable(false);
	    f.getContentPane().add(BorderLayout.CENTER, textArea);
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
