//다음 그림과 같이 "Let's study Java"라는 문자열을 타이틀로 가지고 
//프레임의 크기가 400 × 200인 스윙 프로그램을 작성하라.

import java.awt.*;
import javax.swing.*;

public class Example_8_1 extends JFrame {
	public Example_8_1() {
		this.setTitle("Let's study Java");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 200);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Example_8_1();
	}
}