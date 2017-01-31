/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smktelkom
 */
public class Film extends javax.swing.JFrame {

    /**
     * Creates new form Film
     */
    public Film() {
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

        textArea1 = new java.awt.TextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbfilm = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtsin = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtinfo = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jtxtgenre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jltrailer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setForeground(new java.awt.Color(255, 204, 204));
        getContentPane().setLayout(null);

        jLabel1.setText("Sinopsis Film");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 20, 200, 33);

        jLabel2.setText("Pilih Dokter");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(41, 63, 75, 37);

        jcbfilm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Salah Satu --", "La La Land", "The 5th Wave", "Beauty and The Beast", "Despicable Me 3", "Transformers 5 : The Last Knight" }));
        jcbfilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbfilmActionPerformed(evt);
            }
        });
        getContentPane().add(jcbfilm);
        jcbfilm.setBounds(130, 70, 180, 20);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Result"));
        jPanel2.setToolTipText("");
        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(null);

        jLabel4.setText("Info Umum");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 20, 120, 14);

        jLabel5.setText("Genre");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 180, 120, 14);

        jtxtsin.setEditable(false);
        jtxtsin.setColumns(20);
        jtxtsin.setRows(5);
        jScrollPane1.setViewportView(jtxtsin);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 266, 610, 130);

        jtxtinfo.setEditable(false);
        jtxtinfo.setColumns(20);
        jtxtinfo.setRows(5);
        jScrollPane2.setViewportView(jtxtinfo);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 40, 610, 120);

        jLabel7.setText("Sinopsis");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 240, 120, 14);

        jtxtgenre.setEditable(false);
        jtxtgenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtgenreActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtgenre);
        jtxtgenre.setBounds(10, 200, 610, 30);

        jLabel8.setText("Lihat Trailer");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 410, 120, 14);
        jPanel2.add(jltrailer);
        jltrailer.setBounds(20, 430, 600, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 11, 650, 470);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(25, 111, 680, 490);

        setBounds(0, 0, 735, 653);
    }// </editor-fold>//GEN-END:initComponents

    private void jcbfilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbfilmActionPerformed
        // TODO add your handling code here:
        if (jcbfilm.getSelectedItem().equals("La La Land")) {
            jtxtinfo.setText("DIRECTOR : Damien Chazelle\n" +
                             "RELEASE DATE : December 16, 2016\n" +
                             "RUNNING TIME : 126 minutes\n"+
                             "LANGUAGE : English");
            jtxtgenre.setText("Comedy Drama Musical");
            jtxtsin.setText("Bercerita tentang kisah Mia, seorang aktris inspiratif, "
                    + "\ndan Sebastian, seorang musisi Jazz berprestasi, yang keduanya "
                    + "\nmerasa sedang dalam masa sulit dan harus berjuang untuk memenuhi "
                    + "\nkebutuhan mereka saat tinggal di sebuah kota yang dikenal keras, "
                    + "\nkota yang menghancurkan harapan dan membuat patah hati. Diset di kota "
                    + "\nLos Angeles pada era modern, kisah bernada musikal ini mengangkat kehidupan "
                    + "\nsehari-hari, mengeksplorasi rasa sukacita dan sakitnya mengejar impian anda.");
            jltrailer.setText("https://www.youtube.com/watch?v=lu4RHvouJH8");
        }
        else if(jcbfilm.getSelectedItem().equals("The 5th Wave")){
            jtxtinfo.setText("Release: 22 Januari 2016"
                             +"\nDirector: J Blakeson"
                             +"\nDistributor: Sony Pictures"
                             +"\nOfficial: twitter.com/5thWaveMovie"
                             +"\nIMDB: www.imdb.com/title/tt2304933/");
            jtxtgenre.setText("Thriller, Sci-Fi");
            jtxtsin.setText("Film Thiller \"The 5th Wave\" bercerita tentang serangan alien yang telah terjadi dalam empat gelombang, "
                    + "\nserangan itu telah menghancurkan sebagian dari Bumi yang hancur porak poranda. "
                    + "\nDengan melawan ketakutan dan ketidakpercayaan, Cassie berusaha keras menyelamatkan adik laki lakinya. "
                    + "\nSaat ia sedang menghadapi gelombang ke 5 yang mematikan, Cassie membentuk sebuah tim kecil "
                    + "\ndengan seorang pemuda yang mungkin menjadi harapan terakhirnya karena ia yang dapat dipercaya.");    
            jltrailer.setText("https://www.youtube.com/watch?v=kmxLybfGNC4");
        }
        else if(jcbfilm.getSelectedItem().equals("Beauty and The Beast")){
            jtxtinfo.setText("Tanggal Tayang : 17 Maret 2017 (USA)\n" +
                             "Negara : USA\n" +
                             "Bahasa : English");
            jtxtgenre.setText("Fantasy, Musical, Romance");
            jtxtsin.setText("Beauty and the Beast (2017) bercerita tentang seorang gadis cantik bernama Belle. "
                    + "\nIa tersesat dan tanpa sengaja ia menemukan sebuah kerajaan tua. Lantas ia memasuki "
                    + "\nkerajaan itu. Awalnya Belle sangat ketakutan saat bertemu dengan sesosok makhluk dengan "
                    + "\nrupa yang mengerikan. Sebenarnya makhluk itu adalah sesosok pangeran tampan yang terkena "
                    + "\nkutukan akibat kesombongannya. Akibat kutukan itu, ia berubah menjadi makhluk yang menakutkan. "
                    + "\nDalam perjalanan waktu akhirnya Belle jatuh cinta dengan makhluk itu. Akankah cinta Belle mampu "
                    + "\nmenghilangkan kutukan dan mengembalikan rupa sebenarnya dari sang pangeran?");
            jltrailer.setText("https://www.youtube.com/watch?v=OvW_L8sTu5E");
        }
        else if(jcbfilm.getSelectedItem().equals("Despicable Me 3")){
            jtxtinfo.setText("Tanggal RIlis: 30 Juni 2017\n" +
                            "Rumah Produksi: Illumination Entertainment, Unviersal Pictures\n" +
                            "Durasi: Menit\n" +
                            "Negara: Amerika Serikat");
            jtxtgenre.setText("Animasi");
            jtxtsin.setText("Kali ini, film Despicable Me 3 kembali menceritakan kehidupan Gru beserta keluarganya. "
                    + "\nSebelumnya, diceritakan bahwa Gru memiliki tiga orang anak dari hasil adopsi di keluarga mereka. "
                    + "\nAkhirnya, ia pun memperbolehkan ketiga anaknya itu untuk ikut bekerja di agen rahasia dimana ia "
                    + "\ndan Lucy bekerja. Pada saat itu, kejahatan kembali menyerang kota, dan saat itulah Gruu dinanti-nantikan "
                    + "\nuntuk menyelamatkan. Bukan hanya itu, Gru pun menemukan fakta lain yang mengejutkan tentang Lucy. Ternyata "
                    + "\nLucy memiliki anak dari pernikahannya dengan suami yang sebelumnya. Kedua anak itu bernama Mario dan juga Corey. "
                    + "\nBagaimana kira-kira tindakan Gru mengetahui hal yang satu ini? Berhasilkah Gru untuk menyelamatkan kota?");
            jltrailer.setText("https://www.youtube.com/watch?v=6DBi41reeF0");
        }
        else if(jcbfilm.getSelectedItem().equals("Transformers 5 : The Last Knight"))
        {
            jtxtinfo.setText("Movie Theaters: 23 June 2017"+
                             "\nCompanies: Hasbro, Paramount Pictures"+
                             "\nMPAA Rating: PG-13");
            jtxtgenre.setText("Adventures, Sci-Fi");
            jtxtsin.setText("Film aksi barat berjudul “Transformers 5: The Last Knight” ini merupakan film yang menceritakan tentang "
                    + "\nkisah dari kelanjutan sekuel sebelumnya. Bercerita tentang Cade Yeager ( Mark Wahlberg ) bersama dengan putri "
                    + "\ndan juga kekasihnya beserta tim Autobots. Mereka harus saling berjuang untuk melindungi Bumi dari ancaman Unicron "
                    + "\nyang ingin menghancurkan Bumi.\n" 
                    +"Di samping itu, Optimus Prime yang telah menemukan planet rumahnya, Cybertron, sekarang menjadi planet mati, "
                    + "\ndi mana dia harus bertanggung jawab, Optimus akhirnya menemukan cara untuk membangun hidup kembali planetnya "
                    + "\nyaitu dengan menemukan artifak dan artifak tersebut kini berada di Bumi. Oleh karena ancaman dari Unicron untuk "
                    + "\nmenghancurkan Bumi, Optimus Prime akan memimpin para Autobots untuk menghentikan upaya Unicorn.");
            jltrailer.setText("https://www.youtube.com/watch?v=sgnO5fO46pE");
        }
    }//GEN-LAST:event_jcbfilmActionPerformed

    private void jtxtgenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtgenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtgenreActionPerformed

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
            java.util.logging.Logger.getLogger(Film.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Film.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Film.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Film.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Film().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbfilm;
    private javax.swing.JTextField jltrailer;
    private javax.swing.JTextField jtxtgenre;
    private javax.swing.JTextArea jtxtinfo;
    private javax.swing.JTextArea jtxtsin;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
