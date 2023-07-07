package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ComponentsTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 428, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Component Test");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 10, 168, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		
		btn1.setBounds(12, 53, 97, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
			}
		});
		
		btn2.setBounds(131, 53, 97, 23);
		frame.getContentPane().add(btn2);
		 
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == 0) {
					System.out.println("YES 클릭...");
				}else {
					System.out.println("NO 클릭...");
				}
				
			}
		});
		
		btn3.setBounds(248, 53, 97, 23);
		frame.getContentPane().add(btn3);
		
		JLabel lblNewLabel_1 = new JLabel("TextField실습");
		lblNewLabel_1.setBounds(12, 86, 138, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Button 실습");
		lblNewLabel_1_1.setBounds(12, 37, 138, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(12, 111, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(12, 136, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("휴대폰");
		lblNewLabel_2_2.setBounds(12, 160, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		txtUid = new JTextField();
		txtUid.setBounds(64, 108, 116, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(64, 132, 116, 21);
		frame.getContentPane().add(txtName);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(64, 157, 116, 21);
		frame.getContentPane().add(txtHp);
		
		JLabel lbUid = new JLabel("결과 : ");
		lbUid.setBounds(268, 111, 154, 15);
		frame.getContentPane().add(lbUid);
		
		JLabel lbName = new JLabel("결과 : ");
		lbName.setBounds(268, 136, 154, 15);
		frame.getContentPane().add(lbName);
		
		JLabel lbHp = new JLabel("결과 : ");
		lbHp.setBounds(268, 160, 154, 15);
		frame.getContentPane().add(lbHp);
		
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtUid.getText();
				lbUid.setText("결과 : " + uid);
				
			}
		});
		
		btnUid.setBounds(192, 107, 64, 23);
		frame.getContentPane().add(btnUid);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				lbName.setText("결과 : " + name);
			}
		});
		btnName.setBounds(192, 131, 64, 23);
		frame.getContentPane().add(btnName);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hp = txtHp.getText();
				lbHp.setText("결과 : " + hp);
			}
		});
		btnHp.setBounds(192, 156, 64, 23);
		frame.getContentPane().add(btnHp);
		
		JCheckBox chk1 = new JCheckBox("사과");
		chk1.setBounds(12, 215, 57, 23);
		frame.getContentPane().add(chk1);
		
		JLabel lblNewLabel_3 = new JLabel("CheckBox 실습");
		lblNewLabel_3.setBounds(12, 194, 97, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JCheckBox chk2 = new JCheckBox("딸기");
		chk2.setBounds(73, 215, 57, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("포도");
		chk3.setBounds(131, 215, 57, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("수박");
		chk4.setBounds(192, 215, 57, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("참외");
		chk5.setBounds(255, 215, 57, 23);
		frame.getContentPane().add(chk5);
		
		JLabel lbChkFruit = new JLabel("선택한 과일 : ");
		lbChkFruit.setBounds(22, 244, 384, 15);
		frame.getContentPane().add(lbChkFruit);
		
		JButton btnChkFruit = new JButton("확인");
		btnChkFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> fruits = new ArrayList<>();
				
				if(chk1.isSelected()){
					fruits.add(chk1.getText());
				}
				if(chk2.isSelected()){
					fruits.add(chk2.getText());
				}
				if(chk3.isSelected()){
					fruits.add(chk3.getText());
				}
				if(chk4.isSelected()){
					fruits.add(chk4.getText());
				}
				if(chk5.isSelected()){
					fruits.add(chk5.getText());
				}
				
				lbChkFruit.setText("선택한 과일 : " + fruits);
				
			}
		});
		btnChkFruit.setBounds(320, 215, 75, 23);
		frame.getContentPane().add(btnChkFruit);
		
		JLabel lblNewLabel_4 = new JLabel("RadioButton 실습");
		lblNewLabel_4.setBounds(12, 281, 118, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton rbMale = new JRadioButton("남자");
		rbMale.setBounds(32, 302, 64, 23);
		frame.getContentPane().add(rbMale);
		
		JRadioButton rbFemale = new JRadioButton("여자");
		rbFemale.setBounds(116, 302, 64, 23);
		frame.getContentPane().add(rbFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbMale);
		bg.add(rbFemale);

		JLabel lbGender = new JLabel("선택 결과 : ");
		lbGender.setBounds(42, 331, 273, 15);
		frame.getContentPane().add(lbGender);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rbMale.isSelected()) {
					lbGender.setText("선택 결과 : " + rbMale.getText());
				}else {
					lbGender.setText("선택 결과 : " + rbFemale.getText());
				}
				
				
				
				
			}
		});
		btnGender.setBounds(192, 302, 97, 23);
		frame.getContentPane().add(btnGender);
		

		

	}
}
