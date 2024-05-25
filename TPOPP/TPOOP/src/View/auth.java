package View;

import Controller.Client;
import Controller.DateException;

import javax.swing.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

public class auth extends JFrame implements ActionListener {
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JPasswordField jPasswordField1;
    private JTextField jTextField1;

    public auth() throws DateException {
        this.initComponents();
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jLabel4 = new JLabel();
        this.jPasswordField1 = new JPasswordField();
        this.jButton1 = new JButton();
        this.setDefaultCloseOperation(3);
        this.jLabel2.setText("password ");
        this.jTextField1.setFont(new Font("Segoe UI", 1, 16));
        this.jTextField1.setForeground(new Color(153, 0, 0));
        //this.jTextField1.setText(" ");
        this.jLabel4.setText("username");
        this.jButton1.setFocusable(false);
        this.jButton1.addActionListener(this);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(109, 109, 109).addComponent(this.jLabel1, -2, 173, -2)).addGroup(layout.createSequentialGroup().addGap(23, 23, 23).addComponent(this.jTextField1, -2, 345, -2)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel4)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel2))).addGroup(layout.createSequentialGroup().addGap(21, 21, 21).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton1).addComponent(this.jPasswordField1, -2, 347, -2)))).addContainerGap(32, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(36, 36, 36).addComponent(this.jLabel1, -2, 36, -2).addGap(18, 18, 18).addComponent(this.jLabel4, -2, 22, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jTextField1, -2, 33, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel2, -2, 22, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jPasswordField1, -2, 35, -2).addGap(18, 18, 18).addComponent(this.jButton1).addContainerGap(33, 32767)));
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==jButton1)
        {
            ArrayList<String> arrayList=new ArrayList<>();
            arrayList.add("admin");
            String password=String.valueOf(jPasswordField1.getPassword());
            String username =jTextField1.getText();
            if (arrayList.contains(username) && arrayList.contains(password))
            {

                admin interfaceAdministrateur=new admin();
                this.dispose();

            }
            else  {
                for (Client client:inter.hotel.clients) {
                    if (client.password.equals(jPasswordField1.getText()) && client.nom.equals(jTextField1.getText()))
                    {
                        clienthui interfaceClient=new clienthui(client);
                        this.dispose();
                        break;
                    }
                    break;
                }


                this.dispose();
            }
            }


        }
    }


