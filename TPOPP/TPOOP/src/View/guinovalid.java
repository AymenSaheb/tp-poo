package View;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guinovalid extends javax.swing.JFrame implements ActionListener {

        /**
         * Creates new form verifierDemandes2
         */
        public guinovalid(int i) {
            initComponents(i);
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents(int i) {

            jLabelNbrChambre = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            jLabelNbrChambre1 = new javax.swing.JLabel();
            jButtonref = new javax.swing.JButton();
            jButtonigno = new javax.swing.JButton();

            jLabelNbrChambre.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
            jLabelNbrChambre.setForeground(new java.awt.Color(0, 51, 153));
            jLabelNbrChambre.setText("demande "+i+" :");

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(0, 51, 153));
            jLabel1.setText("traitement de demandes  :");

            jLabelNbrChambre1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
            jLabelNbrChambre1.setForeground(new java.awt.Color(0, 51, 153));
            jLabelNbrChambre1.setText("demande 1 :");

            jButtonref.setBackground(new java.awt.Color(0, 51, 153));
            jButtonref.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
            jButtonref.setForeground(new java.awt.Color(255, 255, 255));
            jButtonref.setText("refuser ");

            jButtonigno.setBackground(new java.awt.Color(0, 51, 153));
            jButtonigno.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
            jButtonigno.setForeground(new java.awt.Color(255, 255, 255));
            jButtonigno.setText("ignorer");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabelNbrChambre1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(35, 35, 35)
                                                    .addComponent(jButtonref, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(67, 67, 67)
                                                    .addComponent(jButtonigno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addContainerGap(42, Short.MAX_VALUE)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(40, 40, 40))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel1)
                                    .addGap(38, 38, 38)
                                    .addComponent(jLabelNbrChambre1)
                                    .addGap(41, 41, 41)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButtonref)
                                            .addComponent(jButtonigno))
                                    .addContainerGap(109, Short.MAX_VALUE))
            );

            pack();
            setVisible(true);
        }// </editor-fold>//GEN-END:initComponents

        /**
         * @param args the command line arguments
         */


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButtonigno;
        private javax.swing.JButton jButtonref;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabelNbrChambre;
        private javax.swing.JLabel jLabelNbrChambre1;

    @Override
    public void actionPerformed(ActionEvent e) {
        if ((inter.i)>=inter.hotel.demandes.size())
        {
            admin interfaceAdministrateur=new admin();
            this.dispose();
        }
        else {
            inter.i++;
            if (inter.administrateur.Verifier_Disponibilite(inter.hotel.demandes.get(inter.i))==-1)
            {
                guinovalid interfaceDemandesNonValides=new guinovalid(inter.i);
                this.dispose();
            }
            else {
                validatedemande interfaceDemandesValides=new validatedemande(inter.i);
                this.dispose();
            }
        }
    }
    }
    // End of variables declaration//GEN-END:variables





