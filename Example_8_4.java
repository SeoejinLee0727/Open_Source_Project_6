// 예제 8-5의 소스 코드를 수정하여 각 버튼의 배경색을 다음 그림과 같이 설정하라.

import java.awt.*;
import javax.swing.*;

public class Example_8_4 extends JFrame {
	public Example_8_4() {
		this.setTitle("Ten Color Buttons Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new GridLayout(1, 10));
		
		Color [] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,
				Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY };
		
		JButton [] btn = new JButton[10];
		for(int i = 0; i < 10; i++) {
			btn[i] = new JButton(Integer.toString(i));
			btn[i].setOpaque(true);
			btn[i].setBackground(color[i]);
			c.add(btn[i]);
		}
				
		this.setSize(500, 250);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Example_8_4();
	}
}