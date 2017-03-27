package org.liko.Swing.simpleFrame;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;



import javax.swing.ImageIcon;
import javax.swing.JFrame;



public class SimpleFrameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			SimpleFrame simpleFrame = new SimpleFrame();
			simpleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//关闭框架装饰,就是外边的一圈最大最小化之类的.
//			simpleFrame.setUndecorated(true);
			
//			simpleFrame.setLocation(200, 200);
			/*
			 * 设置位置
			 */
			simpleFrame.setBounds(200, 200, 200, 200);
			simpleFrame.setLocationByPlatform(true);
			/*
			 * 读写Title
			 */
			simpleFrame.setTitle("Vivi");
			System.out.println(simpleFrame.getTitle());
			
			/*
			 * 获取用户屏幕信息
			 */
			Toolkit kit = Toolkit.getDefaultToolkit();
			Dimension dimension = kit.getScreenSize();
			simpleFrame.setSize(dimension.width/2, dimension.height/2);
			simpleFrame.setLocationByPlatform(true);
			
			/*
			 * 设置图标
			 */
			ImageIcon img = new ImageIcon("I:/download/resource/gif/timg.jpg");
			simpleFrame.setIconImage(img.getImage());
			
			/*
			 *  设置全屏
			 */
			simpleFrame.setExtendedState(Frame.MAXIMIZED_BOTH);
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
