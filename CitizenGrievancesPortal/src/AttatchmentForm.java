/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lenovo
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
public class AttatchmentForm extends javax.swing.JFrame {

    /**
     * Creates new form AttatchmentForm
     */
    File f=null;
    String path ="NULL";
    String fname="NULL";
      String Name1="NULL";
    String addr="NULL";
    String types="NULL";
    String Location="NULL";
    String descrip="NULL";
    
    int s=0;
    byte[] pimage=null;
    
    public AttatchmentForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    public AttatchmentForm(String types,String Location,String Name1, String addr,String descrip,String path,String fname) throws ClassNotFoundException, SQLException {
        Connect();
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.types=types;
        this.Location=Location;
        this.descrip=descrip;
        this.Name1=Name1;
        this.addr=addr;
        this.path=path;
        this.fname=fname;
        FileNameTextField.setText(fname);
        FilePathTextField.setText(path);
        
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public void Connect() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/citizens", "root", "Edgeedge@4");
        
        
        
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
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Browse = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        FileNameLeft = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FileNameRight = new javax.swing.JLabel();
        FileNameTextField = new javax.swing.JTextField();
        FilePathTextField = new javax.swing.JTextField();
        Back5Button = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ATTATCHMENTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jLabel2.setText("CHOOSE THE FILE ");

        Browse.setText("BROWSE");
        Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseActionPerformed(evt);
            }
        });

        Save.setText("SAVE");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        FileNameLeft.setText("File Name :");

        jLabel4.setText("File path :");

        FileNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileNameTextFieldActionPerformed(evt);
            }
        });

        FilePathTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilePathTextFieldActionPerformed(evt);
            }
        });

        Back5Button.setText("BACK");
        Back5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back5ButtonActionPerformed(evt);
            }
        });

        SubmitButton.setText("SUBMIT");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Browse, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(Back5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(FilePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(FileNameLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(FileNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FileNameRight, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Browse)
                    .addComponent(Save))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FileNameLeft)
                    .addComponent(FileNameRight)
                    .addComponent(FileNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FilePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back5Button)
                    .addComponent(SubmitButton))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back5ButtonActionPerformed
        // TODO add your handling code here:
         
         
        DescriptionForm df= new DescriptionForm(types,Location,Name1,addr,descrip,path,fname);
                //System.exit(0);
                
                df.setVisible(true);
                df.pack();
                df.setLocationRelativeTo(null);
                df.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
        
    }//GEN-LAST:event_Back5ButtonActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

        System.out.println("file path :"+path);
        System.out.println("file name :"+f.getName());
        fname=f.getName();
        File f = new File(path);

        try {
            // TODO add your handling code here:
            
           if(f.exists())
           {
               File destFile=new File("E:\\Saved files for Citizens Grievences"+File.separator+f.getName());
               try(InputStream is=new FileInputStream(f);OutputStream os=new FileOutputStream (destFile))
               {
                   int len;
                   float filesize=is.available()/1000.0f;
                   float totalCopied=0.0f;
                   byte[] bytes=new byte[1024];
                   while((len=is.read(bytes))>0)
                           {
                               os.write(bytes,0,len);
                               totalCopied+=len;
                               System.out.println("\rCopied... "+totalCopied/1000.f+"kb/"+filesize+"kb");
                               Thread.sleep(5);
                           }
               } catch (InterruptedException ex) {
                   Logger.getLogger(AttatchmentForm.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
            
            InputStream in =new FileInputStream(f);
            System.out.println(in);
            
           

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AttatchmentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error saving the file.");
            }
        FileNameTextField.setText(fname);
        FilePathTextField.setText(path);
        

    }//GEN-LAST:event_SaveActionPerformed

    private void BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser=new JFileChooser();
        FileNameExtensionFilter fnwf =new FileNameExtensionFilter("PNG JPG PDF AND JPEG","png","pdf","jpg","jpeg");
        fileChooser.addChoosableFileFilter(fnwf);
        int load = fileChooser.showOpenDialog(null);

        if(load==fileChooser.APPROVE_OPTION){
            f=fileChooser.getSelectedFile();

            path=f.getAbsolutePath();

        }
    }//GEN-LAST:event_BrowseActionPerformed

    private void FileNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FileNameTextFieldActionPerformed

    private void FilePathTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilePathTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilePathTextFieldActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        PreparedStatement ps;
        String query="INSERT INTO `grievences`(`Name`,`Address`,`Location`,`Type`,`Path`,`FileName`)VALUES(?,?,?,?,?,?)";
        
        try {
            ps= con.prepareStatement(query);
            
            ps.setString(1,Name1);
            ps.setString(2,addr);
            ps.setString(3,Location);
            ps.setString(4,types);
            ps.setString(5,path);
            ps.setString(6,fname);
            
            if(ps.executeUpdate() > 0)
            {
                //JOptionPane.showMessageDialog(null,"New User add");
                SuccesfulPage sp= new SuccesfulPage();
                //System.exit(0);
                sp.setVisible(true);
                sp.pack();
                sp.setLocationRelativeTo(null);
                sp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AttatchmentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_SubmitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AttatchmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttatchmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttatchmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttatchmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttatchmentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back5Button;
    private javax.swing.JButton Browse;
    private javax.swing.JLabel FileNameLeft;
    private javax.swing.JLabel FileNameRight;
    private javax.swing.JTextField FileNameTextField;
    private javax.swing.JTextField FilePathTextField;
    private javax.swing.JButton Save;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
