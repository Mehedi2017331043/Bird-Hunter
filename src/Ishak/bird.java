
package Ishak;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class bird extends javax.swing.JFrame {

    boolean click = false, dragging = false, blood = false;
    int b = 1, bullet = 5, d = 0, n = 3;
    int s = 1, seconds = 60, minute = 1;
    java.util.Timer sparkTimer = null;
    int b1 = 5, b2 = 5, b3 = 5;
    AudioStream BGMGlobal, tick;
    int prevR = 0, r = 1;
    java.util.Timer timeKeeper = null;
    TimerTask timeKeeperTask = new TimerTask() {
        @Override
        public void run() {

            String prefix = "";

            if (seconds > 0) {
                minute = --seconds / 60;
                if ((seconds % 60 + "").length() < 2) {
                    prefix = "0";
                } else {
                    prefix = "";
                }

                if (minute != 0) {
                    sec.setForeground(Color.black);
                    sec.setText(minute + ":" + prefix + seconds % 60);
                } else {
                    if (seconds <= 10) {
                        sound("tick");
                        stopBGM(BGMGlobal);
                        sec.setForeground(Color.red);
                    } else {
                        sec.setForeground(Color.black);
                    }
                    sec.setText(prefix + seconds % 60 + "");
                }
            } else if (s - 1 < 10) {
                this.cancel();
                retry a = new retry();
                a.setVisible(true);
                retry.score1.setText(" You scored " + (s - 1));
                bird.this.dispose();
            }

        }
    };


    public bird() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        g = new javax.swing.JLabel();
        spark = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();
        bd2 = new javax.swing.JLabel();
        bd3 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bd = new javax.swing.JLabel();
        bullets = new javax.swing.JLabel();
        bullets1 = new javax.swing.JLabel();
        bullets2 = new javax.swing.JLabel();
        bullets4 = new javax.swing.JLabel();
        bullets3 = new javax.swing.JLabel();
        bd4 = new javax.swing.JLabel();
        bd1 = new javax.swing.JLabel();
        target = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new java.awt.Dimension(1370, 750));
        setUndecorated(true);
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("AR DELANEY", 2, 36)); // NOI18N
        jLabel1.setText("LEVEL 1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(670, 0, 150, 40);

        g.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gun.png"))); // NOI18N
        getContentPane().add(g);
        g.setBounds(830, 590, 290, 180);

        spark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spark.png"))); // NOI18N
        getContentPane().add(spark);
        spark.setBounds(870, 540, 110, 130);

        sec.setFont(new java.awt.Font("Jokerman", 1, 40)); // NOI18N
        sec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sec.setText("Time 1:00");
        getContentPane().add(sec);
        sec.setBounds(640, 40, 200, 50);

        bd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flying-bird.gif"))); // NOI18N
        getContentPane().add(bd2);
        bd2.setBounds(1250, 220, 160, 150);

        bd3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BaldEagleFlyingAnimationRightSide.gif"))); // NOI18N
        bd3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(bd3);
        bd3.setBounds(1220, 80, 220, 160);

        score.setFont(new java.awt.Font("AR DARLING", 0, 40)); // NOI18N
        score.setText("0");
        getContentPane().add(score);
        score.setBounds(1270, 0, 80, 40);

        jLabel2.setFont(new java.awt.Font("AR DARLING", 0, 40)); // NOI18N
        jLabel2.setText("SCORE:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1090, 0, 170, 40);

        bd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/7.gif"))); // NOI18N
        bd.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(bd);
        bd.setBounds(-40, 50, 220, 160);

        bullets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1.png"))); // NOI18N
        getContentPane().add(bullets);
        bullets.setBounds(-20, 0, 35, 56);

        bullets1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1.png"))); // NOI18N
        getContentPane().add(bullets1);
        bullets1.setBounds(0, 0, 40, 56);

        bullets2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1.png"))); // NOI18N
        getContentPane().add(bullets2);
        bullets2.setBounds(20, 0, 40, 56);

        bullets4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1.png"))); // NOI18N
        getContentPane().add(bullets4);
        bullets4.setBounds(60, 0, 40, 56);

        bullets3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1.png"))); // NOI18N
        getContentPane().add(bullets3);
        bullets3.setBounds(40, 0, 40, 56);

        bd4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood5.gif"))); // NOI18N
        bd4.setText("1");
        bd4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(bd4);
        bd4.setBounds(220, 200, 90, 90);

        bd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dodo-bird-animation.gif"))); // NOI18N
        bd1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(bd1);
        bd1.setBounds(1300, 520, 120, 130);

        target.setFont(new java.awt.Font("AR DARLING", 0, 40)); // NOI18N
        target.setText("Target: 10 birds");
        getContentPane().add(target);
        target.setBounds(220, 0, 300, 45);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background4.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1410, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        bd3.setLocation(2400, 80);
        bd4.setVisible(false);
        bd1.setLocation(5400, 500);
        BGMGlobal = soundBGM();
        spark.setVisible(false);

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
        java.util.Timer o = new java.util.Timer();
        o.schedule(new TimerTask() {
            @Override
            public void run() {
                int a3 = bd1.getX();
                int b3 = bd1.getY();

                if (a3 < -100) {
                    a3 = 5400;
                }
                bd1.setLocation(a3 -= 5, b3);

            }
        }, 20, 20);
        timeKeeper = new java.util.Timer();
        timeKeeper.schedule(timeKeeperTask, 1000, 1000);


    }//GEN-LAST:event_formWindowOpened

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage(getClass().getResource("aim1.png"));
        Cursor a = toolkit.createCustomCursor(image, new Point(this.getX(), this.getY()), "");
        this.setCursor(a);
    }//GEN-LAST:event_formMouseEntered

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        int a = evt.getX();
        int b = g.getY();
        int c = spark.getY();
        if (a < 1100) {
            g.setLocation(a, b);
            spark.setLocation(a += 10, c);
        }

    }//GEN-LAST:event_formMouseMoved

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

        if (!dragging) {
            dragging = true;
            switch (bullet) {
            case 0:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                bullets2.setVisible(true);
                bullets3.setVisible(true);
                bullets4.setVisible(true);
                spark.setVisible(false);
                bullet = 5;
                d = 1;
                sound("reload");

                break;
            case 1:
                spark.setVisible(true);
                bullets.setVisible(false);
                bullets1.setVisible(false);
                bullets2.setVisible(false);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                bullet--;
                d = 0;
                sound("gunshot");

                break;
            case 2:
                bullets.setVisible(true);
                bullets1.setVisible(false);
                spark.setVisible(true);
                bullets2.setVisible(false);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                bullet--;
                d = 0;
                sound("gunshot");

                break;
            case 3:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                spark.setVisible(true);
                bullets2.setVisible(false);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                bullet--;
                d = 0;
                sound("gunshot");

                break;
            case 4:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                spark.setVisible(true);
                bullets2.setVisible(true);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                bullet--;
                d = 0;
                sound("gunshot");
                break;
            case 5:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                spark.setVisible(true);
                bullets2.setVisible(true);
                bullets3.setVisible(true);
                bullets4.setVisible(false);
                bullet--;
                d = 0;
                sound("gunshot");
                break;

            default:
                break;
        }
        if (d != 1) {
            int x = evt.getX();
            int y = evt.getY();
            int a = bd.getX();
            int a1 = bd1.getX();
            int b1 = bd1.getY();

            int a2 = bd2.getX();
            int a3 = bd3.getX();
            int b2 = bd2.getY();
            int b3 = bd3.getY();
            int b = bd.getY();
            int arr[] = {
                10, 70, 50, 200, 150, 60, 130, 220, 70, 100, 250, 75, -40, -50, -10, -56, -12, 103, 85, 40, 190, 160
            };
            r = 0 + (int) (Math.random() * arr.length);
            prevR = r;

            if (x >= a + 50 && x <= a + 135 && y >= b + 52 && y <= b + 82) {

                if (y > 360) {
                    score.setText(s++ + "");
                    bd.setLocation(-1225, 0);
                    bd4.setLocation(x, y);
                    bd4.setVisible(true);

                } else {
                    score.setText(s++ + "");
                    bd.setLocation(-1225, b + arr[r]);
                    bd4.setLocation(x, y);
                    bd4.setVisible(true);

                }
                if (s - 1 >= 10) {
                    timeKeeper.cancel();
                    AudioPlayer.player.stop(tick);
                    JOptionPane.showMessageDialog(this, "Congatulation You Made It to Next Level");

                    bird2 nl = new bird2();
                    nl.setVisible(true);
                    this.dispose();

                }

            } else if (x >= a2 + 25 && x <= a2 + 70 && y >= b2 + 25 && y <= b2 + 70) {
                if (y > 360) {
                    score.setText(s++ + "");
                    bd2.setLocation(1450, 0);
                    bd4.setLocation(x, y);
                    bd4.setVisible(true);

                } else {
                    score.setText(s++ + "");
                    bd2.setLocation(1450, b2 + arr[r]);
                    bd4.setLocation(x, y);
                    bd4.setVisible(true);

                }
                if (s - 1 >= 10) {
                    timeKeeper.cancel();
                    AudioPlayer.player.stop(tick);
                    JOptionPane.showMessageDialog(this, "Congatulation You Made It to Next Level");
                    bird2 nl = new bird2();
                    nl.setVisible(true);
                    this.dispose();

                }

            } else if (x >= a3 + 40 && x <= a3 + 120 && y >= b3 + 55 && y <= b3 + 85) {
                if (y > 360) {
                    score.setText(s++ + "");
                    bd3.setLocation(2450, 0);
                    bd4.setLocation(x, y);
                    bd4.setVisible(true);

                } else {
                    score.setText(s++ + "");
                    bd3.setLocation(2450, b3 + arr[r]);
                    bd4.setLocation(x, y);
                    bd4.setVisible(true);
                }
                if (s - 1 >= 10) {
                    timeKeeper.cancel();
                    AudioPlayer.player.stop(tick);
                    JOptionPane.showMessageDialog(this, "Congatulation You Made It to Next Level");
                    bird2 nl = new bird2();
                    nl.setVisible(true);
                    this.dispose();

                }

            } else if ((x >= a1 + 32 && x <= a1 + 100 && y >= b1 + 30 && y <= b1 + 85) || (x >= a1 + 10 && x <= a1 + 50 && y >= b1 - 5 && y <= b1 + 20)) {

                score.setText(s++ + "");
                bd1.setLocation(5400, 500);
                bd4.setLocation(x, y);
                bd4.setVisible(true);
                if (s - 1 >= 10) {
                    timeKeeper.cancel();
                    AudioPlayer.player.stop(tick);
                    JOptionPane.showMessageDialog(this, "Congatulation You Made It to Next Level");
                    bird2 nl = new bird2();
                    nl.setVisible(true);
                    this.dispose();

                }

            }

        }
        if (bd4.isVisible()) {
            java.util.Timer t = new java.util.Timer();
            t.schedule(new TimerTask() {
                @Override
                public void run() {

                    bd4.setVisible(false);

                }
            }, 2000);

        }

        } else {
            int a = evt.getX();
            int b = g.getY();
            int c = spark.getY();
            if (a < 1100) {
                g.setLocation(a, b);
                spark.setLocation(a += 10, c);
            }

        }


    }//GEN-LAST:event_formMouseDragged

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        switch (n) {
            case 1:
                b1 = bullet;
                break;
            case 2:
                b2 = bullet;
                break;
            case 3:
                b3 = bullet;
                break;
            default:
                System.out.println("n<=0 || n>=4");
        }

        if (evt.getWheelRotation() >= 0) {
            n++;
            if (n > 3) {
                n = 1;
            }
        } else {
            n--;
            if (n < 1) {
                n = 3;
            }
        }

        switch (n) {
            case 1:
                g.setIcon(new ImageIcon(getClass().getClassLoader().getResource("g4.png")));
                spark.setVisible(false);
                bullet = b1;
                break;
            case 2:
                spark.setVisible(false);
                bullet = b2;
                g.setIcon(new ImageIcon(getClass().getClassLoader().getResource("g3.png")));
                break;
            case 3:
                bullet = b3;
                spark.setVisible(false);
                g.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gun.png")));
                break;
            default:
                break;
        }

        switch (bullet) {
            case 0:
                bullets.setVisible(false);
                bullets1.setVisible(false);
                bullets2.setVisible(false);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                break;
            case 1:
                bullets.setVisible(true);
                bullets1.setVisible(false);
                bullets2.setVisible(false);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                break;
            case 2:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                bullets2.setVisible(false);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                break;
            case 3:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                bullets2.setVisible(true);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                break;
            case 4:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                bullets2.setVisible(true);
                bullets3.setVisible(true);
                bullets4.setVisible(false);
                break;
            case 5:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                bullets2.setVisible(true);
                bullets3.setVisible(true);
                bullets4.setVisible(true);
                break;
        }
    }//GEN-LAST:event_formMouseWheelMoved

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
switch (bullet) {
            case 0:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                bullets2.setVisible(true);
                bullets3.setVisible(true);
                bullets4.setVisible(true);
                spark.setVisible(false);
                bullet = 5;
                d = 1;
                sound("reload");

                break;
            case 1:
                spark.setVisible(true);
                bullets.setVisible(false);
                bullets1.setVisible(false);
                bullets2.setVisible(false);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                bullet--;
                d = 0;
                sound("gunshot");

                break;
            case 2:
                bullets.setVisible(true);
                bullets1.setVisible(false);
                spark.setVisible(true);
                bullets2.setVisible(false);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                bullet--;
                d = 0;
                sound("gunshot");

                break;
            case 3:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                spark.setVisible(true);
                bullets2.setVisible(false);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                bullet--;
                d = 0;
                sound("gunshot");

                break;
            case 4:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                spark.setVisible(true);
                bullets2.setVisible(true);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                bullet--;
                d = 0;
                sound("gunshot");
                break;
            case 5:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                spark.setVisible(true);
                bullets2.setVisible(true);
                bullets3.setVisible(true);
                bullets4.setVisible(false);
                bullet--;
                d = 0;
                sound("gunshot");
                break;

            default:
                break;
        }
        if (d != 1) {
            int x = evt.getX();
            int y = evt.getY();
            int a = bd.getX();
            int a1 = bd1.getX();
            int b1 = bd1.getY();

            int a2 = bd2.getX();
            int a3 = bd3.getX();
            int b2 = bd2.getY();
            int b3 = bd3.getY();
            int b = bd.getY();
            int arr[] = {
                10, 70, 50, 200, 150, 60, 130, 220, 70, 100, 250, 75, -40, -50, -10, -56, -12, 103, 85, 40, 190, 160
            };
            r = 0 + (int) (Math.random() * arr.length);
            prevR = r;

            if (x >= a + 50 && x <= a + 135 && y >= b + 52 && y <= b + 82) {

                if (y > 360) {
                    score.setText(s++ + "");
                    bd.setLocation(-1225, 0);
                    bd4.setLocation(x, y);
                    bd4.setVisible(true);

                } else {
                    score.setText(s++ + "");
                    bd.setLocation(-1225, b + arr[r]);
                    bd4.setLocation(x, y);
                    bd4.setVisible(true);

                }
                if (s - 1 >= 10) {
                    timeKeeper.cancel();
                    AudioPlayer.player.stop(tick);
                    JOptionPane.showMessageDialog(this, "Congatulation You Made It to Next Level");

                    bird2 nl = new bird2();
                    nl.setVisible(true);
                    this.dispose();

                }

            } else if (x >= a2 + 25 && x <= a2 + 70 && y >= b2 + 25 && y <= b2 + 70) {
                if (y > 360) {
                    score.setText(s++ + "");
                    bd2.setLocation(1450, 0);
                    bd4.setLocation(x, y);
                    bd4.setVisible(true);

                } else {
                    score.setText(s++ + "");
                    bd2.setLocation(1450, b2 + arr[r]);
                    bd4.setLocation(x, y);
                    bd4.setVisible(true);

                }
                if (s - 1 >= 10) {
                    timeKeeper.cancel();
                    AudioPlayer.player.stop(tick);
                    JOptionPane.showMessageDialog(this, "Congatulation You Made It to Next Level");
                    bird2 nl = new bird2();
                    nl.setVisible(true);
                    this.dispose();

                }

            } else if (x >= a3 + 40 && x <= a3 + 120 && y >= b3 + 55 && y <= b3 + 85) {
                if (y > 360) {
                    score.setText(s++ + "");
                    bd3.setLocation(2450, 0);
                    bd4.setLocation(x, y);
                    bd4.setVisible(true);

                } else {
                    score.setText(s++ + "");
                    bd3.setLocation(2450, b3 + arr[r]);
                    bd4.setLocation(x, y);
                    bd4.setVisible(true);
                }
                if (s - 1 >= 10) {
                    timeKeeper.cancel();
                    AudioPlayer.player.stop(tick);
                    JOptionPane.showMessageDialog(this, "Congatulation You Made It to Next Level");
                    bird2 nl = new bird2();
                    nl.setVisible(true);
                    this.dispose();

                }

            } else if ((x >= a1 + 32 && x <= a1 + 100 && y >= b1 + 30 && y <= b1 + 85) || (x >= a1 + 10 && x <= a1 + 50 && y >= b1 - 5 && y <= b1 + 20)) {

                score.setText(s++ + "");
                bd1.setLocation(5400, 500);
                bd4.setLocation(x, y);
                bd4.setVisible(true);
                if (s - 1 >= 10) {
                    timeKeeper.cancel();
                    AudioPlayer.player.stop(tick);
                    JOptionPane.showMessageDialog(this, "Congatulation You Made It to Next Level");
                    bird2 nl = new bird2();
                    nl.setVisible(true);
                    this.dispose();

                }

            }

        }
        if (bd4.isVisible()) {
            java.util.Timer t = new java.util.Timer();
            t.schedule(new TimerTask() {
                @Override
                public void run() {

                    bd4.setVisible(false);

                }
            }, 2000);

        }
        
    }//GEN-LAST:event_formMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        if (sparkTimer != null) {
            sparkTimer.cancel();
        }
        if (spark.isVisible()) {
            sparkTimer = new java.util.Timer();
            sparkTimer.schedule(new TimerTask() {
                @Override
                public void run() {

                    spark.setVisible(false);

                }
            }, 200, 200);

        }


    }//GEN-LAST:event_formWindowActivated

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        dragging = false;
    }//GEN-LAST:event_formMouseReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            int currTime = pause();

            int choice = JOptionPane.showConfirmDialog(this, "Do You Want To Exit", "PAUSED", JOptionPane.YES_NO_OPTION);
            switch (choice) {
                case JOptionPane.YES_OPTION:
                    System.exit(0);
                    break;
                case JOptionPane.NO_OPTION:
                    resume(currTime);
                    break;
                default:
                    resume(currTime);
            }
        }

    }//GEN-LAST:event_formKeyPressed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus


    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated

    }//GEN-LAST:event_formWindowDeactivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        stopBGM(BGMGlobal);
        AudioPlayer.player.stop(tick);
    }//GEN-LAST:event_formWindowClosed
    public AudioStream soundBGM() {
        BGMGlobal = null;
        try {
            InputStream music = getClass().getResourceAsStream("/bg.wav");
            InputStream music1 = getClass().getResourceAsStream("/tick.wav");
            tick = new AudioStream(music1);
            BGMGlobal = new AudioStream(music);
            AudioPlayer.player.start(BGMGlobal);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        } finally {
            return BGMGlobal;
        }
    }

    private void stopBGM(AudioStream BGMGlobal) {
        AudioPlayer.player.stop(BGMGlobal);
    }

    public void sound(String nm) {
        AudioStream BGM;
        try {
            InputStream music = getClass().getResourceAsStream("/" + nm + ".wav");
            BGM = new AudioStream(music);
            AudioPlayer.player.start(BGM);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
    }

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bird().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bd;
    private javax.swing.JLabel bd1;
    private javax.swing.JLabel bd2;
    private javax.swing.JLabel bd3;
    private javax.swing.JLabel bd4;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bullets;
    private javax.swing.JLabel bullets1;
    private javax.swing.JLabel bullets2;
    private javax.swing.JLabel bullets3;
    private javax.swing.JLabel bullets4;
    private javax.swing.JLabel g;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel score;
    private javax.swing.JLabel sec;
    private javax.swing.JLabel spark;
    private javax.swing.JLabel target;
    // End of variables declaration//GEN-END:variables

    private int pause() {
        if (timeKeeper != null) {
            timeKeeper.cancel();
        }
        return seconds;
    }

    private void resume(int currTime) {
        spark.setVisible(true);
        seconds = currTime;
        timeKeeper = new Timer();
        timeKeeper.schedule(new TimerTask() {
            @Override
            public void run() {

                String prefix = "";

                if (seconds > 0) {
                    minute = --seconds / 60;
                    if ((seconds % 60 + "").length() < 2) {
                        prefix = "0";
                    } else {
                        prefix = "";
                    }
                    if (minute != 0) {
                        sec.setForeground(Color.black);
                        sec.setText(minute + ":" + prefix + seconds % 60);
                    } else {
                        if (seconds <= 10) {
                            sound("tick");
                            stopBGM(BGMGlobal);
                            sec.setForeground(Color.red);
                        } else {
                            sec.setForeground(Color.black);
                        }
                        sec.setText(prefix + seconds % 60 + "");
                    }
                } else {
                    this.cancel();
                    retry a = new retry();
                    a.setVisible(true);

                    retry.score1.setText(" You scored " + (s - 1));
                    bird.this.dispose();
                }

            }
        }, 1000, 1000);
    }
}
