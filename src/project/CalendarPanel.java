package project;

import java.awt.*;

import javax.swing.*;

public class CalendarPanel extends JPanel{
	JScrollPane scroll;
	JTextArea area;
	JPanel p_date;
	JLabel date_label;
	public CalendarPanel(String text) {
		this.setLayout(new BorderLayout());
		area = new JTextArea();
		scroll = new JScrollPane(area);
		p_date = new JPanel();
		date_label = new JLabel(text);
		p_date.add(date_label);
		this.add(p_date,BorderLayout.NORTH);
		this.add(area);
	}
}
