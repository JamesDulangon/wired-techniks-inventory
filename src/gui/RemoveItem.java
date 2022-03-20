/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;

/**
 *
 * @author Zamskie
 */
public class RemoveItem {

    RemoveItem() {
        InventoryTableMenu itm = new InventoryTableMenu();
        itm.setVisible(true);
        itm.setLocationRelativeTo(null);
        AddItemMenu aim = new AddItemMenu();
        aim.setVisible(false);
        String choice = JOptionPane.showInputDialog(null, "Enter Machine to be removed: ");
        for (int i = 0; i < aim.getList().size(); i++) {
            if (choice.equals(aim.getList().get(i).getName())) {
                aim.getList().remove(i);
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Process Successful");
        itm.dispose();
    }
}
