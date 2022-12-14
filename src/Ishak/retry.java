
package Ishak;

import java.awt.Color;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class retry extends javax.swing.JFrame {

    
    public retry() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JButton();
        score1 = new javax.swing.JLabel();
        retry = new javax.swing.JButton();
        bd = new javax.swing.JLabel();
        bd2 = new javax.swing.JLabel();
        bd3 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new java.awt.Dimension(1370, 750));
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(null);

        exit.setBackground(new java.awt.Color(0, 0, 0));
        exit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("EXIT");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(1030, 670, 340, 70);

        score1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        score1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(score1);
        score1.setBounds(450, 590, 480, 60);

        retry.setBackground(new java.awt.Color(0, 0, 0));
        retry.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        retry.setForeground(new java.awt.Color(255, 255, 255));
        retry.setText("RETRY");
        retry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        retry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                retryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                retryMouseExited(evt);
            }
        });
        retry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retryActionPerformed(evt);
            }
        });
        getContentPane().add(retry);
        retry.setBounds(0, 670, 340, 70);

        bd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/7.gif"))); // NOI18N
        bd.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(bd);
        bd.setBounds(-40, 50, 220, 160);

        bd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flying-bird.gif"))); // NOI18N
        getContentPane().add(bd2);
        bd2.setBounds(1250, 220, 160, 150);

        bd3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BaldEagleFlyingAnimationRightSide.gif"))); // NOI18N
        bd3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(bd3);
        bd3.setBounds(1220, 80, 220, 160);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background4.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1410, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
     System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void retryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryActionPerformed
       bird b=new bird();
       b.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_retryActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        java.util.Timer t = new java.util.Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                int a = bd.getX();
                int b = bd.getY();
                if (a > 1500) {
                    a = -100;
                }
                if (b < 200) {
                    b = 100;
                }
                if (b > 360) {
                    b = 150;
                }

                bd.setLocation(a += 10, b);

            }
        }, 25, 25);

        java.util.Timer l = new java.util.Timer();
        l.schedule(new TimerTask() {
            @Override
            public void run() {
                int a2 = bd2.getX();
                int b2 = bd2.getY();
                if (a2 < -100) {
                    a2 = 1400;
                }
                if (b2 < 0) {
                    b2 = 200;
                }
                if (b2 > 360) {
                    b2 = 300;
                }

                bd2.setLocation(a2 -= 7, b2);

            }
        }, 17, 17);

        java.util.Timer n = new java.util.Timer();
        n.schedule(new TimerTask() {
            @Override
            public void run() {
                int a3 = bd3.getX();
                int b3 = bd3.getY();

                if (a3 < -100) {
                    a3 = 2400;
                }
                if (b3 < 0) {
                    b3 = 100;
                }
                if (b3 > 360) {
                    b3 = 250;
                }
                bd3.setLocation(a3 -= 7, b3);

            }
        }, 15, 15);
    }//GEN-LAST:event_formWindowOpened

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setBackground(Color.red);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBackground(Color.black);
    }//GEN-LAST:event_exitMouseExited

    private void retryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retryMouseEntered
        retry.setBackground(Color.green);
    }//GEN-LAST:event_retryMouseEntered

    private void retryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retryMouseExited
        retry.setBackground(Color.black);
    }//GEN-LAST:event_retryMouseExited

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
      
    }//GEN-LAST:event_formMouseEntered

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
         int x=evt.getX();
        if(x<685){
            retry.setBackground(Color.green);
            exit.setBackground(Color.black);
        }
        else{retry.setBackground(Color.black);
            exit.setBackground(Color.red);
            
        }
    }//GEN-LAST:event_formMouseMoved

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        int x=evt.getX();
        if(x<685){
            retry.doClick();
        }
        else{
            exit.doClick();
        }
    }//GEN-LAST:event_formMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new retry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bd;
    private javax.swing.JLabel bd2;
    private javax.swing.JLabel bd3;
    private javax.swing.JLabel bg;
    private javax.swing.JButton exit;
    private javax.swing.JButton retry;
    public static javax.swing.JLabel score1;
    // End of variables declaration//GEN-END:variables
}
