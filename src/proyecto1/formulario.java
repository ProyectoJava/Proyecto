/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class formulario extends javax.swing.JFrame {

File dir,file;
static JList jlist1=new JList();
static DefaultListModel modelo=new DefaultListModel();
String rutaGlobal;

    public formulario() throws IOException, Exception {
        setLocationRelativeTo(null);
        
        rutaGlobal = JOptionPane.showInputDialog("En que ruta quisiera trabajar:");
        if(!rutaGlobal.endsWith("/")){
            rutaGlobal += "/";
        }
        System.out.println(rutaGlobal);
        escribirArchivo(crearArchivo(), rutaGlobal);
        leerArchivo("/Users/ghondar/Desktop/archivos/ruta.txt");
        initComponents();
        carga();
    }

    private void carga(){
        this.jTextField1.setText("seccion3305-->>"); 
        this.jTextField1.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jList1.setBackground(new java.awt.Color(0, 0, 0));
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try {
                String mandato=null;
                mandato=this.jTextField1.getText().substring(15,19).trim();
                if(mandato.equalsIgnoreCase("crtc")){
                    String parametro = parametro();
                    dir=new File(parametro);
                    dir.mkdir();
                    carga();
                    modelo.addElement("se ha creado la carpeta "+dir.getName());
                    jList1.setModel(modelo);

                }
                if(mandato.equalsIgnoreCase("crtf")){
                    String parametro = parametro();
                    dir=new File(parametro);
                    try {
                        if(dir.createNewFile()){
                            modelo.addElement("Se ha creado el archivo "+dir.getName());
                        }else{
                            modelo.addElement("No se ha podido crear el archivo "+dir.getName());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    carga();
                    jList1.setModel(modelo);

                }

                if(mandato.equalsIgnoreCase("dele")){
                    String parametro = parametro();
                    dir = new File(parametro);
                    if(dir.isDirectory()){
                        modelo.addElement("Se elemino la carpeta "+dir.getName());
                    }
                    else if(dir.isFile()){
                        modelo.addElement("Se elemino el archivo "+dir.getName());
                    }
                    dir.delete();
                    carga();
                    jList1.setModel(modelo);

                }
                if(mandato.equalsIgnoreCase("rnmt")){
                    String ruta = JOptionPane.showInputDialog("Que nombre le pones:");
                    System.out.println(ruta);
                    String parametro = parametro();
                    dir=new File(parametro);
                    String cambio = parametro.replace(dir.getName(), ruta);
                    File dir1 = new File(cambio);
                    System.out.println(cambio);
                    dir.renameTo(dir1);

                }
                if(mandato.equalsIgnoreCase("lstr")){
                    dir = new File(rutaGlobal);
                    String[] ficheros = dir.list();
                    for(int i = 0; i<ficheros.length;i++){
                    modelo.addElement(ficheros[i]);
                    }
                    carga();
                     jList1.setModel(modelo);
                    deslizar();
                    Thread.sleep(10000);
                   
                }
                if(mandato.equalsIgnoreCase("lmpr")){
                    modelo.clear();
                    jList1.setModel(modelo);
                    carga();

                }
                if(mandato.equalsIgnoreCase("baja")){
                    jScrollPane1.getVerticalScrollBar().setValue(jScrollPane1.getVerticalScrollBar().getMaximum());

                }
            } catch (Exception e) {
                System.out.println(e.getStackTrace());
            }
                      
            
      
        }
        
    }//GEN-LAST:event_jTextField1KeyReleased
    
    public String parametro(){
        String primero =this.jTextField1.getText().substring(20,this.jTextField1.getText().length()).trim();
        String parametro = rutaGlobal + primero;
        return parametro;
    }
    public void deslizar(){
        jScrollPane1.getVerticalScrollBar().setValue(jScrollPane1.getVerticalScrollBar().getMaximum());
    }
    public PrintWriter escribirArchivo(PrintWriter salida, String cadena) throws  Exception{
        salida.write(cadena);
        salida.close();
        return salida;
    }
    public PrintWriter crearArchivo() throws IOException{
        File archivo = new File("/Users/ghondar/Desktop/archivos/ruta.txt");
        FileWriter writer = new FileWriter(archivo);
        PrintWriter salida = new PrintWriter(writer);
        return salida;
    }
    public String leerArchivo(String ruta) throws Exception{
        File archivo = new File(ruta);
        FileReader fileReader = new FileReader(archivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linea = null;
        String contenido = "";
        while((linea=bufferedReader.readLine())!=null){
            System.out.println(linea);
            contenido += " "+linea;
        }
        if(null != fileReader) fileReader.close();
        return contenido;
    }
 
    public static void main(String args[]) {
   
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new formulario().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(formulario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
