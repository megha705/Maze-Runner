package cells.walls.types;

import cells.walls.Wall;
import javafx.scene.image.Image;

public class Tree extends Wall {
	
    private static final Image IMAGE = new Image("assets/img/tree.png");

    public Tree() {
        super(true, 0, 0);
        super.cellImage = IMAGE;
    }
    
    @Override
	public void load(Image image) {
    	if(image != null)
    		super.cellImage = image;
	}
}
