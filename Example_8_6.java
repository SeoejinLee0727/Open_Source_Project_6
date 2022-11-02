//0~19까지의 정수 20개를 프레임 내의 (30, 30)에서 
//(250, 250) 영역 내 랜덤한 위치에 출력하는 스윙 프로그램을 작성하라. 
//프레임의 크기를 300 × 300으로 하고, 정수는 JLabel을 이용하여 출력하고 크기는 20 × 20으로 한다.

import java.awt.*;
import javax.swing.*;

public class Example_8_6 extends JFrame {
	public Example_8_6() {
		this.setTitle("Random Labels");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(null);
		
		JLabel [] label = new JLabel[20];
		int randNum1 = 0;
		int randNum2 = 0;
		for(int i = 0; i < 20; i++) {
			label[i] = new JLabel(Integer.toString(i));
			
			randNum1 = (int)(Math.random()*220)+30;
			randNum2 = (int)(Math.random()*220)+30;
			
			label[i].setBounds(randNum1, randNum2, 20, 20);
			label[i].setForeground(Color.MAGENTA);
			c.add(label[i]);
		}
				
		this.setSize(300, 300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Example_8_6();
	}
}