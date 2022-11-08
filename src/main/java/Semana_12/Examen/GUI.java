/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Semana_12.Examen;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Detz1
 */
class Complementos{
        
    static int nAleatorio(int min, int max){ // DEVUELVE UN NUMERO ALEATORIO
        int n;
        Random rd=new Random();
        n=rd.nextInt((max-min)+1)+min;
        return n;      
    }
    
    static String cadenaAleatoria(int longitud) {
        // El banco de caracteres
        String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        // La cadena en donde iremos agregando un carácter aleatorio
        String cadena = "";
        for (int x = 0; x < longitud; x++) {
            int indiceAleatorio = nAleatorio(0, banco.length() - 1);
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return cadena;
    }
}

class nodo_Simple{
    Animales dato;
    nodo_Simple sgte;
    
    public nodo_Simple(Animales dato) {
        this.dato = dato;
        this.sgte = null;
    } 
}

class Lista_Simple{
    nodo_Simple origen=null;
    
    
    void ingresar(Animales n){
        nodo_Simple newnodo=new nodo_Simple(n);
        if(origen==null){
            origen=newnodo;
        }else{
            newnodo.sgte=origen;
            origen=newnodo;
        }
        
    }
    
    void mostrar(){
        nodo_Simple  temp=origen;
        while(temp!=null){
            System.out.print(temp.dato+" --> ");
            temp=temp.sgte;
        }
    }
    
}


class nodo_Doble{
    Animales dato;
    nodo_Doble sgte,ant;
    
    public nodo_Doble(Animales n){
        this.dato=n;
        this.ant=this.sgte=null;
    } 

    
}

class Lista_Doble {
   nodo_Doble origen, fin;
   
    public Lista_Doble(){
        this.origen=this.fin=null;
    }
    void ingresar(Animales n){
        nodo_Doble newnodo=new nodo_Doble(n);        
        if(origen==null){            
            fin=origen=newnodo;
        }else{
                newnodo.sgte=origen;
                origen.ant=newnodo;
                origen=newnodo;
                }
    }
    
    void mostrar(){
        nodo_Doble temp=fin;
        while(temp!=null){
            System.out.print(temp.dato+" --> ");
            
            temp=temp.ant;
        }
    }
    
    void escribirTxt()throws IOException{   //ESCRIBE EL OBJETO EN EL TXT
        File arch = new File("Deiby.txt");
        if(!arch.exists()){
            arch.createNewFile();
        }
        PrintWriter pw=new PrintWriter(arch);
 
        nodo_Doble temp1 = fin;
        pw.println("Hola : \n");
        while(temp1!=null){
            //pw.print(" -> "+temp1.dato());
            temp1=temp1.ant;
        }
    
    }
}


public class GUI extends javax.swing.JFrame {
    Complementos cp= new Complementos();
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        buttonGroup1.add(btn_simple);
        buttonGroup1.add(btn_doble);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btn_crear = new javax.swing.JButton();
        lbl_welcome = new javax.swing.JLabel();
        lbl_tipo = new javax.swing.JLabel();
        lbl_animal = new javax.swing.JLabel();
        text_nAnimal = new javax.swing.JTextField();
        btn_simple = new javax.swing.JRadioButton();
        btn_doble = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_crear.setText("CREAR");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        lbl_welcome.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        lbl_welcome.setText("** BIENVENIDO **");

        lbl_tipo.setText("TIPO DE LISTA :");

        lbl_animal.setText("Numero de animales: ");

        text_nAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nAnimalActionPerformed(evt);
            }
        });

        btn_simple.setText("Simple");
        btn_simple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpleActionPerformed(evt);
            }
        });

        btn_doble.setText("Doble");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_animal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_welcome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(text_nAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_tipo)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_doble, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crear)
                    .addComponent(btn_simple, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_welcome)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_animal)
                            .addComponent(text_nAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_simple)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_doble)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_crear)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
        
        int n=Integer.parseInt(this.text_nAnimal.getText().trim());
        Lista_Simple met_s = new Lista_Simple();
        Lista_Doble met_d = new Lista_Doble();
        
        String sexo[]={"Macho","Hembra"};
        String especie[]={"Marsupial","Oviparo","Mamifero"};
        if(btn_simple.isSelected()){
            for(int i=0;i<n;i++){
                
                met_s.ingresar(new Animales(especie[(int)(Math.random()*2)],cp.cadenaAleatoria(5),cp.nAleatorio(1,25),sexo[(int)(Math.random()*2)]));
                
            }
        }else if(btn_doble.isSelected()){
            for(int i=0;i<n;i++){
                
                met_d.ingresar(new Animales(especie[(int)(Math.random()*2)],cp.cadenaAleatoria(5),cp.nAleatorio(1,25),sexo[(int)(Math.random()*2)]));
                
            }
            try {
                met_d.escribirTxt();
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
                JOptionPane.showMessageDialog(null, "SIN SELECCION");
                }
        
        
        met_s.mostrar();
        met_d.mostrar();
        
            
        
    }//GEN-LAST:event_btn_crearActionPerformed

    private void text_nAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nAnimalActionPerformed

    private void btn_simpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_simpleActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear;
    private javax.swing.JRadioButton btn_doble;
    private javax.swing.JRadioButton btn_simple;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_animal;
    private javax.swing.JLabel lbl_tipo;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JTextField text_nAnimal;
    // End of variables declaration//GEN-END:variables
}