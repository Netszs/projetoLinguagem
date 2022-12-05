/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.lanchonete.view;

//import br.com.lanchonete.rdn.ConnectionFactory;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author NB004
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ConnectionFactory conTeste = new ConnectionFactory();
        //conTeste.getConnection();
        
        // TODO code application logic here

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                JanelaPrincipal principal = new JanelaPrincipal();
                //  principal.pack();      

                /*Insets in = Toolkit.getDefaultToolkit().getScreenInsets(principal.getGraphicsConfiguration());

                Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

                int width = d.width - (in.left + in.top);
                int height = d.height - (in.top + in.bottom);

                principal.setSize(width, height);
                principal.setLocation(in.left, in.top);*/

                principal.setVisible(true);

                // Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                //double width = screenSize.getWidth();
                //double height = screenSize.getHeight();
                // principal.setSize(screenSize);
                //new JanelaPrincipal().setVisible(true);
                //principal.setExtendedState();
            }
        });

    }

}
