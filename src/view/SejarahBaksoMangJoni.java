/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author ASUS
 */
public class SejarahBaksoMangJoni extends javax.swing.JFrame {

    /**
     * Creates new form SejarahBaksoMangJoni
     */
    public SejarahBaksoMangJoni() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Bakso JONI  keberhasilan pria Wonogiri\nModal 300ribu hasilkan puluhan juta perbulan\n\nUsaha Bakso Joni adalah salah satu contoh sukses pedangang bakso \nyang telah menjalankan usaha ini dalam kurun waktu puluhan tahun.\nUsaha yang digawangi bapak asli Wonogiri jawa tengan bernama sukino \nini bermula semuanya sejak tahun 1995. Pria usia 68 tahun ini, \nmengawali usaha berjualan baksonya dengan bermodal 300ribu.\n\nUsaha yang dirintis oleh pria yang mengaku merantaunke lampung sejak \n1980 ini, awalnya menjajakan baksonya berkeliling dikawasan kaliawi \ndengan pikulan kayu. Kesuksesan yang di raih sukino dengan merk \ndagang “Bakso Joni” saat ini bukan lah mulus-mulus saja tanpa masalah, \nakan tetapi suami dari sutarmi harus mengalami perjuangan yang \nbegitu sulit bagi diri dan keluarganya.\n\nDengan kesabaran dan penuh rasa cinta kasih membuat sukino semakin \nberkerja dengan giat. Dengan suatu tekad kelak dirinya akan \nmembahagiakan istri dan anak-anaknya dengan pernghasilan yang cukup. \nSukino mengisahkan, bahwa dirinya harus memikul gerobak itu selama \npuluhan tahun, banyak hasil yang didapat dalam mengarungi kehidupan \nitu.\n\nDiri nya harus mengetuk-ngetuk mangkuk baksonya sambil berteriak \nbakso…bakso…bakso,hingga ada orang yang memanggil untuk membeli \nbaksonya. “Kegembiraan yang tak ternilai saat dipanggil oleh \npembeli”, kisah Sukino menambahkan, dia selalu melayani pembeli \ndengan senyuman walaupun dirinya terlihat lelah, karena jarak \ntempus jualannya tidaknya dekat.\n\n“ke-lima anak sayalah yang menjadi sumber tenaga bagi saya sehingga \ntidak merasa kelelahan setiap harinya.” Kata sukino,yang mengaku \npernah mengalami masa-masa sulit berjualan bakso.\n\nSejak awal merintis usaha,sukino sudah meracit sendiri bakso dan \nbahan lainnya. Menurut dia kunci utama dari kesuksesannya adalah \nkualitas bakso yang selalu terjaga dan selalu memastikan daging \nbahan baku bakso adalah yang terbaik, dengan bumbu original. \nDengan berjalannya waktu, sukino kini berbeda dengan yang dulu, \nkarena pria yang mengaku tinggal di jl.H.Agus salim,kaliawi,\nBandar Lampung ini, bakso “Joni” dengan rasa bos harga kos sudah \nmemiliki 2 cabang yakni di kawasan jl.Agus salim dan jl. Imam bonjol.\n\nSaat ini dengan 2 cabang usaha bakso dan mie ayam tersebut untuk satu \nharinya membutuhkan daging sapi seharinya sekitar 10kg, dan \npenghasilan mencapai 2 juta untuk perharinya. Hasil fantastis dari \nseorang pedagang bakso.");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Bodoni MT Poster Compressed", 1, 48)); // NOI18N
        jLabel1.setText("BAKSO DAN MIE AYAM");

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 0, 48)); // NOI18N
        jLabel2.setText("MANG JONI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)))
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

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
            java.util.logging.Logger.getLogger(SejarahBaksoMangJoni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SejarahBaksoMangJoni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SejarahBaksoMangJoni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SejarahBaksoMangJoni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SejarahBaksoMangJoni().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}