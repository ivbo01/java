package prak2_2;

public class Ball {
  private double x;
  private double y;

	public Ball(double inputX, double inputY) {
		this.x = inputX;
		this.y = inputY;
	}

    public Ball() {
    }

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
        return y;
    }

	public void setY(double y) {
        this.y = y;
    }

	public void setXY(double x, double y) {
		this.x = x;
        this.y = y;
	}
	
    public void move(double xdisp, double ydisp){
        this.x += x;
        this.y += y;
    }

	@Override
	public String toString () {
		return "x = " + this.x + ", y = " + this.y;
	}
}