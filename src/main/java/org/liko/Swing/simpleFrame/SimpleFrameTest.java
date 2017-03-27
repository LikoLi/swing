package org.liko.Swing.simpleFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class SimpleFrameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			SimpleFrame simpleFrame = new SimpleFrame();
			simpleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//关闭框架装饰,就是外边的一圈最大最小化之类的.
//			simpleFrame.setUndecorated(true);
			simpleFrame.setLocationByPlatform(true);
			simpleFrame.setVisible(true);
		});
	}
}

class SimpleFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	public SimpleFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}
