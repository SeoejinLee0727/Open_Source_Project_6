//컨텐트펜에 FlowLayout 배치관리자를 지정하고 그림과 같이 JLabel과 JButton 컴포넌트를 이용하여 
//산술문을 출력하는 스윙 프로그램을 작성하라


import java.awt.*;
import javax.swing.*;

public class Example_8_3 extends JFrame {
	public Example_8_3() {
		this.setTitle("FlowLayout Practice");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("100 + 200"));
		c.add(new JButton("="));
		c.add(new JLabel("300"));
				
		this.setSize(400, 100);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Example_8_3();
	}
}
