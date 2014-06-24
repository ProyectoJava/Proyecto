/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
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
        crearAlmacen();
//        System.out.println(leerRuta());
        
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
                    String parametro = leerRuta()+parametro();
                    dir=new File(parametro);
                    dir.mkdir();
                    carga();
                    modelo.addElement("se ha creado la carpeta "+dir.getName());
                    jList1.setModel(modelo);

                }
                if(mandato.equalsIgnoreCase("crtf")){
                    System.out.println(leerRuta());
                    System.out.println(parametro());
                    String parametro = leerRuta()+parametro();
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
                    String parametro = leerRuta()+parametro();
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
                    String parametro = leerRuta()+parametro();
                    dir=new File(parametro);
                    String cambio = parametro.replace(dir.getName(), ruta);
                    File dir1 = new File(cambio);
                    System.out.println(cambio);
                    dir.renameTo(dir1);

                }
                if(mandato.equalsIgnoreCase("lstr")){
                    System.out.println(leerRuta());
                    dir = new File(leerRuta());
                    String[] ficheros = dir.list();
                    for(int i = 0; i<ficheros.length;i++){
                    modelo.addElement(ficheros[i]);
                    }
                    carga();
                     jList1.setModel(modelo);                
                }
                if(mandato.equalsIgnoreCase("lmpr")){
                    modelo.clear();
                    jList1.setModel(modelo);
                    carga();

                }
                if(mandato.equalsIgnoreCase("baja")){
                    jScrollPane1.getVerticalScrollBar().setValue(jScrollPane1.getVerticalScrollBar().getMaximum());
                    carga();

                }
                if(mandato.equalsIgnoreCase("ruta")){
                    modelo.addElement(leerRuta());
                    jList1.setModel(modelo);
                    carga();
                }
                if(mandato.equalsIgnoreCase("cmbr")){
                    String cambio = JOptionPane.showInputDialog("Cual es la ruta nueva?");
                    escribirArchivo(crearArchivo(), cambio);
                    crearAlmacen();
                    carga();
                }
                if(mandato.equalsIgnoreCase("zipr")){
                    String mensaje = zipear(leerRuta()+parametro());
                    modelo.addElement(mensaje);
                    jlist1.setModel(modelo);
                    carga();
                }
                if(mandato.equalsIgnoreCase("bscr")){
                    String parametro = parametro();
                    dir = new File(leerRuta());
                    String[] ficheros = dir.list();
                    String existencia = null;
                    for(int i = 0; i<ficheros.length;i++){
                        if(parametro.toLowerCase().equals(ficheros[i].toLowerCase().toString())){
                            existencia = "Si existe el archivo";
                            modelo.addElement(existencia);
                        }
                    }
                    if(existencia == null){
                        existencia = "No existe el archivo o directorio";
                            modelo.addElement(existencia);
                    }
                    carga();
                    jlist1.setModel(modelo);
                    System.out.println("hola");
                }
                if(mandato.equalsIgnoreCase("help")){
                    
                }
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
                      
            
      
        }
        
    }//GEN-LAST:event_jTextField1KeyReleased
    
    public String parametro(){
        String parametro =this.jTextField1.getText().substring(20,this.jTextField1.getText().length()).trim();
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
    public PrintWriter agregarPalabras(PrintWriter salida, String cadena) throws Exception{
        salida.append(cadena);
        salida.close();
        return salida;
    }
    public PrintWriter crearArchivo() throws IOException{
        File directorio = new File("/Users/ghondar/Desktop/archivos");// estas lineas cambiarlas por esta: File directorio = new File("c:\\config");
        if(!directorio.exists()) directorio.mkdir();
        File archivo = new File("/Users/ghondar/Desktop/archivos/ruta.txt");// estas lineas cambiarlas por esta: File directorio = new File("c:\\config\\ruta.txt");
        FileWriter writer = new FileWriter(archivo);
        PrintWriter salida = new PrintWriter(writer);
        return salida;
    }
    public String leerRuta() throws Exception{
        File archivo = new File("/Users/ghondar/Desktop/archivos/ruta.txt");// estas lineas cambiarlas por esta: File directorio = new File("c:\\config\\ruta.txt");
        FileReader fileReader = new FileReader(archivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linea = null;
        String contenido = "";
        while((linea=bufferedReader.readLine())!=null){
            contenido += linea;
        }
        if(null != fileReader) fileReader.close();
        return contenido;
    }
    public boolean existencia(String ruta){
        File carpeta = new File(ruta);
        return carpeta.exists();
    }
    public void crearAlmacen() throws IOException, Exception{
        if(existencia("/Users/ghondar/Desktop/archivos/ruta.txt")){// estas lineas cambiarlas por esta: File directorio = new File("c:\\config\\ruta.txt");
            if(leerRuta().isEmpty()) rutaGlobal = JOptionPane.showInputDialog("En que ruta quisiera trabajar:");
            if(!leerRuta().endsWith("/")){// estas lineas cambiarlas por esta: if(!leerRuta().endsWith("\\")){
                String a = leerRuta();
                System.out.println(a);
                System.out.println("hola");
                File file = new File("/Users/ghondar/Desktop/archivos/ruta.txt");// estas lineas cambiarlas por esta: File directorio = new File("c:\\config\\ruta.txt");
                
                FileWriter writer = new FileWriter(file);
                PrintWriter salida = new PrintWriter(writer);
                salida.write(a);
                salida.append("/");// estas lineas cambiarlas por esta: salida.append("\\");
                salida.close();
            }
            
        }else{
            rutaGlobal = JOptionPane.showInputDialog("En que ruta quisiera trabajar:");
            escribirArchivo(crearArchivo(), rutaGlobal);
            if(!leerRuta().endsWith("/")){// estas lineas cambiarlas por esta: if(!leerRuta().endsWith("\\")){
                String a = leerRuta();
                File file = new File("/Users/ghondar/Desktop/archivos/ruta.txt");// estas lineas cambiarlas por esta: File directorio = new File("c:\\config\\ruta.txt");
                FileWriter writer = new FileWriter(file);
                PrintWriter salida = new PrintWriter(writer);
                salida.write(a);
                salida.append("/");// estas lineas cambiarlas por esta: salida.append("\\");
                salida.close();
            }
        }
    }
    public static String zipear(String dir){
        File d = new File(dir);
        String destino = dir.substring(0,dir.length()-d.getName().length()).trim();
        try {
            System.out.println(destino);
            if(!d.isDirectory()) throw new IllegalArgumentException(dir+ " no es un Directorio.");
            String [] entries = d.list();
            byte[] buffer = new byte[4096];
            int bytesRead;
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(destino+d.getName()+".zip"));
            for(int i =0; i< entries.length; i++){
                File f = new File(d, entries[i]);
                if(f.isDirectory()) continue;
                FileInputStream in = new FileInputStream(f);
                ZipEntry entry = new ZipEntry(f.getName());
                out.putNextEntry(entry);
                while((bytesRead = in.read(buffer))!= -1){
                    out.write(buffer,0,bytesRead);
                    
                }
                in.close();
            }
            out.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return "Carpeta comprimida a "+d.getName() + ".zip";
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
