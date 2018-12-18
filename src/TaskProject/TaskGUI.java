
package TaskProject;

import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;


public class TaskGUI extends javax.swing.JFrame {
    
    ArrayList<Task> list;
    ListIterator<Task> li;
    int curtask, tottask;
    Task t;
    
    public TaskGUI() {
        initComponents();
        list = new ArrayList();
        li = list.listIterator();
        curtask=0;
        tottask=0;
        //initialize with 3 Tasks  - all inserted before iterator location
        li.add(new Task("Homework", "Math (pg 434 #4,6a,12,16)"));
        li.add(new Task("Feed Cats", "1/8 of container each"));
        li.add(new Task("Chores", "Vacuum basement, Clean Bathroom"));
        //rewind iterator to front of Task List
        while(li.hasPrevious()) t = li.previous();
        //initialize counters
        curtask=1;
        tottask=3;
        //update display to show first task
        lbltask.setText("" + curtask);
        lbltot.setText("" + tottask);
        txtname.setText(t.getName());
        txtdes.setText(t.getDescription());
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdes = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btnstart = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbltask = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbltot = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnushowall = new javax.swing.JMenuItem();
        mnuexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnurepCT = new javax.swing.JMenuItem();
        mnuRemCT = new javax.swing.JMenuItem();
        mnuResCT = new javax.swing.JMenuItem();
        mnuclear = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuBCT = new javax.swing.JMenuItem();
        mnuACT = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Description:");

        txtdes.setColumns(20);
        txtdes.setRows(5);
        jScrollPane1.setViewportView(txtdes);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnstart.setText("|<");
        btnstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstartActionPerformed(evt);
            }
        });

        btnprev.setText("<");
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });

        btnnext.setText(">");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnlast.setText(">|");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnstart)
                .addGap(63, 63, 63)
                .addComponent(btnprev)
                .addGap(18, 18, 18)
                .addComponent(btnnext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnlast)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnstart)
                    .addComponent(btnprev)
                    .addComponent(btnnext)
                    .addComponent(btnlast))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Current Task:");

        lbltask.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbltask.setText("0");
        lbltask.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Total Tasks:");

        lbltot.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbltot.setText("0");
        lbltot.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltask, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbltot, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbltask)
                    .addComponent(jLabel5)
                    .addComponent(lbltot))
                .addContainerGap())
        );

        jMenu1.setText("Program");

        mnushowall.setText("Show all Tasks");
        mnushowall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnushowallActionPerformed(evt);
            }
        });
        jMenu1.add(mnushowall);

        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnurepCT.setText("Replace This As Current Task");
        mnurepCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnurepCTActionPerformed(evt);
            }
        });
        jMenu2.add(mnurepCT);

        mnuRemCT.setText("Remove Current Task");
        mnuRemCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRemCTActionPerformed(evt);
            }
        });
        jMenu2.add(mnuRemCT);

        mnuResCT.setText("Restore Current Task To Screen");
        mnuResCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuResCTActionPerformed(evt);
            }
        });
        jMenu2.add(mnuResCT);

        mnuclear.setText("Clear Screen");
        mnuclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuclearActionPerformed(evt);
            }
        });
        jMenu2.add(mnuclear);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Insert");

        mnuBCT.setText("Before Current Task");
        mnuBCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBCTActionPerformed(evt);
            }
        });
        jMenu3.add(mnuBCT);

        mnuACT.setText("After Current Task");
        mnuACT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuACTActionPerformed(evt);
            }
        });
        jMenu3.add(mnuACT);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(txtname))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuACTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuACTActionPerformed
        String nm = txtname.getText();//read info from screen
        String d = txtdes.getText();
        Task t = new Task(nm,d); //make a task
        if(t.validate()==false){ //make sure data is ok
            JOptionPane.showMessageDialog(this,"Error - Must enter all information");
            return;
        }
        if (tottask>0) li.next(); //go past current task if you have at least 1
        
        li.add(t); //it always adds to the left of iterator
        li.previous(); //always put iterator before current task
        curtask++; //new task is now current and we inserted it after
        tottask++; //we have one new task
        lbltot.setText("" + tottask); //update counter displays
        lbltask.setText("" + curtask); //update counter displays
        JOptionPane.showMessageDialog(this,"Task Added");
    }//GEN-LAST:event_mnuACTActionPerformed

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        if (curtask==tottask) return; //we are at end
        while(li.hasNext())//go to end
            li.next();
        t = li.previous(); //go to front of last
        curtask=tottask; // curtask is last
        //update display
        lbltask.setText("" + curtask);
        txtname.setText(t.getName());
        txtdes.setText(t.getDescription());
    }//GEN-LAST:event_btnlastActionPerformed

    private void mnushowallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnushowallActionPerformed
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            t = list.get(i);
            result+="TASK " + (i+1) + ":\n" + t.toString() + "\n";
        }
        JOptionPane.showMessageDialog(this,result);
    }//GEN-LAST:event_mnushowallActionPerformed

    private void btnstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstartActionPerformed
        if (curtask==0|| curtask==1) return; //we are at start
        while(li.hasPrevious())//go to start
            t = li.previous();
        curtask=1; // curtask is last
        //update display
        lbltask.setText("" + curtask);
        txtname.setText(t.getName());
        txtdes.setText(t.getDescription());
    }//GEN-LAST:event_btnstartActionPerformed

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        if (curtask==1||curtask==0) return;
        t = li.previous();
        curtask--;
        lbltask.setText("" + curtask);
        txtname.setText(t.getName());
        txtdes.setText(t.getDescription());

    }//GEN-LAST:event_btnprevActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        if (curtask==tottask) return;
        li.next();
        li.next();
        t = li.previous();
        curtask++;
        lbltask.setText("" + curtask);
        txtname.setText(t.getName());
        txtdes.setText(t.getDescription());
    }//GEN-LAST:event_btnnextActionPerformed

    private void mnuResCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuResCTActionPerformed
        if (tottask==0){
            JOptionPane.showMessageDialog(this,"Error - No task to restore");
            return;
        }
        li.next();
        t=li.previous();
        lbltask.setText("" + curtask);
        txtname.setText(t.getName());
        txtdes.setText(t.getDescription());
    }//GEN-LAST:event_mnuResCTActionPerformed

    private void mnurepCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnurepCTActionPerformed
        if (tottask==0){
            JOptionPane.showMessageDialog(this,"Error - No task to replace");
            return;
        }
        
        String nm = txtname.getText();//read info from screen
        String d = txtdes.getText();
        Task t = new Task(nm,d); //make a task
        if(t.validate()==false){ //make sure data is ok
            JOptionPane.showMessageDialog(this,"Error - Must enter all information");
            return;
        }
        if (tottask>0) li.next(); //go past current task if you have at least 1
        
        li.set(t); //it always adds to the left of iterator
        li.previous(); //always put iterator before current task
        lbltot.setText("" + tottask); //update counter displays
        lbltask.setText("" + curtask); //update counter displays
        JOptionPane.showMessageDialog(this,"Task Replaced");
    }//GEN-LAST:event_mnurepCTActionPerformed

    private void mnuRemCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRemCTActionPerformed
        if (tottask==0){
            JOptionPane.showMessageDialog(this,"Error - No task to remove");
            return;
        }
        li.next();
        li.remove();
        tottask--;
        curtask--;
        
        if (curtask==tottask){
           t=li.previous(); 
        }
        else if (curtask==0){
            curtask++;
        }
        else if(tottask==0){
            curtask=0;
        }
        else{
            li.next();
            t = li.previous();
        }
        lbltot.setText("" + tottask); //update counter displays
        lbltask.setText("" + curtask); //update counter displays
        if (tottask==0){
            txtname.setText("");
            txtdes.setText("");
        }
        else{
            txtname.setText(t.getName());
            txtdes.setText(t.getDescription());
        }
        
        JOptionPane.showMessageDialog(this,"Task Removed");
        
    }//GEN-LAST:event_mnuRemCTActionPerformed

    private void mnuBCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBCTActionPerformed
        String nm = txtname.getText();//read info from screen
        String d = txtdes.getText();
        Task t = new Task(nm,d); //make a task
        if(t.validate()==false){ //make sure data is ok
            JOptionPane.showMessageDialog(this,"Error - Must enter all information");
            return;
        }        
        li.add(t); //it always adds to the left of iterator
        li.previous(); //always put iterator before current task
        tottask++; //we have one new task
        lbltot.setText("" + tottask); //update counter displays
        if (curtask==0){
            curtask++;
        }
        lbltask.setText("" + curtask); //update counter displays
        JOptionPane.showMessageDialog(this,"Task Added");
        
    }//GEN-LAST:event_mnuBCTActionPerformed

    private void mnuclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuclearActionPerformed
        txtname.setText("");
        txtdes.setText("");
    }//GEN-LAST:event_mnuclearActionPerformed

    
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
            java.util.logging.Logger.getLogger(TaskGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JButton btnstart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltask;
    private javax.swing.JLabel lbltot;
    private javax.swing.JMenuItem mnuACT;
    private javax.swing.JMenuItem mnuBCT;
    private javax.swing.JMenuItem mnuRemCT;
    private javax.swing.JMenuItem mnuResCT;
    private javax.swing.JMenuItem mnuclear;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenuItem mnurepCT;
    private javax.swing.JMenuItem mnushowall;
    private javax.swing.JTextArea txtdes;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
