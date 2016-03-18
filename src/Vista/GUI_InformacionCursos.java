
package Vista;

public class GUI_InformacionCursos extends javax.swing.JPanel {

    
    public GUI_InformacionCursos() {
        initComponents();
    }
    public String[] devolverInformacion(){
        String arreglo[];
        arreglo =new String[3];
        arreglo[0]=this.jt_NombreDelCurso.getText();
        arreglo[1]=this.jt_Siglas.getText();
        arreglo[2]=this.jt_Creditos.getText();
        return arreglo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jt_NombreDelCurso = new javax.swing.JTextField();
        jt_Siglas = new javax.swing.JTextField();
        jt_Creditos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre del Curso: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setText("Siglas: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel4.setText("Creditos: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        add(jt_NombreDelCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 270, -1));
        add(jt_Siglas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 270, -1));

        jt_Creditos.setToolTipText("");
        add(jt_Creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 270, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo 2.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jt_Creditos;
    private javax.swing.JTextField jt_NombreDelCurso;
    private javax.swing.JTextField jt_Siglas;
    // End of variables declaration//GEN-END:variables
}