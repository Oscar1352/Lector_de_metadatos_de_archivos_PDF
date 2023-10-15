/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_1.Interfaces;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.pdmodel.graphics.PDXObject;
import org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import com.mycompany.proyecto_1.Métodos;
import java.util.HashSet;
import java.util.Set;
import org.apache.pdfbox.cos.COSName;


/**
 *
 * @author Oscar Luna
 */
public class frmInfoArchivo extends javax.swing.JFrame {

    /**
     * Creates new form frmInfoArchivo
     *
     * @param archivoPDF
     */
    public frmInfoArchivo(File archivoPDF) throws IOException {
        initComponents();
        obtenerInformacionPDF(archivoPDF);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        lbltamaño = new java.awt.Label();
        lblNoDePáginas = new java.awt.Label();
        lblTítulo = new java.awt.Label();
        lblAsunto = new java.awt.Label();
        lblPalabrasClave = new java.awt.Label();
        lblAplicación = new java.awt.Label();
        Regresar = new java.awt.Button();
        label7 = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        lblAplicación1 = new java.awt.Label();
        label8 = new java.awt.Label();
        lblVersion = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Información de PDF");
        setResizable(false);

        label1.setText("Número de páginas: ");

        label2.setText("Tamaño de archivo:");

        label3.setText("Título: ");

        label4.setText("Asunto:");

        label5.setText("Palabras Clave:");

        label6.setText("Aplicación con la que fue creada:");

        Regresar.setBackground(new java.awt.Color(255, 102, 51));
        Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regresar.setLabel("Regresar");
        Regresar.setName(""); // NOI18N
        Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegresarMouseExited(evt);
            }
        });
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        label7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label7.setText("INFORMACIÓN DEL PDF");

        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        label8.setText("Version de PDF: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(129, 129, 129)
                                        .addComponent(lblAplicación1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblVersion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNoDePáginas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTítulo, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                    .addComponent(lblAsunto, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                    .addComponent(lblPalabrasClave, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                    .addComponent(lblAplicación, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                    .addComponent(lbltamaño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(240, 240, 240)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbltamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblNoDePáginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTítulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPalabrasClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAplicación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAplicación1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        frmPaginaPrincipal a = new frmPaginaPrincipal();
        a.show(true);
        this.show(false);
    }//GEN-LAST:event_RegresarActionPerformed

    private void RegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseEntered
        Regresar.setBackground(new Color(255, 102, 51));
    }//GEN-LAST:event_RegresarMouseEntered

    private void RegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseExited
        Regresar.setBackground(new Color(153, 51, 0));
    }//GEN-LAST:event_RegresarMouseExited

    private void obtenerInformacionPDF(File archivoPDF) throws IOException {
        String archivo = "C:\\Users\\urbin\\OneDrive\\Escritorio\\Lector_de_metadatos_de_archivos_PDF\\InfoPDF.txt";
        Métodos met = new Métodos();
        met.crearArchivo(archivo);

        // Abre el archivo PDF
        PDDocument pdf = PDDocument.load(archivoPDF);

        // Obtiene la información del documento
        PDDocumentInformation info = pdf.getDocumentInformation();
        String titulo = info.getTitle();
        String asunto = info.getSubject();
        String palabrasClave = info.getKeywords();
        String aplicacionCreadora = info.getCreator();

        // Obtiene el número de páginas del documento
        int numPaginas = pdf.getNumberOfPages();
        
        // Obtiene la version del pdf
        float version = pdf.getVersion();
        lblVersion.setText(version + "");
        
        // Obtiene el tamaño del archivo del pdf
        long tamanoBytes = archivoPDF.length();
        float tamaño = tamanoBytes / 1000;
        lblNoDePáginas.setText(numPaginas + "");
        if (tamaño > 1000) {
            lbltamaño.setText(tamaño / 1000 + " Megabytes");
        } else {
            lbltamaño.setText(tamaño + " Kilobytes");
        }
        met.escribirArchivo(archivo, "Tamaño del archivo: "+ lbltamaño.getText());
        met.escribirArchivo(archivo, "Tamaño de las paginas: ");
        
        // Obtiene el tamaño de las páginas del pdf
        for (int pageNum = 0; pageNum < numPaginas; pageNum++) {
            PDPage page = pdf.getPage(pageNum);
            float ancho = page.getMediaBox().getWidth();
            float alto = page.getMediaBox().getHeight();
            
            met.escribirArchivo(archivo, "Numero pagina: " + (pageNum+1));
            met.escribirArchivo(archivo, "Ancho:" + ancho);
            met.escribirArchivo(archivo, "Alto:" + alto);
        }

        // Determinar el numero de paginas del pdf
        met.escribirArchivo(archivo, "Número de páginas: " + numPaginas);

        // Muestra el título del PDF
        if (titulo != null && !titulo.isEmpty()) {
            lblTítulo.setText(titulo);
            met.escribirArchivo(archivo, "Título: " + titulo);
        } else {
            lblTítulo.setText("El archivo PDF no tiene título.");
            met.escribirArchivo(archivo, "El archivo PDF no tiene título.");
        }

        // Determinar el asunto de un pdf
        if (asunto != null && !asunto.isEmpty()) {
            lblAsunto.setText(asunto);
            met.escribirArchivo(archivo, "Asunto: " + asunto);
        } else {
            lblAsunto.setText("El archivo PDF no tiene asunto.");
            met.escribirArchivo(archivo, "El archivo PDF no tiene asunto.");
        }

        // Determinar las palabras claves de un pdf
        if (palabrasClave != null && !palabrasClave.isEmpty()) {
            lblPalabrasClave.setText(palabrasClave);
            met.escribirArchivo(archivo, "Palabras Clave: " + palabrasClave);
        } else {
            lblPalabrasClave.setText("El archivo PDF no tiene palabras clave.");
            met.escribirArchivo(archivo, "El archivo PDF no tiene palabras clave.");
        }
        
        // Determinar tipo de archivo pdf
            if (pdf.isEncrypted()) {
                met.escribirArchivo(archivo, "El tipo de archivo PDF es: Encriptado");
            } else {
                met.escribirArchivo(archivo, "El tipo de archivo PDF es: No encriptado");
            }
        
        // Determinar la version del pdf
        met.escribirArchivo(archivo, "La versión del PDF es: " + version);

        // Determinar con que se creo el archivo pdf
        if (aplicacionCreadora != null && !aplicacionCreadora.isEmpty()) {
            lblAplicación.setText(aplicacionCreadora);
            met.escribirArchivo(archivo, "Aplicación creadora del archivo: " + aplicacionCreadora);
        } else {
            lblAplicación.setText("El archivo PDF no tiene la aplicación creadora.");
            met.escribirArchivo(archivo, "Aplicación creadora del archivo: " + "El archivo PDF no tiene la aplicación creadora.");
        }
        
        // Determinar las imagenes del pdf
            int pageNum = 0;

            for (PDPage page : pdf.getPages()) {
                PDResources resources = page.getResources();
                for (COSName xObjectName : resources.getXObjectNames()) {
                    PDXObject xObject = resources.getXObject(xObjectName);
                    if (xObject instanceof PDImageXObject) {
                        PDImageXObject image = (PDImageXObject) xObject;
                        met.escribirArchivo(archivo, "Página " + pageNum + ": Imagen encontrada - Formato: " + image.getSuffix() + ", Ancho: " + image.getWidth() + ", Alto: " + image.getHeight());
                    } else if (xObject instanceof PDFormXObject) {
                        PDFormXObject form = (PDFormXObject) xObject;
                        for (COSName subXObjectName : form.getResources().getXObjectNames()) {
                            PDXObject subXObject = form.getResources().getXObject(subXObjectName);
                            if (subXObject instanceof PDImageXObject) {
                                PDImageXObject subImage = (PDImageXObject) subXObject;
                                met.escribirArchivo(archivo, "Página " + pageNum + ": Imagen encontrada - Formato: " + subImage.getSuffix() + ", Ancho: " + subImage.getWidth() + ", Alto: " + subImage.getHeight());
                            }
                        }
                    }
                }

                pageNum++;
            }
        
        // Determinar las fuentes del pdf
            Map<String, String> fontMapping = new HashMap<>();
            // Agrega mapeo de nombres técnicos a nombres legibles
            fontMapping.put("TT0", "Times New Roman");
            fontMapping.put("TT1", "Calibri");
            fontMapping.put("TT2", "Arial");
            fontMapping.put("TT3", "Courier-BoldOblique");
            // Agrega más mapeos según sea necesario

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

            met.escribirArchivo(archivo, "Fuentes únicas: " + String.join(", ", uniqueFonts));

        // Cierra el documento PDF
        pdf.close();
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
            java.util.logging.Logger.getLogger(frmInfoArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInfoArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInfoArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInfoArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(File archivoPDF) throws IOException {
                new frmInfoArchivo(archivoPDF).setVisible(true);
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Regresar;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label lblAplicación;
    private java.awt.Label lblAplicación1;
    private java.awt.Label lblAsunto;
    private java.awt.Label lblNoDePáginas;
    private java.awt.Label lblPalabrasClave;
    private java.awt.Label lblTítulo;
    private java.awt.Label lblVersion;
    private java.awt.Label lbltamaño;
    // End of variables declaration//GEN-END:variables
}
