import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main  extends Frame implements ActionListener{
	

	ArrayList<Student> slist = new ArrayList<Student>();
	
	public JTextArea area;
	public JLabel name,usn,address,age,s1,s2,s3,s4,s5,s6,s7,s8,cat;
	public JTextField txtname,txtusn,txtaddr,txtage,txts1,txts2,txts3,txts4,txts5,txts6,txts7,txts8;
	public JComboBox<String> category;
	public JButton submit,display;
	public String cats[] = {"GM","BC","SC"};
	public Main() {
		name = new JLabel("Name");
		usn = new JLabel("USN");
		address = new JLabel("address");
		age = new JLabel("Age");
		s1 = new JLabel("SGPA-1");
		s2 = new JLabel("SGPA-2");
		s3 = new JLabel("SGPA-3");
		s4 = new JLabel("SGPA-4");
		s5 = new JLabel("SGPA-5");
		s6 = new JLabel("SGPA-6");
		s7 = new JLabel("SGPA-7");
		s8 = new JLabel("SGPA-8");
		cat = new JLabel("Category");
		txtname = new JTextField("Name");
		txtusn = new JTextField("USN");
		txtaddr = new JTextField("Address");
		txtage = new JTextField(10);
		txts1 = new JTextField();
		txts2 = new JTextField();
		txts3 = new JTextField();
		txts4 = new JTextField();
		txts5 = new JTextField();
		txts6 = new JTextField();
		txts7 = new JTextField();
		txts8= new JTextField();
		submit = new JButton("Submit");
		display = new JButton("Display");
		category = new JComboBox<String>(cats);
		area = new JTextArea();
		add(name);
		add(txtname);
		add(usn);
		add(txtusn);
		add(address);
		add(txtaddr);
		add(age);
		add(txtage);
		add(cat);
		add(category);
		add(s1);
		add(txts1);
		add(s2);
		add(txts2);
		add(s3);
		add(txts3);
		add(s4);
		add(txts4);
		add(s5);
		add(txts5);
		add(s6);
		add(txts5);
		add(s6);
		add(txts6);
		add(s7);
		add(txts7);
		add(s8);
		add(txts8);
		add(submit);
		add(display);
		add(area);
		display.addActionListener((ActionListener)this);
		submit.addActionListener((ActionListener)this);	
	}
	public void actionPerformed(ActionEvent ev) {
		if(ev.getSource()==submit) {
			int age=0;
			try {
				age = Integer.parseInt(txtage.getText());
				if(age<0 || age>100)
				{
					txtage.setText(JOptionPane.showInputDialog(null, "reenter age"));
				}
			}catch(Exception e) {
				txtage.setText(JOptionPane.showInputDialog(null, "reenter age"));
			}
			Student  s = new Student(
					txtname.getText(),
					txtusn.getText(),
					txtaddr.getText(),
					(String) category.getItemAt(category.getSelectedIndex()),
					Integer.parseInt(txtage.getText()),
					Double.parseDouble(txts1.getText()),
					Double.parseDouble(txts2.getText()),
					Double.parseDouble(txts3.getText()),
					Double.parseDouble(txts4.getText()),
					Double.parseDouble(txts5.getText()),
					Double.parseDouble(txts6.getText()),
					Double.parseDouble(txts7.getText()),
					Double.parseDouble(txts8.getText())
					);
			double g = (s.s1+s.s2+s.s3+s.s4+s.s5+s.s6+s.s7+s.s8)/8;
			s.setCGPA(g);
			slist.add(s);
		}
		if(ev.getSource()==display) {
			area.setText("");
			for(Student i:slist)
			{
				area.setText(area.getText()+i+"\n");
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.setLayout(new GridLayout(0,2));
		m.setSize(600,400);
		m.setVisible(true);
	}
}
	
