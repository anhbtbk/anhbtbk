/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package net.devicemanagement.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import net.devicemanagement.view.model.Laptop;
import net.devicemanagement.view.model.Monitor;

/**
 *
 * @author Tuan Anh
 */
public class EditLaptopDialog extends javax.swing.JDialog implements ActionListener {

    private HomeFrm homeFrm;
    private Laptop laptop;

    /**
     * Creates new form AddPhoneDialog
     */
    public EditLaptopDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null); //hiển thị ra chính giữa màn hình
        addActionListener();
        laptop = new Laptop(); //khi click vào add new sẽ mặc định tạo mới 1 đối tượng phone, 
        //không khai báo sẽ bị lỗi không gọi được this.phone
        homeFrm = (HomeFrm) parent;
    }

    public EditLaptopDialog(java.awt.Frame parent, boolean modal, Laptop laptop) {
        this(parent, modal);
        this.laptop = laptop;
        showData(); //pt hiển thị dữ liệu ra trước khi chỉnh sửa
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLaptopSerial = new javax.swing.JTextField();
        txtLaptopName = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLaptopRam = new javax.swing.JTextField();
        txtLaptopSize = new javax.swing.JTextField();
        txtLaptopCpu = new javax.swing.JTextField();
        txtLaptopDisk = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtLaptopVga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("THÊM MỚI ĐIỆN THOẠI");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sửa thông tin laptop");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Số serial");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tên laptop");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("CPU");

        txtLaptopSerial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLaptopSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLaptopSerialActionPerformed(evt);
            }
        });

        txtLaptopName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancel.setText("Hủy bỏ");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnAddNew.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddNew.setText("Cập nhật");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Dung lượng RAM");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Dung lượng ổ cứng");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Card đồ họa");

        txtLaptopRam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtLaptopSize.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtLaptopCpu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtLaptopDisk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Màn hình");

        txtLaptopVga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtLaptopSerial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                .addComponent(txtLaptopName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtLaptopRam, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                .addComponent(txtLaptopDisk))
                            .addComponent(txtLaptopCpu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLaptopSize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLaptopVga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLaptopSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLaptopName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtLaptopCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLaptopRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLaptopDisk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLaptopVga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtLaptopSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnAddNew))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLaptopSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLaptopSerialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLaptopSerialActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditLaptopDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditLaptopDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditLaptopDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditLaptopDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditLaptopDialog dialog = new EditLaptopDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtLaptopCpu;
    private javax.swing.JTextField txtLaptopDisk;
    private javax.swing.JTextField txtLaptopName;
    private javax.swing.JTextField txtLaptopRam;
    private javax.swing.JTextField txtLaptopSerial;
    private javax.swing.JTextField txtLaptopSize;
    private javax.swing.JTextField txtLaptopVga;
    // End of variables declaration//GEN-END:variables

    private void addActionListener() {
        btnAddNew.addActionListener(this);
        btnCancel.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var obj = e.getSource();
        if (obj.equals(btnCancel)) {
            dispose();
        } else if (obj.equals(btnAddNew)) {
            editLaptop();
        }
    }

    private void editLaptop() {
        var serial = txtLaptopSerial.getText();
        var name = txtLaptopName.getText();
        var cpu = txtLaptopCpu.getText();
        var ram = txtLaptopRam.getText();
        var disk = txtLaptopDisk.getText();
        var vga = txtLaptopVga.getText();
        var size = txtLaptopSize.getText();

        if (!ram.isEmpty() && !serial.isEmpty() && !name.isEmpty()
                && !cpu.isEmpty() && !disk.isEmpty() && !vga.isEmpty()
                && !size.isEmpty()) {

            laptop.setSerial(serial);
            laptop.setName(name);
            laptop.setCpu(cpu);
            laptop.setRam(ram);
            laptop.setDisk(disk);
            laptop.setVga(vga);
            laptop.setSize(size);

            homeFrm.editLaptopCallback(laptop);//đẩy thông tin vào bảng
            JOptionPane.showMessageDialog(rootPane, "Cập nhật laptop thành công");
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Các ô nhập liệu không được để trống");
        }

    }

    private void showData() {
        txtLaptopSerial.setText(laptop.getSerial());
        txtLaptopName.setText(laptop.getName());
        txtLaptopCpu.setText(laptop.getCpu());
        txtLaptopRam.setText(laptop.getRam());
        txtLaptopDisk.setText(laptop.getDisk());
        txtLaptopVga.setText(laptop.getVga());
        txtLaptopSize.setText(laptop.getSize());
    }

}
