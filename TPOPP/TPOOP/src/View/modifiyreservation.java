package View;

import Controller.Client;
import Controller.DateException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class modifiyreservation extends JFrame implements ActionListener {

    Client client;
    /**
     * Creates new form modifierRéservation
     */
    public modifiyreservation(Client client) {
        this.client=client;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelNbrChambre = new javax.swing.JLabel();
        jTextFieldNbrCHambre = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Numéro de chambre :");

        jButton3.setBackground(new java.awt.Color(0, 51, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("envoyer");
        jButton3.addActionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("modifier réservation :");

        jLabelNbrChambre.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelNbrChambre.setForeground(new java.awt.Color(0, 51, 153));
        jLabelNbrChambre.setText("Numéro de chambre :");

        jTextFieldNbrCHambre.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jTextFieldNbrCHambre.setForeground(new java.awt.Color(0, 51, 153));
        //jTextFieldNbrCHambre.setText(" ");

        jButton4.setBackground(new java.awt.Color(0, 51, 153));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("envoyer");
        jButton4.addActionListener(this);
        setVisible(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jTextFieldNbrCHambre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelNbrChambre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 75, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(74, 74, 74))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jButton4)
                                                                .addGap(47, 47, 47))))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addGap(33, 33, 33)
                                .addComponent(jLabelNbrChambre)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNbrCHambre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelNbrChambre;
    private javax.swing.JTextField jTextFieldNbrCHambre;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==jButton3 || e.getSource()==jButton4) {
            try {


                this.client.Modifier_Reservation(Integer.parseInt(jTextFieldNbrCHambre.getText().trim()));

                System.out.println(this.client.reservation.nbr_lit_souhaitee);


            }catch (DateException exception){
                JOptionPane.showMessageDialog(null, "date is no longer availabe" + exception.getMessage());

            }
            catch (Exception exception)
            {
                JOptionPane.showMessageDialog(null, "date is no longer available");
            }
            finally {
                clienthui interfaceClient=new clienthui(this.client);
                this.dispose();
            }
        }
    }
    // End of variables declaration//GEN-END:variables
}