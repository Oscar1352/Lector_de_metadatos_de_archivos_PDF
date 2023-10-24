package com.mycompany.proyecto_1.Interfaces;

import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.io.*;
import javax.swing.text.Caret;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.JTextComponent;

public class frmEditor extends JFrame {

    JTextArea area = new JTextArea("");
    JFileChooser fileChooser = new JFileChooser();

    frmEditor() {

        JFrame frame = new JFrame("Editor de texto");
        frame.setSize(400, 300); 

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);

        JMenuBar mb = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenuItem abrir = new JMenuItem("Abrir");
        abrir.addActionListener(new AbrirArchivo());
        JMenuItem guardar = new JMenuItem("Guardar");
        guardar.addActionListener(new GuardarArchivo());
        JMenuItem imprimir = new JMenuItem("Imprimir");
        JMenuItem salir = new JMenuItem("Salir");
        salir.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JMenu editar = new JMenu("Editar");
        JMenuItem copiar = new JMenuItem("Copiar");

        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem pegar = new JMenuItem("Pegar");
        JMenuItem buscar = new JMenuItem("Buscar");
        buscar = new JMenuItem(new AccionBuscar(area));

        mb.add(archivo);
        archivo.add(abrir);
        archivo.add(guardar);
        archivo.add(imprimir);
        archivo.add(salir);
        mb.add(editar);
        editar.add(cortar);
        editar.add(copiar);
        editar.add(pegar);
        editar.add(new JSeparator());
        editar.add(buscar);

        JScrollPane scr = new JScrollPane();
        scr.setViewportView(area);
        frame.getContentPane().add(scr);

        ActionListener accion = new ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditar(evt);
            }
        };

        abrir.addActionListener(accion);
        guardar.addActionListener(accion);
        salir.addActionListener(accion);
        copiar.addActionListener(accion);
        cortar.addActionListener(accion);
        pegar.addActionListener(accion);

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setJMenuBar(mb);

        imprimir.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                imprimir();
            }
        });

    }

    // Opcion para poder imprimir el archivo .txt
    public void imprimir() {
        String todo = area.getText();
        PrintJob pjob = getToolkit().getPrintJob(this, "Imprimir Hoja", null);
        Graphics pg = pjob.getGraphics();
        pg.setFont(new Font("SansSerif", Font.PLAIN, 10));
        pg.drawString("Imprimido:", 100, 100);
        int inicio = 0;
        int numlineas = 1;
        for (int i = 0; i < todo.length(); i++) {
            if ((int) todo.charAt(i) == 10) {
                pg.drawString(todo.substring(inicio, i - 1), 100, 100 + (15 * numlineas));
                inicio = i + 1;
                numlineas++;
            }
        }
        pg.drawString(todo.substring(inicio, todo.length()), 100, 100 + (15 * numlineas));
        pg.dispose(); 
        pjob.end(); 
    }

    // Opcion para poder abrir otro archivo de texto
    class AbrirArchivo implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            int retval = fileChooser.showOpenDialog(frmEditor.this);
            if (retval == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                area.setText("");

                BufferedReader reader = null;
                try {
                    reader = new BufferedReader(new FileReader(file));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(AbrirArchivo.class.getName()).log(Level.SEVERE, null, ex);
                }
                String linea = null;
                try {
                    linea = reader.readLine();
                } catch (IOException ex) {
                    Logger.getLogger(AbrirArchivo.class.getName()).log(Level.SEVERE, null, ex);
                }
                while (linea != null) {
                    // Aquí lo que tengamos que hacer con la línea puede ser esto
                    area.append(linea);
                    area.append(System.getProperty("line.separator"));
                    try {
                        linea = reader.readLine();
                    } catch (IOException ex) {
                        Logger.getLogger(AbrirArchivo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        }
    }

    // Opcion para poder guardar el archivo de texto
    public class GuardarArchivo implements ActionListener {

        public void actionPerformed(ActionEvent ae) {

            int retval = fileChooser.showSaveDialog(frmEditor.this);
            if (retval == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();

                PrintWriter writer = null;
                try {
                    writer = new PrintWriter(file);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(GuardarArchivo.class.getName()).log(Level.SEVERE, null, ex);
                }
                writer.print(area.getText());
                writer.close();

            }
        }
    }

    // Opcion para poder buscar por medio de palabras
    public class AccionBuscar extends AbstractAction {

        private JTextComponent area;

        public AccionBuscar(JTextComponent area) {
            this.area = area;
            this.putValue(Action.NAME, "Buscar ...");
            this.putValue(Action.ACCELERATOR_KEY, KeyStroke.getAWTKeyStroke('B', Event.CTRL_MASK));
        }

        public void actionPerformed(ActionEvent arg0) {

            String textoABuscar = area.getSelectedText();

            if (textoABuscar == null) {
                textoABuscar = "";
            }

            textoABuscar = JOptionPane.showInputDialog(area, "Texto a buscar", textoABuscar);

            String texto = area.getText();
            Caret seleccion = area.getCaret();
            int posicion = 0;
            if (seleccion.getDot() != seleccion.getMark()) {
                posicion = seleccion.getDot();
            }

            posicion = texto.indexOf(textoABuscar, posicion);
            if (posicion == -1) {
                return;
            }
            area.setCaretPosition(posicion);
            area.moveCaretPosition(posicion + textoABuscar.length());
        }
    }

    private void menuEditar(ActionEvent evt) {

        if (evt.getActionCommand().contentEquals("Copiar")) {

            javax.swing.Action accionCopiar = area.getActionMap().get(DefaultEditorKit.copyAction);
            accionCopiar.actionPerformed(evt);
        } else if (evt.getActionCommand().contentEquals("Cortar")) {
            javax.swing.Action accionCortar = area.getActionMap().get(DefaultEditorKit.cutAction);
            accionCortar.actionPerformed(evt);
        } else if (evt.getActionCommand().contentEquals("Pegar")) {
            javax.swing.Action accionPegar = area.getActionMap().get(DefaultEditorKit.pasteAction);
            accionPegar.actionPerformed(evt);
        }
    }

    // Correr el editor de texto, cargando previamente el archio que queremos
    public void correr() {
        String filePath = "C:\\Users\\urbin\\OneDrive\\Escritorio\\Lector_de_metadatos_de_archivos_PDF\\Datos_PDF\\InfoPDF.txt"; 
        File file = new File(filePath);
        area.setText("");

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AbrirArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        String linea = null;
        try {
            linea = reader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(AbrirArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (linea != null) {
            // Aquí lo que tengamos que hacer con la línea puede ser esto
            area.append(linea);
            area.append(System.getProperty("line.separator"));
            try {
                linea = reader.readLine();
            } catch (IOException ex) {
                Logger.getLogger(AbrirArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
