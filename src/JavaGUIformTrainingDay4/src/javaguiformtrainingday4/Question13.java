/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiformtrainingday4;

import java.text.*;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author rheist
 */
public class Question13 extends javax.swing.JFrame {

    /**
     * Creates new form Question13
     */
    private String locales ;
    private String timezone ;
    private String timestyle = "DEFAULT";
    private String datestyle = "DEFAULT";
    
    void setLocales(String locales) {
        this.locales = locales;
        applyDateChanges();
    }

    void setTimezone(String timezone) {
        this.timezone = timezone;
        applyDateChanges();
    }

    void setTimestyle(String timestyle) {
        this.timestyle = timestyle;
        applyDateChanges();
    }
    
    void setDatestyle(String datestyle) {
        this.datestyle = datestyle;
        applyDateChanges();
    }
    
    private void applyDateChanges(){
        TimeZone.setDefault(TimeZone.getTimeZone(timezone));
        int datestyle;
        if(this.datestyle.equals("DEFAULT")){
            datestyle = DateFormat.DEFAULT;
        }else if (this.datestyle.equals("SHORT")) {
            datestyle = DateFormat.SHORT;
        }else if (this.datestyle.equals("MEDIUM")){
            datestyle = DateFormat.MEDIUM;
        }else if (this.datestyle.equals("LONG")){
            datestyle = DateFormat.LONG;
        }else{
            datestyle = DateFormat.FULL;
        }
        
        int timestyle;
        if(this.timestyle.equals("DEFAULT")){
            timestyle = DateFormat.DEFAULT;
        }else if (this.timestyle.equals("SHORT")) {
            timestyle = DateFormat.SHORT;
        }else if (this.timestyle.equals("MEDIUM")){
            timestyle = DateFormat.MEDIUM;
        }else if (this.timestyle.equals("LONG")){
            timestyle = DateFormat.LONG;
        }else{
            timestyle = DateFormat.FULL;
        }
        
        Locale locale = getLocaleFromString(locales);
        
        Date today;
        String dateOut;
        String timeOut;
        DateFormat dateFormatter;
        dateFormatter = DateFormat.getDateInstance(datestyle, locale);
        today = new Date();
        dateOut = dateFormatter.format(today);
        
        jTextField1.setText(dateOut);
        
        DateFormat timeFormatter = DateFormat.getTimeInstance(timestyle, locale);
        timeOut = timeFormatter.format(today);
        
        jTextField3.setText(timeOut);
        
        
    }
    
    public static Locale getLocaleFromString(String localeString)
    {
        if (localeString == null)
        {
            return null;
        }
        localeString = localeString.trim();
        if (localeString.toLowerCase().equals("default"))
        {
            return Locale.getDefault();
        }

        // Extract language
        int languageIndex = localeString.indexOf('_');
        String language = null;
        if (languageIndex == -1)
        {
            // No further "_" so is "{language}" only
            return new Locale(localeString, "");
        }
        else
        {
            language = localeString.substring(0, languageIndex);
        }

        // Extract country
        int countryIndex = localeString.indexOf('_', languageIndex + 1);
        String country = null;
        if (countryIndex == -1)
        {
            // No further "_" so is "{language}_{country}"
            country = localeString.substring(languageIndex+1);
            return new Locale(language, country);
        }
        else
        {
            // Assume all remaining is the variant so is "{language}_{country}_{variant}"
            country = localeString.substring(languageIndex+1, countryIndex);
            String variant = localeString.substring(countryIndex+1);
            return new Locale(language, country, variant);
        }
    }
        
    public Question13() {
        initComponents();
        Date today;
        String dateOut;
        String timeOut;
        DateFormat dateFormatter;
        Locale currentLocale = Locale.getDefault();
        String[] ids = TimeZone.getAvailableIDs();
        ComboTimezone.setModel(new DefaultComboBoxModel(ids));
        ComboTimezone.setSelectedItem(TimeZone.getDefault());
        Locale list[] = Locale.getAvailableLocales();
        ComboLocale.setModel(new DefaultComboBoxModel(list));
        ComboLocale.setSelectedItem(currentLocale.toString());
        
        this.locales = currentLocale.toString() ;
        this.timezone = TimeZone.getDefault().toString();
        dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
        today = new Date();
        dateOut = dateFormatter.format(today);
        
        jTextField1.setText(dateOut);
        
        DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
        timeOut = timeFormatter.format(today);
        
        jTextField3.setText(timeOut);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ComboLocale = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        ComboTimezone = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        ComboDatestyle = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        ComboTimestyle = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Date");

        jLabel2.setText("Time");

        jLabel3.setText("Locale");

        ComboLocale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboLocaleActionPerformed(evt);
            }
        });

        jLabel4.setText("TimeZone");

        ComboTimezone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTimezoneActionPerformed(evt);
            }
        });

        jLabel5.setText("Date Style");

        ComboDatestyle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DEFAULT", "SHORT", "MEDIUM", "LONG", "FULL" }));
        ComboDatestyle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboDatestyleActionPerformed(evt);
            }
        });

        jLabel6.setText("Time Style");

        ComboTimestyle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DEFAULT", "SHORT", "MEDIUM", "LONG", "FULL" }));
        ComboTimestyle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTimestyleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboDatestyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboLocale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField3)
                        .addComponent(ComboTimezone, 0, 192, Short.MAX_VALUE))
                    .addComponent(ComboTimestyle, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ComboLocale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(ComboTimezone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ComboDatestyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(ComboTimestyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboLocaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboLocaleActionPerformed
        // TODO add your handling code here:
        setLocales(ComboLocale.getSelectedItem().toString());
    }//GEN-LAST:event_ComboLocaleActionPerformed

    private void ComboTimezoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTimezoneActionPerformed
        // TODO add your handling code here:
        setTimezone(ComboTimezone.getSelectedItem().toString());
    }//GEN-LAST:event_ComboTimezoneActionPerformed

    private void ComboDatestyleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboDatestyleActionPerformed
        // TODO add your handling code here:
        setDatestyle(ComboDatestyle.getSelectedItem().toString());
    }//GEN-LAST:event_ComboDatestyleActionPerformed

    private void ComboTimestyleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTimestyleActionPerformed
        // TODO add your handling code here:
        setTimestyle(ComboTimestyle.getSelectedItem().toString());
    }//GEN-LAST:event_ComboTimestyleActionPerformed

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
            java.util.logging.Logger.getLogger(Question13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question13().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboDatestyle;
    private javax.swing.JComboBox ComboLocale;
    private javax.swing.JComboBox ComboTimestyle;
    private javax.swing.JComboBox ComboTimezone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
