package messengerclient;

import java.awt.BorderLayout;
import javax.swing.DefaultListSelectionModel;
import javax.swing.ListSelectionModel;

public class ClientListPanel extends javax.swing.JPanel {

    /** Creates new form ClientListPanel */
    public ClientListPanel() {
        initComponents();
        createListModel();
    }

        void createListModel()
    {
        list_model=new javax.swing.DefaultListModel();
        list_online_clients = new javax.swing.JList(list_model);
        list_online_clients.setBorder(javax.swing.BorderFactory.createTitledBorder("Buddy List"));

        dlsm=new DefaultListSelectionModel();
        dlsm.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list_online_clients.setSelectionModel(dlsm);
        this.setLayout(new BorderLayout());
        this.add(list_online_clients,BorderLayout.CENTER);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
     // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    public javax.swing.DefaultListModel list_model;
    public javax.swing.DefaultListSelectionModel dlsm;
    public javax.swing.JList list_online_clients;


