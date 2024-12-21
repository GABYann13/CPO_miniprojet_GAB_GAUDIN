/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package premierprojettest;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author yann
 */
public class FenêtrePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FenêtrePrincipal
     */
    Color[] palette = {Color.GRAY, Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.MAGENTA, Color.WHITE, Color.PINK };
    Pion_Graphique[][] GrilleB = new Pion_Graphique[10][4];
    int ligneValide= 0;
    Color[] Solution = new Color[4];
    public FenêtrePrincipal() {
        
        initComponents();
         int nbLignes = 10;
        int nbColonnes = 4;
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i=0; i < nbLignes; i++) {
           
            for (int j=0; j < nbColonnes; j++ ) {
                Pion_Graphique bouton_cellule = new Pion_Graphique(palette);
                if (i!=0){
                    bouton_cellule.setCliquable();
                }
                GrilleB[i][j]= bouton_cellule;
                PanneauGrille.add(bouton_cellule);
            }
        }
        int nbtLignes = 1;
        int nbtColonnes = 8;
        ChoixCouleurs.setLayout(new GridLayout(nbtLignes, nbtColonnes));
        for (int i=0; i < nbtLignes; i++) {
            for (int j=0; j < nbtColonnes; j++ ) {
                JButton bouton_cellule = new JButton(); // création d'un bouton
                bouton_cellule.setBackground(palette[j+1]);
                ChoixCouleurs.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }
        
        OptionMaster.setLayout(new GridLayout(3, 1));
        Solution[0] = Color.MAGENTA;
        Solution[1] = Color.YELLOW;
        Solution[2] = Color.BLUE;
        Solution[3] = Color.WHITE;
        JButton [][] aideSolu = new JButton[10][4];
        aideSolution.setLayout(new GridLayout(10, 4));
        for (int i =0;i<10;i++){
            for (int j =0;j<4;j++){
                JButton bouton = new JButton();
                bouton.setBackground(Color.WHITE);
                aideSolu[i][j]=bouton;
                aideSolution.add(bouton);
            }
        }    
        JButton jButton1 = new javax.swing.JButton();
        JButton jButton2 = new javax.swing.JButton();
        JButton jButton3 = new javax.swing.JButton();
        jButton1.setText("Valider ");
        jButton1.addActionListener(new ActionListener() {
    @Override
        public void actionPerformed(ActionEvent e) {
            GrilleB[ligneValide][0].setCliquable();
            GrilleB[ligneValide][1].setCliquable();
            GrilleB[ligneValide][2].setCliquable();
            GrilleB[ligneValide][3].setCliquable();
            if(GrilleB[ligneValide][0].getCurrentColor()==Solution[0]){
                aideSolu[ligneValide][0].setBackground(Color.BLACK);
            }
            else if(GrilleB[ligneValide][0].getCurrentColor()==Solution[1] || GrilleB[ligneValide][0].getCurrentColor()==Solution[2] || GrilleB[ligneValide][0].getCurrentColor()==Solution[3]){
                aideSolu[ligneValide][0].setBackground(Color.GRAY);
            }
            if(GrilleB[ligneValide][1].getCurrentColor()==Solution[1]){
                aideSolu[ligneValide][1].setBackground(Color.BLACK);
            }
            else if(GrilleB[ligneValide][1].getCurrentColor()==Solution[0] || GrilleB[ligneValide][1].getCurrentColor()==Solution[2] || GrilleB[ligneValide][1].getCurrentColor()==Solution[3]){
                aideSolu[ligneValide][1].setBackground(Color.GRAY);
            }
            if(GrilleB[ligneValide][2].getCurrentColor()==Solution[2]){
                aideSolu[ligneValide][2].setBackground(Color.BLACK);
            }
            else if(GrilleB[ligneValide][2].getCurrentColor()==Solution[0] || GrilleB[ligneValide][2].getCurrentColor()==Solution[1] || GrilleB[ligneValide][2].getCurrentColor()==Solution[3]){
                aideSolu[ligneValide][2].setBackground(Color.GRAY);
            }
            if(GrilleB[ligneValide][3].getCurrentColor()==Solution[3]){
                aideSolu[ligneValide][3].setBackground(Color.BLACK);
            }
            else if(GrilleB[ligneValide][3].getCurrentColor()==Solution[0] || GrilleB[ligneValide][3].getCurrentColor()==Solution[1] || GrilleB[ligneValide][3].getCurrentColor()==Solution[2]){
                aideSolu[ligneValide][3].setBackground(Color.GRAY);
            }
            ligneValide++;
            GrilleB[ligneValide][0].setCliquable();
            GrilleB[ligneValide][1].setCliquable();
            GrilleB[ligneValide][2].setCliquable();
            GrilleB[ligneValide][3].setCliquable();
        }
    });
    jButton2.setText("Règles");
    jButton3.setText("Quitter");
    OptionMaster.add(jButton1);
    OptionMaster.add(jButton2);
    OptionMaster.add(jButton3);

    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        OptionMaster = new javax.swing.JPanel();
        aideSolution = new javax.swing.JPanel();
        ChoixCouleurs = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 102, 255));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 400, 500));

        OptionMaster.setBackground(new java.awt.Color(255, 255, 0));
        OptionMaster.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout OptionMasterLayout = new javax.swing.GroupLayout(OptionMaster);
        OptionMaster.setLayout(OptionMasterLayout);
        OptionMasterLayout.setHorizontalGroup(
            OptionMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        OptionMasterLayout.setVerticalGroup(
            OptionMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(OptionMaster, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 240, 500));

        aideSolution.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout aideSolutionLayout = new javax.swing.GroupLayout(aideSolution);
        aideSolution.setLayout(aideSolutionLayout);
        aideSolutionLayout.setHorizontalGroup(
            aideSolutionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        aideSolutionLayout.setVerticalGroup(
            aideSolutionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(aideSolution, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 500));

        ChoixCouleurs.setBackground(new java.awt.Color(204, 0, 255));
        ChoixCouleurs.setPreferredSize(new java.awt.Dimension(880, 350));

        javax.swing.GroupLayout ChoixCouleursLayout = new javax.swing.GroupLayout(ChoixCouleurs);
        ChoixCouleurs.setLayout(ChoixCouleursLayout);
        ChoixCouleursLayout.setHorizontalGroup(
            ChoixCouleursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        ChoixCouleursLayout.setVerticalGroup(
            ChoixCouleursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        getContentPane().add(ChoixCouleurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 880, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FenêtrePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenêtrePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenêtrePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenêtrePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenêtrePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChoixCouleurs;
    private javax.swing.JPanel OptionMaster;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JPanel aideSolution;
    // End of variables declaration//GEN-END:variables
}
