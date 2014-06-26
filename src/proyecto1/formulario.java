/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.Desktop;
import java.awt.Frame;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class formulario extends javax.swing.JFrame {
int x, y;
File dir,file;
static JList jlist1=new JList();
static DefaultListModel modelo=new DefaultListModel();
String rutaGlobal;

    public formulario() throws IOException, Exception {
        
        crearAlmacen();
//        System.out.println(leerRuta());
        setUndecorated(true); 
        setOpacity(0.70f);         
        initComponents();
        carga();
        this.setLocationRelativeTo(null);
        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rojo.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/amarillo.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/verde.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    
                    if(parametro().equals("--help")){
                     String ayuda = "crtc --> Crea una carpeta";
                     modelo.addElement(ayuda); 
                    }else{
                        String parametro = leerRuta()+parametro();
                        dir=new File(parametro);
                        dir.mkdir();                    
                        modelo.addElement("se ha creado la carpeta "+dir.getName());
                    }
                    carga();
                    jList1.setModel(modelo);
                    

                }
                if(mandato.equalsIgnoreCase("crtf")){    
                    if(parametro().equals("--help")){
                        String ayuda = "crtf --> Crea un archivo";
                        modelo.addElement(ayuda); 
                    }else{
                        String parametro = leerRuta()+parametro();
                        dir=new File(parametro);
                        try {
                            if(dir.createNewFile()){
                                modelo.addElement("Se ha creado el archivo "+dir.getName());
                            }else{
                                modelo.addElement("No se ha podido crear el archivo "+dir.getName());
                            }
                        } catch (Exception i) {
                            i.printStackTrace();
                        }
                    }
                    carga();
                    jList1.setModel(modelo);
                }
                if(mandato.equalsIgnoreCase("dele")){
                    
                    if(parametro().equals("--help")){
                    System.out.println(parametro());
                    String ayuda = "dele --> Borra un archivo o carpeta";
                    modelo.addElement(ayuda); 
                    }
                    else{
                        String parametro = leerRuta()+parametro();
                        dir = new File(parametro);
                        if(dir.isDirectory()){
                            modelo.addElement("Se elemino la carpeta "+dir.getName());
                        }
                        else if(dir.isFile()){
                            modelo.addElement("Se elemino el archivo "+dir.getName());
                        }
                        dir.delete();
                    }
                    carga();
                    jList1.setModel(modelo);

                }
                if(mandato.equalsIgnoreCase("rnmt")){
                    

                    if(parametro().equals("--help")){
                        String ayuda = "rnmt --> Renombra un archivo o carpeta";
                        modelo.addElement(ayuda); 
                    }else{

                        String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");               
                        String parametro = leerRuta()+parametro();
                        dir=new File(parametro);
                        String cambio = parametro.replace(dir.getName(), nuevoNombre);
                        File dir1 = new File(cambio);
                        dir.renameTo(dir1);
                        modelo.addElement("Se cambio el nombre a: "+nuevoNombre);
                    }
                    carga();
                    jList1.setModel(modelo);

                }
                if(mandato.equalsIgnoreCase("lstr")){
                    try {
                        if(parametro().equals("--help")){
                        String ayuda = "lstr --> Lista los elementos de la ruta";
                        modelo.addElement(ayuda); 
                    }
                    } catch (Exception e) {
                        dir = new File(leerRuta());
                        String[] ficheros = dir.list();
                        for(int i = 0; i<ficheros.length;i++){
                            modelo.addElement(ficheros[i]);
                        }
                    }
                     
                    carga();
                    jList1.setModel(modelo);                
                }
                if(mandato.equalsIgnoreCase("lmpr")){
                    try {
                        if(parametro().equals("--help")){                           
                            String ayuda = "lmpr --> Limpia la shell";
                            modelo.addElement(ayuda); 
                        }
                    } catch (Exception e) {
                        modelo.clear();
                        jList1.setModel(modelo);
                    }
                    
                    carga();

                }
                if(mandato.equalsIgnoreCase("baja")){
                    try {
                       if(parametro().equals("--help")){
                            System.out.println(parametro());
                            String ayuda = "baja --> Baja la barra de la shell";
                            modelo.addElement(ayuda); 
                       } 
                    } catch (Exception e) {
                        jScrollPane1.getVerticalScrollBar().setValue(jScrollPane1.getVerticalScrollBar().getMaximum());
                    }
                    
                    carga();
                }
                if(mandato.equalsIgnoreCase("ruta")){
                    try {
                        if(parametro().equals("--help")){
                            System.out.println(parametro());
                            String ayuda = "ruta --> Muestra la ruta actual de la shell";
                            modelo.addElement(ayuda); 
                        }
                        
                    } catch (Exception e) {
                        modelo.addElement(leerRuta());
                    }
                    carga();
                    jList1.setModel(modelo);
                    
                }
                if(mandato.equalsIgnoreCase("cmbr")){
                    try {
                        if(parametro().equals("--help")){
                            String ayuda = "cmbr --> Cambia la ruta de la shell";
                            modelo.addElement(ayuda); 
                            jList1.setModel(modelo);

                        }
                    } catch (Exception e) {
                        String cambio = JOptionPane.showInputDialog("Cual es la ruta nueva?");
                        escribirArchivo(crearArchivo(), cambio);
                        crearAlmacen();
                    }                 
                          
                    carga();
                }
                if(mandato.equalsIgnoreCase("zipr")){
                    
                    if(parametro().equals("--help")){
                        String ayuda = "zipr --> Comprime una carpeta en la misma ruta";
                        modelo.addElement(ayuda); 
                    }else{
                        String mensaje = zipear(leerRuta()+parametro());
                        modelo.addElement(mensaje);                  
                        
                    }
                    carga();
                    jList1.setModel(modelo);
                    
                }
                if(mandato.equalsIgnoreCase("ping")){
                    
                    if(parametro().equals("--help")){
                        String ayuda = "ping --> Verifica la disponibilidad de un host en tu Red";
                        modelo.addElement(ayuda); 
                    }else{
                        InetAddress ping;
                        String ip = parametro();
                        System.out.println(parametro());
                        String salida;                    
                        ping = InetAddress.getByName(ip);
                        if(ping.isReachable(5000)) salida = ip+" - Existe en tu Red!!"; 
                        else salida = ip + " - No Existe en tu Red!!";
                        modelo.addElement(salida);
                    }
                                      
                    carga();
                    jList1.setModel(modelo);
                    
                }
                
                if(mandato.equalsIgnoreCase("bscr")){
                    
                    if(parametro().equals("--help")){
                    System.out.println(parametro());
                    String ayuda = "bscr --> Busca un archivo o carpeta en la ruta";
                    modelo.addElement(ayuda); 
                    }

                    String parametro = parametro();
                    dir = new File(leerRuta());
                    String[] ficheros = dir.list();
                    String existencia = null;
                    for(int i = 0; i<ficheros.length;i++){
                        if(parametro.toLowerCase().equals(ficheros[i].toLowerCase())){
                            existencia = "Si existe el archivo";
                            modelo.addElement(existencia);
                        }
                    }
                    if(existencia == null){
                        existencia = "No existe el archivo o directorio";
                            modelo.addElement(existencia);
                    }
                               
                    carga();
                    jList1.setModel(modelo);
                }
                if(mandato.equalsIgnoreCase("open")){
                    
                    if(parametro().equals("--help")){
                    System.out.println(parametro());
                    String ayuda = "open --> Abre un archivo o carpeta de la ruta";
                    modelo.addElement(ayuda); 
                    }else{
                        String parametro = leerRuta()+parametro();
                        File file = new File(parametro);
                        Desktop.getDesktop().open(file);
                    }
                    carga();
                }
                if(mandato.equalsIgnoreCase("help")){
                    String ayuda;
                    String[] fichero;
                    for(int i = 0; i<14; i++){
                        switch(i){
                            case 0:
                                ayuda = "crtc --> Crea una carpeta";
                                modelo.addElement(ayuda); 
                                carga();
                                jList1.setModel(modelo);
                                break;
                            case 1:
                                ayuda = "crtf --> Crea un archivo";
                                modelo.addElement(ayuda); 
                                carga();
                                jList1.setModel(modelo);
                                break;
                            case 2:
                                ayuda = "dele --> Borra un archivo o carpeta";
                                modelo.addElement(ayuda); 
                                carga();
                                jList1.setModel(modelo);
                                break;
                            case 3:
                                ayuda = "rnmt --> renombra un archivo o carpeta";
                                modelo.addElement(ayuda); 
                                carga();
                                jList1.setModel(modelo);
                                break;
                            case 4:
                                ayuda = "lstr --> Lista los elementos de la ruta";
                                modelo.addElement(ayuda); 
                                carga();
                                jList1.setModel(modelo);
                                break;
                            case 5:
                                ayuda = "lmpr --> Limpia la shell";
                                modelo.addElement(ayuda); 
                                carga();
                                jList1.setModel(modelo);
                                break;
                            case 6:
                                ayuda = "baja --> Baja la barra de la shell";
                                modelo.addElement(ayuda); 
                                carga();
                                jList1.setModel(modelo);
                                break;
                            case 7:
                                ayuda = "ruta --> Muestra la ruta actual de la shell";
                                modelo.addElement(ayuda); 
                                carga();
                                jList1.setModel(modelo);
                                break;
                            case 8:
                                ayuda = "cmbr --> Cambia la ruta de la shell";
                                modelo.addElement(ayuda); 
                                carga();
                                jList1.setModel(modelo);
                                break;
                            case 9:
                                ayuda = "zipr --> Comprime una carpeta en la misma ruta";
                                modelo.addElement(ayuda); 
                                carga();
                                jList1.setModel(modelo);
                                break;
                            case 10:
                                ayuda = "bscr --> Busca un archivo o carpeta en la ruta";
                                modelo.addElement(ayuda); 
                                carga();
                                jList1.setModel(modelo);
                                break;
                            case 11:
                                ayuda = "open --> Abre un archivo o carpeta de la ruta";
                                modelo.addElement(ayuda); 
                                carga();
                                jList1.setModel(modelo);
                                break;
                            case 12:
                                ayuda = "ping --> Verifica la disponibilidad de un host en tu Red";
                                modelo.addElement(ayuda); 
                                carga();
                                jList1.setModel(modelo);
                                break;
                            case 13:
                                ayuda = "help --> Despliega una leyenda de los comandos";
                                modelo.addElement(ayuda); 
                                carga();
                                jList1.setModel(modelo);
                                break;
                        }
                    }
                    switch(parametro()){
                        case "crtc":
                            ayuda = "crtc --> Crea una carpeta";
                            modelo.addElement(ayuda); 
                            carga();
                            jList1.setModel(modelo);
                            break;
                            
                        case "crtf":
                            ayuda = "crtf --> Crea un archivo";
                            modelo.addElement(ayuda); 
                            carga();
                            jList1.setModel(modelo);
                            break;
                        case "dele":
                            ayuda = "dele --> Borra un archivo o carpeta";
                            modelo.addElement(ayuda);
                            carga();
                            jList1.setModel(modelo);
                            break;
                        case "rnmt":
                            ayuda = "rnmt --> renombra un archivo o carpeta";
                            modelo.addElement(ayuda); 
                            carga();
                            jList1.setModel(modelo);
                            break;
                        case "lstr":
                            ayuda = "lstr --> Lista los elementos de la ruta";
                            modelo.addElement(ayuda);
                            carga();
                            jList1.setModel(modelo);
                            break;
                        case "lmpr":
                            ayuda = "lmpr --> Limpia la shell";
                            modelo.addElement(ayuda); 
                            carga();
                            jList1.setModel(modelo);
                            break;
                        case "baja":
                            ayuda = "baja --> Baja la barra de la shell";
                            modelo.addElement(ayuda); 
                            carga();
                            jList1.setModel(modelo);
                            break;
                        case "ruta":
                            ayuda = "ruta --> Muestra la ruta actual de la shell";
                            modelo.addElement(ayuda); 
                            carga();
                            jList1.setModel(modelo);
                            break;
                        case "cmbr":
                            ayuda = "cmbr --> Cambia la ruta de la shell";
                            modelo.addElement(ayuda); 
                            carga();
                            jList1.setModel(modelo);
                            break;
                        case "zipr":
                            ayuda = "zipr --> Comprime una carpeta en la misma ruta";
                            modelo.addElement(ayuda);
                            carga();
                            jList1.setModel(modelo);
                            break;
                        case "bscr":
                            ayuda = "bscr --> Busca un archivo o carpeta en la ruta";
                            modelo.addElement(ayuda); 
                            carga();
                            jList1.setModel(modelo);
                            break;
                        case "ping":
                            ayuda = "ping --> Verifica la disponibilidad de un host en tu Red";
                            modelo.addElement(ayuda); 
                            carga();
                            jList1.setModel(modelo);
                            break;
                        case "open":
                            ayuda = "open --> Abre un archivo o carpeta de la ruta";
                            modelo.addElement(ayuda); 
                            carga();
                            jList1.setModel(modelo);
                            break;
                        case "help":
                            ayuda = "help --> Despliega una leyenda de los comandos";
                            modelo.addElement(ayuda); 
                            carga();
                            jList1.setModel(modelo);
                            break;
                    }
                    
                    
                }
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
                      
            
      
        }
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int primero = 0;
        if(this.getExtendedState()!=JFrame.MAXIMIZED_BOTH){
            primero = this.getExtendedState();
           this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        }else{
            this.setExtendedState(primero);
        }
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rojo_c.png")));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/amarillo_c.png")));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/verde_c.png")));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rojo.png")));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/amarillo.png")));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/verde.png")));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX(); 
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation(); 
        this.setLocation(point.x - x, point.y - y); 
    }//GEN-LAST:event_jPanel1MouseDragged
    
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
        File archivo = new File("/Users/ghondar/Desktop/archivos/ruta.txt");// estas lineas cambiarlas por esta: File archivo = new File("c:\\config\\ruta.txt");
        FileWriter writer = new FileWriter(archivo);
        PrintWriter salida = new PrintWriter(writer);
        return salida;
    }
    public String leerRuta() throws Exception{
        File archivo = new File("/Users/ghondar/Desktop/archivos/ruta.txt");// estas lineas cambiarlas por esta: File archivo = new File("c:\\config\\ruta.txt");
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
        if(existencia("/Users/ghondar/Desktop/archivos/ruta.txt")){// estas lineas cambiarlas por esta: if(existencia("c:\\config\\ruta.txt")){
            if(leerRuta().isEmpty()) rutaGlobal = JOptionPane.showInputDialog("En que ruta quisiera trabajar:");
            if(!leerRuta().endsWith("/")){// estas lineas cambiarlas por esta: if(!leerRuta().endsWith("\\")){
                String a = leerRuta();
                System.out.println(a);
                System.out.println("hola");
                File file = new File("/Users/ghondar/Desktop/archivos/ruta.txt");// estas lineas cambiarlas por esta: File file = new File("c:\\config\\ruta.txt");
                
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
                File file = new File("/Users/ghondar/Desktop/archivos/ruta.txt");// estas lineas cambiarlas por esta: File file = new File("c:\\config\\ruta.txt");
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
