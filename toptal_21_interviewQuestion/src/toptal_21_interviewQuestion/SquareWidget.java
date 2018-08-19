package toptal_21_interviewQuestion;

public class SquareWidget extends Widget {
	
	private final  int  size; 

	public SquareWidget(int size) {
	   this.size = size;
	}
	@Override
	public int width() {
		
		return size;
	}

	@Override
	public int height() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public static void main(String[] args) {
	   Widget  squareWidget = new SquareWidget(5);
		  System.out.println( squareWidget.width());

	}


}

/*Now we’ve introduced a subtle bug: Widget.cachedWidth and Widget.cachedHeight will always be zero for SquareWidget instances! This is because the this.size = size assignment occurs after the Widget constructor runs.

Avoid calling abstract methods in your abstract classes’ constructors, as it restricts how those abstract methods can be implemented.*/
