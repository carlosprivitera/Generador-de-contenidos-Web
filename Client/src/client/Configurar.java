package client;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Configurar extends JDialog {
    private String vs[] = 
     {"9","10","11","12","13","14","15","16","17","18","19","20","21","22",
      "23","24","25","26","27","28","29","30","31","32","33","34","35","36",
      "37","38","39","40","41","42","43","44","45","46","47","48"};
    private DefaultListModel dlm = new DefaultListModel();
    private SpinnerModel sm = null; //sm = new SpinnerListModel(vs);
    public JLabel jLabel1 = new JLabel();
    public JPanel jPanel1 = new JPanel();
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    private JButton jButton3 = new JButton();
    private JList jList1 = new JList(dlm);
    private JSpinner jSpinner1 = new JSpinner();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JButton jButton4 = new JButton();
    private JButton jButton5 = new JButton();
    private int aplicar = 0;

    public Configurar() {
        super();
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout(null);
        this.setSize(new Dimension(466, 387));
        this.setTitle("Configurar");
        this.setResizable(false);
        this.setModal(true);
        jLabel1.setText("jLabel1");
        jLabel1.setBounds(new Rectangle(10, 40, 215, 110));
        jPanel1.setBounds(new Rectangle(220, 85, 235, 195));
        jPanel1.setLayout(null);
        jButton1.setText("Color de fondo");
        jButton1.setBounds(new Rectangle(15, 5, 210, 40));
        jButton1.setToolTipText("Establece un color de fondo para la ventana");
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
                }
            });
        jButton2.setText("Color de fondo fuente");
        jButton2.setBounds(new Rectangle(240, 5, 210, 40));
        jButton2.setToolTipText("Establece un color de fondo para las fuentes");
        jButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton2_actionPerformed(e);
                }
            });
        jButton3.setText("Color fuente");
        jButton3.setBounds(new Rectangle(5, 55, 135, 25));
        jButton3.setToolTipText("Establece un color de fuente para los números ");
        jButton3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton3_actionPerformed(e);
                }
            });
        jList1.addListSelectionListener(new ListSelectionListener() {
                public void valueChanged(ListSelectionEvent e) {
                    jComboBox1_valueChanged(e);
                }
            });
        jSpinner1.setBounds(new Rectangle(145, 55, 70, 25));
        jSpinner1.addChangeListener(new ChangeListener() {
                public void stateChanged(ChangeEvent e) {
                jSpinner1_stateChanged(e);
            }
            });
        jScrollPane1.setBounds(new Rectangle(5, 85, 210, 255));
        jButton4.setText("Aplicar");
        jButton4.setBounds(new Rectangle(220, 300, 115, 40));
        jButton4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton4_actionPerformed(e);
                }
            });
        jButton5.setText("Salir");
        jButton5.setBounds(new Rectangle(340, 300, 115, 40));
        jButton5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton5_actionPerformed(e);
                }
            });
        jScrollPane1.getViewport().add(jList1, null);
        this.getContentPane().add(jButton5, null);
        this.getContentPane().add(jButton4, null);
        this.getContentPane().add(jScrollPane1, null);
        this.getContentPane().add(jSpinner1, null);
        this.getContentPane().add(jButton3, null);
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jButton1, null);
        jPanel1.add(jLabel1, null);
        this.getContentPane().add(jPanel1, null);
        cargarFuentes();

        this.jLabel1.setFont(new Font(dlm.getElementAt(0).toString(),
                                      jLabel1.getFont().getStyle(),
                                      jLabel1.getFont().getSize()));
        int x = jLabel1.getFont().getSize();
        jSpinner1.setToolTipText("Tamaño de la fuente");
        jLabel1.setOpaque(true);
        this.jList1.setSelectedIndex(0);
        jList1.setToolTipText("Fuentes instaladas en el sistema operativo");
        sm = new SpinnerListModel(vs);
        jSpinner1.setModel(sm);
        
    }
    public void iniciarValores() {
        int fontTamano = jLabel1.getFont().getSize();
        this.jSpinner1.setValue(""+fontTamano);
    }

    private void jButton1_actionPerformed(ActionEvent e) {
        Color color = null; //new Color();
        JColorChooser ventanaDeColores=new JColorChooser();
        color=ventanaDeColores.showDialog(this, "Seleccione un Color", Color.gray);
        if(!(color==null)) {
            this.jPanel1.setBackground(color);    
        }
    }
    private void cargarFuentes(){
        String fuentes[];
        GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        fuentes= environment.getAvailableFontFamilyNames();
        for(int con=0;con<fuentes.length;con++) {
          this.dlm.addElement(fuentes[con]);
        }    
    }

    private void jButton2_actionPerformed(ActionEvent e) {
        Color color = null; //new Color();
        JColorChooser ventanaDeColores=new JColorChooser();
        color=ventanaDeColores.showDialog(this, "Seleccione un Color", Color.gray);
        if(!(color==null)) {
            this.jLabel1.setBackground(color);    
        }
    }

    private void jSpinner1_stateChanged(ChangeEvent e) {
        Font f = new Font(jLabel1.getFont().getName(),
                             jLabel1.getFont().getStyle(),
                             Integer.parseInt(jSpinner1.getValue().toString()));
        this.jLabel1.setFont(f);
    }

    private void jComboBox1_valueChanged(ListSelectionEvent e) {
        this.jLabel1.setText(dlm.getElementAt(jList1.getSelectedIndex()).toString());
        String fuente=dlm.getElementAt(jList1.getSelectedIndex()).toString();
        int estilo = jLabel1.getFont().getStyle();
        int tamano = jLabel1.getFont().getSize();
        this.jLabel1.setFont(new Font(fuente, estilo, tamano));
    }

    private void jButton3_actionPerformed(ActionEvent e) {
        Color color = null; //new Color();
        JColorChooser ventanaDeColores=new JColorChooser();
        color=ventanaDeColores.showDialog(this, "Seleccione un Color", Color.gray);
        if(!(color==null)) {
            this.jLabel1.setForeground(color);
        }
    }

    private void jButton4_actionPerformed(ActionEvent e) {
        aplicar=1;
        this.setVisible(false);
    }

    private void jButton5_actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }

    public int getAplicar() {
        return aplicar;
    }

    public void setAplicar(int aplicar) {
        this.aplicar = aplicar;
    }
}


