/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redes;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author joaof
 */
public class Dijkstra extends javax.swing.JFrame {

    /**
     * Creates new form Dijkstra
     */
    public Dijkstra() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        n0 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        n3 = new javax.swing.JTextField();
        n4 = new javax.swing.JTextField();
        n5 = new javax.swing.JTextField();
        n6 = new javax.swing.JTextField();
        n7 = new javax.swing.JTextField();
        n8 = new javax.swing.JTextField();
        n9 = new javax.swing.JTextField();
        n10 = new javax.swing.JTextField();
        n11 = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        n0.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ActionPerformed(evt);
            }
        });

        jButton1.setText("PROCURAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("RECOMEÇAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        n1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        n2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        n3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        n4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });

        n5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });

        n6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });

        n7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });

        n8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });

        n9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });

        n10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n10ActionPerformed(evt);
            }
        });

        n11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        n11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(n10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(n11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        pack();
    }// </editor-fold>                        

    private void n0ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void n10ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void n11ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int vt[];
        vt = new int[12];
        vt[0] = Integer.parseInt(n0.getText());
        vt[1] = Integer.parseInt(n1.getText());
        vt[2] = Integer.parseInt(n2.getText());
        vt[3] = Integer.parseInt(n3.getText());
        vt[4] = Integer.parseInt(n4.getText());
        vt[5] = Integer.parseInt(n5.getText());
        vt[6] = Integer.parseInt(n6.getText());
        vt[7] = Integer.parseInt(n7.getText());
        vt[8] = Integer.parseInt(n8.getText());
        vt[9] = Integer.parseInt(n9.getText());
        vt[10] = Integer.parseInt(n10.getText());
        vt[11] = Integer.parseInt(n11.getText());
        
        int cam[];
        cam = new int [9];
        cam[0] = vt[0]+vt[1]+vt[2]+vt[3]+vt[7]+vt[11];
        cam[1] = vt[0]+vt[1]+vt[2]+vt[6]+vt[7]+vt[11];
        cam[2] = vt[0]+vt[1]+vt[5]+vt[6]+vt[7]+vt[11];
        cam[3] = vt[0]+vt[4]+vt[5]+vt[6]+vt[7]+vt[11];
        cam[4] = vt[0]+vt[1]+vt[2]+vt[6]+vt[10]+vt[11];
        cam[5] = vt[0]+vt[4]+vt[5]+vt[6]+vt[10]+vt[11];
        cam[6] = vt[0]+vt[1]+vt[5]+vt[9]+vt[10]+vt[11];
        cam[7] = vt[0]+vt[4]+vt[5]+vt[8]+vt[10]+vt[11];
        cam[8] = vt[0]+vt[4]+vt[8]+vt[9]+vt[10]+vt[11];
        int y= 0;
        int x = 0;
       
        for(int i = 0;i<=8;i++){
           if( cam[i]<= cam[y]){
               y = i;
               x = cam[i];
               
           }
           
           
           
        }
        
        
        if (x == cam[0]){
            n0.setBackground(Color.green);
            n1.setBackground(Color.green);
            n2.setBackground(Color.green);
            n3.setBackground(Color.green);
            n7.setBackground(Color.green);
            n11.setBackground(Color.green);
            
        }
        if (x == cam[1]){
            n0.setBackground(Color.green);
            n1.setBackground(Color.green);
            n2.setBackground(Color.green);
            n6.setBackground(Color.green);
            n7.setBackground(Color.green);
            n11.setBackground(Color.green);
            
        }
        if (x == cam[2]){
            n0.setBackground(Color.green);
            n1.setBackground(Color.green);
            n5.setBackground(Color.green);
            n6.setBackground(Color.green);
            n7.setBackground(Color.green);
            n11.setBackground(Color.green);
            
        }
        if (x == cam[3]){
            n0.setBackground(Color.green);
            n4.setBackground(Color.green);
            n5.setBackground(Color.green);
            n6.setBackground(Color.green);
            n7.setBackground(Color.green);
            n11.setBackground(Color.green);
            
        }
        if (x == cam[4]){
            n0.setBackground(Color.green);
            n1.setBackground(Color.green);
            n2.setBackground(Color.green);
            n6.setBackground(Color.green);
            n10.setBackground(Color.green);
            n11.setBackground(Color.green);
            
        }
        if (x == cam[5]){
            n0.setBackground(Color.green);
            n4.setBackground(Color.green);
            n5.setBackground(Color.green);
            n6.setBackground(Color.green);
            n10.setBackground(Color.green);
            n11.setBackground(Color.red);
            
        }
        if (x == cam[6]){
            n0.setBackground(Color.green);
            n1.setBackground(Color.green);
            n5.setBackground(Color.green);
            n9.setBackground(Color.green);
            n10.setBackground(Color.green);
            n11.setBackground(Color.green);
            
        }
        if (x == cam[7]){
            n0.setBackground(Color.green);
            n4.setBackground(Color.green);
            n5.setBackground(Color.green);
            n9.setBackground(Color.green);
            n10.setBackground(Color.green);
            n11.setBackground(Color.green);
            
        }
        if (x == cam[8]){
            n0.setBackground(Color.green);
            n4.setBackground(Color.green);
            n8.setBackground(Color.green);
            n9.setBackground(Color.green);
            n10.setBackground(Color.green);
            n11.setBackground(Color.green);
            
        }
           JOptionPane.showMessageDialog(null,"Soma :"+x); 
        
        
        
        
        
        
        
        
         
         
         
        
        
        
        
        
        
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
 n0.setBackground(Color.white);
 n1.setBackground(Color.white);
 n2.setBackground(Color.white);
 n3.setBackground(Color.white);
 n4.setBackground(Color.white);
 n5.setBackground(Color.white);
 n6.setBackground(Color.white);
 n7.setBackground(Color.white);
 n8.setBackground(Color.white);
 n9.setBackground(Color.white);
 n10.setBackground(Color.white);
 n11.setBackground(Color.white);
 
 n0.setText("");
 n1.setText("");
 n2.setText("");
 n3.setText("");
 n4.setText("");
 n5.setText("");
 n6.setText("");
 n7.setText("");
 n8.setText("");
 n9.setText("");
 n10.setText("");
 n11.setText("");
    }                                        

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
            java.util.logging.Logger.getLogger(Dijkstra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dijkstra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dijkstra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dijkstra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dijkstra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField n0;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n10;
    private javax.swing.JTextField n11;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField n3;
    private javax.swing.JTextField n4;
    private javax.swing.JTextField n5;
    private javax.swing.JTextField n6;
    private javax.swing.JTextField n7;
    private javax.swing.JTextField n8;
    private javax.swing.JTextField n9;
    // End of variables declaration                   
}
