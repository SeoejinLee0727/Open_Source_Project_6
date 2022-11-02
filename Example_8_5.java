// GridLayout을 이용하여 다음 그림과 같이 Color.WHITE, Color.GRAY, Color.RED 등 
//Color 클래스에 선언된 16개의 색을 배경색으로 하는 4 × 4 판을 구성하라.


import java.awt.*;
import javax.swing.*;

public class Example_8_5 extends JFrame {
	public Example_8_5() {
		this.setTitle("4x4 Color Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new GridLayout(4, 4));
		
		Color [] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,
				Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.BLACK,
				Color.DARK_GRAY, Color.WHITE };
		
		JLabel [] label = new JLabel[16];
		int randNum = 0;
		for(int i = 0; i < 16; i++) {
			label[i] = new JLabel(Integer.toString(i));
			randNum = (int)(Math.random()*12);
			label[i].setOpaque(true);
			label[i].setBackground(color[randNum]);
			c.add(label[i]);
		}
				
		this.setSize(500, 250);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Example_8_5();
	}
}
