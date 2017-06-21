package LockScreen;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LockScreen extends javax.swing.JFrame {
    
    String mastercode = "0907";
    
    int Code1;
    int Code2;
    int Code3;
    int Code4;
    
    int buttonClick;
    
    int count;
    
    ImageIcon filled = new ImageIcon(getClass().getResource("/images/circle_filled.png"));
    ImageIcon unfilled = new ImageIcon(getClass().getResource("/images/circle_unfilled.png"));
    
    public LockScreen() {
        initComponents();
    }
    
    public void circleControl()
    {
        count++;
        
        switch(count)
        {
            case 1:
                code1.setIcon(filled);
                Code1 = buttonClick;
                break;
            case 2:
                code2.setIcon(filled);
                Code2 = buttonClick;
                break;
            case 3 :
                code3.setIcon(filled);
                Code3 = buttonClick;
                break;
            case 4 :
                code4.setIcon(filled);
                Code4 = buttonClick;
                
                String masterTest = Code1 + "" + Code2 + "" + Code3 + "" + Code4;
                
                if(masterTest.equals(mastercode))
                {
                    JOptionPane.showMessageDialog(null, "Your Password is Correct");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Your Password is Wrong");
                }
                
                code1.setIcon(unfilled);
                code2.setIcon(unfilled);
                code3.setIcon(unfilled);
                code4.setIcon(unfilled);
                
                count = 0;
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        number0 = new javax.swing.JLabel();
        number1 = new javax.swing.JLabel();
        number2 = new javax.swing.JLabel();
        number3 = new javax.swing.JLabel();
        number4 = new javax.swing.JLabel();
        number5 = new javax.swing.JLabel();
        number6 = new javax.swing.JLabel();
        number7 = new javax.swing.JLabel();
        number8 = new javax.swing.JLabel();
        number9 = new javax.swing.JLabel();
        code1 = new javax.swing.JLabel();
        code2 = new javax.swing.JLabel();
        code3 = new javax.swing.JLabel();
        code4 = new javax.swing.JLabel();
        numberpad = new javax.swing.JLabel();
        Passcode = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lockscreen");
        setMinimumSize(new java.awt.Dimension(295, 460));
        setResizable(false);
        getContentPane().setLayout(null);

        number0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        number0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                number0MouseReleased(evt);
            }
        });
        getContentPane().add(number0);
        number0.setBounds(118, 342, 60, 60);

        number1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        number1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                number1MouseReleased(evt);
            }
        });
        getContentPane().add(number1);
        number1.setBounds(32, 130, 60, 60);

        number2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        number2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                number2MouseReleased(evt);
            }
        });
        getContentPane().add(number2);
        number2.setBounds(118, 130, 60, 60);

        number3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        number3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                number3MouseReleased(evt);
            }
        });
        getContentPane().add(number3);
        number3.setBounds(200, 130, 60, 60);

        number4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        number4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                number4MouseReleased(evt);
            }
        });
        getContentPane().add(number4);
        number4.setBounds(32, 199, 60, 60);

        number5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        number5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                number5MouseReleased(evt);
            }
        });
        getContentPane().add(number5);
        number5.setBounds(118, 199, 60, 60);

        number6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        number6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                number6MouseReleased(evt);
            }
        });
        getContentPane().add(number6);
        number6.setBounds(200, 199, 60, 60);

        number7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        number7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                number7MouseReleased(evt);
            }
        });
        getContentPane().add(number7);
        number7.setBounds(32, 270, 60, 60);

        number8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        number8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                number8MouseReleased(evt);
            }
        });
        getContentPane().add(number8);
        number8.setBounds(118, 270, 60, 60);

        number9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        number9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                number9MouseReleased(evt);
            }
        });
        getContentPane().add(number9);
        number9.setBounds(200, 270, 60, 60);

        code1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circle_unfilled.png"))); // NOI18N
        getContentPane().add(code1);
        code1.setBounds(95, 70, 15, 15);

        code2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circle_unfilled.png"))); // NOI18N
        getContentPane().add(code2);
        code2.setBounds(125, 70, 15, 15);

        code3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circle_unfilled.png"))); // NOI18N
        getContentPane().add(code3);
        code3.setBounds(155, 70, 15, 15);

        code4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circle_unfilled.png"))); // NOI18N
        getContentPane().add(code4);
        code4.setBounds(185, 70, 15, 15);

        numberpad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/numbers.png"))); // NOI18N
        getContentPane().add(numberpad);
        numberpad.setBounds(0, 120, 295, 290);

        Passcode.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        Passcode.setText("Enter Passcode");
        getContentPane().add(Passcode);
        Passcode.setBounds(90, 30, 120, 30);

        background.setBackground(new java.awt.Color(103, 65, 114));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 295, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void number1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number1MouseReleased
        buttonClick = 1;
        circleControl();
    }//GEN-LAST:event_number1MouseReleased

    private void number2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number2MouseReleased
        buttonClick = 2;
        circleControl();
    }//GEN-LAST:event_number2MouseReleased

    private void number3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number3MouseReleased
        buttonClick = 3;
        circleControl();
    }//GEN-LAST:event_number3MouseReleased

    private void number4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number4MouseReleased
        buttonClick = 4;
        circleControl();
    }//GEN-LAST:event_number4MouseReleased

    private void number5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number5MouseReleased
        buttonClick = 5;
        circleControl();
    }//GEN-LAST:event_number5MouseReleased

    private void number6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number6MouseReleased
        buttonClick = 6;
        circleControl();
    }//GEN-LAST:event_number6MouseReleased

    private void number7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number7MouseReleased
        buttonClick = 7;
        circleControl();
    }//GEN-LAST:event_number7MouseReleased

    private void number8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number8MouseReleased
        buttonClick = 8;
        circleControl();
    }//GEN-LAST:event_number8MouseReleased

    private void number9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number9MouseReleased
        buttonClick = 9;
        circleControl();
    }//GEN-LAST:event_number9MouseReleased

    private void number0MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number0MouseReleased
        buttonClick = 0;
        circleControl();
    }//GEN-LAST:event_number0MouseReleased

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LockScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LockScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LockScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LockScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LockScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Passcode;
    private javax.swing.JLabel background;
    private javax.swing.JLabel code1;
    private javax.swing.JLabel code2;
    private javax.swing.JLabel code3;
    private javax.swing.JLabel code4;
    private javax.swing.JLabel number0;
    private javax.swing.JLabel number1;
    private javax.swing.JLabel number2;
    private javax.swing.JLabel number3;
    private javax.swing.JLabel number4;
    private javax.swing.JLabel number5;
    private javax.swing.JLabel number6;
    private javax.swing.JLabel number7;
    private javax.swing.JLabel number8;
    private javax.swing.JLabel number9;
    private javax.swing.JLabel numberpad;
    // End of variables declaration//GEN-END:variables
}
