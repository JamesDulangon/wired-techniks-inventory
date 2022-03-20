package gui;


import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame("WiRed Techniks Inventory Management");
		frame.setBounds(100, 100, 900, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel backgroundMainlbl = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/WiRed Techniks.jpg")).getImage();

		JLabel lblNewLabel = new JLabel("    Inventory Management Application");
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel.setBounds(294, 161, 364, 46);
		frame.getContentPane().add(lblNewLabel);

		JButton btnToAddItem = new JButton("To ADD ITEM");
		btnToAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AddItemMenu aim = new AddItemMenu();
			}
		});
                
                JButton btnToRemoveItem = new JButton("To REMOVE ITEM");
                btnToRemoveItem.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        frame.dispose();
                        
                        RemoveItem ri = new RemoveItem();
                    }
                });
                
		btnToAddItem.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 20));
		btnToAddItem.setBounds(351, 217, 245, 46);
		frame.getContentPane().add(btnToAddItem);
                
                btnToRemoveItem.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 20));
                btnToRemoveItem.setBounds(351,369, 245, 46);
                frame.getContentPane().add(btnToRemoveItem);

		JButton btnToViewInventory = new JButton("To view INVENTORY");
		btnToViewInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				InventoryTableMenu itm = new InventoryTableMenu();
				itm.setVisible(true);
			}
		});
		btnToViewInventory.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 20));
		btnToViewInventory.setBounds(351, 293, 245, 46);
		frame.getContentPane().add(btnToViewInventory);
                
                
		JLabel lblDevelopedByDulangon = new JLabel("Developed by DULANGON & SAMBALSEÑO (2019)");
		lblDevelopedByDulangon.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 16));
		lblDevelopedByDulangon.setForeground(Color.BLACK);
		lblDevelopedByDulangon.setBounds(10, 413, 415, 40);
		frame.getContentPane().add(lblDevelopedByDulangon);
		backgroundMainlbl.setIcon(new ImageIcon(img));
		backgroundMainlbl.setBounds(0, 0, 886, 463);
		frame.getContentPane().add(backgroundMainlbl);
	}
}
