/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_1.Interfaces;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.graphics.PDXObject;
import org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import com.mycompany.proyecto_1.Métodos;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author urbin
 */
public class frmPaginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPaginaPrincipal
     */
    public frmPaginaPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Página principal");
        setIconImages(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Lector de metadatos avanzado");

        jLabel2.setText("Presione el siguiente boton para seleccionar un archivo:");

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Seleccionar carpeta");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Presione el siguiente boton para seleccionar una carpeta:");

        jButton2.setBackground(new java.awt.Color(153, 153, 0));
        jButton2.setText("Seleccionar archivo");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jButton3.setBackground(new java.awt.Color(255, 153, 153));
        jButton3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton3.setText("Ir a carpeta del destino");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("Inicio");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Salir");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(11, 11, 11)))
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(221, 221, 221))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String archivo_guardar = "C:\\Users\\urbin\\OneDrive\\Escritorio\\Lector_de_metadatos_de_archivos_PDF\\Datos_PDF\\InfoCarpetaPDFS.txt";
        Métodos met = new Métodos();
        met.crearArchivo(archivo_guardar);

        JFileChooser jfc = new JFileChooser();

        jfc.showOpenDialog(jfc);
        File archivoSeleccionado = jfc.getSelectedFile();

        String parent = archivoSeleccionado.getParent();
        String nuevoParent = parent.replaceAll("\\\\", "\\\\\\\\");
        JOptionPane.showMessageDialog(null, "Carpeta Seleccionada -> " + nuevoParent);

        String rutaCarpeta = nuevoParent;

        File carpeta = new File(rutaCarpeta);

        if (carpeta.exists() && carpeta.isDirectory()) {
            File[] archivos = carpeta.listFiles();

            if (archivos != null) {
                int seleccion = JOptionPane.showOptionDialog(null, "¿Desea abrir la carpeta en donde se guardó el archivo?",
                        "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null,// null para icono por defecto.
                        new Object[]{"Si", "No"}, "opcion 1");
                System.out.println(seleccion);
                if (seleccion == 0) {
                    String folderPath = "C:\\Users\\urbin\\OneDrive\\Escritorio\\Lector_de_metadatos_de_archivos_PDF\\Datos_PDF";

                    // Abre la carpeta en el sistema de archivos
                    try {
                        Desktop.getDesktop().open(new File(folderPath));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } else {
                    System.out.println("");
                }
                for (File archivo : archivos) {
                    if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".pdf")) {
                        try {
                            PDDocument pdf = PDDocument.load(archivo);
                            PDDocumentInformation info = pdf.getDocumentInformation();

                            met.escribirArchivo(archivo_guardar, "Archivo: " + archivo.getName());
                            CalcularTamañoArchivos(archivo, archivo_guardar);
                            CalcularTamañoPaginas(archivo, archivo_guardar);
                            CalcularNumeroPaginas(pdf, archivo_guardar);
                            ObtenerTitulo(info, archivo_guardar);
                            ObtenerAsuntoPDF(info, archivo_guardar);
                            ObtenerPalabrasClaves(info, archivo_guardar);
                            ObtenerTipoPDF(pdf, archivo_guardar);
                            ObtenerVersionPDF(pdf, archivo_guardar);
                            ObtenerAplicacionCreador(info, archivo_guardar);
                            ObtenerImagenes(pdf, archivo_guardar);
                            ObtenerFuentes(pdf, archivo_guardar);
                            met.escribirArchivo(archivo_guardar, "**************************************************");
                            pdf.close();
                        } catch (IOException e) {
                            System.err.println("Error al leer el archivo PDF: " + archivo.getName());
                        }
                    }
                }
                try {
                    // Especifica la ruta del archivo de texto que deseas abrir
                    String rutaArchivo = "C:\\Users\\urbin\\OneDrive\\Escritorio\\Lector_de_metadatos_de_archivos_PDF\\Datos_PDF\\InfoCarpetaPDFS.txt";

                    // Crea un objeto BufferedReader para leer el archivo
                    BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));

                    String linea;
                    while ((linea = br.readLine()) != null) {
                        System.out.println(linea);
                    }

                    // Cierra el BufferedReader
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.err.println("La carpeta no existe o no es una carpeta válida.");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new Color(153, 102, 0));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(153, 153, 0));
    }//GEN-LAST:event_jButton2MouseExited

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro programa");
        System.exit(0);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY); // Configura el JFileChooser para seleccionar solo archivos
        int resultado = jfc.showOpenDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = jfc.getSelectedFile();

            if (archivoSeleccionado.isFile() && archivoSeleccionado.getName().toLowerCase().endsWith(".pdf")) {
                // Si es un archivo PDF, obtén su información
                try {
                    frmInfoArchivo a = new frmInfoArchivo(archivoSeleccionado);
                    a.show(true);
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al leer el archivo PDF.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El elemento seleccionado no es un archivo PDF válido.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún archivo.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        JOptionPane.showMessageDialog(null, "Se regresa al inicio del programa");
        frmPaginaPrincipal a = new frmPaginaPrincipal();
        a.show(true);
        this.hide();

    }//GEN-LAST:event_jMenu1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// Ruta de la carpeta que deseas abrir
        String folderPath = "C:\\Users\\urbin\\OneDrive\\Escritorio\\Lector_de_metadatos_de_archivos_PDF\\Datos_PDF";

        // Abre la carpeta en el sistema de archivos
        try {
            Desktop.getDesktop().open(new File(folderPath));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        String rutaPDF = "C:\\Users\\urbin\\OneDrive\\Escritorio\\Lector_de_metadatos_de_archivos_PDF\\ProyectoLectorMetadatos.pdf";

    // Verifica si el soporte de la API Desktop está disponible
    if (Desktop.isDesktopSupported()) {
        Desktop desktop = Desktop.getDesktop();
        try {
            // Abre el archivo PDF con la aplicación predeterminada
            desktop.open(new File(rutaPDF));
        } catch (IOException e) {
            e.printStackTrace();
        }
    } else {
        // La API Desktop no está soportada en este sistema
        System.out.println("La apertura de archivos no es compatible en este sistema.");
    }
    }//GEN-LAST:event_jMenu2MouseClicked

    // Definiar el tamaño de los archivos pdfs
    public static void CalcularTamañoArchivos(File archivo, String archivoGuardar) {
        Métodos met = new Métodos();

        long tamanoBytes = archivo.length();
        float tamaño = tamanoBytes / 1000;

        if (tamaño > 1000) {
            met.escribirArchivo(archivoGuardar, tamaño / 1000 + " Megabytes");
        } else {
            met.escribirArchivo(archivoGuardar, tamaño + " Kilobytes");
        }
    }

    // Definir el tamaño de las paginas de los archivos pdfs
    public static void CalcularTamañoPaginas(File archivo, String archivoGuardar) {
        Métodos met = new Métodos();

        try (PDDocument document = PDDocument.load(archivo)) {
            int numeroDePaginas = document.getNumberOfPages();

            for (int pageNum = 0; pageNum < numeroDePaginas; pageNum++) {
                PDPage page = document.getPage(pageNum);

                float ancho = page.getMediaBox().getWidth();
                float alto = page.getMediaBox().getHeight();

                met.escribirArchivo(archivoGuardar, "Página " + (pageNum + 1) + ":");
                met.escribirArchivo(archivoGuardar, "Ancho: " + ancho + " puntos");
                met.escribirArchivo(archivoGuardar, "Alto: " + alto + " puntos");
            }
            System.out.println("------------------------");
        } catch (IOException e) {
        }
    }

    // Calcular el numero de paginas de los archivos pdfs
    public static void CalcularNumeroPaginas(PDDocument pdf, String archivoGuardar) {
        Métodos met = new Métodos();
        int numPaginas = pdf.getNumberOfPages();

        met.escribirArchivo(archivoGuardar, "Número de páginas: " + numPaginas);
    }

    // Definir el titulo de los archivos pdfs
    public static void ObtenerTitulo(PDDocumentInformation info, String archivoGuardar) {
        Métodos met = new Métodos();
        String titulo = info.getTitle();

        if (titulo != null && !titulo.isEmpty()) {
            met.escribirArchivo(archivoGuardar, "Titulo: " + titulo);
        } else {
            met.escribirArchivo(archivoGuardar, "El archivo PDF no tiene título.");
        }
    }

    // Determinar el asuntos de los archivos pdfs
    public static void ObtenerAsuntoPDF(PDDocumentInformation info, String archivoGuardar) {
        Métodos met = new Métodos();
        String asuntoPDF = info.getSubject();

        if (asuntoPDF != null && !asuntoPDF.isEmpty()) {
            met.escribirArchivo(archivoGuardar, "Asunto: " + asuntoPDF);
        } else {
            met.escribirArchivo(archivoGuardar, "El archivo PDF no tiene asunto");
        }
    }

    // Determinar las palabras claves del pdf
    public static void ObtenerPalabrasClaves(PDDocumentInformation info, String archivoGuardar) {
        Métodos met = new Métodos();
        String palabrasClave = info.getKeywords();

        if (palabrasClave != null && !palabrasClave.isEmpty()) {
            met.escribirArchivo(archivoGuardar, "Palabras clave: " + palabrasClave);
        } else {
            met.escribirArchivo(archivoGuardar, "Este archivo no tiene palabras clave");
        }
    }

    // Determinar el tipo de pdf que es
    public static void ObtenerTipoPDF(PDDocument pdf, String archivoGuardar) {
        Métodos met = new Métodos();
        if (pdf.isEncrypted()) {
            met.escribirArchivo(archivoGuardar, "El tipo de archivo PDF es: Encriptado");
        } else {
            met.escribirArchivo(archivoGuardar, "El tipo de archivo PDF es: No encriptado");
        }
    }

    // Determinar la version del pdf
    public static void ObtenerVersionPDF(PDDocument pdf, String archivoGuardar) {
        Métodos met = new Métodos();
        float version = pdf.getVersion();

        met.escribirArchivo(archivoGuardar, "Numero de version: " + version);
    }

    // Determinar la aplicacion con la que fue creada el pdf
    public static void ObtenerAplicacionCreador(PDDocumentInformation info, String archivoGuardar) {
        Métodos met = new Métodos();
        String aplicacionCreadora = info.getCreator();

        if (aplicacionCreadora != null && !aplicacionCreadora.isEmpty()) {
            met.escribirArchivo(archivoGuardar, "Aplicación creadora del archivo: " + aplicacionCreadora);
        } else {
            met.escribirArchivo(archivoGuardar, "El archivo PDF no tiene la aplicación creadora.");
        }
    }

    // Determinar las imagenes del pdf
    public static void ObtenerImagenes(PDDocument pdf, String archivoGuardar) throws IOException {
        Métodos met = new Métodos();
        int pageNum = 0;
        for (PDPage page : pdf.getPages()) {
            PDResources resources = page.getResources();
            for (COSName xObjectName : resources.getXObjectNames()) {
                PDXObject xObject = resources.getXObject(xObjectName);
                if (xObject instanceof PDImageXObject) {
                    PDImageXObject image = (PDImageXObject) xObject;
                    met.escribirArchivo(archivoGuardar, "Página " + pageNum + ": Imagen encontrada - Formato: " + image.getSuffix() + ", Ancho: " + image.getWidth() + ", Alto: " + image.getHeight());
                } else if (xObject instanceof PDFormXObject) {
                    PDFormXObject form = (PDFormXObject) xObject;
                    for (COSName subXObjectName : form.getResources().getXObjectNames()) {
                        PDXObject subXObject = form.getResources().getXObject(subXObjectName);
                        if (subXObject instanceof PDImageXObject) {
                            PDImageXObject subImage = (PDImageXObject) subXObject;
                            met.escribirArchivo(archivoGuardar, "Página " + pageNum + ": Imagen encontrada - Formato: " + subImage.getSuffix() + ", Ancho: " + subImage.getWidth() + ", Alto: " + subImage.getHeight());
                        }
                    }
                }
            }

            pageNum++;
        }
    }

    // Determinar las fuentes del pdf
    public static void ObtenerFuentes(PDDocument pdf, String archivoGuardar) {
        Métodos met = new Métodos();
        Map<String, String> fontMapping = new HashMap<>();
        fontMapping.put("TT0", "Times New Roman");
        fontMapping.put("TT1", "Calibri");
        fontMapping.put("TT2", "Arial");
        fontMapping.put("TT3", "Courier-BoldOblique");

        Set<String> uniqueFonts = new HashSet<>();

        for (PDPage page : pdf.getPages()) {
            PDResources resources = page.getResources();
            COSDictionary fonts = (COSDictionary) resources.getCOSObject().getDictionaryObject(COSName.FONT);
            if (fonts != null) {
                for (COSName fontName : fonts.keySet()) {
                    String fontNameString = fontName.getName();
                    String mappedFontName = fontMapping.get(fontNameString);
                    if (mappedFontName != null) {
                        uniqueFonts.add(mappedFontName);
                    }
                }
            }
        }

        met.escribirArchivo(archivoGuardar, "Fuentes únicas: " + String.join(", ", uniqueFonts));
    }

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
            java.util.logging.Logger.getLogger(frmPaginaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPaginaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPaginaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPaginaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
