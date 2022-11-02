//BorderLayout을 사용하여 컴포넌트 사이의 수평 간격이 50픽셀, 
//수직 간격이 5픽셀이 되도록 다음 그림과 같은 스윙 응용프로그램을 작성하라.


import java.awt.*;
import javax.swing.*;

public class Example_8_2 extends JFrame {
	public Example_8_2() {
		this.setTitle("BorderLayout Practice");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(50, 20));
		
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("Center"), BorderLayout.CENTER);
		
		this.setSize(400, 200);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Example_8_2();
	}
}