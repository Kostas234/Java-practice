import java.awt.Point;

class FourDPoint extends Point{

	int i,j;

	FourDPoint(int x, int y, int z, int w){
		super(x,y);
		i=z;
		j=w;
	}

	public static void main(String[] args){
		FourDPoint fd = new FourDPoint(1,2,3,4);
		System.out.println("x: "+fd.x+"\ny: "+fd.y+"\nz: "+fd.i+"\nw: "+fd.j);
	}
}


