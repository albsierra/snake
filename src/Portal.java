import java.awt.Point;
import java.util.Random;


public class Portal {
	private int nature; //-1 for snake , +1 for ladder
    private int start;
    private int end;
    
    public Portal(int maxCells){   //creates random portals
        Random luck = new Random();
        start = luck.nextInt(maxCells);
        end = luck.nextInt(maxCells);
        if(start < end)
        	nature = 1;
        else nature = -1;
    }
    
    public int returnNature(){
    	return nature;
    }
    
    public int returnStart(){
    	return start;
    }
    
    public int returnEnd(){
    	return end;
    }
    
}
