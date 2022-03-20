package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AddItemMenu extends JFrame {

	private JPanel contentPane;
	
	static ArrayList<Machine> machines = new ArrayList<Machine>();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddItemMenu frame = new AddItemMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ArrayList<Machine> getList()
	{
		return machines;
	}

	public void close() { 
	    this.setVisible(false);
	    this.dispose();
	}
	
	

	
	public AddItemMenu() {
		setTitle("WiRed Techniks Inventory Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnd = new JLabel("");
		lblnd.setBounds(97, 57, 46, 13);
		contentPane.add(lblnd);
		
		JButton btnScreenPrinters = new JButton("Screen Printers");
		btnScreenPrinters.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Machine screenPrinter = new Machine("Screen Printer",(float) 30000);
				machines.add(screenPrinter);
				screenPrinter.setQuantity(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter how many you want to add(quantity):")));
				
			}
		});
		btnScreenPrinters.setFont(new Font("Cambria", Font.BOLD, 20));
		btnScreenPrinters.setBounds(50, 80, 370, 87);
		contentPane.add(btnScreenPrinters);
		
		JButton btnMechanicalValve = new JButton("Mechanical Valve");
		btnMechanicalValve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Machine mechanicalValve = new Machine("Mechanical Valve",(float) 20000);
				machines.add(mechanicalValve);
				mechanicalValve.setQuantity(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter how many you want to add(quantity):")));
			}
		});
		btnMechanicalValve.setFont(new Font("Cambria", Font.BOLD, 20));
		btnMechanicalValve.setBounds(489, 80, 370, 87);
		contentPane.add(btnMechanicalValve);
		
		JButton btnServoMotors = new JButton("Servo Motors");
		btnServoMotors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Machine servoMotors = new Machine("Servo Motors",(float) 10000);
				machines.add(servoMotors);
				servoMotors.setQuantity(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter how many you want to add(quantity):")));
			}
		});
		btnServoMotors.setFont(new Font("Cambria", Font.BOLD, 20));
		btnServoMotors.setBounds(50, 191, 370, 87);
		contentPane.add(btnServoMotors);
		
		JButton btnServoAmp = new JButton("Servo Amp");
		btnServoAmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Machine servoAmp = new Machine("Servo Amp",(float) 10000);
				machines.add(servoAmp);
				servoAmp.setQuantity(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter how many you want to add(quantity):")));
			}
		});
		btnServoAmp.setFont(new Font("Cambria", Font.BOLD, 20));
		btnServoAmp.setBounds(489, 191, 370, 87);
		contentPane.add(btnServoAmp);
		
		JButton btnPiston = new JButton("Piston");
		btnPiston.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Machine piston = new Machine("Piston",(float) 15000);
				machines.add(piston);
				piston.setQuantity(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter how many you want to add(quantity):")));
			}
		});
		btnPiston.setFont(new Font("Cambria", Font.BOLD, 20));
		btnPiston.setBounds(50, 303, 370, 87);
		contentPane.add(btnPiston);
		
		JButton btnVacuumStopper = new JButton("Vacuum Stopper");
		btnVacuumStopper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Machine vacuumStopper = new Machine("Vacuum Stopper",(float) 15000);
				machines.add(vacuumStopper);
				vacuumStopper.setQuantity(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter how many you want to add(quantity):")));
			}
		});
		btnVacuumStopper.setFont(new Font("Cambria", Font.BOLD, 20));
		btnVacuumStopper.setBounds(489, 303, 370, 87);
		contentPane.add(btnVacuumStopper);
		
		JLabel lblNewLabel = new JLabel("CLICK ON THE MACHINE/EQUIPMENT TO ADD:");
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 26));
		lblNewLabel.setBounds(10, 10, 605, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("RETURN to main menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main mn = new Main();
			}
		});
		btnNewButton.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton.setBounds(608, 414, 251, 39);
		contentPane.add(btnNewButton);
		
		setVisible(true);
	}
}
