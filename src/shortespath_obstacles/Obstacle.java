package shortespath_obstacles;

public class Obstacle {
	
	private Point a, b, c;

	public Obstacle(Point a, Point b, Point c){
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Obstacle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
}
