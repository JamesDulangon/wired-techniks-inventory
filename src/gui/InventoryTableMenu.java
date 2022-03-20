package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

public class InventoryTableMenu extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private int countScreenPrinter = 0;
	private int countMechValve = 0;
	private int countServMotor = 0;
	private int countServAmp = 0;
	private int countPiston = 0;
	private int countVacuumStop = 0;
//        Tsum.setText(Integer.toString(getSum)); TOTAL PRICES

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InventoryTableMenu frame = new InventoryTableMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public String getStringStock() {
		return "Screen Printer:[" + Integer.toString(countScreenPrinter) + "]   Mechanical Valve:["
				+ Integer.toString(countMechValve) + "]   Servo Motor:[" + Integer.toString(countServMotor)
				+ "]   Servo Amp:[" + Integer.toString(countServAmp) + "]   Piston:[" + Integer.toString(countPiston)
				+ "]   Vacuum Stopper:[" + Integer.toString(countVacuumStop) + "]";
	}
        
        //TOTAL PRICES
//        public int getSum(){
//            int rowsCount = table.getRowCount();
//            int sum = 0;
//            for(int i = 0; i <rowsCount; i++){
//                sum = sum + Integer.parseInt(table.getValueAt(i, 4).toString()); 
//            }
//        return sum;
//        }
//            
        
        
        
	public InventoryTableMenu() {
		setTitle("WiRed Techniks Inventory Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		String[] column = { "Machine/Equipment", "Quantity", "Price per Unit", "Total Price" };

		AddItemMenu machineList = new AddItemMenu();

		System.out.println(machineList.getList());

		DefaultTableModel tableModel = new DefaultTableModel(column, 0);
		for (Machine machine : machineList.getList()) {
			tableModel.addRow(new Object[] { machine.getName(), machine.getQuantity(), machine.getPrice(),
					machine.getTotalPriceAmount() });

			switch (machine.getName()) {
			case "Screen Printer":
				countScreenPrinter += machine.getQuantity();
				break;

			case "Mechanical Valve":
				countMechValve += machine.getQuantity();
				break;

			case "Servo Motors":
				countServMotor += machine.getQuantity();
				break;

			case "Servo Amp":
				countServAmp += machine.getQuantity();
				break;

			case "Piston":
				countPiston += machine.getQuantity();
				break;

			case "Vacuum Stopper":
				countVacuumStop += machine.getQuantity();
				break;
			}
		}

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 866, 368);
		contentPane.add(scrollPane);

		table = new JTable(tableModel);
		table.setFont(new Font("Cambria", Font.PLAIN, 15));

		table.setEnabled(false);
		scrollPane.setViewportView(table);

		JLabel lblNewLabel = new JLabel("STOCK:");
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNewLabel.setBounds(20, 379, 130, 33);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(getStringStock());
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 405, 855, 48);
		contentPane.add(lblNewLabel_1);
	}
}
