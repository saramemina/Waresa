/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Waresa01;

import javax.swing.*;

/**
 * @author sara
 */
public class Esencial02_c2 extends javax.swing.JFrame {
    int size = 11;
    ImageIcon[] images = new ImageIcon[size];
    String[] textos = {

            "1. Ilustraremos mediante imágenes el proceso de construcción del humedal artificial.",


            "2.  El sistema de depuración se ha propuesto con 3 estaciones:\n" +
                    "    1. Estación desengrasante:\n" +
                    "    Contiene una grasera o atrapagrasas que se instala a la salida de las aguas provenientes de la cocina\n" +
                    "    2. Estación de limpieza previa:\n" +
                    "    Contiene un filtro básico que retiene contaminantes antes de que lleguen al humedal\n" +
                    "    3. Depuración del humedal:\n" +
                    "    Es la estructura del humedal con todos los componentes del mismo\n" +
                    "    4. Finalmente se encuentra un tanque que almacena el agua procesada",


            "3. Grasera o atrapagrasas.\n" +
                    "Si ya cuenta con un atrapagrasas funcional puede seguir haciendo uso de este, de lo contrario puede construir uno con una tarrina de 60 litros.\n" +
                    "    1. Realice el ingreso del agua de la cocina hacia la tarrina, incluya un codo para evitar oleaje.\n" +
                    "    2. A la salida de la tarrina instale una \"T\", para que el aire contenido en la parte superior facilite la circulación",


            "4. Una vez el agua ha pasado por el atrapa-grasa se debe unir por un conducto con el agua proveniente de el lavamanos, la ducha y la lavadora para pasar por la segunda estación que es el pre tratamiento a través del filtro. No se incluye en este sistema el agua proveniente del inodoro.",


            "5. El filtro de pretratamiento se construye con una tarrina de 200 litros en la cual el agua ingresa a través de un tubo perforado y pasa verticalmente por una columna con distintas capas de grava, gravilla y arena. intercaladas por una capa de geomembrana textil.\n" +
                    "El tubo de salida del filtro no debe llegar al final del recipiente y debe tener en la parte superior una \"T\" para que el aire atrapado ahí ayude a la circulación del agua. Una vez las aguas han pasado por el filtro de pretratamiento son conducidas al humedal que es la sección 3 del humedal.",


            "6. Para la construcción del humedal inicialmente debemos:\n" +
                    "    1. Realizar un proceso de limpieza y deshierbe, retirar escombros y demás desechos.\n" +
                    "    2. Seguidamente es necesario marcar el área de construcción con estacas y/o cuerdas.\n" +
                    "    3. Iniciar el proceso de excavación.\n" +
                    "\n" +
                    "    Nota: Tener presente en los pasos 2 y 3 los valores obtenidos en la sección de \"componentes de diseño\".",

            "7. Evitar filtraciones de agua al subsuelo es fundamental en estos diseños, por eso se debe compactar el área del terreno excavada para impermeabilizar adecuadamente la zona.\n" +
                    "\n" +
                    "    Cuando la zona está compactada, extendemos en ella plásticos de impermeabilización, los cuales tienen alta densidad, son inertes y no sufren degradación y son resistentes a la luz solar; suelen ser de fácil instalación y manejo.\n" +
                    "\n" +
                    "    Para impermeabilizar, bajo ninguna circunstancia se debe considerar el uso de películas bituminosas o materiales que se degraden o emulsionen en contacto con el agua.",


            "8. El paso siguiente es la instalación de la tubería  de entrada y salida del agua.\n" +
                    "Las conexiones de entrada y salida de agua pasarán a través del plástico de impermeabilización por lo tanto, esta labor implicará perforar el plástico, para dar acceso a las tuberías.\n" +
                    "Una vez éstas estén instaladas, el plástico se debe pegar o fundir garantizando que se recupera la impermeabilidad y asegurando que no habrá pérdidas de agua del humedal por las juntas.",


            "9. Una vez se hayan instalado las estructuras de distribución y recogida de aguas se realiza el relleno del lecho\n" +
                    "    1. Cerca a las entradas y salidas de las tuberías se deben ubicar piedras más grandes que los orificios de las tuberías.\n" +
                    "    2. Se deben utilizar un material de relleno limpio, libre de arcillas y limos.\n" +
                    "    3. Depositar el material cuidadosamente de manera que no se perfore el plástico de impermeabilización ni se compacte el material de relleno.\n" +
                    "    4. Tener presente la instalación de tuberías de inspección a través de estas circula aire en el humedal y se inspeccionan eventuales atascos",

            "10. Sobre el relleno o medio de soporte se planta la vegetación. Son plantas semiacuáticas que deben tener raíz o se les debe cultivar la raíz durante una semana aproximadamente antes de que el humedal inicie el proceso de funcionamiento.",


            "11. Finalmente el agua sale tratada en un promedio de 5 días, el sistema se puede terminar agregando un tanque que almacene el recurso y de ser posible añadirle una bomba al mismo de manera tal que pueda ser utilizada fácilmente.\n" +
                    "El agua que resulta de este proceso está limpia más no es potable, es decir que no puede ser implementada en proceso de consumo. Es apropiada para regar el jardín, para lavar autos, fachadas e incluso la ropa."
    };
    int position = 0;

    /**
     * Creates new form Principal01
     */
    public Esencial02_c2() {
        setVisible(true);
        initComponents();

        for (int k = 0; k < size; k++) {
            System.out.println(k);
            images[k] = new ImageIcon(getClass().getResource("/WaresaRecursos/" + (k + 1) + ".png"));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_base = new javax.swing.JPanel();
        pnl_izquierdo = new javax.swing.JPanel();
        lbl_nombre_i = new javax.swing.JLabel();
        btn_home = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa_descripcion_i = new javax.swing.JTextArea();
        pnl_centro = new javax.swing.JPanel();
        lbl_galeria_c = new javax.swing.JLabel();
        pnl_inferior = new javax.swing.JPanel();
        btn_atras = new javax.swing.JButton();
        btn_adelante = new javax.swing.JButton();
        btn_primera = new javax.swing.JButton();
        pnl_derecho = new javax.swing.JPanel();
        txa_descripcion_d = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(974, 546));

        pnl_base.setBackground(new java.awt.Color(90, 176, 233));

        lbl_nombre_i.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_nombre_i.setText("Proceso de construcción");

        btn_home.setText("Inicio");
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        txa_descripcion_i.setEditable(false);
        txa_descripcion_i.setColumns(20);
        txa_descripcion_i.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txa_descripcion_i.setLineWrap(true);
        txa_descripcion_i.setRows(5);
        txa_descripcion_i.setText("Mediante la construcción de este humedal artificial se busca tratar aguas residuales domésticas, con estas se presenta emisión de olores y una alta probabilidad de aparición de vectores por tal motivo, el tipo de humedal que mejor contrarresta este tipo de condiciones es el **Humedal Artificial Subsuperficial**, en este sistema el agua fluye debajo del material de soporte, por ende existe una disminución significativa de olores, también permite que no haya contacto directo entre la atmósfera y el agua, evitando la eclosión de mosquitos e insectos.");
        txa_descripcion_i.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txa_descripcion_i);

        javax.swing.GroupLayout pnl_izquierdoLayout = new javax.swing.GroupLayout(pnl_izquierdo);
        pnl_izquierdo.setLayout(pnl_izquierdoLayout);
        pnl_izquierdoLayout.setHorizontalGroup(
                pnl_izquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_izquierdoLayout.createSequentialGroup()
                                .addGroup(pnl_izquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_izquierdoLayout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnl_izquierdoLayout.createSequentialGroup()
                                                .addGroup(pnl_izquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnl_izquierdoLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(lbl_nombre_i))
                                                        .addGroup(pnl_izquierdoLayout.createSequentialGroup()
                                                                .addGap(83, 83, 83)
                                                                .addComponent(btn_home)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        pnl_izquierdoLayout.setVerticalGroup(
                pnl_izquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_izquierdoLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(lbl_nombre_i)
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_home)
                                .addContainerGap())
        );

        lbl_galeria_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WaresaRecursos/1.png"))); // NOI18N

        btn_atras.setText("Anterior");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        btn_adelante.setText("Siguiente");
        btn_adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adelanteActionPerformed(evt);
            }
        });

        btn_primera.setText("Inicio");
        btn_primera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_inferiorLayout = new javax.swing.GroupLayout(pnl_inferior);
        pnl_inferior.setLayout(pnl_inferiorLayout);
        pnl_inferiorLayout.setHorizontalGroup(
                pnl_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_inferiorLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_atras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_adelante)
                                .addGap(63, 63, 63)
                                .addComponent(btn_primera, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_inferiorLayout.setVerticalGroup(
                pnl_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_inferiorLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnl_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_atras)
                                        .addComponent(btn_adelante)
                                        .addComponent(btn_primera)))
        );

        javax.swing.GroupLayout pnl_centroLayout = new javax.swing.GroupLayout(pnl_centro);
        pnl_centro.setLayout(pnl_centroLayout);
        pnl_centroLayout.setHorizontalGroup(
                pnl_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_centroLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnl_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_galeria_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pnl_inferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        pnl_centroLayout.setVerticalGroup(
                pnl_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_centroLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbl_galeria_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnl_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
        );

        txa_descripcion_d.setEditable(false);
        txa_descripcion_d.setColumns(20);
        txa_descripcion_d.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txa_descripcion_d.setLineWrap(true);
        txa_descripcion_d.setRows(5);
        txa_descripcion_d.setText("Ilustraremos mediante imágenes el proceso de construcción del humedal artificial.\n");
        txa_descripcion_d.setWrapStyleWord(true);

        javax.swing.GroupLayout pnl_derechoLayout = new javax.swing.GroupLayout(pnl_derecho);
        pnl_derecho.setLayout(pnl_derechoLayout);
        pnl_derechoLayout.setHorizontalGroup(
                pnl_derechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_derechoLayout.createSequentialGroup()
                                .addContainerGap(16, Short.MAX_VALUE)
                                .addComponent(txa_descripcion_d, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
        );
        pnl_derechoLayout.setVerticalGroup(
                pnl_derechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_derechoLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txa_descripcion_d, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_baseLayout = new javax.swing.GroupLayout(pnl_base);
        pnl_base.setLayout(pnl_baseLayout);
        pnl_baseLayout.setHorizontalGroup(
                pnl_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_baseLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnl_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnl_centro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnl_derecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        pnl_baseLayout.setVerticalGroup(
                pnl_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_baseLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnl_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pnl_derecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pnl_izquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pnl_centro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnl_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnl_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        Esencial01 e1 = new Esencial01();
        this.dispose();
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_adelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adelanteActionPerformed

        if (position < size - 1) {
            position = position + 1;
            lbl_galeria_c.setIcon(images[position]);
            txa_descripcion_d.setText(textos[position]);
        }

    }//GEN-LAST:event_btn_adelanteActionPerformed

    private void btn_primeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeraActionPerformed
        txa_descripcion_d.setText(textos[0]);
        lbl_galeria_c.setIcon(images[0]);
        position = 0;

    }//GEN-LAST:event_btn_primeraActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        if (position > 0) {
            position = position - 1;
            lbl_galeria_c.setIcon(images[position]);
            txa_descripcion_d.setText(textos[position]);

        }
    }//GEN-LAST:event_btn_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(Esencial02_c2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Esencial02_c2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Esencial02_c2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Esencial02_c2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Esencial02_c2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adelante;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_primera;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_galeria_c;
    private javax.swing.JLabel lbl_nombre_i;
    private javax.swing.JPanel pnl_base;
    private javax.swing.JPanel pnl_centro;
    private javax.swing.JPanel pnl_derecho;
    private javax.swing.JPanel pnl_inferior;
    private javax.swing.JPanel pnl_izquierdo;
    private javax.swing.JTextArea txa_descripcion_d;
    private javax.swing.JTextArea txa_descripcion_i;
    // End of variables declaration//GEN-END:variables
}
