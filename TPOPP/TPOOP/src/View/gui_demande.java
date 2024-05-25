package View;

import Controller.Client;
import Controller.Date;
import Controller.DateException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui_demande extends JFrame implements ActionListener {

    public Client client;
    /**
     * Creates new form réservation
     */
    public gui_demande(Client client)
    {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabelNbrLit = new javax.swing.JLabel();
        jLabelDdebut = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldJourDEB = new javax.swing.JTextField();
        jTextFieldMoisDEB = new javax.swing.JTextField();
        jLabelDfin = new javax.swing.JLabel();
        jTextFieldNbrlit = new javax.swing.JTextField();
        jTextFieldAnneeDEB = new javax.swing.JTextField();
        jTextFieldjourFin = new javax.swing.JTextField();
        jTextFieldAnnee = new javax.swing.JTextField();
        jTextFieldMoisFin = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabelNbrLit1 = new javax.swing.JLabel();
        jLabelNbrLitoisFin = new javax.swing.JLabel();
        jLabelJour = new javax.swing.JLabel();
        jLabelNbrLitAnneeFIn = new javax.swing.JLabel();
        jLabelMois = new javax.swing.JLabel();
        jLabelAnnee = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("demande réservation");

        jCheckBox1.setBackground(new java.awt.Color(0, 51, 153));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("vip");

        jLabelNbrLit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelNbrLit.setForeground(new java.awt.Color(0, 51, 153));
        jLabelNbrLit.setText("nombre de lit ");

        jLabelDdebut.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelDdebut.setForeground(new java.awt.Color(0, 51, 153));
        jLabelDdebut.setText("date début :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("jour :");

        jTextFieldJourDEB.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextFieldJourDEB.setForeground(new java.awt.Color(0, 51, 153));
        //jTextFieldJourDEB.setText(" ");

        jTextFieldMoisDEB.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextFieldMoisDEB.setForeground(new java.awt.Color(0, 51, 153));
        //jTextFieldMoisDEB.setText(" ");

        jLabelDfin.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelDfin.setForeground(new java.awt.Color(0, 51, 153));
        jLabelDfin.setText("date fin :");

        jTextFieldNbrlit.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jTextFieldNbrlit.setForeground(new java.awt.Color(0, 51, 153));
        //jTextFieldNbrlit.setText(" ");

        jTextFieldAnneeDEB.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextFieldAnneeDEB.setForeground(new java.awt.Color(0, 51, 153));
        //jTextFieldAnneeDEB.setText(" ");

        jTextFieldjourFin.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextFieldjourFin.setForeground(new java.awt.Color(0, 51, 153));
        //jTextFieldjourFin.setText(" ");

        jTextFieldAnnee.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextFieldAnnee.setForeground(new java.awt.Color(0, 51, 153));
        //jTextFieldAnnee.setText(" ");

        jTextFieldMoisFin.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextFieldMoisFin.setForeground(new java.awt.Color(0, 51, 153));
        //jTextFieldMoisFin.setText(" ");

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("envoyer");
        jButton1.addActionListener(this);

        jLabelNbrLit1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelNbrLit1.setForeground(new java.awt.Color(0, 51, 153));
        jLabelNbrLit1.setText("jour :");

        jLabelNbrLitoisFin.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelNbrLitoisFin.setForeground(new java.awt.Color(0, 51, 153));
        jLabelNbrLitoisFin.setText("mois :");

        jLabelJour.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelJour.setForeground(new java.awt.Color(0, 51, 153));
        jLabelJour.setText("jour :");

        jLabelNbrLitAnneeFIn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelNbrLitAnneeFIn.setForeground(new java.awt.Color(0, 51, 153));
        jLabelNbrLitAnneeFIn.setText("année  :");

        jLabelMois.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelMois.setForeground(new java.awt.Color(0, 51, 153));
        jLabelMois.setText("mois :");

        jLabelAnnee.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelAnnee.setForeground(new java.awt.Color(0, 51, 153));
        jLabelAnnee.setText("année  :");

        setVisible(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(135, 135, 135))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabelNbrLit1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jTextFieldjourFin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabelJour, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jTextFieldJourDEB, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(31, 31, 31))))
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelDdebut, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelMois, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelNbrLitoisFin, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(31, 31, 31)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextFieldMoisFin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFieldMoisDEB, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelNbrLit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFieldNbrlit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelDfin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 63, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelNbrLitAnneeFIn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                                                .addComponent(jButton1)
                                                                .addGap(24, 24, 24))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jTextFieldAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldAnneeDEB, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNbrLit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNbrlit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDdebut)
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldJourDEB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelJour)
                                        .addComponent(jTextFieldMoisDEB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelMois)
                                        .addComponent(jLabelAnnee)
                                        .addComponent(jTextFieldAnneeDEB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(jLabelDfin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldMoisFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelNbrLit1)
                                        .addComponent(jLabelNbrLitoisFin)
                                        .addComponent(jLabelNbrLitAnneeFIn)
                                        .addComponent(jTextFieldjourFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCheckBox1)
                                        .addComponent(jButton1))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAnnee;
    private javax.swing.JLabel jLabelDdebut;
    private javax.swing.JLabel jLabelDfin;
    private javax.swing.JLabel jLabelJour;
    private javax.swing.JLabel jLabelMois;
    private javax.swing.JLabel jLabelNbrLit;
    private javax.swing.JLabel jLabelNbrLit1;
    private javax.swing.JLabel jLabelNbrLitAnneeFIn;
    private javax.swing.JLabel jLabelNbrLitoisFin;
    private javax.swing.JTextField jTextFieldMoisFin;
    private javax.swing.JTextField jTextFieldAnnee;
    private javax.swing.JTextField jTextFieldAnneeDEB;
    private javax.swing.JTextField jTextFieldJourDEB;
    private javax.swing.JTextField jTextFieldMoisDEB;
    private javax.swing.JTextField jTextFieldNbrlit;
    private javax.swing.JTextField jTextFieldjourFin;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==jButton1)
        {
            /*
            int nbrlits=Integer.parseInt(jTextFieldNbrlit.getText().trim());


            int jourdebut=Integer.parseInt(jTextFieldJourDEB.getText().trim());
            int jourfin=Integer.parseInt(jTextFieldjourFin.getText().trim());

            int moisdebut=Integer.parseInt(jTextFieldMoisDEB.getText().trim());
            int anneedebut=Integer.parseInt(jTextFieldAnneeDEB.getText().trim());

            int anneefin=Integer.parseInt(jTextFieldAnnee.getText().trim());
            int moisfin=Integer.parseInt(jTextField10.getText().trim());


             */
            int nblits;
            int jourdeb;
            int jourfin;
            int anneedeb;
            int anneefin;
            int moisfin;
            int moisdeb;

            try {

                 nblits = Integer.parseInt(jTextFieldNbrlit.getText().trim());
                 jourdeb = Integer.parseInt(jTextFieldJourDEB.getText().trim());
                 jourfin = Integer.parseInt(jTextFieldjourFin.getText().trim());
                 anneedeb = Integer.parseInt(jTextFieldAnneeDEB.getText().trim());
                 anneefin = Integer.parseInt(jTextFieldAnnee.getText().trim());
                 moisfin = Integer.parseInt(jTextFieldMoisFin.getText().trim());
                 moisdeb = Integer.parseInt(jTextFieldMoisDEB.getText().trim());

                Date datede;
                Date datef;

                try {
                    datede = new Date(jourdeb, moisdeb, anneedeb);
                    datef = new Date(jourfin, moisfin, anneefin);
                } catch (DateException ex) {
                    JOptionPane.showMessageDialog(null, "please put validate date");
                }


                this.client.Demander_Reservation(inter.hotel, nblits, jCheckBox1.isSelected(), new Date(jourdeb, moisdeb, anneedeb), new Date(jourfin, moisfin, anneefin));
                System.out.println(inter.hotel.clients.get(inter.hotel.clients.size() - 1).reservation.nbr_lit_souhaitee);
                System.out.println(inter.hotel.clients.get(inter.hotel.clients.size() - 1).reservation.vip);
                System.out.println(inter.hotel.clients.get(inter.hotel.clients.size() - 1).reservation.date_debut.jour);
                System.out.println(inter.hotel.clients.get(inter.hotel.clients.size() - 1).reservation.date_fin.jour);
                clienthui interfaceClient=new clienthui(this.client);
                this.dispose();
            }
            catch (Exception exception){
                JOptionPane.showMessageDialog(null, "please put number");
            }






        }

    }
    // End of variables declaration//GEN-END:variables
}