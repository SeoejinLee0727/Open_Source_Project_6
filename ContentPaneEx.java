/*예제 9-2 : 3개의 버튼 컴포넌트를 가진 스윙프레임 만들기*/
//다음 그림과 같이 컨텐트팬의 배경색을 오렌지색으로 하고, 
//이곳에 OK, Cancel, Ignore 버튼들을 부착한 스윙 프로그램을 작성하라.

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);
	}
	
		public static void main(String[] args) {
		new ContentPaneEx();
	}	
}