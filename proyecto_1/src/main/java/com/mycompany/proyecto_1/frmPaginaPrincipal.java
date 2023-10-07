/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_1;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;

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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Lector de metadatos avanzado");

        jLabel2.setText("Presione el siguiente boton para seleccionar un archivo:");

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Seleccionar carpeta");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jMenu1.setText("Inicio");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Salir");
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(80, 80, 80))
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
                                .addGap(15, 15, 15))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
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
                        .addComponent(jLabel2)))
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser jfc = new JFileChooser();

        jfc.showOpenDialog(jfc);
        File archivoSeleccionado = jfc.getSelectedFile();

        String parent = archivoSeleccionado.getParent();
        String nuevoParent = parent.replaceAll("\\\\", "\\\\\\\\");
        JOptionPane.showMessageDialog(null, "Carpeta Seleccionada -> " + nuevoParent);

        CalcularTamañoArchivos(nuevoParent);
        CalcularTamañoPaginas(nuevoParent);
        CalcularNumeroPaginas(nuevoParent);
        ObtenerTitulo(nuevoParent);
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
                    obtenerInformacionPDF(archivoSeleccionado);
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

    public static void obtenerInformacionPDF(File archivoPDF) throws IOException {
        // Abre el archivo PDF
        PDDocument pdf = PDDocument.load(archivoPDF);

        // Obtiene la información del documento
        PDDocumentInformation info = pdf.getDocumentInformation();
        String titulo = info.getTitle();

        // Obtiene el número de páginas del documento
        int numPaginas = pdf.getNumberOfPages();

        // Obtiene el tamaño de las páginas
        for (int pageNum = 0; pageNum < numPaginas; pageNum++) {
            PDPage page = pdf.getPage(pageNum);
            float ancho = page.getMediaBox().getWidth();
            float alto = page.getMediaBox().getHeight();
            System.out.println("Página " + (pageNum + 1) + ":");
            System.out.println("Ancho: " + ancho + " puntos");
            System.out.println("Alto: " + alto + " puntos");
        }

        // Obtiene el tamaño del archivo
        long tamanoBytes = archivoPDF.length();
        System.out.println("Archivo: " + archivoPDF.getName());
        System.out.println("No De Páginas: " + numPaginas);
        System.out.println("Tamaño en bytes: " + tamanoBytes/1000 + " Kilobytes");

        // Muestra el título del PDF
        if (titulo != null && !titulo.isEmpty()) {
            System.out.println("Título: " + titulo);
        } else {
            System.out.println("El archivo PDF no tiene título.");
        }

        // Cierra el documento PDF
        pdf.close();
    }

    public static void CalcularTamañoArchivos(String ruta) {
        String rutaCarpeta = ruta;

        File carpeta = new File(rutaCarpeta);

        if (carpeta.exists() && carpeta.isDirectory()) {
            File[] archivos = carpeta.listFiles();

            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".pdf")) {
                        long tamanoBytes = archivo.length() / 1000;

                        System.out.println("Archivo: " + archivo.getName());
                        System.out.println("Tamaño en bytes: " + tamanoBytes + " Kilobytes");
                        System.out.println("------------------------");
                    }
                }
            }
        } else {
            System.err.println("La carpeta no existe o no es una carpeta válida.");
        }
    }

    public static void CalcularNumeroPaginas(String ruta) {
        String rutaCarpeta = ruta;

        File carpeta = new File(rutaCarpeta);

        if (carpeta.exists() && carpeta.isDirectory()) {
            File[] archivos = carpeta.listFiles();

            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".pdf")) {
                        try {
                            PDDocument pdf = PDDocument.load(archivo);
                            int numPaginas = pdf.getNumberOfPages();
                            pdf.close();

                            System.out.println("Archivo: " + archivo.getName());
                            System.out.println("Número de páginas: " + numPaginas);
                            System.out.println("------------------------");
                        } catch (IOException e) {
                            System.err.println("Error al leer el archivo PDF: " + archivo.getName());
                        }
                    }
                }
            }
        } else {
            System.err.println("La carpeta no existe o no es una carpeta válida.");
        }
    }

    public static void ObtenerTitulo(String ruta) {
        String rutaCarpeta = ruta;

        File directorio = new File(rutaCarpeta);

        if (directorio.isDirectory()) {
            File[] archivosPDF = directorio.listFiles((dir, nombre) -> nombre.toLowerCase().endsWith(".pdf"));

            if (archivosPDF != null) {
                for (File archivo : archivosPDF) {
                    try (PDDocument document = PDDocument.load(archivo)) {
                        PDDocumentInformation info = document.getDocumentInformation();
                        String titulo = info.getTitle();

                        if (titulo != null && !titulo.isEmpty()) {
                            System.out.println("Archivo: " + archivo.getName());
                            System.out.println("Titulo: " + titulo);
                            System.out.println("------------------------");
                        } else {
                            System.out.println("El archivo '" + archivo.getName() + "' no tiene título.");
                            System.out.println("------------------------");
                        }
                    } catch (IOException e) {
                    }
                }
            }
        }
    }

    public static void CalcularTamañoPaginas(String ruta) {
        String rutaCarpeta = ruta;

        File directorio = new File(rutaCarpeta);

        if (directorio.isDirectory()) {
            File[] archivosPDF = directorio.listFiles((dir, nombre) -> nombre.toLowerCase().endsWith(".pdf"));

            if (archivosPDF != null) {
                for (File archivo : archivosPDF) {
                    try (PDDocument document = PDDocument.load(archivo)) {
                        int numeroDePaginas = document.getNumberOfPages();

                        System.out.println("Archivo: " + archivo.getName());

                        for (int pageNum = 0; pageNum < numeroDePaginas; pageNum++) {
                            PDPage page = document.getPage(pageNum);

                            float ancho = page.getMediaBox().getWidth();
                            float alto = page.getMediaBox().getHeight();

                            System.out.println("Página " + (pageNum + 1) + ":");
                            System.out.println("Ancho: " + ancho + " puntos");
                            System.out.println("Alto: " + alto + " puntos");
                            System.out.println();
                        }
                        System.out.println("------------------------");
                    } catch (IOException e) {
                    }
                }
            }
        }
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
            java.util.logging.Logger.getLogger(frmPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
