package toptal_21_interviewQuestion;

public abstract class Widget {
	private final int cachedWidth;
	private final int cachedHeight;
	
	public Widget(){
		this.cachedWidth = width();
		this.cachedHeight = height();
	}
	
	public abstract int width();
	public abstract int height();
	

}
