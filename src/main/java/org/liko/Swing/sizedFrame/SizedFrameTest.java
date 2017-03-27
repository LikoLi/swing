package org.liko.Swing.sizedFrame;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SizedFrameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			SizedFrame frame = new SizedFrame();
			frame.setTitle("SizeFrame");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			/*
			 * 需在窗口显示之前设置
			 * 是否显示系统窗口框架
			 */
			boolean undecorated = frame.isUndecorated();
			System.out.println(undecorated);
			if(!undecorated) frame.setUndecorated(true);
			
			frame.setVisible(true);
			/*
			 * 将窗口移动到桌面窗口栈的后面，并重新排列所有的可见窗口
			 */
			frame.toBack();
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			/*
			 * 将窗口显示在所有窗口的最前面
			 */
			
			/*
			 * 是否可以重新定义框架的大小
			 */
			boolean resizable = frame.isResizable();
			System.out.println(resizable);
			if(resizable) frame.setResizable(false);
			frame.toFront();
			
		});
	}
}

class SizedFrame extends JFrame {
	public SizedFrame() {
		//get Screen dimensions
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dimension = kit.getScreenSize();
		
		int screenHeight = dimension.height;
		int screenWidth = dimension.width;
		
		//set frame width, height and let platform pick screen location
		
		setSize(screenWidth / 2, screenHeight / 2);
		setLocationByPlatform(true);
		
		//set frame icon 
		Image img = new ImageIcon("I:/download/resource/gif/timg.jpg").getImage();
		setIconImage(img);
	}
}
