package arraylist;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaBuscarAlumno extends javax.swing.JFrame {

    //BASE DATOS
    List<Alumno> alumnos_al = new ArrayList<>();
    DefaultListModel<String> modeloLista = new DefaultListModel<>();
    DefaultListModel<String> modeloLista1 = new DefaultListModel<>();
    DefaultListModel<String> modeloLista2 = new DefaultListModel<>();
    DefaultListModel<String> modeloLista3 = new DefaultListModel<>();

    ButtonGroup edad = new ButtonGroup();

    public VentanaBuscarAlumno() {
        initComponents();
        personalizarVentana();
        anadirPorDefecto();
        lstASIGNATURAS.setModel(modeloLista);//poner modelo a nuestra lista
        lstAsignaturas.setModel(modeloLista);
        lstAsignaturas1.setModel(modeloLista1);
        llenarComoBox();
        edad.add(rdoMayor);
        edad.add(rdoMenor);
        pintarAlumno(0);
        jListASIGNATURAS.setModel(modeloLista3);
    }

    public void pintarAlumno(int indice) {
        Alumno alumno = alumnos_al.get(indice);
        txtID1.setText(alumno.getIdAlumno());
        txtNOMBRE11.setText(alumno.getNombre());
        txtAPELLIDO11.setText(alumno.getApellido());
        txtEDAD11.setText(alumno.getEdad() + "");
        List<String> asignaturas_al = alumno.getAsignatures_al();
        modeloLista3.clear();
        for (String s : asignaturas_al) {
            modeloLista3.addElement(s);
        }

    }

    public void llenarComoBox() {
        for (Alumno alumno : alumnos_al) {
            cboMostrarID.addItem(alumno.getIdAlumno());

        }
    }

    public void anadirPorDefecto() {
        List<String> asignaturas1_al = new ArrayList<>();
        asignaturas1_al.add("Física");
        asignaturas1_al.add("Química");
        Alumno alumno1 = new Alumno("A1", "Luis", "Roncal", 15, asignaturas1_al);
        Alumno alumno2 = new Alumno("A2", "Miguel", "Alva", 17, new ArrayList<>(Arrays.asList("Religión", "Matemática", "Física", "Química")));
        Alumno alumno3 = new Alumno("A3", "Luis", "Zuñiga", 18, new ArrayList<>(Arrays.asList("Literatura", "Matemática", "Física", "Química")));
        Alumno alumno4 = new Alumno("A4", "Carmen", "Cuba", 19, new ArrayList<>(Arrays.asList("Arte", "Matemática", "Física", "Química")));
        Alumno alumno5 = new Alumno("A5", "María", "Rodriguez", 18, new ArrayList<>(Arrays.asList("Arte", "Matemática", "Física", "Química")));
        Alumno alumno6 = new Alumno("A6", "Arturo", "Alcantara", 17, new ArrayList<>(Arrays.asList("Arte", "Matemática", "Química")));
        Alumno alumno7 = new Alumno("A7", "Ismael", "Lescano", 16, new ArrayList<>(Arrays.asList("Arte", "Matemática", "Historia", "Laboral")));
        Alumno alumno8 = new Alumno("A8", "Julieta", "Jauregui", 15, new ArrayList<>(Arrays.asList("Arte", "Matemática", "Ciencias Naturales", "Laboral")));
        Alumno alumno9 = new Alumno("A9", "Silvia", "Jauregui", 15, new ArrayList<>(Arrays.asList("Arte", "Biología", "Ciencias Naturales", "Laboral")));
        Alumno alumno10 = new Alumno("A10", "Luis", "Párraga", 16, new ArrayList<>(Arrays.asList("Arte", "Biología", "Historia", "Laboral")));

        alumnos_al.add(alumno1);
        alumnos_al.add(alumno2);
        alumnos_al.add(alumno3);
        alumnos_al.add(alumno4);
        alumnos_al.add(alumno5);
        alumnos_al.add(alumno6);
        alumnos_al.add(alumno7);
        alumnos_al.add(alumno8);
        alumnos_al.add(alumno9);
        alumnos_al.add(alumno10);
    }

    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/cross1.png");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana
        this.setTitle("CRUDE");//poner titulo
        //this.setSize(350,200);//Poner un ancho y un alto de la ventana
        this.setResizable(false);//No se redimensione
        this.setLocationRelativeTo(null);//localizar en el centro
        this.setVisible(true);//Mostrar ventana
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboMostrarNumeros = new javax.swing.JTabbedPane();
        jpNOMBRE = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMOSTRARNOMBRES = new javax.swing.JTextArea();
        txtBUSCARNOMBRE = new javax.swing.JTextField();
        lblBUSCARNOMBRE = new javax.swing.JLabel();
        botBUSCARNOMBRE = new javax.swing.JButton();
        botBUSCARNUEVO = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstASIGNATURAS = new javax.swing.JList<>();
        jpAPELLIDO = new javax.swing.JPanel();
        lblASIGNATURA = new javax.swing.JLabel();
        txtAsignaturas1 = new javax.swing.JTextField();
        botBUSCAR = new javax.swing.JButton();
        botNUEVO = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txaALUMNOSASIGNATURAS = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        cboMostrarID = new javax.swing.JComboBox<>();
        txtTODO1 = new javax.swing.JTextField();
        txtNOMBRE1 = new javax.swing.JTextField();
        txtAPELLIDO1 = new javax.swing.JTextField();
        txtEDAD1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstAsignaturas1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rdoMenor = new javax.swing.JRadioButton();
        rdoMayor = new javax.swing.JRadioButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        txaMostrarEdades = new javax.swing.JTextArea();
        cmdNuevo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID1 = new javax.swing.JTextField();
        txtNOMBRE11 = new javax.swing.JTextField();
        txtAPELLIDO11 = new javax.swing.JTextField();
        txtEDAD11 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jListASIGNATURAS = new javax.swing.JList<>();
        botATRAS = new javax.swing.JButton();
        botALANTE = new javax.swing.JButton();
        txtINDEX = new javax.swing.JTextField();
        jpID = new javax.swing.JPanel();
        jlIDalumno = new javax.swing.JLabel();
        txtIDAlumno = new javax.swing.JTextField();
        cmdBUSCAR = new javax.swing.JButton();
        txtNOMBRE = new javax.swing.JTextField();
        txtAPELLIDO = new javax.swing.JTextField();
        txtEDAD = new javax.swing.JTextField();
        txtTODO = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstAsignaturas = new javax.swing.JList<>();
        botNuevo = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        jLabel1.setText("INGRESAR IDALUMNO(EJEMPLO A1)");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 370));
        setSize(new java.awt.Dimension(500, 370));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txaMOSTRARNOMBRES.setEditable(false);
        txaMOSTRARNOMBRES.setColumns(20);
        txaMOSTRARNOMBRES.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txaMOSTRARNOMBRES.setForeground(new java.awt.Color(153, 51, 255));
        txaMOSTRARNOMBRES.setRows(5);
        jScrollPane1.setViewportView(txaMOSTRARNOMBRES);

        txtBUSCARNOMBRE.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtBUSCARNOMBRE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBUSCARNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBUSCARNOMBREActionPerformed(evt);
            }
        });

        lblBUSCARNOMBRE.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblBUSCARNOMBRE.setText("BUSCAR POR NOMBRE ?");

        botBUSCARNOMBRE.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        botBUSCARNOMBRE.setText("BUSCAR");
        botBUSCARNOMBRE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botBUSCARNOMBREMouseEntered(evt);
            }
        });
        botBUSCARNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botBUSCARNOMBREActionPerformed(evt);
            }
        });

        botBUSCARNUEVO.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        botBUSCARNUEVO.setText("NUEVO");
        botBUSCARNUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botBUSCARNUEVOActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(lstASIGNATURAS);

        javax.swing.GroupLayout jpNOMBRELayout = new javax.swing.GroupLayout(jpNOMBRE);
        jpNOMBRE.setLayout(jpNOMBRELayout);
        jpNOMBRELayout.setHorizontalGroup(
            jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNOMBRELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNOMBRELayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(botBUSCARNOMBRE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botBUSCARNUEVO)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNOMBRELayout.createSequentialGroup()
                        .addGroup(jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpNOMBRELayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
                            .addGroup(jpNOMBRELayout.createSequentialGroup()
                                .addComponent(lblBUSCARNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtBUSCARNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(86, 86, 86))))
        );
        jpNOMBRELayout.setVerticalGroup(
            jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNOMBRELayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBUSCARNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBUSCARNOMBRE))
                .addGap(18, 18, 18)
                .addGroup(jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botBUSCARNOMBRE)
                    .addComponent(botBUSCARNUEVO))
                .addGap(4, 4, 4))
        );

        cboMostrarNumeros.addTab("NOMBRE", jpNOMBRE);

        lblASIGNATURA.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblASIGNATURA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblASIGNATURA.setText("INGRESE LA ASIGNATURA");

        txtAsignaturas1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtAsignaturas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAsignaturas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsignaturas1ActionPerformed(evt);
            }
        });

        botBUSCAR.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        botBUSCAR.setText("BUSCAR");
        botBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botBUSCARActionPerformed(evt);
            }
        });

        botNUEVO.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        botNUEVO.setText("NUEVO");
        botNUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botNUEVOActionPerformed(evt);
            }
        });

        txaALUMNOSASIGNATURAS.setColumns(20);
        txaALUMNOSASIGNATURAS.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txaALUMNOSASIGNATURAS.setRows(5);
        jScrollPane4.setViewportView(txaALUMNOSASIGNATURAS);

        javax.swing.GroupLayout jpAPELLIDOLayout = new javax.swing.GroupLayout(jpAPELLIDO);
        jpAPELLIDO.setLayout(jpAPELLIDOLayout);
        jpAPELLIDOLayout.setHorizontalGroup(
            jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAPELLIDOLayout.createSequentialGroup()
                .addGroup(jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpAPELLIDOLayout.createSequentialGroup()
                        .addGroup(jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpAPELLIDOLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblASIGNATURA, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(jpAPELLIDOLayout.createSequentialGroup()
                                .addGap(0, 89, Short.MAX_VALUE)
                                .addComponent(botBUSCAR)
                                .addGap(59, 59, 59)))
                        .addGroup(jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAsignaturas1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAPELLIDOLayout.createSequentialGroup()
                                .addComponent(botNUEVO)
                                .addGap(13, 13, 13))))
                    .addGroup(jpAPELLIDOLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jpAPELLIDOLayout.setVerticalGroup(
            jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAPELLIDOLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblASIGNATURA)
                    .addComponent(txtAsignaturas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botBUSCAR)
                    .addComponent(botNUEVO))
                .addGap(14, 14, 14))
        );

        cboMostrarNumeros.addTab("ALUMNOS X ASIGNATURA", jpAPELLIDO);

        cboMostrarID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboMostrarIDItemStateChanged(evt);
            }
        });
        cboMostrarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMostrarIDActionPerformed(evt);
            }
        });

        txtTODO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTODO1ActionPerformed(evt);
            }
        });

        txtNOMBRE1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtNOMBRE1.setForeground(new java.awt.Color(255, 51, 255));
        txtNOMBRE1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNOMBRE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOMBRE1ActionPerformed(evt);
            }
        });

        txtAPELLIDO1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtAPELLIDO1.setForeground(new java.awt.Color(255, 51, 255));
        txtAPELLIDO1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEDAD1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtEDAD1.setForeground(new java.awt.Color(255, 51, 255));
        txtEDAD1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEDAD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEDAD1ActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(lstAsignaturas1);

        jLabel2.setText("SELECCIONAR ID ALUMNO?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(cboMostrarID, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTODO1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEDAD1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAPELLIDO1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNOMBRE1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(132, 132, 132)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMostrarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTODO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNOMBRE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtAPELLIDO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEDAD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cboMostrarNumeros.addTab("ID COMBOBOX", jPanel1);

        rdoMenor.setText("MENOR");
        rdoMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMenorActionPerformed(evt);
            }
        });

        rdoMayor.setText("MAYOR");
        rdoMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMayorActionPerformed(evt);
            }
        });

        txaMostrarEdades.setColumns(20);
        txaMostrarEdades.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txaMostrarEdades.setRows(5);
        jScrollPane6.setViewportView(txaMostrarEdades);

        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(rdoMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(rdoMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cmdNuevo)
                        .addGap(176, 176, 176))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoMenor)
                    .addComponent(rdoMayor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdNuevo)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        cboMostrarNumeros.addTab("EDAD RADIOBUTTON", jPanel2);

        jLabel3.setText("ID");

        jLabel4.setText("ASIGNATURAS");

        jLabel5.setText("NOMBRE");

        jLabel6.setText("EDAD");

        jLabel7.setText("APELLIDO");

        txtID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID1ActionPerformed(evt);
            }
        });

        txtAPELLIDO11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAPELLIDO11ActionPerformed(evt);
            }
        });

        jScrollPane7.setViewportView(jListASIGNATURAS);

        botATRAS.setText("<<");
        botATRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botATRASActionPerformed(evt);
            }
        });

        botALANTE.setText(">>");
        botALANTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botALANTEActionPerformed(evt);
            }
        });

        txtINDEX.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtINDEX.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtINDEX.setText("0");
        txtINDEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtINDEXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(txtEDAD11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(txtAPELLIDO11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(txtID1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNOMBRE11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(botATRAS)
                .addGap(45, 45, 45)
                .addComponent(txtINDEX, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(botALANTE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNOMBRE11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtAPELLIDO11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEDAD11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botATRAS)
                    .addComponent(txtINDEX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botALANTE))
                .addGap(59, 59, 59))
        );

        cboMostrarNumeros.addTab("NAVEGAR X ALUMNO", jPanel3);

        jpID.setMaximumSize(new java.awt.Dimension(500, 370));
        jpID.setMinimumSize(new java.awt.Dimension(500, 370));
        jpID.setPreferredSize(new java.awt.Dimension(500, 370));
        jpID.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlIDalumno.setText("INGRESAR IDALUMNO (EJEMPLO A1)");
        jpID.add(jlIDalumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 18, 205, -1));

        txtIDAlumno.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtIDAlumno.setForeground(new java.awt.Color(255, 51, 255));
        txtIDAlumno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDAlumnoActionPerformed(evt);
            }
        });
        jpID.add(txtIDAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 18, 71, -1));

        cmdBUSCAR.setText("BUSCAR");
        cmdBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBUSCARActionPerformed(evt);
            }
        });
        jpID.add(cmdBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 15, -1, -1));

        txtNOMBRE.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtNOMBRE.setForeground(new java.awt.Color(255, 51, 255));
        txtNOMBRE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOMBREActionPerformed(evt);
            }
        });
        jpID.add(txtNOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 109, 71, -1));

        txtAPELLIDO.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtAPELLIDO.setForeground(new java.awt.Color(255, 51, 255));
        txtAPELLIDO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpID.add(txtAPELLIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 149, 71, -1));

        txtEDAD.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtEDAD.setForeground(new java.awt.Color(255, 51, 255));
        txtEDAD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEDADActionPerformed(evt);
            }
        });
        jpID.add(txtEDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 187, 71, -1));

        txtTODO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTODOActionPerformed(evt);
            }
        });
        jpID.add(txtTODO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 483, -1));

        jScrollPane3.setViewportView(lstAsignaturas);

        jpID.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 109, 109, 98));

        botNuevo.setText("NUEVO");
        botNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botNuevoActionPerformed(evt);
            }
        });
        jpID.add(botNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 133, -1, -1));

        cboMostrarNumeros.addTab("ID", jpID);

        getContentPane().add(cboMostrarNumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 60, -1, 340));

        lblTitulo.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 102, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("BUSCAR");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 54));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDAlumnoActionPerformed

    private void txtNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNOMBREActionPerformed

    private void txtTODOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTODOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTODOActionPerformed

    private void cmdBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBUSCARActionPerformed
        String idAlumnoBuscar = txtIDAlumno.getText();
        for (Alumno alumno : alumnos_al) {
            if (alumno.getIdAlumno().equals(idAlumnoBuscar)) {
                // System.out.println(alumno);
                txtTODO.setText(alumno.toString());
                txtNOMBRE.setText(alumno.getNombre());
                txtAPELLIDO.setText(alumno.getApellido());
                txtEDAD.setText(alumno.getEdad() + "");//se concatena cadena vacia porque es un numero
                List<String> asignaturas_al = alumno.getAsignatures_al();
                for (String asi : asignaturas_al) {
                    modeloLista.addElement(asi);
                }

            }
        }
    }//GEN-LAST:event_cmdBUSCARActionPerformed

    private void txtBUSCARNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBUSCARNOMBREActionPerformed
        modeloLista.clear();
        txaMOSTRARNOMBRES.setText("");
        String nombre = txtBUSCARNOMBRE.getText();
        List<Alumno> alumnosaux_al = obtenerListaNombres(nombre);
        if (alumnosaux_al.size() > 0) {
            Alumno.cabecera();
            txaMOSTRARNOMBRES.append(Alumno.cabecera());
            txaMOSTRARNOMBRES.append(Alumno.SubrayadoCabecera());

            for (Alumno a : alumnosaux_al) {
                //txaMOSTRARNOMBRES.append(a.toString() + "\n");
                txaMOSTRARNOMBRES.append(a.cuerpo());
                List<String> asignaturas_al = a.getAsignatures_al();
                for (String asi : asignaturas_al) {
                    modeloLista.addElement(asi);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO EXISTEN ALUMNOS CON DICHO NOMBRE", "Error", JOptionPane.ERROR_MESSAGE);
        }
        botBUSCARNOMBRE.setEnabled(false);
    }//GEN-LAST:event_txtBUSCARNOMBREActionPerformed

    private void botBUSCARNUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botBUSCARNUEVOActionPerformed
        txtBUSCARNOMBRE.setText("");
        txaMOSTRARNOMBRES.setText("");
        modeloLista.clear();

        botBUSCARNOMBRE.setEnabled(true);

    }//GEN-LAST:event_botBUSCARNUEVOActionPerformed

    private void botBUSCARNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botBUSCARNOMBREActionPerformed
        txaMOSTRARNOMBRES.setText("");
        modeloLista.clear();
        String nombre = txtBUSCARNOMBRE.getText();
        List<Alumno> alumnosaux_al = obtenerListaNombres(nombre);
        if (alumnosaux_al.size() > 0) {
            Alumno.cabecera();
            txaMOSTRARNOMBRES.append(Alumno.cabecera());
            txaMOSTRARNOMBRES.append(Alumno.SubrayadoCabecera());
            for (Alumno a : alumnosaux_al) {
                //txaMOSTRARNOMBRES.append(a.toString() + "\n");
                txaMOSTRARNOMBRES.append(a.cuerpo());
                List<String> asignaturas_al = a.getAsignatures_al();
                for (String asi : asignaturas_al) {
                    modeloLista.addElement(asi);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO EXISTEN ALUMNOS CON DICHO NOMBRE", "Error", JOptionPane.ERROR_MESSAGE);
        }
        botBUSCARNOMBRE.setEnabled(false);

    }//GEN-LAST:event_botBUSCARNOMBREActionPerformed

    private void botBUSCARNOMBREMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botBUSCARNOMBREMouseEntered
        txaMOSTRARNOMBRES.setText("");
        String nombre = txtBUSCARNOMBRE.getText();
        List<Alumno> alumnosaux_al = obtenerListaNombres(nombre);
        if (alumnosaux_al.size() > 0) {
            Alumno.cabecera();
            txaMOSTRARNOMBRES.append(Alumno.cabecera());
            txaMOSTRARNOMBRES.append(Alumno.SubrayadoCabecera());
            for (Alumno a : alumnosaux_al) {
                //txaMOSTRARNOMBRES.append(a.toString() + "\n");
                txaMOSTRARNOMBRES.append(a.cuerpo());
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO EXISTEN ALUMNOS CON DICHO NOMBRE", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_botBUSCARNOMBREMouseEntered

    private void botNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botNuevoActionPerformed
        modeloLista.clear();
        txtNOMBRE.setText("");
        txtAPELLIDO.setText("");
        txtEDAD.setText("");
        txtTODO.setText("");
        txtIDAlumno.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_botNuevoActionPerformed

    private void txtEDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEDADActionPerformed

    private void botBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botBUSCARActionPerformed
        String asignatura = txtAsignaturas1.getText().toLowerCase().trim();
        int encontrado = 0;
        int i = 0;
        for (Alumno a : alumnos_al) {
            List<String> asignaturas_al = a.getAsignatures_al();
            for (String asig : asignaturas_al) {
                if (asig.toLowerCase().equals(asignatura)) {
                    if (i == 0) {
                        txaALUMNOSASIGNATURAS.append(Alumno.cabecera());
                        txaALUMNOSASIGNATURAS.append(Alumno.SubrayadoCabecera());
                        i++;
                    }
                    txaALUMNOSASIGNATURAS.append(a.cuerpo());
                    encontrado++;
                    break;
                }
            }
        }
        if (encontrado == 0) {
            JOptionPane.showMessageDialog(null, "NO EXISTEN ALUMNOS CON DICHA ASIGNATURA", "Error", JOptionPane.ERROR_MESSAGE);
        }
        botBUSCAR.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_botBUSCARActionPerformed

    private void botNUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botNUEVOActionPerformed
        txaALUMNOSASIGNATURAS.setText("");
        txtAsignaturas1.setText("");// TODO add your handling code here:
        botBUSCAR.setEnabled(true);

    }//GEN-LAST:event_botNUEVOActionPerformed

    private void txtAsignaturas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsignaturas1ActionPerformed

    }//GEN-LAST:event_txtAsignaturas1ActionPerformed

    private void cboMostrarIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboMostrarIDItemStateChanged


    }//GEN-LAST:event_cboMostrarIDItemStateChanged

    private void cboMostrarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMostrarIDActionPerformed
        String idAlumno = (String) cboMostrarID.getSelectedItem();
        boolean encontro = false;
        if (alumnos_al.size() > 0) {
            for (Alumno a : alumnos_al) {
                if (a.getIdAlumno().equals(idAlumno)) {
                    // System.out.println(alumno);
                    modeloLista1.clear();
                    encontro = true;
                    txtTODO1.setText(a.toString());
                    txtNOMBRE1.setText(a.getNombre());
                    txtAPELLIDO1.setText(a.getApellido());
                    txtEDAD1.setText(a.getEdad() + "");//se concatena cadena vacia porque es un numero
                    List<String> asignaturas_al = a.getAsignatures_al();
                    for (String asi : asignaturas_al) {
                        modeloLista1.addElement(asi);

                    }

                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "LISTA ALUMNOS VACIA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        if (!encontro) {
            JOptionPane.showMessageDialog(null, "ALUMNO NO EXISTE", "ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_cboMostrarIDActionPerformed

    private void txtTODO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTODO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTODO1ActionPerformed

    private void txtNOMBRE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOMBRE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNOMBRE1ActionPerformed

    private void txtEDAD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEDAD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEDAD1ActionPerformed

    private void rdoMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMenorActionPerformed
        txaMostrarEdades.setText("");
        for (Alumno a : alumnos_al) {
            if (a.getEdad() < 18) {
                txaMostrarEdades.append(a.cuerpo());
            }
        }
    }//GEN-LAST:event_rdoMenorActionPerformed

    private void rdoMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMayorActionPerformed
        txaMostrarEdades.setText("");
        for (Alumno a : alumnos_al) {
            if (a.getEdad() >= 18) {
                txaMostrarEdades.append(a.cuerpo());
            }
        }
    }//GEN-LAST:event_rdoMayorActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        txaMostrarEdades.setText("");
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void txtID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID1ActionPerformed

    private void txtAPELLIDO11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAPELLIDO11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAPELLIDO11ActionPerformed

    private void txtINDEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtINDEXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtINDEXActionPerformed

    private void botATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botATRASActionPerformed
        
        String indices = txtINDEX.getText();
        int indicei = Integer.parseInt(indices);
        if (indicei > 0) {
            indicei--;
            txtINDEX.setText(indicei + "");
            pintarAlumno(indicei);
        }
    }//GEN-LAST:event_botATRASActionPerformed

    private void botALANTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botALANTEActionPerformed
        String indices = txtINDEX.getText();
        int indicei = Integer.parseInt(indices);
        if (indicei < alumnos_al.size() - 1) {
            indicei++;
            txtINDEX.setText(indicei + "");
            pintarAlumno(indicei);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_botALANTEActionPerformed

    public List<Alumno> obtenerListaNombres(String nombre) {
        List<Alumno> alumnosaux_al = new ArrayList<>();
        for (Alumno a : alumnos_al) {
            if (a.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
                alumnosaux_al.add(a);
            }

        }
        return alumnosaux_al;
    }

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
            java.util.logging.Logger.getLogger(VentanaBuscarAlumno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaBuscarAlumno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaBuscarAlumno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaBuscarAlumno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBuscarAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botALANTE;
    private javax.swing.JButton botATRAS;
    private javax.swing.JButton botBUSCAR;
    private javax.swing.JButton botBUSCARNOMBRE;
    private javax.swing.JButton botBUSCARNUEVO;
    private javax.swing.JButton botNUEVO;
    private javax.swing.JButton botNuevo;
    private javax.swing.JComboBox<String> cboMostrarID;
    private javax.swing.JTabbedPane cboMostrarNumeros;
    private javax.swing.JButton cmdBUSCAR;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jListASIGNATURAS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel jlIDalumno;
    private javax.swing.JPanel jpAPELLIDO;
    private javax.swing.JPanel jpID;
    private javax.swing.JPanel jpNOMBRE;
    private javax.swing.JLabel lblASIGNATURA;
    private javax.swing.JLabel lblBUSCARNOMBRE;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstASIGNATURAS;
    private javax.swing.JList<String> lstAsignaturas;
    private javax.swing.JList<String> lstAsignaturas1;
    private javax.swing.JRadioButton rdoMayor;
    private javax.swing.JRadioButton rdoMenor;
    private javax.swing.JTextArea txaALUMNOSASIGNATURAS;
    private javax.swing.JTextArea txaMOSTRARNOMBRES;
    private javax.swing.JTextArea txaMostrarEdades;
    private javax.swing.JTextField txtAPELLIDO;
    private javax.swing.JTextField txtAPELLIDO1;
    private javax.swing.JTextField txtAPELLIDO11;
    private javax.swing.JTextField txtAsignaturas1;
    private javax.swing.JTextField txtBUSCARNOMBRE;
    private javax.swing.JTextField txtEDAD;
    private javax.swing.JTextField txtEDAD1;
    private javax.swing.JTextField txtEDAD11;
    private javax.swing.JTextField txtID1;
    private javax.swing.JTextField txtIDAlumno;
    private javax.swing.JTextField txtINDEX;
    private javax.swing.JTextField txtNOMBRE;
    private javax.swing.JTextField txtNOMBRE1;
    private javax.swing.JTextField txtNOMBRE11;
    private javax.swing.JTextField txtTODO;
    private javax.swing.JTextField txtTODO1;
    // End of variables declaration//GEN-END:variables

}
