import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class ReportFrame extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    

    public ReportFrame() {
        
        initComponents();
        setDateTime();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        profName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        monitorCB = new javax.swing.JCheckBox();
        mouseCB = new javax.swing.JCheckBox();
        keyboardCB = new javax.swing.JCheckBox();
        cablesCB = new javax.swing.JCheckBox();
        internetCB = new javax.swing.JCheckBox();
        audioCB = new javax.swing.JCheckBox();
        specifiedTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        softwareCB = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        submitReport = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        elaboratedTF = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        roomNumber = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        pcNumber = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(243, 243, 89));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Enter the details of the computer you are reporting");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Note: Write \"None\" if there are no currently in-charge professor.");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 340, 20));
        jPanel3.add(profName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 250, -1));

        jLabel4.setText("Current Professor In-charge");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        monitorCB.setText("Monitor");
        monitorCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monitorCBActionPerformed(evt);
            }
        });
        jPanel2.add(monitorCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 85, -1));

        mouseCB.setText("Mouse");
        mouseCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mouseCBActionPerformed(evt);
            }
        });
        jPanel2.add(mouseCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 85, -1));

        keyboardCB.setText("Keyboard");
        keyboardCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyboardCBActionPerformed(evt);
            }
        });
        jPanel2.add(keyboardCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 85, -1));

        cablesCB.setText("Cables");
        cablesCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cablesCBActionPerformed(evt);
            }
        });
        jPanel2.add(cablesCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 85, -1));

        internetCB.setText("Internet Connectivity");
        internetCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internetCBActionPerformed(evt);
            }
        });
        jPanel2.add(internetCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        audioCB.setText("Audio");
        audioCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audioCBActionPerformed(evt);
            }
        });
        jPanel2.add(audioCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));
        jPanel2.add(specifiedTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 110, -1));

        jLabel8.setText("Specify:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 100, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Which of the following seems to have a problem?");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        softwareCB.setText("Software");
        softwareCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                softwareCBActionPerformed(evt);
            }
        });
        jPanel2.add(softwareCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jLabel13.setText("Choose atleast one or specify");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 46, 160, 20));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 400, 220));

        submitReport.setBackground(new java.awt.Color(0, 0, 102));
        submitReport.setForeground(new java.awt.Color(255, 255, 204));
        submitReport.setText("Submit Report");
        submitReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitReportActionPerformed(evt);
            }
        });
        jPanel3.add(submitReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 550, 120, 30));

        jPanel5.setBackground(new java.awt.Color(0, 0, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Report Form");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 50));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 860, 50));

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setText("Please elaborate the problem you encountered with the computer");

        elaboratedTF.setColumns(20);
        elaboratedTF.setRows(5);
        jScrollPane1.setViewportView(elaboratedTF);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 770, 180));

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("These can be found at the back of the PC or at the CPU.");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Room #");

        roomNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Room #", "RM 304", "RM 306" }));
        roomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomNumberActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("PC#");

        pcNumber.setModel(new javax.swing.SpinnerNumberModel(0, 0, 40, 1));
        pcNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("max: 40");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roomNumber, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pcNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pcNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(7, 7, 7)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 360, 220));

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel3.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, -1, 30));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel3.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 553, -1, 30));

        jLabel11.setText("Date:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, -1));

        jLabel12.setText("Time:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, -1, -1));

        dateLabel.setText("*insert date*");
        jPanel3.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, -1, -1));

        timeLabel.setText("*insert time*");
        jPanel3.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, -1, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 850, 600));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 870, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public void setDateTime() {
        // Create a Date object for the current date and time
        Date now = new Date();
        
        // Create SimpleDateFormat obj ects for date and time with the desired formats
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");

        // Set the time zone to Asia/Manila
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Manila");
        dateFormat.setTimeZone(timeZone);
        timeFormat.setTimeZone(timeZone);

        // Format the Date object into strings for date and time
        String date = dateFormat.format(now);
        String time = timeFormat.format(now);
        
        // Print the formatted date and time
        dateLabel.setText(date);
        timeLabel.setText(time);
        
    }
    /*
    public void showTable(){
       try{
       con = DriverManager.getConnection("jdbc:mysql://localhost/peasycheck","root","");
       String sql = "SELECT * FROM reports";
       pst = con.prepareStatement(sql);
       rs=pst.executeQuery();
       .setModel(DbUtils.resultSetToTableModel(rs));
       }
       catch(Exception ex){
       JOptionPane.showMessageDialog(null, ex);
       }
    }
    */
    //instantiation of checkboxes
    int monitor=0;
    int mouse=0;
    int keyboard=0;
    int cables=0;
    int internet=0;
    int software=0;
    int audio=0;

    private void roomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomNumberActionPerformed

    private void monitorCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monitorCBActionPerformed
        // TODO add your handling code here:
        if (monitorCB.isSelected()){
            monitor=1;            
        }
    }//GEN-LAST:event_monitorCBActionPerformed

    private void internetCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internetCBActionPerformed
        if (internetCB.isSelected()){
            internet=1;
        }
    }//GEN-LAST:event_internetCBActionPerformed

    private void submitReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitReportActionPerformed
        Date now = new Date();
        
        // Create SimpleDateFormat objects for date and time with the desired formats
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");

        // Set the time zone to Asia/Manila
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Manila");
        dateFormat.setTimeZone(timeZone);
        timeFormat.setTimeZone(timeZone);

        // Format the Date object into strings for date and time
        String date = dateFormat.format(now);
        String time = timeFormat.format(now);
        
        // Print the formatted date and time
        dateLabel.setText(date);
        timeLabel.setText(time);
        

        int pcNum = (int) (pcNumber.getValue());
        int roomNum = (roomNumber.getSelectedIndex());
        if (roomNum==1){
            roomNum=304;
        }
        else if (roomNum==2){
            roomNum=306;
        }
        //validations before submitting
        if (roomNum==0) {
            JOptionPane.showMessageDialog(null,"Please select a room","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else if (pcNum==0) {
            JOptionPane.showMessageDialog(null,"Please select a PC Number","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else if (profName.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null,"Please enter the current professor in charge during the time of the report","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else if (!monitorCB.isSelected() && !mouseCB.isSelected() && !keyboardCB.isSelected() && !internetCB.isSelected() && 
                !softwareCB.isSelected() && !audioCB.isSelected() && specifiedTF.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null,"Please check the boxes that are currently having the issue","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else if (elaboratedTF.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null,"Please elaborate the current problem you are experiencing","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        //submitting the report and saving to database
        
        else {
            JOptionPane.showMessageDialog(null,"Thank you for submiting a report!!","Report Success", JOptionPane.INFORMATION_MESSAGE);
            //database saving
           try {
            String sql = "INSERT INTO reports (`room #`, `pc #`, `professor`, `monitor`, `mouse`, `keyboard`, `cables`, `internet`, `software`, `audio`, `specified`, `elaborated`, `date`, `time`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/peasycheck", "root", "");
            pst = con.prepareStatement(sql);
            pst.setInt(1, roomNum);
            pst.setInt(2, pcNum);
            pst.setString(3, profName.getText().trim());
            pst.setInt(4, monitor);
            pst.setInt(5, mouse);
            pst.setInt(6, keyboard);
            pst.setInt(7, cables);
            pst.setInt(8, internet);
            pst.setInt(9, software);
            pst.setInt(10, audio);
            pst.setString(11, specifiedTF.getText().trim());
            pst.setString(12, elaboratedTF.getText());
            pst.setString(13, date);
            pst.setString(14, time);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Report added successfully!");
        } catch (HeadlessException | SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
        }
    }
        if (roomNum==304){
            try{
        String sql = "UPDATE status304 SET status=? WHERE pc=?";
        con = DriverManager.getConnection("jdbc:mysql://localhost/peasycheck","root","");
        pst = con.prepareStatement(sql);
        
        pst.setString(1,"Reported");
        pst.setInt(2,pcNum);
        
        pst.executeUpdate();
        }
        catch(SQLException | HeadlessException ex){
        JOptionPane.showMessageDialog(null, ex);
            }
        }
        else if (roomNum==306){
                try{
        String sql = "UPDATE status306 SET status=? WHERE pc=?";
        con = DriverManager.getConnection("jdbc:mysql://localhost/peasycheck","root","");
        pst = con.prepareStatement(sql);
        
        pst.setString(1,"Reported");
        pst.setInt(2,pcNum);
        
        pst.executeUpdate();
        }
        catch(SQLException | HeadlessException ex){
        JOptionPane.showMessageDialog(null, ex);
            }
        
        }
    }//GEN-LAST:event_submitReportActionPerformed

    private void audioCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audioCBActionPerformed
        if (audioCB.isSelected()){
            audio=1;
        }
    }//GEN-LAST:event_audioCBActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        LoginFrame login = new LoginFrame();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        profName.setText("");
        elaboratedTF.setText("");
        specifiedTF.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void mouseCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mouseCBActionPerformed
        if (mouseCB.isSelected()){
            mouse=1;
        }
    }//GEN-LAST:event_mouseCBActionPerformed

    private void keyboardCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyboardCBActionPerformed
        if (keyboardCB.isSelected()){
            keyboard=1;
        }
    }//GEN-LAST:event_keyboardCBActionPerformed

    private void cablesCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cablesCBActionPerformed
        if(cablesCB.isSelected()){
            cables=1;
        }
    }//GEN-LAST:event_cablesCBActionPerformed

    private void softwareCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_softwareCBActionPerformed
        if(softwareCB.isSelected()){
            software=1;
        }
    }//GEN-LAST:event_softwareCBActionPerformed

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
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox audioCB;
    private javax.swing.JButton backButton;
    private javax.swing.JCheckBox cablesCB;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextArea elaboratedTF;
    private javax.swing.JCheckBox internetCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox keyboardCB;
    private javax.swing.JCheckBox monitorCB;
    private javax.swing.JCheckBox mouseCB;
    private javax.swing.JSpinner pcNumber;
    private javax.swing.JTextField profName;
    private javax.swing.JComboBox<String> roomNumber;
    private javax.swing.JCheckBox softwareCB;
    private javax.swing.JTextField specifiedTF;
    private javax.swing.JButton submitReport;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
