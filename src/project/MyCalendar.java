package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyCalendar extends JFrame{
	JMenuBar cal_bar;
	JMenu add_menu;
	JMenuItem[] add_item = new JMenuItem[3];
	JPanel[][] cal_p = new JPanel[6][7];
	JPanel p_center;
	JPanel p_info;
	public MyCalendar() {
		super("달력");
		cal_bar = new JMenuBar();
		add_menu = new JMenu("추가");
		add_item[0] = new JMenuItem("일정 추가"); // 이건 그 년도만.
		add_item[1] = new JMenuItem("기념일 추가"); // 기념일은 매년 적용되어야 하는 것..
		p_info = new JPanel();
		p_center = new JPanel();
		p_center.setLayout(new GridLayout(6,7,2,2));
		showPanel();
		add_menu.add(add_item[0]);
		add_menu.add(add_item[1]);
		cal_bar.add(add_menu);
		this.setJMenuBar(cal_bar);
		this.add(p_center);
		this.add(p_info, BorderLayout.NORTH);
		this.setVisible(true);
		this.setSize(700,700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void showPanel() {
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 7; j++) {
				cal_p[i][j] = new CalendarPanel(i+"행"+" "+j+"열");
				cal_p[i][j].setPreferredSize(new Dimension(100, 100));
				p_center.add(cal_p[i][j]);
			}
		}
	}
	public static void main(String[] args) {
		new MyCalendar();
	}
	

}
