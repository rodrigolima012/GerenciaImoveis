/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.Desenvolvimento;
//Bibliotecas

import java.awt.Color;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;


public class Splash extends JWindow{

AbsoluteLayout absoluto;
AbsoluteConstraints absimagem, absbarra;
ImageIcon image;
JLabel jLabel;
JProgressBar barra;


public void SplashTela() {

    absoluto = new AbsoluteLayout();
    absimagem = new AbsoluteConstraints(0, 0);
    absbarra = new AbsoluteConstraints(0, 284);
    jLabel = new JLabel();
    image = new ImageIcon(this.getClass().getResource("/IconeSistema/EnviarEmail.gif"));
    jLabel.setIcon(image);
    barra = new JProgressBar();
    barra.setPreferredSize(new Dimension(285, 10));
    this.getContentPane().setLayout(absoluto);
    this.getContentPane().add(jLabel, absimagem);
    this.getContentPane().add(barra, absbarra);
    this.getContentPane().setBackground(Color.white);

    new Thread() {

        @Override
        public void run() {
            int i = 0;
            while (i < 101) {
                barra.setValue(i);
                i++;
                try {
                    sleep(150);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }.start();
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    this.toFront();

}

}
