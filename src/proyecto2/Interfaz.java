/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2;
import Body.Arbolvisual;
import Body.HashTable;
import Body.Tree;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Image;
import java.nio.file.Files;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

/**
 *
 * @author gramc
 */
public class Interfaz extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;

    public Interfaz() {
        initComponents();
        inicio.setBackground(Color.white);
        blanco2.setVisible(false);  //Para que no se vea los botones del panel de atras

        this.setLocationRelativeTo(this);

        this.pintarImagen(this.Reyimg, "src/Img/rey.jpg");          //Para agregar las imagenes de la interfaz
        this.pintarImagen(this.herencia, "src/Img/herencia.gif");
        this.pintarImagen(this.arbol, "src/Img/arbol-de-familia.gif");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barramenu = new javax.swing.JPanel();
        inicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        serbtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        genealogico = new javax.swing.JLabel();
        btnsalida = new javax.swing.JPanel();
        txtsalida = new javax.swing.JLabel();
        fondo = new javax.swing.JPanel();
        blanco1 = new javax.swing.JPanel();
        Reyimg = new javax.swing.JLabel();
        arbol = new javax.swing.JLabel();
        herencia = new javax.swing.JLabel();
        blanco2 = new javax.swing.JPanel();
        CargarTree = new javax.swing.JButton();
        VerRegistro = new javax.swing.JButton();
        BuscarNom = new javax.swing.JButton();
        MostrarAntep = new javax.swing.JButton();
        BuscarTitulo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barramenu.setBackground(new java.awt.Color(102, 102, 102));

        inicio.setBackground(new java.awt.Color(204, 204, 204));
        inicio.setPreferredSize(new java.awt.Dimension(140, 43));
        inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicioMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INICIO");

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        serbtn.setBackground(new java.awt.Color(204, 204, 204));
        serbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serbtnMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SERVICIO BOTONES");

        javax.swing.GroupLayout serbtnLayout = new javax.swing.GroupLayout(serbtn);
        serbtn.setLayout(serbtnLayout);
        serbtnLayout.setHorizontalGroup(
            serbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        serbtnLayout.setVerticalGroup(
            serbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        genealogico.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        genealogico.setForeground(new java.awt.Color(255, 255, 255));
        genealogico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genealogico.setText("Árbol Genealógico");

        btnsalida.setBackground(new java.awt.Color(204, 204, 204));
        btnsalida.setPreferredSize(new java.awt.Dimension(100, 43));

        txtsalida.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtsalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtsalida.setText("SALIDA");
        txtsalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsalidaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtsalidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtsalidaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnsalidaLayout = new javax.swing.GroupLayout(btnsalida);
        btnsalida.setLayout(btnsalidaLayout);
        btnsalidaLayout.setHorizontalGroup(
            btnsalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtsalida, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnsalidaLayout.setVerticalGroup(
            btnsalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtsalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barramenuLayout = new javax.swing.GroupLayout(barramenu);
        barramenu.setLayout(barramenuLayout);
        barramenuLayout.setHorizontalGroup(
            barramenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barramenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(genealogico, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(serbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        barramenuLayout.setVerticalGroup(
            barramenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(serbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barramenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(genealogico, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(5, 5, 5))
            .addComponent(btnsalida, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        blanco1.setBackground(new java.awt.Color(255, 255, 255));

        Reyimg.setIcon(new javax.swing.ImageIcon("C:\\Users\\gramc\\Downloads\\rey2.jpg")); // NOI18N

        javax.swing.GroupLayout blanco1Layout = new javax.swing.GroupLayout(blanco1);
        blanco1.setLayout(blanco1Layout);
        blanco1Layout.setHorizontalGroup(
            blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco1Layout.createSequentialGroup()
                .addComponent(Reyimg, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(herencia, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(arbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        blanco1Layout.setVerticalGroup(
            blanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Reyimg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(blanco1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(herencia, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(arbol, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        blanco2.setBackground(new java.awt.Color(255, 255, 255));

        CargarTree.setBackground(new java.awt.Color(51, 51, 51));
        CargarTree.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        CargarTree.setForeground(new java.awt.Color(255, 255, 255));
        CargarTree.setText("Cargar Tree");
        CargarTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CargarTreeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CargarTreeMouseExited(evt);
            }
        });
        CargarTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarTreeActionPerformed(evt);
            }
        });

        VerRegistro.setBackground(new java.awt.Color(51, 51, 51));
        VerRegistro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        VerRegistro.setForeground(new java.awt.Color(255, 255, 255));
        VerRegistro.setText("Ver Registro");
        VerRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VerRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VerRegistroMouseExited(evt);
            }
        });

        BuscarNom.setBackground(new java.awt.Color(51, 51, 51));
        BuscarNom.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        BuscarNom.setForeground(new java.awt.Color(255, 255, 255));
        BuscarNom.setText("Buscar Nom");
        BuscarNom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuscarNomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuscarNomMouseExited(evt);
            }
        });
        BuscarNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarNomActionPerformed(evt);
            }
        });

        MostrarAntep.setBackground(new java.awt.Color(51, 51, 51));
        MostrarAntep.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        MostrarAntep.setForeground(new java.awt.Color(255, 255, 255));
        MostrarAntep.setText("Mostrar Antep");
        MostrarAntep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MostrarAntepMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MostrarAntepMouseExited(evt);
            }
        });

        BuscarTitulo.setBackground(new java.awt.Color(51, 51, 51));
        BuscarTitulo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        BuscarTitulo.setForeground(new java.awt.Color(255, 255, 255));
        BuscarTitulo.setText("Buscar Titulo");
        BuscarTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuscarTituloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuscarTituloMouseExited(evt);
            }
        });

        javax.swing.GroupLayout blanco2Layout = new javax.swing.GroupLayout(blanco2);
        blanco2.setLayout(blanco2Layout);
        blanco2Layout.setHorizontalGroup(
            blanco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(blanco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BuscarNom, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CargarTree, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VerRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addGroup(blanco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MostrarAntep)
                    .addComponent(BuscarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(422, Short.MAX_VALUE))
        );
        blanco2Layout.setVerticalGroup(
            blanco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(blanco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CargarTree, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MostrarAntep, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(blanco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VerRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(BuscarNom, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(blanco1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(blanco2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(blanco1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(blanco2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barramenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barramenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseClicked
        blanco1.setVisible(true);   //Para que se muestre el panel que selecciones
        blanco2.setVisible(false);
        inicio.setBackground(Color.white);
        serbtn.setBackground(new Color(204, 204, 204));

    }//GEN-LAST:event_inicioMouseClicked

    private void serbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serbtnMouseClicked
        blanco2.setVisible(true);   //Para que se muestre el panel que selecciones
        blanco1.setVisible(false);
        serbtn.setBackground(Color.white);
        inicio.setBackground(new Color(204, 204, 204));

    }//GEN-LAST:event_serbtnMouseClicked

    private void txtsalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsalidaMouseClicked
        System.exit(0);  // Salida del programa
    }//GEN-LAST:event_txtsalidaMouseClicked

    private void txtsalidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsalidaMouseEntered
        btnsalida.setBackground(Color.red);    // Coloca el color rojo al seleccionarlo
        txtsalida.setForeground(Color.white);
    }//GEN-LAST:event_txtsalidaMouseEntered

    private void txtsalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsalidaMouseExited
        btnsalida.setBackground(new Color(204, 204, 204));  // Devuelve el color del background
        txtsalida.setForeground(Color.black);
    }//GEN-LAST:event_txtsalidaMouseExited

    private void BuscarNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarNomActionPerformed

    private void CargarTreeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarTreeMouseEntered
        CargarTree.setBackground(new Color(153, 204, 255));
        CargarTree.setForeground(Color.black);
    }//GEN-LAST:event_CargarTreeMouseEntered

    private void CargarTreeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarTreeMouseExited
        CargarTree.setBackground(new Color(51, 51, 51));
        CargarTree.setForeground(Color.white);
    }//GEN-LAST:event_CargarTreeMouseExited

    private void VerRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerRegistroMouseEntered
        VerRegistro.setBackground(new Color(153, 204, 255));
        VerRegistro.setForeground(Color.black);
    }//GEN-LAST:event_VerRegistroMouseEntered

    private void VerRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerRegistroMouseExited
        VerRegistro.setBackground(new Color(51, 51, 51));
        VerRegistro.setForeground(Color.white);
    }//GEN-LAST:event_VerRegistroMouseExited

    private void BuscarNomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarNomMouseEntered
        BuscarNom.setBackground(new Color(153, 204, 255));
        BuscarNom.setForeground(Color.black);
    }//GEN-LAST:event_BuscarNomMouseEntered

    private void BuscarNomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarNomMouseExited
        BuscarNom.setBackground(new Color(51, 51, 51));
        BuscarNom.setForeground(Color.white);
    }//GEN-LAST:event_BuscarNomMouseExited

    private void MostrarAntepMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarAntepMouseEntered
        MostrarAntep.setBackground(new Color(153, 204, 255));
        MostrarAntep.setForeground(Color.black);
    }//GEN-LAST:event_MostrarAntepMouseEntered

    private void MostrarAntepMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarAntepMouseExited
        MostrarAntep.setBackground(new Color(51, 51, 51));
        MostrarAntep.setForeground(Color.white);
    }//GEN-LAST:event_MostrarAntepMouseExited

    private void BuscarTituloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarTituloMouseEntered
        BuscarTitulo.setBackground(new Color(153, 204, 255));
        BuscarTitulo.setForeground(Color.black);
    }//GEN-LAST:event_BuscarTituloMouseEntered

    private void BuscarTituloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarTituloMouseExited
        BuscarTitulo.setBackground(new Color(51, 51, 51));
        BuscarTitulo.setForeground(Color.white);
    }//GEN-LAST:event_BuscarTituloMouseExited

    private void CargarTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarTreeActionPerformed
        var chooser = new JFileChooser(); //para seleccionar el archivo
        chooser.showOpenDialog(null);

        //recibe el archivo
        var file = chooser.getSelectedFile();
        if (file != null) {
            try {
                var nombre = file.getName();
                var contenido = new String(Files.readAllBytes(file.toPath())); //lee el archivo

                JsonParser parser = new JsonParser();
                JsonElement element = parser.parse(contenido);
                JsonObject casas = element.getAsJsonObject();

                //itera en archivocasa del json
                for (String archivoCasa : casas.keySet()) {
                    System.out.println(archivoCasa);
                    JsonArray miembros = casas.getAsJsonArray(archivoCasa);
                    
                    Arbolvisual arbol = new Arbolvisual();
                    arbol.display();

                    //itera cada miembro del archivocasa
                    for (JsonElement miembro : miembros) {
                        JsonObject linaje = miembro.getAsJsonObject();

                        //itera en cada miembro del linaje
                        for (String nombreMiembro : linaje.keySet()) {
                            System.out.println(nombreMiembro);
                            JsonArray atributos = linaje.getAsJsonArray(nombreMiembro);

                            //itera cada atributos y los muestra
                            for (JsonElement atributo : atributos) {
                                var Ofhisname = atributo.getAsJsonObject().get("Of his name");
                                var bornTo = atributo.getAsJsonObject().get("Born to");
                                var knownThroughoutAs = atributo.getAsJsonObject().get("Known throughout as");
                                var heldTitle = atributo.getAsJsonObject().get("Held title");
                                var wedTo = atributo.getAsJsonObject().get("Wed to");
                                var ofEyes = atributo.getAsJsonObject().get("Of eyes");
                                var ofhair = atributo.getAsJsonObject().get("Of hair");
                                var notes = atributo.getAsJsonObject().get("Notes");
                                var fate = atributo.getAsJsonObject().get("Fate");
                                System.out.println(atributo);

                                // Verifica si el miembro tiene hijos y los muestra
                                if (atributo.getAsJsonObject().has("Father to")) {
                                    JsonArray fatherTo = atributo.getAsJsonObject().get("Father to").getAsJsonArray();
                                    System.out.println("Father to:");
                                    for (JsonElement hijo : fatherTo) {
                                        System.out.println(hijo.getAsString());

                                    }

                                }

                            }
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_CargarTreeActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    private void pintarImagen(JLabel lb1, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                        lb1.getWidth(),
                        lb1.getHeight(),
                        Image.SCALE_DEFAULT
                )
        );
        lb1.setIcon(this.icono);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarNom;
    private javax.swing.JButton BuscarTitulo;
    private javax.swing.JButton CargarTree;
    private javax.swing.JButton MostrarAntep;
    private javax.swing.JLabel Reyimg;
    private javax.swing.JButton VerRegistro;
    private javax.swing.JLabel arbol;
    private javax.swing.JPanel barramenu;
    private javax.swing.JPanel blanco1;
    private javax.swing.JPanel blanco2;
    private javax.swing.JPanel btnsalida;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel genealogico;
    private javax.swing.JLabel herencia;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel serbtn;
    private javax.swing.JLabel txtsalida;
    // End of variables declaration//GEN-END:variables
}
