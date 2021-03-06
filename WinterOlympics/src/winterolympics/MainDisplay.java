package winterolympics;


import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thatcherb
 */
public class MainDisplay extends javax.swing.JFrame {
    public static Olympics current = new Olympics("2012","Salt Lake City, Utah, USA");
    
    /**
     * Creates new form MainDisplay
     */
    public MainDisplay() {
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

        importClassButton = new javax.swing.JButton();
        importEventButton = new javax.swing.JButton();
        newOlympicsButton = new javax.swing.JButton();
        newEventButton = new javax.swing.JButton();
        saveClassButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        olympicsYear = new javax.swing.JLabel();
        yearEntry = new javax.swing.JTextField();
        olympicsLocation = new javax.swing.JLabel();
        locationEntry = new javax.swing.JTextField();
        olympicsLabel = new javax.swing.JLabel();
        olympicEvents = new javax.swing.JComboBox();
        eventsScrollPane = new javax.swing.JScrollPane();
        medalists = new javax.swing.JTextArea();
        fileNameEntry = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Winter Olympics");
        setBackground(new java.awt.Color(204, 204, 255));
        setResizable(false);

        importClassButton.setText("Olympics");
        importClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importClassButtonActionPerformed(evt);
            }
        });

        importEventButton.setText("Event");
        importEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importEventButtonActionPerformed(evt);
            }
        });

        newOlympicsButton.setText("New Olympics");
        newOlympicsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOlympicsButtonActionPerformed(evt);
            }
        });

        newEventButton.setText("New Event");
        newEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEventButtonActionPerformed(evt);
            }
        });

        saveClassButton.setText("Save");
        saveClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveClassButtonActionPerformed(evt);
            }
        });

        errorLabel.setForeground(java.awt.Color.red);

        olympicsYear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        olympicsYear.setText("2002");

        olympicsLocation.setText("Salt Lake City, Utah, USA");

        olympicsLabel.setText("Winter Olympics");

        olympicEvents.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Event1", "Event2", "Event3", "Event4" }));
        olympicEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olympicEventsActionPerformed(evt);
            }
        });

        medalists.setColumns(20);
        medalists.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        medalists.setRows(5);
        eventsScrollPane.setViewportView(medalists);

        jLabel1.setText("To import an existing Olympics from a class file, or an");

        jLabel2.setText("Enter the desired file name and click the appropriate button");

        jLabel3.setText("To manually create a new Olympics type in the Year and");

        jLabel4.setText("Location then click \"New Olympics\"");

        jLabel5.setText("Year");

        jLabel6.setText("Location");

        jLabel7.setText("To Manually add an event click \"New Event\"");

        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Event from a text file, or to save the current Olympics");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(olympicsLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(olympicsYear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(olympicsLocation))
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(newOlympicsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(eventsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fileNameEntry, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(importClassButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(importEventButton)
                                .addGap(121, 121, 121)
                                .addComponent(saveClassButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(yearEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(locationEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(olympicEvents, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(refreshBtn))))
                    .addComponent(errorLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jLabel8)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fileNameEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(importClassButton)
                    .addComponent(importEventButton)
                    .addComponent(saveClassButton))
                .addGap(2, 2, 2)
                .addComponent(errorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newOlympicsButton)
                .addGap(3, 3, 3)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newEventButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(olympicsYear)
                    .addComponent(olympicsLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(olympicsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(olympicEvents, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(refreshBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eventsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Action performed when the import class button is clicked.  Reads the 
     * Olympics object from the file then changes the information displayed 
     * on the GUI to match the object and sets the medalists default to the 
     * first event in the array.
     * pre: none
     * post: the file indicated in the field has been read into the current 
     * Olympics Object and displayed
     * @param evt 
     */
    private void importClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importClassButtonActionPerformed
        errorLabel.setText("");
        
        File olympicFile = new File(fileNameEntry.getText());
        
        try {
            FileInputStream in = new FileInputStream(olympicFile);
            ObjectInputStream readOlympic = new ObjectInputStream(in);
            current = (Olympics)readOlympic.readObject();
            readOlympic.close();
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + e);
            errorLabel.setText("File Not Found.");
        } catch (IOException e) {
            errorLabel.setText("IO Exception");
            System.err.println("IOException: " + e);
        } catch (ClassNotFoundException e) {
            errorLabel.setText("Class Not Found");
            System.err.println("ClassNotFoundException: " + e);
        }
        
        olympicsYear.setText(current.getYear());
        olympicsLocation.setText(current.getLocation());
        
        refreshEvents();
        
    }//GEN-LAST:event_importClassButtonActionPerformed
    
    /**
     * creates a new Olympics object using the text in the year and location
     * fields and clears out the Events combo box
     * pre: the year and location fields are filled out
     * post: a new Olympic object has been created replacing the current one and
     * the combo box has been cleared out.
     * @param evt 
     */
    private void newOlympicsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOlympicsButtonActionPerformed
        errorLabel.setText("");
        String year = yearEntry.getText();
        String location = locationEntry.getText();
        current = new Olympics(year,location);
        olympicsYear.setText(current.getYear());
        olympicsLocation.setText(current.getLocation());
        olympicEvents.removeAllItems();
        medalists.setText("");
    }//GEN-LAST:event_newOlympicsButtonActionPerformed

    /**
     * Opens the new event GUI when clicked
     * pre: none
     * post: the new Event GUI has been opened.
     * @param evt 
     */
    private void newEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEventButtonActionPerformed
        errorLabel.setText("");
        NewEventGUI n = new NewEventGUI();
        n.setVisible(true);
    }//GEN-LAST:event_newEventButtonActionPerformed

    /**
     * When the refresh button is clicked refresh events lists
     * pre: none
     * post: the events list has been refreshed
     * @param evt 
     */
    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        errorLabel.setText("");
        refreshEvents();
    }//GEN-LAST:event_refreshBtnActionPerformed

    /**
     * Saves the current Olympics object to a class file, with the filename 
     * indicated in the field.
     * pre: a filename is typed in the field
     * post: the Olympics object has been created overwriting any other file 
     * with the same file name
     * @param evt 
     */
    private void saveClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveClassButtonActionPerformed
        errorLabel.setText("");
        File olympicFile = new File(fileNameEntry.getText());
        if (olympicFile.exists()) {
            olympicFile.delete();
        }
        try {
            FileOutputStream out = new FileOutputStream(olympicFile);
            ObjectOutputStream writeOlympic = new ObjectOutputStream(out);
            writeOlympic.writeObject(current);
            writeOlympic.close();
        } catch (FileNotFoundException e) {
            errorLabel.setText("File Not Found");
            System.err.println("FileNotFoundException: " + e);
        } catch (IOException e) {
            errorLabel.setText("IO Exception");
            System.err.println("IOException: " + e);
        }
    }//GEN-LAST:event_saveClassButtonActionPerformed

    /**
     * Reads the text file specified in the field, and creates new events.  Can
     * read multiple events from the same file but there must be no empty lines
     * between events, but if you have an event with fewer than 6 competitors in
     * it you still have to place some kind of information in for all six, if you 
     * don't there will be a NumberFormatException for empty strings, and that 
     * event and all later events will not be read in.
     * pre: a file (which exists) is specified in the field
     * post: one or more events have been read and saved to the ArrayList and the
     * display refreshed
     * @param evt 
     */
    private void importEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importEventButtonActionPerformed
        errorLabel.setText("");
        File eventFile = new File(fileNameEntry.getText());
        Event newEvent;
        String newName, comp1, comp2, comp3, comp4, comp5, comp6; 
        double scr1, scr2, scr3, scr4, scr5, scr6;
        boolean timed;
        
        try {
            FileReader in = new FileReader(eventFile);
            BufferedReader readEvent = new BufferedReader(in);
            while((newName = readEvent.readLine()) != null) {
                timed = Boolean.parseBoolean(readEvent.readLine());
                comp1 = readEvent.readLine();
                scr1 = Double.parseDouble(readEvent.readLine());
                comp2 = readEvent.readLine();
                scr2 = Double.parseDouble(readEvent.readLine());
                comp3 = readEvent.readLine();
                scr3 = Double.parseDouble(readEvent.readLine());
                comp4 = readEvent.readLine();
                scr4 = Double.parseDouble(readEvent.readLine());
                comp5 = readEvent.readLine();
                scr5 = Double.parseDouble(readEvent.readLine());
                comp6 = readEvent.readLine();
                scr6 = Double.parseDouble(readEvent.readLine());

                newEvent = new Event(newName, timed, comp1, scr1, comp2, scr2, 
                        comp3, scr3, comp4, scr4, comp5, scr5, comp6, scr6);
                current.addEvent(newEvent);
            }
            readEvent.close();
        } catch (FileNotFoundException e) {
            errorLabel.setText("File not found.");
            System.err.println("FileNotFoundException: " + e);
        } catch (IOException e) {
            errorLabel.setText("IOException");
            System.err.println("IOException: " + e);
        } catch (NumberFormatException e) {
            errorLabel.setText("Number Format Exception");
            System.err.println("NumberFormatException: " + e);
        } catch (NullPointerException e) {
            errorLabel.setText("Did you mean to push Olympics?");
            System.err.println("NullPointerException: " + e);
        }
        
        refreshEvents();
    }//GEN-LAST:event_importEventButtonActionPerformed

    /**
     * Handles the ComboBox, displaying the correct medalists for the selected
     * event.
     * pre: none
     * post: the medalists of the selected event have been displayed
     * @param evt 
     */
    private void olympicEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olympicEventsActionPerformed
        errorLabel.setText("");
        int select = olympicEvents.getSelectedIndex();
        if (select >= 0) {
            medalists.setText(current.getMedalists(select));
        }
        
    }//GEN-LAST:event_olympicEventsActionPerformed

    /**
     * Refreshes the olympicEvents comboBox sorting the ArrayList alphabetically
     * then populating the combo box
     * pre: none
     * post: the olympicEvents comboBox now displays current information
     */
    public void refreshEvents() {
        olympicsYear.setText(current.getYear());
        olympicsLocation.setText(current.getLocation());
        olympicEvents.removeAllItems();
        if (current.getEventsSize() > 0) {
            
            //sort the ArrayList aphabetically
            for (int index = 0; index < current.getEventsSize(); index++) {
                
                for (int subIndex = index; subIndex < current.getEventsSize(); subIndex++) {
                    Event indexValue = current.getEvent(index);
                    String indexName = current.getEventName(index);
                    Event subIndexValue = current.getEvent(subIndex);
                    String subName = current.getEventName(subIndex);
                    
                    
                    if (subName.compareTo(indexName) < 0) {
                        Event temp = indexValue;
                        current.setEvent(index, subIndexValue);
                        current.setEvent(subIndex, temp);
                    }
                }
            }
            
            //Add the ArrayList items to the combo box
            for (int i = 0; i < current.getEventsSize(); i++) {
                String event = current.getEventName(i);
                olympicEvents.addItem(event);
            }
            medalists.setText(current.getMedalists(0));
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MainDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLabel;
    private javax.swing.JScrollPane eventsScrollPane;
    private javax.swing.JTextField fileNameEntry;
    private javax.swing.JButton importClassButton;
    private javax.swing.JButton importEventButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField locationEntry;
    private javax.swing.JTextArea medalists;
    private javax.swing.JButton newEventButton;
    private javax.swing.JButton newOlympicsButton;
    private javax.swing.JComboBox olympicEvents;
    private javax.swing.JLabel olympicsLabel;
    private javax.swing.JLabel olympicsLocation;
    private javax.swing.JLabel olympicsYear;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton saveClassButton;
    private javax.swing.JTextField yearEntry;
    // End of variables declaration//GEN-END:variables
}
