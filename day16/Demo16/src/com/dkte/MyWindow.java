package com.dkte;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyWindow extends JFrame{
	private DefaultTableModel prodTableModel;
	private JTable prodTable;
	private JScrollPane prodScrollPane;
	private JButton addBtn,delBtn,exitBtn;
	
	public MyWindow() {
		this.setTitle("Main Window");
		this.setSize(600,400);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(null);
		
		Object[] columns = { "Id", "Name", "Price" };
		
		/*Object[][] rows = {
			{ 1, "iPhone", 89000.0 },
			{ 2, "Pixel", 94000.0 },
			{ 3, "OnePlus", 64000.0 }
		};
		prodTable = new JTable(rows , columns);*/
		
		prodTableModel = new DefaultTableModel(columns, 0);
		prodTable = new JTable(prodTableModel);
		prodScrollPane = new JScrollPane(prodTable);
		prodScrollPane.setBounds(20, 20, 550, 250);
		this.add(prodScrollPane);
		
		addBtn = new JButton("Add");
		addBtn.setBounds(100, 300, 100, 30);
		this.add(addBtn);

		delBtn = new JButton("Delete");
		delBtn.setBounds(250, 300, 100, 30);
		this.add(delBtn);
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(400, 300, 100, 30);
		this.add(exitBtn);
		
		addBtn.addActionListener((e)->{
			ProductDialog dlg=new ProductDialog();
			dlg.setModal(true);
			dlg.setVisible(true);
			Product prod=dlg.getProduct();
			
			Object[] row = {prod.getId(), prod.getName(), prod.getPrice()};
			prodTableModel.addRow(row);
		});
		
		delBtn.addActionListener((e) -> {
			// get selected row index
			int rowIndex = prodTable.getSelectedRow();
			if(rowIndex == -1) {
				JOptionPane.showMessageDialog(this, "No Row is Selected");
				return;
			}
			// delete the row from table model
			prodTableModel.removeRow(rowIndex);
		});
		
		exitBtn.addActionListener((e) -> this.dispose() );
		
		
		
	}

}
