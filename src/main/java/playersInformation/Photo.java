package Config;

import javax.swing.*;

/**
 * 
 * �趨����ͼƬ��
 * 
 * */

public class Photo {
	
	/**
	 *  ���һѡ��ͼƬ
	 */
	public static ImageIcon PLAYER_01_SELECTED = new ImageIcon("src\\images\\config\\playerChoose\\selected_01.png");
	/**
	 *  ��Ҷ�ѡ��ͼƬ
	 */
	public static ImageIcon PLAYER_02_SELECTED = new ImageIcon("src\\images\\config\\playerChoose\\selected_02.png");
	/**
	 *  ��ť
	 */
	public static ImageIcon[] BUTTON_LEFT = {
		new ImageIcon("src\\images\\config\\��ť\\normal.png"),
		new ImageIcon("src\\images\\config\\��ť\\disabled.png"),
		new ImageIcon("src\\images\\config\\��ť\\mouseOver.png"),
		new ImageIcon("src\\images\\config\\��ť\\pressed.png")
	};
	/**
	 *  �Ұ�ť
	 */
	public static ImageIcon[] BUTTON_RIGHT = {
		new ImageIcon("src\\images\\config\\�Ұ�ť\\normal.png"),
		new ImageIcon("src\\images\\config\\�Ұ�ť\\disabled.png"),
		new ImageIcon("src\\images\\config\\�Ұ�ť\\mouseOver.png"),
		new ImageIcon("src\\images\\config\\�Ұ�ť\\pressed.png")
	};
	/**
	 * ��ѡ����ͼƬ
	 * */
	public static ImageIcon[] PLAYER_CHOOSE = {
		new ImageIcon("src\\images\\player\\0\\head_h5.png"),
		new ImageIcon("src\\images\\player\\1\\head_h5.png"),
		new ImageIcon("src\\images\\player\\2\\head_h5.png"),
		new ImageIcon("src\\images\\player\\3\\head_h5.png")
	};
}
