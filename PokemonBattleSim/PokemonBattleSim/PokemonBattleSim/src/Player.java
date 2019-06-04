import java.awt.event.*;
import java.util.concurrent.TimeUnit;

public class Player {

	Encounter E = new Encounter();
	Map map = new Map();
	int PosX = 1;
	int PosY = 1; 
	
	public void keyPressed(KeyEvent e) throws InterruptedException{
        int KeyCode = e.getKeyCode();
        if(KeyCode == KeyEvent.VK_W){
            if (map.Route1[PosX][PosY--] != 0 || map.Route1[PosX][PosY--] != 4 || map.Route1[PosX][PosY--] != 5 || map.Route1[PosX][PosY--] != 6) {
            	if (map.Route1[PosX][PosY--] == 2) {
            		E.encounter();
            		PosY--;
            	}
            	PosY--;
            	map.DrawMap();
            }
            TimeUnit.SECONDS.sleep(1);
        }
        if(KeyCode == KeyEvent.VK_S){
        	if (map.Route1[PosX][PosY++] != 0 || map.Route1[PosX][PosY++] != 3 || map.Route1[PosX][PosY++] != 5 || map.Route1[PosX][PosY++] != 6) {
        		if (map.Route1[PosX][PosY++] == 2) {
            		E.encounter();
            		PosY++;
            	}
        		PosY++;
        		map.DrawMap();
            }
            TimeUnit.SECONDS.sleep(1);
        }
        if(KeyCode == KeyEvent.VK_A){
        	if (map.Route1[PosX--][PosY] != 0 || map.Route1[PosX--][PosY] != 4 || map.Route1[PosX--][PosY] != 5 || map.Route1[PosX--][PosY] != 3) {
        		if (map.Route1[PosX--][PosY] == 2) {
            		E.encounter();
            		PosX--;
            	}
        		PosX--;
        		map.DrawMap();
            }
            TimeUnit.SECONDS.sleep(1);
       	 
        }
        if(KeyCode == KeyEvent.VK_D){
        	if (map.Route1[PosX++][PosY] != 0 || map.Route1[PosX++][PosY] != 4 || map.Route1[PosX++][PosY] != 5 || map.Route1[PosX++][PosY] != 6) {
        		if (map.Route1[PosX--][PosY] == 2) {
            		E.encounter();
            		PosX++;
            	}
        		PosX++;
        		map.DrawMap();
            }
            TimeUnit.SECONDS.sleep(1);
        } 


     }
   }
    