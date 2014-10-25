package BouncingBalls;
import zen.core.Zen;
import java.util.ArrayList;

public class BouncingBalls {

	public static void main(String[] args) {
		Zen.create(500,500);
		
		ArrayList<Ball> ballList = new ArrayList<Ball>();
		
		int count = 0;
		while (count<20) {
			Ball b = new Ball();
			ballList.add(b);
			count++;
		}
		
	
		
		while(true){
			
			Zen.setBackground("cyan");
			
			
			
			for(Ball b1 : ballList){
				
				b1.draw();
				b1.move();
				
				for(Ball b2 : ballList){
					if(b1.collides(b2)){
						
						b1.balldx = -b1.balldx;
						b2.balldx = -b2.balldx;
						b1.balldy = -b1.balldy;
						b2.balldy = -b2.balldy;
					}
				}
			}
			

			
			
			
			Zen.buffer(33);
			
		}
		
		
		
	}

}
