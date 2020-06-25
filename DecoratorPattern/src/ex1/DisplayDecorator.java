package ex1;

public abstract class DisplayDecorator extends Display{
	
	private Display decoratedDisplay;
	
	public DisplayDecorator(Display decoratedDisplay) {
		this.decoratedDisplay = decoratedDisplay;
	}
	
	@Override
	public void draw() {
		decoratedDisplay.draw();
	}
}
