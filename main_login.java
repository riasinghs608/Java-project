
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import javax.mail.*;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.TimerTask;
import java.util.*;



public class main_login extends javax.swing.JFrame {
Connection con=null;
Statement stmt=null;
ResultSet rs=null;
ResultSet rs1=null;
ResultSet rs2=null;
ResultSet rs3=null;
ResultSet rs5=null;
String time1="";
String time2="";
String user="";
int count;
String pass="";
int cc=0;
int seconds=120;
int seconds1=60;
long a5;

Timer myTimer=new Timer();
TimerTask task=new TimerTask()
{
    public void run()
    {
        if(seconds==120)
        {
            dis_time.setText("2:00");
            seconds--;
        }
        if(seconds<=119 && seconds>=60)
        {
            dis_time.setText("1:"+(--seconds1));
            seconds--;
            if(seconds1==0)
                seconds1=59;
        }
        
        if(seconds<=59 && seconds>=1)
        {
            dis_time.setText("0:"+(--seconds1));
            seconds--;
        }
        if(seconds==0)
        {
            myTimer.cancel();
            JOptionPane.showMessageDialog(null,"Your OTP has expired.");
        }
    }
};


    public main_login() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        session_plan1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        user1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        test3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        co1 = new javax.swing.JComboBox();
        co2 = new javax.swing.JComboBox();
        co3 = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        table2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        pub1 = new javax.swing.JLabel();
        pub2 = new javax.swing.JLabel();
        pub3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        test1 = new javax.swing.JTextField();
        test2 = new javax.swing.JTextField();
        test4 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        counter = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        value1 = new javax.swing.JTextField();
        jButton31 = new javax.swing.JButton();
        jLabel85 = new javax.swing.JLabel();
        pro1 = new javax.swing.JComboBox();
        date1 = new datechooser.beans.DateChooserCombo();
        timechooser = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        s1 = new javax.swing.JSpinner();
        s2 = new javax.swing.JSpinner();
        s3 = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        s4 = new javax.swing.JSpinner();
        s5 = new javax.swing.JSpinner();
        s6 = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        c1 = new javax.swing.JComboBox();
        c2 = new javax.swing.JComboBox();
        attendance = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        at1 = new javax.swing.JComboBox();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        student_info = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        panel1 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta2 = new javax.swing.JTextArea();
        jButton15 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        reviewing_attendance = new javax.swing.JFrame();
        jPanel9 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        head = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        tim1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        tim2 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();
        jLabel47 = new javax.swing.JLabel();
        jButton43 = new javax.swing.JButton();
        sessions = new javax.swing.JComboBox();
        jLabel87 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        dates = new datechooser.beans.DateChooserCombo();
        timetable = new javax.swing.JFrame();
        jPanel11 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        z2 = new javax.swing.JComboBox();
        z1 = new javax.swing.JLabel();
        z3 = new javax.swing.JLabel();
        bo1 = new javax.swing.JButton();
        bo2 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableA = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableB = new javax.swing.JTable();
        z4 = new datechooser.beans.DateChooserCombo();
        jButton25 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        volunteer_info = new javax.swing.JFrame();
        jPanel13 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        y1 = new javax.swing.JComboBox();
        jLabel51 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        y2 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        y3 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        y4 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        y5 = new javax.swing.JTextField();
        jButton27 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        y6 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        y7 = new javax.swing.JComboBox();
        jButton26 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        student_info_full = new javax.swing.JFrame();
        jPanel16 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        x1 = new javax.swing.JComboBox();
        jLabel59 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        x2 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        x3 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        x4 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        x5 = new javax.swing.JTextField();
        x6 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        x7 = new javax.swing.JTextArea();
        jButton29 = new javax.swing.JButton();
        add_volunteer = new javax.swing.JFrame();
        jPanel19 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        w1 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        w3 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jButton35 = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        w5 = new javax.swing.JTextField();
        jButton48 = new javax.swing.JButton();
        w2 = new datechooser.beans.DateChooserCombo();
        w4 = new datechooser.beans.DateChooserCombo();
        add_student = new javax.swing.JFrame();
        jPanel20 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        v1 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        v2 = new javax.swing.JSpinner();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        v4 = new javax.swing.JTextArea();
        jButton37 = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        jButton49 = new javax.swing.JButton();
        v3 = new datechooser.beans.DateChooserCombo();
        value_week = new javax.swing.JFrame();
        jPanel23 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        u3 = new javax.swing.JTextField();
        jButton39 = new javax.swing.JButton();
        jLabel96 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jButton50 = new javax.swing.JButton();
        u1 = new datechooser.beans.DateChooserCombo();
        u2 = new datechooser.beans.DateChooserCombo();
        add_books = new javax.swing.JFrame();
        jPanel24 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        q1 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        q2 = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        q3 = new javax.swing.JTextField();
        jButton41 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        tracking_books = new javax.swing.JFrame();
        jPanel26 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        jPanel27 = new javax.swing.JPanel();
        m1 = new javax.swing.JLabel();
        m2 = new javax.swing.JTextField();
        m3 = new javax.swing.JLabel();
        m4 = new javax.swing.JTextField();
        m5 = new javax.swing.JLabel();
        m6 = new javax.swing.JTextField();
        m7 = new javax.swing.JLabel();
        m8 = new javax.swing.JTextField();
        m9 = new javax.swing.JLabel();
        m10 = new javax.swing.JTextField();
        n1 = new javax.swing.JLabel();
        n2 = new javax.swing.JComboBox();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        n3 = new javax.swing.JTable();
        jButton22 = new javax.swing.JButton();
        buttonGroup2 = new javax.swing.ButtonGroup();
        volunteer_app = new javax.swing.JFrame();
        jPanel30 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        up3 = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        up4 = new datechooser.beans.DateChooserCombo();
        jButton52 = new javax.swing.JButton();
        jLabel101 = new javax.swing.JLabel();
        jButton53 = new javax.swing.JButton();
        jLabel102 = new javax.swing.JLabel();
        jButton54 = new javax.swing.JButton();
        up1 = new javax.swing.JLabel();
        up2 = new javax.swing.JLabel();
        jButton56 = new javax.swing.JButton();
        jLabel103 = new javax.swing.JLabel();
        up5 = new javax.swing.JTextField();
        uploading = new javax.swing.JFrame();
        jPanel31 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        ph1 = new javax.swing.JTextField();
        ph3 = new com.toedter.calendar.JYearChooser();
        jButton57 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        ph4 = new javax.swing.JTextArea();
        jButton58 = new javax.swing.JButton();
        ph2 = new javax.swing.JComboBox();
        jButton7 = new javax.swing.JButton();
        cancel = new javax.swing.JFrame();
        jPanel32 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        table7 = new javax.swing.JTable();
        jLabel109 = new javax.swing.JLabel();
        ch1 = new javax.swing.JComboBox();
        jButton60 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        forgot = new javax.swing.JFrame();
        jPanel33 = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        f1 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        f5 = new javax.swing.JLabel();
        f2 = new javax.swing.JPasswordField();
        dis_time = new javax.swing.JLabel();
        f4 = new javax.swing.JButton();
        panel_disp = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        f3 = new javax.swing.JTextField();
        jButton64 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        info = new javax.swing.JLabel();
        get_photos = new javax.swing.JFrame();
        jPanel25 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jButton36 = new javax.swing.JButton();
        info_set = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        k1 = new javax.swing.JComboBox();
        jLabel94 = new javax.swing.JLabel();
        k2 = new javax.swing.JComboBox();
        k3 = new com.toedter.calendar.JYearChooser();
        jLabel95 = new javax.swing.JLabel();
        jButton51 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        activities = new javax.swing.JFrame();
        jPanel35 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jButton65 = new javax.swing.JButton();
        jLabel114 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        selection1 = new javax.swing.JPanel();
        cho1 = new javax.swing.JRadioButton();
        cho2 = new javax.swing.JRadioButton();
        cho3 = new javax.swing.JRadioButton();
        cho4 = new javax.swing.JRadioButton();
        cho5 = new javax.swing.JRadioButton();
        cho6 = new javax.swing.JRadioButton();
        display1 = new javax.swing.JPanel();
        disp1 = new javax.swing.JLabel();
        disp2 = new javax.swing.JLabel();
        disp3 = new javax.swing.JLabel();
        disp4 = new javax.swing.JLabel();
        disp5 = new javax.swing.JLabel();
        disp6 = new javax.swing.JLabel();
        display2 = new javax.swing.JPanel();
        displ1 = new javax.swing.JLabel();
        displ2 = new javax.swing.JLabel();
        displ3 = new javax.swing.JLabel();
        displ4 = new javax.swing.JLabel();
        displ5 = new javax.swing.JLabel();
        displ6 = new javax.swing.JLabel();
        displ7 = new javax.swing.JLabel();
        selection2 = new javax.swing.JPanel();
        choo1 = new javax.swing.JRadioButton();
        choo2 = new javax.swing.JRadioButton();
        choo3 = new javax.swing.JRadioButton();
        choo4 = new javax.swing.JRadioButton();
        choo5 = new javax.swing.JRadioButton();
        choo6 = new javax.swing.JRadioButton();
        choo7 = new javax.swing.JRadioButton();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        activities1 = new javax.swing.JFrame();
        jPanel37 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jButton66 = new javax.swing.JButton();
        jLabel119 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        display4 = new javax.swing.JPanel();
        displ8 = new javax.swing.JLabel();
        displ9 = new javax.swing.JLabel();
        displ10 = new javax.swing.JLabel();
        displ11 = new javax.swing.JLabel();
        displ12 = new javax.swing.JLabel();
        selection4 = new javax.swing.JPanel();
        choo8 = new javax.swing.JRadioButton();
        choo9 = new javax.swing.JRadioButton();
        choo10 = new javax.swing.JRadioButton();
        choo11 = new javax.swing.JRadioButton();
        choo12 = new javax.swing.JRadioButton();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        p1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        check = new javax.swing.JCheckBox();
        jButton13 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        session_plan1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        session_plan1.setTitle("Create Session Plan");
        session_plan1.setMinimumSize(new java.awt.Dimension(1040, 908));
        session_plan1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                session_plan1WindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(951, 770));
        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Cambria", 3, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 0));
        jLabel8.setText(" SESSION PLAN");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(300, 10, 380, 80);

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 0));
        jLabel9.setText("DATE OF SESSION:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(280, 240, 180, 30);

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 0));
        jLabel10.setText("SESSION HEAD:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(280, 130, 160, 30);

        user1.setEnabled(false);
        user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user1ActionPerformed(evt);
            }
        });
        jPanel2.add(user1);
        user1.setBounds(470, 130, 260, 30);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 368, 1040, 10);

        test3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        test3.setText("CHOOSE TIME");
        test3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test3ActionPerformed(evt);
            }
        });
        jPanel2.add(test3);
        test3.setBounds(470, 300, 170, 30);

        jPanel4.setBackground(new java.awt.Color(0, 0, 51));
        jPanel4.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 0));
        jLabel11.setText("CHOOSE STORY BOOKS TO BE READ:");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(50, 40, 340, 22);

        co1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                co1FocusLost(evt);
            }
        });
        co1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                co1ActionPerformed(evt);
            }
        });
        jPanel4.add(co1);
        co1.setBounds(100, 100, 240, 26);

        co2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                co2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                co2FocusLost(evt);
            }
        });
        co2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                co2ActionPerformed(evt);
            }
        });
        jPanel4.add(co2);
        co2.setBounds(100, 150, 240, 26);

        co3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                co3ActionPerformed(evt);
            }
        });
        jPanel4.add(co3);
        co3.setBounds(100, 200, 240, 26);

        jButton5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton5.setText("CHOOSE STUDENTS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);
        jButton5.setBounds(270, 280, 210, 38);

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 0));
        jLabel12.setText("CHOOSE STUDENTS FOR SESSION:");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(50, 240, 310, 22);

        table1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setColumnSelectionAllowed(true);
        table1.getTableHeader().setReorderingAllowed(false);
        table2.setViewportView(table1);
        table1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel4.add(table2);
        table2.setBounds(640, 30, 270, 310);

        jButton3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton3.setText("PROCEED");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(430, 330, 160, 38);
        jPanel4.add(pub1);
        pub1.setBounds(370, 100, 210, 40);

        pub2.setForeground(new java.awt.Color(0, 204, 0));
        jPanel4.add(pub2);
        pub2.setBounds(370, 150, 210, 30);
        jPanel4.add(pub3);
        pub3.setBounds(370, 200, 180, 30);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 370, 1040, 380);

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 0));
        jLabel13.setText("TIME OF SESSION:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(280, 300, 160, 22);
        jPanel2.add(test1);
        test1.setBounds(470, 300, 160, 30);
        jPanel2.add(test2);
        test2.setBounds(650, 300, 170, 30);

        test4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        test4.setText("Change");
        test4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test4ActionPerformed(evt);
            }
        });
        jPanel2.add(test4);
        test4.setBounds(830, 300, 100, 30);

        jLabel31.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 204, 0));
        jLabel31.setText("SESSION NUMBER:");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(50, 90, 180, 22);

        counter.setEnabled(false);
        jPanel2.add(counter);
        counter.setBounds(220, 90, 110, 24);

        jLabel24.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 204, 0));
        jLabel24.setText("VALUE OF THE WEEK:");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(550, 90, 210, 22);

        value1.setEnabled(false);
        jPanel2.add(value1);
        value1.setBounds(760, 90, 200, 24);

        jButton31.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton31.setText("BACK");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton31);
        jButton31.setBounds(470, 760, 90, 30);

        jLabel85.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(0, 204, 0));
        jLabel85.setText("PROJECT:");
        jPanel2.add(jLabel85);
        jLabel85.setBounds(320, 190, 100, 22);

        pro1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Project 1", "Project 2", "Project 3", "Project 4", "Project 5" }));
        jPanel2.add(pro1);
        pro1.setBounds(470, 190, 180, 30);

        date1.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    jPanel2.add(date1);
    date1.setBounds(470, 240, 180, 30);

    javax.swing.GroupLayout session_plan1Layout = new javax.swing.GroupLayout(session_plan1.getContentPane());
    session_plan1.getContentPane().setLayout(session_plan1Layout);
    session_plan1Layout.setHorizontalGroup(
        session_plan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
    );
    session_plan1Layout.setVerticalGroup(
        session_plan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, session_plan1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
            .addContainerGap())
    );

    timechooser.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    timechooser.setMinimumSize(new java.awt.Dimension(641, 483));

    jPanel3.setBackground(new java.awt.Color(0, 0, 0));
    jPanel3.setMinimumSize(new java.awt.Dimension(641, 483));
    jPanel3.setLayout(null);

    jLabel14.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel14.setForeground(new java.awt.Color(255, 255, 255));
    jLabel14.setText("FROM:");
    jPanel3.add(jLabel14);
    jLabel14.setBounds(50, 60, 80, 22);

    s1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
    s1.setName(""); // NOI18N
    jPanel3.add(s1);
    s1.setBounds(100, 100, 90, 26);

    s2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
    jPanel3.add(s2);
    s2.setBounds(250, 100, 90, 26);

    s3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
    jPanel3.add(s3);
    s3.setBounds(400, 100, 100, 26);

    jLabel15.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel15.setForeground(new java.awt.Color(255, 255, 255));
    jLabel15.setText("Hr");
    jPanel3.add(jLabel15);
    jLabel15.setBounds(130, 130, 30, 22);

    jLabel16.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel16.setForeground(new java.awt.Color(255, 255, 255));
    jLabel16.setText("Min");
    jPanel3.add(jLabel16);
    jLabel16.setBounds(280, 130, 33, 22);

    jLabel17.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel17.setForeground(new java.awt.Color(255, 255, 255));
    jLabel17.setText("Sec");
    jLabel17.setToolTipText("");
    jPanel3.add(jLabel17);
    jLabel17.setBounds(430, 130, 29, 22);

    jLabel18.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel18.setText("TO:");
    jPanel3.add(jLabel18);
    jLabel18.setBounds(50, 210, 70, 22);

    s4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
    jPanel3.add(s4);
    s4.setBounds(100, 260, 90, 26);

    s5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
    jPanel3.add(s5);
    s5.setBounds(250, 260, 90, 26);

    s6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
    jPanel3.add(s6);
    s6.setBounds(410, 260, 90, 26);

    jLabel19.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel19.setForeground(new java.awt.Color(255, 255, 255));
    jLabel19.setText("Hr");
    jPanel3.add(jLabel19);
    jLabel19.setBounds(130, 290, 30, 22);

    jLabel20.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel20.setForeground(new java.awt.Color(255, 255, 255));
    jLabel20.setText("Min");
    jPanel3.add(jLabel20);
    jLabel20.setBounds(280, 290, 33, 20);

    jLabel21.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel21.setForeground(new java.awt.Color(255, 255, 255));
    jLabel21.setText("Sec");
    jPanel3.add(jLabel21);
    jLabel21.setBounds(440, 290, 40, 22);

    jButton6.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton6.setText("CONFIRM");
    jButton6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton6ActionPerformed(evt);
        }
    });
    jPanel3.add(jButton6);
    jButton6.setBounds(240, 370, 130, 38);

    c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM", " " }));
    jPanel3.add(c1);
    c1.setBounds(530, 100, 60, 30);

    c2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));
    jPanel3.add(c2);
    c2.setBounds(530, 260, 70, 30);

    javax.swing.GroupLayout timechooserLayout = new javax.swing.GroupLayout(timechooser.getContentPane());
    timechooser.getContentPane().setLayout(timechooserLayout);
    timechooserLayout.setHorizontalGroup(
        timechooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timechooserLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    timechooserLayout.setVerticalGroup(
        timechooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
    );

    attendance.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    attendance.setMinimumSize(new java.awt.Dimension(817, 798));
    attendance.addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowActivated(java.awt.event.WindowEvent evt) {
            attendanceWindowActivated(evt);
        }
        public void windowClosed(java.awt.event.WindowEvent evt) {
            attendanceWindowClosed(evt);
        }
        public void windowOpened(java.awt.event.WindowEvent evt) {
            attendanceWindowOpened(evt);
        }
    });

    jPanel6.setBackground(new java.awt.Color(0, 0, 0));
    jPanel6.setLayout(null);

    jLabel29.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel29.setForeground(new java.awt.Color(0, 204, 0));
    jLabel29.setText("ATTENDANCE MANAGEMENT");
    jPanel6.add(jLabel29);
    jLabel29.setBounds(230, 30, 350, 40);

    jLabel30.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel30.setForeground(new java.awt.Color(0, 204, 0));
    jLabel30.setText("FOR SESSION:");
    jPanel6.add(jLabel30);
    jLabel30.setBounds(230, 90, 130, 20);

    at1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            at1ActionPerformed(evt);
        }
    });
    jPanel6.add(at1);
    at1.setBounds(380, 90, 190, 26);

    a1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    a1.setForeground(new java.awt.Color(0, 204, 0));
    a1.setText("TIMING:");
    jPanel6.add(a1);
    a1.setBounds(130, 150, 120, 22);
    jPanel6.add(a2);
    a2.setBounds(240, 150, 170, 20);

    a3.setForeground(new java.awt.Color(0, 204, 0));
    jPanel6.add(a3);
    a3.setBounds(430, 150, 190, 20);

    table3.setBackground(new java.awt.Color(255, 255, 255));
    table3.setForeground(new java.awt.Color(0, 0, 0));
    table3.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "STUDENT NAME"
        }
    ));
    table3.setColumnSelectionAllowed(true);
    jScrollPane1.setViewportView(table3);
    table3.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

    jPanel6.add(jScrollPane1);
    jScrollPane1.setBounds(210, 190, 330, 320);

    jButton12.setBackground(new java.awt.Color(0, 0, 0));
    jButton12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton12.setText("ADD STUDENT");
    jButton12.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton12ActionPerformed(evt);
        }
    });
    jPanel6.add(jButton12);
    jButton12.setBounds(110, 560, 240, 40);

    jButton4.setBackground(new java.awt.Color(0, 0, 0));
    jButton4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton4.setText("FREEZE ATTENDANCE");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton4ActionPerformed(evt);
        }
    });
    jPanel6.add(jButton4);
    jButton4.setBounds(400, 560, 240, 40);

    jButton38.setBackground(new java.awt.Color(0, 0, 0));
    jButton38.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton38.setText("BACK");
    jButton38.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton38ActionPerformed(evt);
        }
    });
    jPanel6.add(jButton38);
    jButton38.setBounds(330, 630, 100, 38);

    javax.swing.GroupLayout attendanceLayout = new javax.swing.GroupLayout(attendance.getContentPane());
    attendance.getContentPane().setLayout(attendanceLayout);
    attendanceLayout.setHorizontalGroup(
        attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
    );
    attendanceLayout.setVerticalGroup(
        attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
    );

    student_info.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    student_info.setMinimumSize(new java.awt.Dimension(931, 687));
    student_info.addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowActivated(java.awt.event.WindowEvent evt) {
            student_infoWindowActivated(evt);
        }
    });

    jPanel7.setBackground(new java.awt.Color(0, 0, 0));
    jPanel7.setMinimumSize(new java.awt.Dimension(854, 635));
    jPanel7.setLayout(null);

    jLabel32.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel32.setForeground(new java.awt.Color(0, 204, 0));
    jLabel32.setText("STUDENT PROFILE");
    jPanel7.add(jLabel32);
    jLabel32.setBounds(300, 30, 290, 50);

    jLabel33.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel33.setForeground(new java.awt.Color(0, 204, 0));
    jLabel33.setText("ENTER STUDENT NAME:");
    jPanel7.add(jLabel33);
    jLabel33.setBounds(140, 130, 230, 30);
    jPanel7.add(input);
    input.setBounds(390, 130, 260, 30);

    panel1.setBackground(new java.awt.Color(0, 0, 51));
    panel1.setForeground(new java.awt.Color(0, 0, 51));
    panel1.setLayout(null);

    jLabel34.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel34.setForeground(new java.awt.Color(0, 204, 0));
    jLabel34.setText("Student Behaviourial Traits:");
    panel1.add(jLabel34);
    jLabel34.setBounds(70, 20, 280, 22);

    ta1.setColumns(20);
    ta1.setLineWrap(true);
    ta1.setRows(5);
    ta1.setWrapStyleWord(true);
    jScrollPane2.setViewportView(ta1);

    panel1.add(jScrollPane2);
    jScrollPane2.setBounds(240, 50, 440, 110);

    jLabel35.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel35.setForeground(new java.awt.Color(0, 204, 0));
    jLabel35.setText("Add Information:");
    panel1.add(jLabel35);
    jLabel35.setBounds(80, 180, 230, 22);

    ta2.setColumns(20);
    ta2.setLineWrap(true);
    ta2.setRows(5);
    ta2.setWrapStyleWord(true);
    jScrollPane3.setViewportView(ta2);

    panel1.add(jScrollPane3);
    jScrollPane3.setBounds(240, 210, 440, 110);

    jButton15.setBackground(new java.awt.Color(0, 0, 51));
    jButton15.setText("ADD INFORMATION");
    jButton15.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton15ActionPerformed(evt);
        }
    });
    panel1.add(jButton15);
    jButton15.setBounds(360, 330, 150, 32);

    jPanel7.add(panel1);
    panel1.setBounds(0, 230, 930, 380);

    jButton14.setText("OK");
    jButton14.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton14ActionPerformed(evt);
        }
    });
    jPanel7.add(jButton14);
    jButton14.setBounds(370, 180, 80, 32);

    jButton47.setBackground(new java.awt.Color(0, 0, 0));
    jButton47.setText("BACK");
    jButton47.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton47ActionPerformed(evt);
        }
    });
    jPanel7.add(jButton47);
    jButton47.setBounds(410, 620, 70, 32);

    javax.swing.GroupLayout student_infoLayout = new javax.swing.GroupLayout(student_info.getContentPane());
    student_info.getContentPane().setLayout(student_infoLayout);
    student_infoLayout.setHorizontalGroup(
        student_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
    );
    student_infoLayout.setVerticalGroup(
        student_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
    );

    reviewing_attendance.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    reviewing_attendance.setMinimumSize(new java.awt.Dimension(1245, 910));
    reviewing_attendance.setResizable(false);
    reviewing_attendance.addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowActivated(java.awt.event.WindowEvent evt) {
            reviewing_attendanceWindowActivated(evt);
        }
    });

    jPanel9.setBackground(new java.awt.Color(0, 0, 0));
    jPanel9.setLayout(null);

    jLabel42.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel42.setForeground(new java.awt.Color(0, 204, 0));
    jLabel42.setText("REVIEWING ATTENDANCE");
    jPanel9.add(jLabel42);
    jLabel42.setBounds(390, 10, 320, 50);

    jLabel43.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel43.setForeground(new java.awt.Color(0, 204, 0));
    jLabel43.setText("CHOOSE DATE:");
    jPanel9.add(jLabel43);
    jLabel43.setBounds(370, 80, 160, 30);

    jPanel10.setBackground(new java.awt.Color(0, 0, 51));
    jPanel10.setLayout(null);

    jLabel44.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel44.setForeground(new java.awt.Color(0, 204, 0));
    jLabel44.setText("SESSION HEAD:");
    jPanel10.add(jLabel44);
    jLabel44.setBounds(360, 60, 140, 22);

    head.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            headActionPerformed(evt);
        }
    });
    jPanel10.add(head);
    head.setBounds(550, 60, 180, 24);

    jLabel45.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel45.setForeground(new java.awt.Color(0, 204, 0));
    jLabel45.setText("SESSION TIMING:");
    jPanel10.add(jLabel45);
    jLabel45.setBounds(340, 100, 170, 22);
    jPanel10.add(tim1);
    tim1.setBounds(550, 100, 120, 24);

    jLabel46.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel46.setForeground(new java.awt.Color(0, 204, 0));
    jLabel46.setText("TO");
    jPanel10.add(jLabel46);
    jLabel46.setBounds(690, 100, 40, 22);
    jPanel10.add(tim2);
    tim2.setBounds(730, 100, 120, 24);

    jLabel48.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel48.setForeground(new java.awt.Color(0, 204, 0));
    jLabel48.setText("STUDENT LIST");
    jPanel10.add(jLabel48);
    jLabel48.setBounds(490, 140, 160, 16);

    table4.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "STUDENT NAMES"
        }
    ));
    jScrollPane4.setViewportView(table4);

    jPanel10.add(jScrollPane4);
    jScrollPane4.setBounds(380, 170, 360, 340);

    jLabel47.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel47.setText("<html><body><font color=\"red\"><B> DEFAULTERS</B></font><br><font color=\"green\"><B>EXTRA STUDENTS ATTENDED</b></font></br><br><font color=\"white\"><B> PRESENT</B></br></font></body></html> ");
    jPanel10.add(jLabel47);
    jLabel47.setBounds(750, 420, 290, 70);

    jButton43.setBackground(new java.awt.Color(0, 0, 51));
    jButton43.setText("BACK");
    jButton43.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton43ActionPerformed(evt);
        }
    });
    jPanel10.add(jButton43);
    jButton43.setBounds(540, 540, 80, 32);

    sessions.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            sessionsItemStateChanged(evt);
        }
    });
    sessions.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            sessionsActionPerformed(evt);
        }
    });
    jPanel10.add(sessions);
    sessions.setBounds(550, 20, 160, 30);

    jLabel87.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel87.setForeground(new java.awt.Color(0, 204, 0));
    jLabel87.setText("SESSIONS :");
    jPanel10.add(jLabel87);
    jLabel87.setBounds(390, 20, 100, 30);

    jButton21.setText("OK");
    jButton21.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton21ActionPerformed(evt);
        }
    });
    jPanel10.add(jButton21);
    jButton21.setBounds(730, 20, 50, 32);

    jPanel9.add(jPanel10);
    jPanel10.setBounds(0, 150, 1240, 770);

    jButton23.setText("OK");
    jButton23.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton23ActionPerformed(evt);
        }
    });
    jPanel9.add(jButton23);
    jButton23.setBounds(510, 120, 50, 30);

    dates.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
jPanel9.add(dates);
dates.setBounds(510, 80, 180, 30);

javax.swing.GroupLayout reviewing_attendanceLayout = new javax.swing.GroupLayout(reviewing_attendance.getContentPane());
reviewing_attendance.getContentPane().setLayout(reviewing_attendanceLayout);
reviewing_attendanceLayout.setHorizontalGroup(
    reviewing_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1245, Short.MAX_VALUE)
    );
    reviewing_attendanceLayout.setVerticalGroup(
        reviewing_attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
    );

    timetable.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    timetable.setMinimumSize(new java.awt.Dimension(1043, 702));
    timetable.setResizable(false);
    timetable.addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowActivated(java.awt.event.WindowEvent evt) {
            timetableWindowActivated(evt);
        }
    });

    jPanel11.setBackground(new java.awt.Color(0, 0, 0));
    jPanel11.setLayout(null);

    jLabel49.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel49.setForeground(new java.awt.Color(0, 204, 0));
    jLabel49.setText("TIMETABLE");
    jPanel11.add(jLabel49);
    jLabel49.setBounds(440, 20, 160, 30);

    buttonGroup1.add(r1);
    r1.setForeground(new java.awt.Color(255, 255, 255));
    r1.setText("SELECT ACCORDING TO VOLUNTEER");
    r1.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            r1ItemStateChanged(evt);
        }
    });
    r1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            r1ActionPerformed(evt);
        }
    });
    jPanel11.add(r1);
    r1.setBounds(250, 80, 250, 28);

    buttonGroup1.add(r2);
    r2.setForeground(new java.awt.Color(255, 255, 255));
    r2.setText("SELECT ACCORDING TO DATE");
    r2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            r2ActionPerformed(evt);
        }
    });
    jPanel11.add(r2);
    r2.setBounds(530, 80, 240, 28);

    jPanel12.setBackground(new java.awt.Color(0, 0, 51));
    jPanel12.setLayout(null);

    z2.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            z2ItemStateChanged(evt);
        }
    });
    z2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            z2ActionPerformed(evt);
        }
    });
    jPanel12.add(z2);
    z2.setBounds(530, 60, 240, 30);

    z1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    z1.setForeground(new java.awt.Color(0, 204, 0));
    z1.setText("SELECT VOLUNTEER NAME:");
    jPanel12.add(z1);
    z1.setBounds(240, 60, 250, 30);

    z3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    z3.setForeground(new java.awt.Color(0, 204, 0));
    z3.setText("SELECT DATE:");
    jPanel12.add(z3);
    z3.setBounds(340, 100, 160, 30);

    bo1.setText("OK");
    bo1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bo1ActionPerformed(evt);
        }
    });
    jPanel12.add(bo1);
    bo1.setBounds(480, 150, 47, 32);

    bo2.setText("OK");
    bo2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bo2ActionPerformed(evt);
        }
    });
    jPanel12.add(bo2);
    bo2.setBounds(500, 150, 47, 32);

    tableA.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "DATE", "TIME", "STATUS"
        }
    ));
    jScrollPane8.setViewportView(tableA);

    javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
    jPanel21.setLayout(jPanel21Layout);
    jPanel21Layout.setHorizontalGroup(
        jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
    );
    jPanel21Layout.setVerticalGroup(
        jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    jPanel12.add(jPanel21);
    jPanel21.setBounds(310, 210, 460, 120);

    tableB.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "SESSION HEAD", "TIME", "STATUS"
        }
    ));
    jScrollPane5.setViewportView(tableB);

    javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
    jPanel22.setLayout(jPanel22Layout);
    jPanel22Layout.setHorizontalGroup(
        jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
    );
    jPanel22Layout.setVerticalGroup(
        jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    jPanel12.add(jPanel22);
    jPanel22.setBounds(310, 340, 460, 130);

    z4.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
jPanel12.add(z4);
z4.setBounds(530, 100, 240, 30);

jPanel11.add(jPanel12);
jPanel12.setBounds(0, 110, 1030, 520);

jButton25.setText("BACK");
jButton25.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton25ActionPerformed(evt);
    }
    });
    jPanel11.add(jButton25);
    jButton25.setBounds(490, 640, 90, 32);

    javax.swing.GroupLayout timetableLayout = new javax.swing.GroupLayout(timetable.getContentPane());
    timetable.getContentPane().setLayout(timetableLayout);
    timetableLayout.setHorizontalGroup(
        timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timetableLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    timetableLayout.setVerticalGroup(
        timetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    volunteer_info.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    volunteer_info.setMinimumSize(new java.awt.Dimension(912, 701));
    volunteer_info.setResizable(false);
    volunteer_info.addWindowStateListener(new java.awt.event.WindowStateListener() {
        public void windowStateChanged(java.awt.event.WindowEvent evt) {
            volunteer_infoWindowStateChanged(evt);
        }
    });
    volunteer_info.addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowActivated(java.awt.event.WindowEvent evt) {
            volunteer_infoWindowActivated(evt);
        }
        public void windowOpened(java.awt.event.WindowEvent evt) {
            volunteer_infoWindowOpened(evt);
        }
    });

    jPanel13.setBackground(new java.awt.Color(0, 0, 0));
    jPanel13.setLayout(null);

    jLabel50.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel50.setForeground(new java.awt.Color(0, 204, 0));
    jLabel50.setText("VOLUNTEER INFORMATION");
    jPanel13.add(jLabel50);
    jLabel50.setBounds(280, 40, 330, 30);

    y1.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            y1ItemStateChanged(evt);
        }
    });
    y1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            y1MouseClicked(evt);
        }
        public void mousePressed(java.awt.event.MouseEvent evt) {
            y1MousePressed(evt);
        }
    });
    jPanel13.add(y1);
    y1.setBounds(450, 120, 180, 30);

    jLabel51.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel51.setForeground(new java.awt.Color(0, 204, 0));
    jLabel51.setText("CHOOSE VOLUNTEER:");
    jPanel13.add(jLabel51);
    jLabel51.setBounds(230, 120, 190, 30);

    jPanel14.setBackground(new java.awt.Color(0, 0, 51));
    jPanel14.setForeground(new java.awt.Color(0, 0, 51));
    jPanel14.setLayout(null);

    jLabel52.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel52.setForeground(new java.awt.Color(0, 204, 0));
    jLabel52.setText("VOLUNTEER NAME:");
    jPanel14.add(jLabel52);
    jLabel52.setBounds(220, 30, 190, 22);

    y2.setEditable(false);
    y2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            y2ActionPerformed(evt);
        }
    });
    jPanel14.add(y2);
    y2.setBounds(450, 30, 190, 24);

    jLabel53.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel53.setForeground(new java.awt.Color(0, 204, 0));
    jLabel53.setText("BIRTH DATE:");
    jPanel14.add(jLabel53);
    jLabel53.setBounds(280, 80, 130, 20);

    y3.setEditable(false);
    jPanel14.add(y3);
    y3.setBounds(450, 80, 190, 24);

    jLabel54.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel54.setForeground(new java.awt.Color(0, 204, 0));
    jLabel54.setText("WORKING INSTITUTION:");
    jPanel14.add(jLabel54);
    jLabel54.setBounds(180, 130, 230, 22);

    y4.setEditable(false);
    jPanel14.add(y4);
    y4.setBounds(450, 130, 190, 24);

    jLabel55.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel55.setForeground(new java.awt.Color(0, 204, 0));
    jLabel55.setText("CURRENTLY WORKING WITH BOOKWALLAH:");
    jPanel14.add(jLabel55);
    jLabel55.setBounds(100, 190, 410, 30);

    y5.setEditable(false);
    jPanel14.add(y5);
    y5.setBounds(550, 190, 140, 30);

    jButton27.setText("UPDATE DETAILS");
    jButton27.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton27ActionPerformed(evt);
        }
    });
    jPanel14.add(jButton27);
    jButton27.setBounds(380, 250, 150, 32);

    jPanel15.setBackground(new java.awt.Color(51, 0, 0));
    jPanel15.setLayout(null);

    jLabel56.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel56.setForeground(new java.awt.Color(0, 204, 0));
    jLabel56.setText("NEW WORKING INSTITUTION:");
    jPanel15.add(jLabel56);
    jLabel56.setBounds(200, 30, 280, 22);
    jPanel15.add(y6);
    y6.setBounds(530, 30, 190, 24);

    jLabel57.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel57.setForeground(new java.awt.Color(0, 204, 0));
    jLabel57.setText("CURRENTLY WORKING WITH BOOKWALLAH:");
    jPanel15.add(jLabel57);
    jLabel57.setBounds(90, 90, 400, 22);

    y7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "YES ", "NO" }));
    jPanel15.add(y7);
    y7.setBounds(530, 86, 140, 30);

    jButton26.setText("PROCEED");
    jButton26.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton26ActionPerformed(evt);
        }
    });
    jPanel15.add(jButton26);
    jButton26.setBounds(400, 130, 140, 32);

    jPanel14.add(jPanel15);
    jPanel15.setBounds(0, 300, 910, 170);

    jButton28.setText("BACK");
    jButton28.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton28ActionPerformed(evt);
        }
    });
    jPanel14.add(jButton28);
    jButton28.setBounds(430, 480, 80, 32);

    jPanel13.add(jPanel14);
    jPanel14.setBounds(0, 160, 910, 540);

    javax.swing.GroupLayout volunteer_infoLayout = new javax.swing.GroupLayout(volunteer_info.getContentPane());
    volunteer_info.getContentPane().setLayout(volunteer_infoLayout);
    volunteer_infoLayout.setHorizontalGroup(
        volunteer_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
    );
    volunteer_infoLayout.setVerticalGroup(
        volunteer_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
    );

    student_info_full.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    student_info_full.setMinimumSize(new java.awt.Dimension(860, 661));
    student_info_full.setResizable(false);
    student_info_full.addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowActivated(java.awt.event.WindowEvent evt) {
            student_info_fullWindowActivated(evt);
        }
    });

    jPanel16.setBackground(new java.awt.Color(0, 0, 0));
    jPanel16.setLayout(null);

    jLabel58.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel58.setForeground(new java.awt.Color(0, 204, 0));
    jLabel58.setText("STUDENT INFORMATION");
    jPanel16.add(jLabel58);
    jLabel58.setBounds(300, 20, 320, 50);

    x1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            x1ActionPerformed(evt);
        }
    });
    jPanel16.add(x1);
    x1.setBounds(450, 100, 170, 26);

    jLabel59.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel59.setForeground(new java.awt.Color(0, 204, 0));
    jLabel59.setText("CHOOSE STUDENT");
    jPanel16.add(jLabel59);
    jLabel59.setBounds(250, 100, 190, 22);

    jPanel17.setBackground(new java.awt.Color(0, 0, 51));
    jPanel17.setLayout(null);

    jLabel60.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel60.setForeground(new java.awt.Color(0, 204, 0));
    jLabel60.setText("FULL NAME:");
    jPanel17.add(jLabel60);
    jLabel60.setBounds(270, 30, 120, 22);

    x2.setEditable(false);
    jPanel17.add(x2);
    x2.setBounds(460, 30, 220, 24);

    jLabel61.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel61.setForeground(new java.awt.Color(0, 204, 0));
    jLabel61.setText("DATE OF JOINING:");
    jPanel17.add(jLabel61);
    jLabel61.setBounds(240, 90, 160, 20);

    x3.setEditable(false);
    jPanel17.add(x3);
    x3.setBounds(460, 90, 220, 24);

    jLabel62.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel62.setForeground(new java.awt.Color(0, 204, 0));
    jLabel62.setText("AGE:");
    jPanel17.add(jLabel62);
    jLabel62.setBounds(310, 150, 50, 22);

    x4.setEditable(false);
    jPanel17.add(x4);
    x4.setBounds(460, 150, 220, 24);

    jLabel63.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel63.setForeground(new java.awt.Color(0, 204, 0));
    jLabel63.setText("LAST SESSION ATTENDED:");
    jPanel17.add(jLabel63);
    jLabel63.setBounds(190, 210, 250, 20);

    x5.setEditable(false);
    jPanel17.add(x5);
    x5.setBounds(460, 210, 220, 24);

    x6.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    x6.setForeground(new java.awt.Color(0, 204, 0));
    x6.setText("STUDENT'S BEHAVIOURIAL TRAITS:");
    jPanel17.add(x6);
    x6.setBounds(130, 290, 320, 22);

    x7.setEditable(false);
    x7.setColumns(20);
    x7.setLineWrap(true);
    x7.setRows(5);
    x7.setWrapStyleWord(true);
    jScrollPane6.setViewportView(x7);

    javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
    jPanel29.setLayout(jPanel29Layout);
    jPanel29Layout.setHorizontalGroup(
        jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    jPanel29Layout.setVerticalGroup(
        jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    jPanel17.add(jPanel29);
    jPanel29.setBounds(460, 250, 220, 0);

    jPanel16.add(jPanel17);
    jPanel17.setBounds(0, 140, 860, 350);

    jButton29.setBackground(new java.awt.Color(0, 0, 0));
    jButton29.setText("BACK");
    jButton29.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton29ActionPerformed(evt);
        }
    });
    jPanel16.add(jButton29);
    jButton29.setBounds(370, 510, 130, 32);

    javax.swing.GroupLayout student_info_fullLayout = new javax.swing.GroupLayout(student_info_full.getContentPane());
    student_info_full.getContentPane().setLayout(student_info_fullLayout);
    student_info_fullLayout.setHorizontalGroup(
        student_info_fullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
    );
    student_info_fullLayout.setVerticalGroup(
        student_info_fullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
    );

    add_volunteer.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    add_volunteer.setMinimumSize(new java.awt.Dimension(806, 549));

    jPanel19.setBackground(new java.awt.Color(0, 0, 0));
    jPanel19.setLayout(null);

    jLabel71.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel71.setForeground(new java.awt.Color(0, 204, 0));
    jLabel71.setText("ADD VOLUNTEER");
    jPanel19.add(jLabel71);
    jLabel71.setBounds(310, 30, 210, 20);

    jLabel72.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel72.setForeground(new java.awt.Color(0, 204, 0));
    jLabel72.setText("VOLUNTEER NAME:");
    jPanel19.add(jLabel72);
    jLabel72.setBounds(210, 90, 180, 22);
    jPanel19.add(w1);
    w1.setBounds(440, 90, 200, 24);

    jLabel73.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel73.setForeground(new java.awt.Color(0, 204, 0));
    jLabel73.setText("BIRTHDATE:");
    jPanel19.add(jLabel73);
    jLabel73.setBounds(280, 210, 120, 30);

    jLabel74.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel74.setForeground(new java.awt.Color(0, 204, 0));
    jLabel74.setText("CURRENTLY WORKING IN:");
    jPanel19.add(jLabel74);
    jLabel74.setBounds(160, 280, 240, 22);
    jPanel19.add(w3);
    w3.setBounds(440, 280, 200, 24);

    jLabel75.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel75.setForeground(new java.awt.Color(0, 204, 0));
    jLabel75.setText("DATE OF JOINING BOOKWALLAH:");
    jPanel19.add(jLabel75);
    jLabel75.setBounds(100, 350, 310, 30);

    jButton35.setText("ADD");
    jButton35.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton35ActionPerformed(evt);
        }
    });
    jPanel19.add(jButton35);
    jButton35.setBounds(360, 430, 110, 32);

    jLabel76.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel76.setForeground(new java.awt.Color(0, 204, 51));
    jLabel76.setText("CREATE LOGIN:");
    jPanel19.add(jLabel76);
    jLabel76.setBounds(250, 150, 150, 22);
    jPanel19.add(w5);
    w5.setBounds(440, 150, 200, 24);

    jButton48.setText("BACK");
    jButton48.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton48ActionPerformed(evt);
        }
    });
    jPanel19.add(jButton48);
    jButton48.setBounds(380, 480, 80, 32);

    w2.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
jPanel19.add(w2);
w2.setBounds(440, 210, 200, 20);

w4.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
    new datechooser.view.appearance.ViewAppearance("custom",
        new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
            new java.awt.Color(187, 187, 187),
            new java.awt.Color(0, 0, 255),
            false,
            true,
            new datechooser.view.appearance.swing.ButtonPainter()),
        new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
            new java.awt.Color(187, 187, 187),
            new java.awt.Color(0, 0, 255),
            true,
            true,
            new datechooser.view.appearance.swing.ButtonPainter()),
        new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
            new java.awt.Color(0, 0, 255),
            new java.awt.Color(0, 0, 255),
            false,
            true,
            new datechooser.view.appearance.swing.ButtonPainter()),
        new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
            new java.awt.Color(128, 128, 128),
            new java.awt.Color(0, 0, 255),
            false,
            true,
            new datechooser.view.appearance.swing.LabelPainter()),
        new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
            new java.awt.Color(187, 187, 187),
            new java.awt.Color(0, 0, 255),
            false,
            true,
            new datechooser.view.appearance.swing.LabelPainter()),
        new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
            new java.awt.Color(187, 187, 187),
            new java.awt.Color(255, 0, 0),
            false,
            false,
            new datechooser.view.appearance.swing.ButtonPainter()),
        (datechooser.view.BackRenderer)null,
        false,
        true)));
jPanel19.add(w4);
w4.setBounds(440, 350, 200, 30);

javax.swing.GroupLayout add_volunteerLayout = new javax.swing.GroupLayout(add_volunteer.getContentPane());
add_volunteer.getContentPane().setLayout(add_volunteerLayout);
add_volunteerLayout.setHorizontalGroup(
add_volunteerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_volunteerLayout.createSequentialGroup()
    .addContainerGap()
    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
    .addContainerGap())
    );
    add_volunteerLayout.setVerticalGroup(
        add_volunteerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
    );

    add_student.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    add_student.setMinimumSize(new java.awt.Dimension(807, 597));

    jPanel20.setBackground(new java.awt.Color(0, 0, 0));
    jPanel20.setLayout(null);

    jLabel77.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel77.setForeground(new java.awt.Color(51, 204, 0));
    jLabel77.setText("ADD STUDENT");
    jPanel20.add(jLabel77);
    jLabel77.setBounds(310, 30, 200, 30);

    jLabel78.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel78.setForeground(new java.awt.Color(51, 204, 0));
    jLabel78.setText("STUDENT NAME:");
    jPanel20.add(jLabel78);
    jLabel78.setBounds(230, 100, 170, 30);
    jPanel20.add(v1);
    v1.setBounds(410, 100, 200, 30);

    jLabel79.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel79.setForeground(new java.awt.Color(51, 204, 0));
    jLabel79.setText("STUDENT AGE:");
    jPanel20.add(jLabel79);
    jLabel79.setBounds(250, 180, 140, 30);

    v2.setModel(new javax.swing.SpinnerNumberModel());
    jPanel20.add(v2);
    v2.setBounds(410, 180, 130, 26);

    jLabel80.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel80.setForeground(new java.awt.Color(51, 204, 0));
    jLabel80.setText("DATE OF JOINING BOOKWALLAH:");
    jPanel20.add(jLabel80);
    jLabel80.setBounds(100, 250, 300, 30);

    jLabel81.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel81.setForeground(new java.awt.Color(51, 204, 0));
    jLabel81.setText("COMMENTS (IF ANY)");
    jPanel20.add(jLabel81);
    jLabel81.setBounds(180, 320, 200, 22);

    v4.setColumns(20);
    v4.setLineWrap(true);
    v4.setRows(5);
    v4.setWrapStyleWord(true);
    jScrollPane7.setViewportView(v4);

    jPanel20.add(jScrollPane7);
    jScrollPane7.setBounds(410, 310, 270, 100);

    jButton37.setText("ADD");
    jButton37.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton37ActionPerformed(evt);
        }
    });
    jPanel20.add(jButton37);
    jButton37.setBounds(360, 440, 100, 40);

    jLabel82.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
    jLabel82.setForeground(new java.awt.Color(51, 204, 0));
    jLabel82.setText("<html>please add only key points<br> on separate lines</br></html>");
    jPanel20.add(jLabel82);
    jLabel82.setBounds(180, 350, 185, 40);

    jButton49.setText("BACK");
    jButton49.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton49ActionPerformed(evt);
        }
    });
    jPanel20.add(jButton49);
    jButton49.setBounds(375, 490, 70, 32);

    v3.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
jPanel20.add(v3);
v3.setBounds(410, 250, 155, 30);

javax.swing.GroupLayout add_studentLayout = new javax.swing.GroupLayout(add_student.getContentPane());
add_student.getContentPane().setLayout(add_studentLayout);
add_studentLayout.setHorizontalGroup(
    add_studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
    );
    add_studentLayout.setVerticalGroup(
        add_studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
    );

    value_week.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    value_week.setMinimumSize(new java.awt.Dimension(653, 468));

    jPanel23.setBackground(new java.awt.Color(0, 0, 0));
    jPanel23.setLayout(null);

    jLabel83.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel83.setForeground(new java.awt.Color(51, 204, 0));
    jLabel83.setText("UPDATE VALUE");
    jPanel23.add(jLabel83);
    jLabel83.setBounds(310, 30, 260, 30);

    jLabel86.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel86.setForeground(new java.awt.Color(51, 204, 0));
    jLabel86.setText("ENTER VALUE:");
    jPanel23.add(jLabel86);
    jLabel86.setBounds(240, 252, 140, 20);
    jPanel23.add(u3);
    u3.setBounds(420, 250, 160, 24);

    jButton39.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton39.setText("ADD");
    jButton39.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton39ActionPerformed(evt);
        }
    });
    jPanel23.add(jButton39);
    jButton39.setBounds(350, 320, 100, 38);

    jLabel96.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel96.setForeground(new java.awt.Color(51, 204, 0));
    jLabel96.setText("SELECT START DATE:");
    jPanel23.add(jLabel96);
    jLabel96.setBounds(210, 102, 190, 30);

    jLabel84.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel84.setForeground(new java.awt.Color(51, 204, 0));
    jLabel84.setText("SELECT END DATE:");
    jPanel23.add(jLabel84);
    jLabel84.setBounds(220, 170, 190, 30);

    jButton50.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton50.setText("BACK");
    jButton50.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton50ActionPerformed(evt);
        }
    });
    jPanel23.add(jButton50);
    jButton50.setBounds(360, 390, 80, 38);
    jPanel23.add(u1);
    u1.setBounds(420, 100, 180, 30);
    jPanel23.add(u2);
    u2.setBounds(420, 170, 180, 30);

    javax.swing.GroupLayout value_weekLayout = new javax.swing.GroupLayout(value_week.getContentPane());
    value_week.getContentPane().setLayout(value_weekLayout);
    value_weekLayout.setHorizontalGroup(
        value_weekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
    );
    value_weekLayout.setVerticalGroup(
        value_weekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
    );

    add_books.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    add_books.setMinimumSize(new java.awt.Dimension(685, 518));

    jPanel24.setBackground(new java.awt.Color(0, 0, 0));
    jPanel24.setLayout(null);

    jLabel88.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel88.setForeground(new java.awt.Color(51, 204, 0));
    jLabel88.setText("ADD BOOKS");
    jPanel24.add(jLabel88);
    jLabel88.setBounds(280, 20, 180, 20);

    jLabel89.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel89.setForeground(new java.awt.Color(51, 204, 0));
    jLabel89.setText("ENTER BOOK NAME:");
    jPanel24.add(jLabel89);
    jLabel89.setBounds(140, 100, 190, 22);
    jPanel24.add(q1);
    q1.setBounds(340, 100, 230, 24);

    jLabel90.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel90.setForeground(new java.awt.Color(51, 204, 0));
    jLabel90.setText("ENTER PUBLISHER:");
    jPanel24.add(jLabel90);
    jLabel90.setBounds(140, 170, 190, 22);

    q2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            q2ActionPerformed(evt);
        }
    });
    jPanel24.add(q2);
    q2.setBounds(340, 170, 230, 24);

    jLabel91.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel91.setForeground(new java.awt.Color(51, 204, 0));
    jLabel91.setText("ENTER VALUE:");
    jPanel24.add(jLabel91);
    jLabel91.setBounds(140, 244, 170, 22);
    jPanel24.add(q3);
    q3.setBounds(340, 240, 220, 24);

    jButton41.setText("ADD");
    jButton41.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton41ActionPerformed(evt);
        }
    });
    jPanel24.add(jButton41);
    jButton41.setBounds(280, 320, 120, 32);

    jButton46.setText("BACK");
    jButton46.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton46ActionPerformed(evt);
        }
    });
    jPanel24.add(jButton46);
    jButton46.setBounds(300, 370, 80, 32);

    javax.swing.GroupLayout add_booksLayout = new javax.swing.GroupLayout(add_books.getContentPane());
    add_books.getContentPane().setLayout(add_booksLayout);
    add_booksLayout.setHorizontalGroup(
        add_booksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
    );
    add_booksLayout.setVerticalGroup(
        add_booksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
    );

    tracking_books.setMinimumSize(new java.awt.Dimension(961, 706));
    tracking_books.addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowActivated(java.awt.event.WindowEvent evt) {
            tracking_booksWindowActivated(evt);
        }
    });

    jPanel26.setBackground(new java.awt.Color(0, 0, 0));
    jPanel26.setLayout(null);

    jLabel97.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel97.setForeground(new java.awt.Color(51, 204, 0));
    jLabel97.setText("TRACKING BOOKS");
    jPanel26.add(jLabel97);
    jLabel97.setBounds(300, 20, 260, 20);

    buttonGroup2.add(r3);
    r3.setText("FIND A PARTICULAR BOOK");
    r3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            r3ActionPerformed(evt);
        }
    });
    jPanel26.add(r3);
    r3.setBounds(140, 70, 220, 28);

    buttonGroup2.add(r4);
    r4.setText("FIND BOOKS ACCORDING TO VALUE OF WEEK");
    r4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            r4ActionPerformed(evt);
        }
    });
    jPanel26.add(r4);
    r4.setBounds(420, 70, 310, 28);

    jPanel27.setBackground(new java.awt.Color(0, 0, 51));
    jPanel27.setLayout(null);

    m1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    m1.setForeground(new java.awt.Color(51, 204, 0));
    m1.setText("ENTER BOOK NAME:");
    jPanel27.add(m1);
    m1.setBounds(200, 80, 200, 22);

    m2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            m2ActionPerformed(evt);
        }
    });
    jPanel27.add(m2);
    m2.setBounds(420, 80, 230, 24);

    m3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    m3.setForeground(new java.awt.Color(51, 204, 0));
    m3.setText("VALUE ATTACHED WITH IT:");
    jPanel27.add(m3);
    m3.setBounds(130, 140, 250, 22);

    m4.setEditable(false);
    jPanel27.add(m4);
    m4.setBounds(420, 140, 230, 24);

    m5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    m5.setForeground(new java.awt.Color(51, 204, 0));
    m5.setText("PUBLISHER:");
    jPanel27.add(m5);
    m5.setBounds(270, 200, 110, 22);

    m6.setEditable(false);
    jPanel27.add(m6);
    m6.setBounds(420, 200, 230, 24);

    m7.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    m7.setForeground(new java.awt.Color(0, 204, 0));
    m7.setText("LAST USED ON:");
    jPanel27.add(m7);
    m7.setBounds(240, 260, 140, 22);

    m8.setEditable(false);
    jPanel27.add(m8);
    m8.setBounds(420, 260, 230, 24);

    m9.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    m9.setForeground(new java.awt.Color(51, 204, 0));
    m9.setText("LAST USED BY:");
    jPanel27.add(m9);
    m9.setBounds(240, 320, 140, 22);

    m10.setEditable(false);
    jPanel27.add(m10);
    m10.setBounds(420, 320, 240, 24);

    n1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    n1.setForeground(new java.awt.Color(51, 204, 0));
    n1.setText("CHOOSE VALUE:");
    jPanel27.add(n1);
    n1.setBounds(220, 20, 150, 22);

    n2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            n2ActionPerformed(evt);
        }
    });
    jPanel27.add(n2);
    n2.setBounds(420, 20, 170, 26);

    jPanel28.setBackground(new java.awt.Color(0, 0, 51));
    jPanel28.setLayout(null);

    n3.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "BOOK NAME", "PUBLISHER"
        }
    ));
    jScrollPane9.setViewportView(n3);

    jPanel28.add(jScrollPane9);
    jScrollPane9.setBounds(70, 10, 490, 300);

    jPanel27.add(jPanel28);
    jPanel28.setBounds(120, 60, 560, 310);

    jPanel26.add(jPanel27);
    jPanel27.setBounds(0, 120, 880, 440);

    jButton22.setText("BACK");
    jButton22.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton22ActionPerformed(evt);
        }
    });
    jPanel26.add(jButton22);
    jButton22.setBounds(390, 570, 84, 32);

    javax.swing.GroupLayout tracking_booksLayout = new javax.swing.GroupLayout(tracking_books.getContentPane());
    tracking_books.getContentPane().setLayout(tracking_booksLayout);
    tracking_booksLayout.setHorizontalGroup(
        tracking_booksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
    );
    tracking_booksLayout.setVerticalGroup(
        tracking_booksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
    );

    volunteer_app.setMinimumSize(new java.awt.Dimension(942, 695));

    jPanel30.setBackground(new java.awt.Color(0, 0, 0));
    jPanel30.setMinimumSize(new java.awt.Dimension(907, 672));
    jPanel30.setLayout(null);

    jLabel98.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
    jLabel98.setForeground(new java.awt.Color(51, 204, 0));
    jLabel98.setText("VOLUNTEER APPLICATION");
    jPanel30.add(jLabel98);
    jLabel98.setBounds(160, 60, 640, 50);

    jLabel99.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel99.setForeground(new java.awt.Color(255, 255, 255));
    jLabel99.setText("ENTER FULL NAME:");
    jPanel30.add(jLabel99);
    jLabel99.setBounds(80, 139, 240, 30);
    jPanel30.add(up3);
    up3.setBounds(470, 140, 240, 30);

    jLabel100.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel100.setForeground(new java.awt.Color(255, 255, 255));
    jLabel100.setText("ENTER DOB:");
    jPanel30.add(jLabel100);
    jLabel100.setBounds(80, 210, 170, 29);

    up4.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                new java.awt.Color(187, 187, 187),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
up4.setNothingAllowed(false);
jPanel30.add(up4);
up4.setBounds(470, 210, 240, 30);

jButton52.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
jButton52.setText("UPLOAD DOCUMENTS");
jButton52.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton52ActionPerformed(evt);
    }
    });
    jPanel30.add(jButton52);
    jButton52.setBounds(170, 330, 270, 38);

    jLabel101.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel101.setForeground(new java.awt.Color(255, 255, 255));
    jLabel101.setText("<html><body>Upload in .pdf/.doc<br>Size: max.200KB</br></body></html>");
    jPanel30.add(jLabel101);
    jLabel101.setBounds(480, 330, 240, 40);

    jButton53.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton53.setText("UPLOAD PHOTO");
    jButton53.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton53ActionPerformed(evt);
        }
    });
    jPanel30.add(jButton53);
    jButton53.setBounds(170, 440, 270, 38);

    jLabel102.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel102.setForeground(new java.awt.Color(255, 255, 255));
    jLabel102.setText("<html><body>Upload in .jpg format<br>Max.size: 1MB</br></body></html>");
    jPanel30.add(jLabel102);
    jLabel102.setBounds(470, 440, 280, 40);

    jButton54.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton54.setText("PROCEED");
    jButton54.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton54ActionPerformed(evt);
        }
    });
    jPanel30.add(jButton54);
    jButton54.setBounds(370, 550, 130, 38);

    up1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    up1.setForeground(new java.awt.Color(255, 255, 255));
    jPanel30.add(up1);
    up1.setBounds(160, 390, 490, 30);

    up2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    up2.setForeground(new java.awt.Color(255, 255, 255));
    jPanel30.add(up2);
    up2.setBounds(150, 490, 470, 40);

    jButton56.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton56.setText("BACK");
    jButton56.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton56ActionPerformed(evt);
        }
    });
    jPanel30.add(jButton56);
    jButton56.setBounds(390, 610, 84, 32);

    jLabel103.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel103.setForeground(new java.awt.Color(255, 255, 255));
    jLabel103.setText("CURRENTLY WORKING AT:");
    jPanel30.add(jLabel103);
    jLabel103.setBounds(80, 270, 330, 29);
    jPanel30.add(up5);
    up5.setBounds(470, 264, 240, 30);

    javax.swing.GroupLayout volunteer_appLayout = new javax.swing.GroupLayout(volunteer_app.getContentPane());
    volunteer_app.getContentPane().setLayout(volunteer_appLayout);
    volunteer_appLayout.setHorizontalGroup(
        volunteer_appLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
    );
    volunteer_appLayout.setVerticalGroup(
        volunteer_appLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
    );

    uploading.setMinimumSize(new java.awt.Dimension(913, 721));

    jPanel31.setBackground(new java.awt.Color(0, 0, 0));
    jPanel31.setMinimumSize(new java.awt.Dimension(913, 721));
    jPanel31.setLayout(null);

    jLabel104.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
    jLabel104.setForeground(new java.awt.Color(0, 255, 0));
    jLabel104.setText("UPLOAD PHOTOS");
    jPanel31.add(jLabel104);
    jLabel104.setBounds(310, 70, 330, 40);

    jLabel105.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel105.setForeground(new java.awt.Color(255, 255, 255));
    jLabel105.setText("ENTER EVENT NAME:");
    jPanel31.add(jLabel105);
    jLabel105.setBounds(120, 180, 340, 29);

    jLabel106.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel106.setForeground(new java.awt.Color(255, 255, 255));
    jLabel106.setText("ENTER MONTH OF EVENT:");
    jPanel31.add(jLabel106);
    jLabel106.setBounds(120, 240, 300, 29);

    jLabel107.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel107.setForeground(new java.awt.Color(255, 255, 255));
    jLabel107.setText("ENTER YEAR OF EVENT:");
    jPanel31.add(jLabel107);
    jLabel107.setBounds(120, 300, 280, 29);
    jPanel31.add(ph1);
    ph1.setBounds(460, 180, 270, 24);
    jPanel31.add(ph3);
    ph3.setBounds(460, 300, 110, 30);

    jButton57.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton57.setText("UPLOAD PHOTOS/VIDEOS");
    jButton57.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton57ActionPerformed(evt);
        }
    });
    jPanel31.add(jButton57);
    jButton57.setBounds(220, 380, 280, 38);

    ph4.setEditable(false);
    ph4.setBackground(new java.awt.Color(0, 0, 0));
    ph4.setColumns(20);
    ph4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
    ph4.setForeground(new java.awt.Color(255, 255, 255));
    ph4.setRows(5);
    ph4.setBorder(null);
    jScrollPane10.setViewportView(ph4);

    jPanel31.add(jScrollPane10);
    jScrollPane10.setBounds(170, 440, 390, 140);

    jButton58.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton58.setText("PROCEED");
    jButton58.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton58ActionPerformed(evt);
        }
    });
    jPanel31.add(jButton58);
    jButton58.setBounds(430, 610, 130, 32);

    ph2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
    jPanel31.add(ph2);
    ph2.setBounds(460, 240, 110, 26);

    jButton7.setText("BACK");
    jButton7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton7ActionPerformed(evt);
        }
    });
    jPanel31.add(jButton7);
    jButton7.setBounds(470, 660, 62, 32);

    javax.swing.GroupLayout uploadingLayout = new javax.swing.GroupLayout(uploading.getContentPane());
    uploading.getContentPane().setLayout(uploadingLayout);
    uploadingLayout.setHorizontalGroup(
        uploadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    uploadingLayout.setVerticalGroup(
        uploadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    cancel.setMinimumSize(new java.awt.Dimension(882, 679));
    cancel.addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowActivated(java.awt.event.WindowEvent evt) {
            cancelWindowActivated(evt);
        }
    });

    jPanel32.setBackground(new java.awt.Color(0, 0, 0));
    jPanel32.setLayout(null);

    jLabel108.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
    jLabel108.setForeground(new java.awt.Color(51, 204, 0));
    jLabel108.setText("CANCEL SESSION");
    jPanel32.add(jLabel108);
    jLabel108.setBounds(250, 30, 460, 60);

    table7.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "SESSION NUMBER", "PROJECT", "START TIME", "END TIME", "STATUS"
        }
    ) {
        Class[] types = new Class [] {
            java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
        };

        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }
    });
    jScrollPane11.setViewportView(table7);

    jPanel32.add(jScrollPane11);
    jScrollPane11.setBounds(160, 140, 600, 180);

    jLabel109.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jLabel109.setForeground(new java.awt.Color(255, 255, 255));
    jLabel109.setText("CHOOSE SESSION TO DELETE:");
    jPanel32.add(jLabel109);
    jLabel109.setBounds(230, 360, 280, 40);

    jPanel32.add(ch1);
    ch1.setBounds(540, 370, 140, 26);

    jButton60.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton60.setText("DELETE");
    jButton60.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton60ActionPerformed(evt);
        }
    });
    jPanel32.add(jButton60);
    jButton60.setBounds(390, 470, 150, 50);

    jButton16.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton16.setText("BACK");
    jButton16.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton16ActionPerformed(evt);
        }
    });
    jPanel32.add(jButton16);
    jButton16.setBounds(410, 550, 100, 38);

    javax.swing.GroupLayout cancelLayout = new javax.swing.GroupLayout(cancel.getContentPane());
    cancel.getContentPane().setLayout(cancelLayout);
    cancelLayout.setHorizontalGroup(
        cancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
    );
    cancelLayout.setVerticalGroup(
        cancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
    );

    forgot.setMinimumSize(new java.awt.Dimension(1027, 754));
    forgot.addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowActivated(java.awt.event.WindowEvent evt) {
            forgotWindowActivated(evt);
        }
    });

    jPanel33.setBackground(new java.awt.Color(0, 0, 0));
    jPanel33.setMinimumSize(new java.awt.Dimension(733, 679));
    jPanel33.setLayout(null);

    jLabel110.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
    jLabel110.setForeground(new java.awt.Color(51, 204, 0));
    jLabel110.setText("FORGOT PASSWORD");
    jPanel33.add(jLabel110);
    jLabel110.setBounds(320, 30, 473, 90);

    f1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            f1ActionPerformed(evt);
        }
    });
    jPanel33.add(f1);
    f1.setBounds(490, 164, 310, 30);

    jLabel111.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel111.setForeground(new java.awt.Color(255, 255, 255));
    jLabel111.setText("ENTER EMAIL ID:");
    jPanel33.add(jLabel111);
    jLabel111.setBounds(250, 160, 240, 40);

    f5.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    f5.setForeground(new java.awt.Color(255, 255, 255));
    f5.setText("Enter OTP:");
    jPanel33.add(f5);
    f5.setBounds(350, 300, 130, 30);

    f2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            f2ActionPerformed(evt);
        }
    });
    jPanel33.add(f2);
    f2.setBounds(490, 300, 210, 30);

    dis_time.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    dis_time.setForeground(new java.awt.Color(255, 255, 255));
    jPanel33.add(dis_time);
    dis_time.setBounds(720, 300, 120, 30);

    f4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    f4.setText("OK");
    f4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            f4ActionPerformed(evt);
        }
    });
    jPanel33.add(f4);
    f4.setBounds(490, 360, 55, 38);

    panel_disp.setBackground(new java.awt.Color(0, 0, 0));
    panel_disp.setLayout(null);

    jLabel113.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel113.setForeground(new java.awt.Color(255, 255, 255));
    jLabel113.setText("ENTER NEW PASSWORD:");
    panel_disp.add(jLabel113);
    jLabel113.setBounds(210, 70, 310, 30);

    f3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            f3ActionPerformed(evt);
        }
    });
    panel_disp.add(f3);
    f3.setBounds(540, 74, 250, 30);

    jButton64.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton64.setText("RESET PASSWORD");
    jButton64.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton64ActionPerformed(evt);
        }
    });
    panel_disp.add(jButton64);
    jButton64.setBounds(420, 160, 210, 38);

    jPanel33.add(panel_disp);
    panel_disp.setBounds(0, 410, 1030, 260);

    jButton63.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton63.setText("BACK");
    jButton63.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton63ActionPerformed(evt);
        }
    });
    jPanel33.add(jButton63);
    jButton63.setBounds(470, 680, 120, 32);

    info.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    info.setForeground(new java.awt.Color(255, 255, 255));
    jPanel33.add(info);
    info.setBounds(420, 210, 240, 20);

    javax.swing.GroupLayout forgotLayout = new javax.swing.GroupLayout(forgot.getContentPane());
    forgot.getContentPane().setLayout(forgotLayout);
    forgotLayout.setHorizontalGroup(
        forgotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 1027, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    forgotLayout.setVerticalGroup(
        forgotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forgotLayout.createSequentialGroup()
            .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );

    get_photos.setMinimumSize(new java.awt.Dimension(1029, 731));
    get_photos.addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowActivated(java.awt.event.WindowEvent evt) {
            get_photosWindowActivated(evt);
        }
    });

    jPanel25.setBackground(new java.awt.Color(0, 0, 0));
    jPanel25.setMinimumSize(new java.awt.Dimension(975, 706));
    jPanel25.setLayout(null);

    jLabel92.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
    jLabel92.setForeground(new java.awt.Color(51, 255, 0));
    jLabel92.setText("RETRIEVE PHOTOS");
    jPanel25.add(jLabel92);
    jLabel92.setBounds(330, 70, 460, 40);

    jButton36.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jButton36.setText("CHOOSE LOCATION TO SAVE PHOTOS");
    jButton36.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton36ActionPerformed(evt);
        }
    });
    jPanel25.add(jButton36);
    jButton36.setBounds(310, 190, 470, 45);

    info_set.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    info_set.setForeground(new java.awt.Color(255, 255, 255));
    jPanel25.add(info_set);
    info_set.setBounds(340, 260, 410, 30);

    jPanel34.setBackground(new java.awt.Color(0, 0, 0));
    jPanel34.setLayout(null);

    jLabel93.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel93.setForeground(new java.awt.Color(255, 255, 255));
    jLabel93.setText("CHOOSE EVENT NAME:");
    jPanel34.add(jLabel93);
    jLabel93.setBounds(250, 20, 280, 40);

    k1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            k1ActionPerformed(evt);
        }
    });
    jPanel34.add(k1);
    k1.setBounds(540, 30, 200, 26);

    jLabel94.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel94.setForeground(new java.awt.Color(255, 255, 255));
    jLabel94.setText("CHOOSE MONTH:");
    jPanel34.add(jLabel94);
    jLabel94.setBounds(270, 80, 200, 30);

    k2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
    jPanel34.add(k2);
    k2.setBounds(540, 80, 150, 30);
    jPanel34.add(k3);
    k3.setBounds(540, 140, 100, 30);

    jLabel95.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
    jLabel95.setForeground(new java.awt.Color(255, 255, 255));
    jLabel95.setText("CHOOSE YEAR:");
    jPanel34.add(jLabel95);
    jLabel95.setBounds(270, 140, 230, 30);

    jButton51.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton51.setText("SAVE");
    jButton51.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton51ActionPerformed(evt);
        }
    });
    jPanel34.add(jButton51);
    jButton51.setBounds(490, 220, 130, 38);

    jPanel25.add(jPanel34);
    jPanel34.setBounds(0, 290, 1070, 320);

    jButton62.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton62.setText("BACK");
    jButton62.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton62ActionPerformed(evt);
        }
    });
    jPanel25.add(jButton62);
    jButton62.setBounds(480, 650, 120, 32);

    javax.swing.GroupLayout get_photosLayout = new javax.swing.GroupLayout(get_photos.getContentPane());
    get_photos.getContentPane().setLayout(get_photosLayout);
    get_photosLayout.setHorizontalGroup(
        get_photosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE)
    );
    get_photosLayout.setVerticalGroup(
        get_photosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
    );

    activities.setMinimumSize(new java.awt.Dimension(1495, 978));
    activities.addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowActivated(java.awt.event.WindowEvent evt) {
            activitiesWindowActivated(evt);
        }
    });

    jPanel35.setBackground(new java.awt.Color(0, 0, 0));
    jPanel35.setLayout(null);

    jLabel112.setBackground(new java.awt.Color(255, 255, 255));
    jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activities_admin1.jpg"))); // NOI18N
    jLabel112.setOpaque(true);
    jPanel35.add(jLabel112);
    jLabel112.setBounds(60, 30, 150, 150);

    jButton65.setBackground(new java.awt.Color(0, 153, 204));
    jButton65.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton65.setText("LOGOUT");
    jButton65.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton65ActionPerformed(evt);
        }
    });
    jPanel35.add(jButton65);
    jButton65.setBounds(1150, 90, 150, 30);

    jLabel114.setBackground(new java.awt.Color(0, 153, 204));
    jLabel114.setOpaque(true);
    jPanel35.add(jLabel114);
    jLabel114.setBounds(190, 70, 1160, 70);

    jPanel36.setBackground(new java.awt.Color(0, 153, 204));
    jPanel36.setLayout(null);

    jLabel115.setFont(new java.awt.Font("Times New Roman", 1, 52)); // NOI18N
    jLabel115.setForeground(new java.awt.Color(0, 0, 0));
    jLabel115.setText("WELCOME");
    jPanel36.add(jLabel115);
    jLabel115.setBounds(10, 100, 310, 80);

    jLabel116.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
    jLabel116.setForeground(new java.awt.Color(0, 0, 0));
    jLabel116.setText("to");
    jPanel36.add(jLabel116);
    jLabel116.setBounds(230, 240, 60, 40);

    jLabel117.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
    jLabel117.setForeground(new java.awt.Color(0, 0, 0));
    jLabel117.setText("ADMIN PORTAL");
    jPanel36.add(jLabel117);
    jLabel117.setBounds(10, 330, 310, 100);

    jPanel35.add(jPanel36);
    jPanel36.setBounds(60, 200, 330, 630);

    selection1.setBackground(new java.awt.Color(0, 0, 0));
    selection1.setLayout(null);

    cho1.setBackground(new java.awt.Color(0, 0, 0));
    buttonGroup3.add(cho1);
    cho1.setForeground(new java.awt.Color(255, 255, 255));
    cho1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cho1ActionPerformed(evt);
        }
    });
    selection1.add(cho1);
    cho1.setBounds(0, 0, 40, 40);

    cho2.setBackground(new java.awt.Color(0, 0, 0));
    buttonGroup3.add(cho2);
    cho2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cho2ActionPerformed(evt);
        }
    });
    selection1.add(cho2);
    cho2.setBounds(40, 0, 40, 40);

    cho3.setBackground(new java.awt.Color(0, 0, 0));
    buttonGroup3.add(cho3);
    cho3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cho3ActionPerformed(evt);
        }
    });
    selection1.add(cho3);
    cho3.setBounds(80, 0, 40, 40);

    cho4.setBackground(new java.awt.Color(0, 0, 0));
    buttonGroup3.add(cho4);
    cho4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cho4ActionPerformed(evt);
        }
    });
    selection1.add(cho4);
    cho4.setBounds(120, 0, 40, 40);

    cho5.setBackground(new java.awt.Color(0, 0, 0));
    buttonGroup3.add(cho5);
    cho5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cho5ActionPerformed(evt);
        }
    });
    selection1.add(cho5);
    cho5.setBounds(160, 0, 40, 40);

    cho6.setBackground(new java.awt.Color(0, 0, 0));
    buttonGroup3.add(cho6);
    cho6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cho6ActionPerformed(evt);
        }
    });
    selection1.add(cho6);
    cho6.setBounds(200, 0, 40, 40);

    jPanel35.add(selection1);
    selection1.setBounds(730, 780, 270, 40);

    display1.setBackground(new java.awt.Color(0, 0, 0));
    display1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
    display1.setLayout(null);

    disp1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    disp1.setForeground(new java.awt.Color(0, 51, 255));
    disp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timetable.jpg"))); // NOI18N
    disp1.setText("REVIEW TIMETABLE");
    disp1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    disp1.setVerifyInputWhenFocusTarget(false);
    disp1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    disp1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            disp1MouseClicked(evt);
        }
    });
    display1.add(disp1);
    disp1.setBounds(0, 0, 250, 500);

    disp2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    disp2.setForeground(new java.awt.Color(0, 51, 204));
    disp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendance.png"))); // NOI18N
    disp2.setText("REVIEW ATTENDANCE");
    disp2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    disp2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    disp2.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            disp2MouseClicked(evt);
        }
    });
    display1.add(disp2);
    disp2.setBounds(181, 0, 220, 500);

    disp3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    disp3.setForeground(new java.awt.Color(0, 51, 204));
    disp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volunteer_info.jpg"))); // NOI18N
    disp3.setText("VOLUNTEER INFORMATION");
    disp3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    disp3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    disp3.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            disp3MouseClicked(evt);
        }
    });
    display1.add(disp3);
    disp3.setBounds(280, 0, 260, 500);

    disp4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    disp4.setForeground(new java.awt.Color(0, 51, 255));
    disp4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_info.png"))); // NOI18N
    disp4.setText("STUDENT INFORMATION");
    disp4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    disp4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    disp4.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            disp4MouseClicked(evt);
        }
    });
    display1.add(disp4);
    disp4.setBounds(440, 0, 240, 500);

    disp5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    disp5.setForeground(new java.awt.Color(0, 0, 255));
    disp5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    disp5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_volunteer.png"))); // NOI18N
    disp5.setText("ADD VOLUNTEER");
    disp5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    disp5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    disp5.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            disp5MouseClicked(evt);
        }
    });
    display1.add(disp5);
    disp5.setBounds(600, 0, 210, 500);

    disp6.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    disp6.setForeground(new java.awt.Color(0, 51, 255));
    disp6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/get_photo.png"))); // NOI18N
    disp6.setText("RETRIEVE PHOTOS");
    disp6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    disp6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    disp6.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            disp6MouseClicked(evt);
        }
    });
    display1.add(disp6);
    disp6.setBounds(710, 0, 210, 500);

    jPanel35.add(display1);
    display1.setBounds(400, 200, 920, 500);

    display2.setBackground(new java.awt.Color(0, 0, 0));
    display2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
    display2.setMinimumSize(new java.awt.Dimension(920, 500));
    display2.setPreferredSize(new java.awt.Dimension(920, 500));
    display2.setLayout(null);

    displ1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    displ1.setForeground(new java.awt.Color(0, 51, 204));
    displ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timetable.jpg"))); // NOI18N
    displ1.setText("TIMETABLE");
    displ1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    displ1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    displ1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            displ1MouseClicked(evt);
        }
    });
    display2.add(displ1);
    displ1.setBounds(0, 0, 260, 470);

    displ2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    displ2.setForeground(new java.awt.Color(0, 51, 204));
    displ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_books.jpg"))); // NOI18N
    displ2.setText("ADD BOOKS");
    displ2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    displ2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    displ2.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            displ2MouseClicked(evt);
        }
    });
    display2.add(displ2);
    displ2.setBounds(140, 0, 230, 470);

    displ3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    displ3.setForeground(new java.awt.Color(0, 0, 255));
    displ3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_student.png"))); // NOI18N
    displ3.setText("ADD STUDENT");
    displ3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    displ3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    displ3.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            displ3MouseClicked(evt);
        }
    });
    display2.add(displ3);
    displ3.setBounds(290, 0, 220, 470);

    displ4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    displ4.setForeground(new java.awt.Color(0, 0, 255));
    displ4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_progress.png"))); // NOI18N
    displ4.setText("STUDENT PROGRESS");
    displ4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    displ4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    displ4.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            displ4MouseClicked(evt);
        }
    });
    display2.add(displ4);
    displ4.setBounds(410, 0, 200, 500);

    displ5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    displ5.setForeground(new java.awt.Color(0, 51, 255));
    displ5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/value.png"))); // NOI18N
    displ5.setText("ADD VALUE");
    displ5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    displ5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    displ5.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            displ5MouseClicked(evt);
        }
    });
    display2.add(displ5);
    displ5.setBounds(510, 0, 200, 470);

    displ6.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    displ6.setForeground(new java.awt.Color(0, 0, 255));
    displ6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book_track.png"))); // NOI18N
    displ6.setText("BOOK TRACKING");
    displ6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    displ6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    displ6.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            displ6MouseClicked(evt);
        }
    });
    display2.add(displ6);
    displ6.setBounds(590, 0, 180, 470);

    displ7.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    displ7.setForeground(new java.awt.Color(0, 0, 255));
    displ7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/get_photo.png"))); // NOI18N
    displ7.setText("RETRIEVE PHOTOS");
    displ7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    displ7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    displ7.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            displ7MouseClicked(evt);
        }
    });
    display2.add(displ7);
    displ7.setBounds(670, 0, 190, 470);

    jPanel35.add(display2);
    display2.setBounds(400, 200, 920, 500);

    selection2.setBackground(new java.awt.Color(0, 0, 0));
    selection2.setLayout(null);

    choo1.setBackground(new java.awt.Color(0, 0, 0));
    buttonGroup4.add(choo1);
    choo1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            choo1ActionPerformed(evt);
        }
    });
    selection2.add(choo1);
    choo1.setBounds(0, 0, 40, 40);

    choo2.setBackground(new java.awt.Color(0, 0, 0));
    buttonGroup4.add(choo2);
    choo2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            choo2ActionPerformed(evt);
        }
    });
    selection2.add(choo2);
    choo2.setBounds(40, 0, 40, 40);

    choo3.setBackground(new java.awt.Color(0, 0, 0));
    buttonGroup4.add(choo3);
    choo3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            choo3ActionPerformed(evt);
        }
    });
    selection2.add(choo3);
    choo3.setBounds(80, 0, 40, 40);

    choo4.setBackground(new java.awt.Color(0, 0, 0));
    buttonGroup4.add(choo4);
    choo4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            choo4ActionPerformed(evt);
        }
    });
    selection2.add(choo4);
    choo4.setBounds(120, 0, 40, 40);

    choo5.setBackground(new java.awt.Color(0, 0, 0));
    buttonGroup4.add(choo5);
    choo5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            choo5ActionPerformed(evt);
        }
    });
    selection2.add(choo5);
    choo5.setBounds(160, 0, 40, 40);

    choo6.setBackground(new java.awt.Color(0, 0, 0));
    buttonGroup4.add(choo6);
    choo6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            choo6ActionPerformed(evt);
        }
    });
    selection2.add(choo6);
    choo6.setBounds(200, 0, 40, 40);

    choo7.setBackground(new java.awt.Color(0, 0, 0));
    buttonGroup4.add(choo7);
    choo7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            choo7ActionPerformed(evt);
        }
    });
    selection2.add(choo7);
    choo7.setBounds(240, 0, 40, 40);

    jPanel35.add(selection2);
    selection2.setBounds(710, 830, 290, 40);

    javax.swing.GroupLayout activitiesLayout = new javax.swing.GroupLayout(activities.getContentPane());
    activities.getContentPane().setLayout(activitiesLayout);
    activitiesLayout.setHorizontalGroup(
        activitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(activitiesLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, 1489, Short.MAX_VALUE))
    );
    activitiesLayout.setVerticalGroup(
        activitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
    );

    activities1.setMinimumSize(new java.awt.Dimension(1495, 978));
    activities1.addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowActivated(java.awt.event.WindowEvent evt) {
            activities1WindowActivated(evt);
        }
    });

    jPanel37.setBackground(new java.awt.Color(0, 0, 0));
    jPanel37.setLayout(null);

    jLabel118.setBackground(new java.awt.Color(255, 255, 255));
    jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activities_admin1.jpg"))); // NOI18N
    jLabel118.setOpaque(true);
    jPanel37.add(jLabel118);
    jLabel118.setBounds(60, 30, 150, 150);

    jButton66.setBackground(new java.awt.Color(0, 153, 204));
    jButton66.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton66.setText("LOGOUT");
    jButton66.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton66ActionPerformed(evt);
        }
    });
    jPanel37.add(jButton66);
    jButton66.setBounds(1190, 90, 150, 30);

    jLabel119.setBackground(new java.awt.Color(0, 153, 204));
    jLabel119.setOpaque(true);
    jPanel37.add(jLabel119);
    jLabel119.setBounds(190, 70, 1180, 70);

    jPanel38.setBackground(new java.awt.Color(0, 153, 204));
    jPanel38.setLayout(null);

    jLabel120.setFont(new java.awt.Font("Times New Roman", 1, 52)); // NOI18N
    jLabel120.setForeground(new java.awt.Color(0, 0, 0));
    jLabel120.setText("WELCOME");
    jPanel38.add(jLabel120);
    jLabel120.setBounds(10, 100, 310, 80);

    jLabel121.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
    jLabel121.setForeground(new java.awt.Color(0, 0, 0));
    jLabel121.setText("to");
    jPanel38.add(jLabel121);
    jLabel121.setBounds(230, 240, 60, 40);

    jLabel122.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
    jLabel122.setForeground(new java.awt.Color(0, 0, 0));
    jLabel122.setText("USER PORTAL");
    jPanel38.add(jLabel122);
    jLabel122.setBounds(60, 330, 260, 100);

    jPanel37.add(jPanel38);
    jPanel38.setBounds(60, 200, 330, 630);

    display4.setBackground(new java.awt.Color(0, 0, 0));
    display4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
    display4.setMinimumSize(new java.awt.Dimension(920, 500));
    display4.setLayout(null);

    displ8.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    displ8.setForeground(new java.awt.Color(0, 51, 204));
    displ8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timetable.jpg"))); // NOI18N
    displ8.setText("CREATE SESSION PLAN");
    displ8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    displ8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    displ8.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            displ8MouseClicked(evt);
        }
    });
    display4.add(displ8);
    displ8.setBounds(0, 0, 260, 500);

    displ9.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    displ9.setForeground(new java.awt.Color(0, 51, 204));
    displ9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendance.png"))); // NOI18N
    displ9.setText("ATTENDANCE");
    displ9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    displ9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    displ9.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            displ9MouseClicked(evt);
        }
    });
    display4.add(displ9);
    displ9.setBounds(200, 0, 230, 500);

    displ10.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    displ10.setForeground(new java.awt.Color(0, 0, 255));
    displ10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upload.png"))); // NOI18N
    displ10.setText("UPLOAD PHOTOS");
    displ10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    displ10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    displ10.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            displ10MouseClicked(evt);
        }
    });
    display4.add(displ10);
    displ10.setBounds(340, 10, 220, 490);

    displ11.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    displ11.setForeground(new java.awt.Color(0, 0, 255));
    displ11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_info.png"))); // NOI18N
    displ11.setText("UPDATING STUDENT PROFILE");
    displ11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    displ11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    displ11.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            displ11MouseClicked(evt);
        }
    });
    display4.add(displ11);
    displ11.setBounds(460, 0, 200, 500);

    displ12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    displ12.setForeground(new java.awt.Color(0, 0, 255));
    displ12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel.png"))); // NOI18N
    displ12.setText("CANCEL SESSION");
    displ12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    displ12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    displ12.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            displ12MouseClicked(evt);
        }
    });
    display4.add(displ12);
    displ12.setBounds(600, 0, 210, 500);

    jPanel37.add(display4);
    display4.setBounds(400, 200, 830, 500);

    selection4.setBackground(new java.awt.Color(0, 0, 0));
    selection4.setLayout(null);

    choo8.setBackground(new java.awt.Color(0, 0, 0));
    buttonGroup5.add(choo8);
    choo8.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            choo8ActionPerformed(evt);
        }
    });
    selection4.add(choo8);
    choo8.setBounds(0, 0, 40, 40);

    choo9.setBackground(new java.awt.Color(0, 0, 0));
    buttonGroup5.add(choo9);
    choo9.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            choo9ActionPerformed(evt);
        }
    });
    selection4.add(choo9);
    choo9.setBounds(40, 0, 40, 40);

    choo10.setBackground(new java.awt.Color(0, 0, 0));
    buttonGroup5.add(choo10);
    choo10.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            choo10ActionPerformed(evt);
        }
    });
    selection4.add(choo10);
    choo10.setBounds(80, 0, 40, 40);

    choo11.setBackground(new java.awt.Color(0, 0, 0));
    buttonGroup5.add(choo11);
    choo11.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            choo11ActionPerformed(evt);
        }
    });
    selection4.add(choo11);
    choo11.setBounds(120, 0, 40, 40);

    choo12.setBackground(new java.awt.Color(0, 0, 0));
    buttonGroup5.add(choo12);
    choo12.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            choo12ActionPerformed(evt);
        }
    });
    selection4.add(choo12);
    choo12.setBounds(160, 0, 40, 40);

    jPanel37.add(selection4);
    selection4.setBounds(720, 760, 210, 40);

    javax.swing.GroupLayout activities1Layout = new javax.swing.GroupLayout(activities1.getContentPane());
    activities1.getContentPane().setLayout(activities1Layout);
    activities1Layout.setHorizontalGroup(
        activities1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(activities1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, 1489, Short.MAX_VALUE))
    );
    activities1Layout.setVerticalGroup(
        activities1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
    );

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setIconImage(new ImageIcon("F:\\photos_bookwallah\\logo1.jpg").getImage());
    setMinimumSize(new java.awt.Dimension(951, 702));
    addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowActivated(java.awt.event.WindowEvent evt) {
            formWindowActivated(evt);
        }
    });

    jPanel1.setLayout(null);

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login8.jpg"))); // NOI18N
    jPanel1.add(jLabel1);
    jLabel1.setBounds(0, 0, 470, 700);

    jLabel3.setFont(new java.awt.Font("Cambria", 3, 48)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setLabelFor(jLabel2);
    jLabel3.setText("LOGIN HERE");
    jPanel1.add(jLabel3);
    jLabel3.setBounds(560, 90, 320, 80);

    jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setText("Enter Username:");
    jPanel1.add(jLabel4);
    jLabel4.setBounds(500, 210, 150, 22);
    jPanel1.add(t1);
    t1.setBounds(570, 240, 240, 30);

    jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    jLabel5.setText("Enter password:");
    jPanel1.add(jLabel5);
    jLabel5.setBounds(500, 310, 160, 22);
    jPanel1.add(p1);
    p1.setBounds(560, 350, 250, 30);

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login4.jpg"))); // NOI18N
    jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jButton1MouseClicked(evt);
        }
    });
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });
    jPanel1.add(jButton1);
    jButton1.setBounds(590, 410, 110, 130);

    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login5.png"))); // NOI18N
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });
    jPanel1.add(jButton2);
    jButton2.setBounds(770, 410, 110, 130);

    jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("ADMIN LOGIN");
    jPanel1.add(jLabel6);
    jLabel6.setBounds(600, 550, 110, 20);

    jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 255, 255));
    jLabel7.setText("VOLUNTEER LOGIN");
    jLabel7.setToolTipText("");
    jPanel1.add(jLabel7);
    jLabel7.setBounds(760, 550, 160, 18);

    check.setForeground(new java.awt.Color(255, 255, 255));
    check.setText("show password");
    check.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            checkActionPerformed(evt);
        }
    });
    jPanel1.add(check);
    check.setBounds(820, 350, 120, 30);

    jButton13.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
    jButton13.setText("EXIT");
    jButton13.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton13ActionPerformed(evt);
        }
    });
    jPanel1.add(jButton13);
    jButton13.setBounds(690, 670, 63, 34);

    jButton55.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton55.setText("APPLY FOR VOLUNTEER");
    jButton55.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton55ActionPerformed(evt);
        }
    });
    jPanel1.add(jButton55);
    jButton55.setBounds(600, 570, 260, 38);

    jButton61.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
    jButton61.setText("FORGOT PASSWORD");
    jButton61.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton61ActionPerformed(evt);
        }
    });
    jPanel1.add(jButton61);
    jButton61.setBounds(620, 620, 210, 38);

    jLabel2.setBackground(new java.awt.Color(0, 51, 204));
    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login2.jpg"))); // NOI18N
    jPanel1.add(jLabel2);
    jLabel2.setBounds(470, 0, 480, 700);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    /*Admin login has two types
      1. HR login
      2. Project Head login
      Both the logins have accessiblity to different tasks. Therefore they are bifurcated here and the tasks are also divided.*/
        try
          {
            user=t1.getText();   //accepting username 
            pass=new String(p1.getPassword());     //accepting password
            String query="Select * from admin_login where username='"+user+"'and password='"+pass+"';";   //checking for correct password entered from the backend
            System.out.println(query);
            rs=stmt.executeQuery(query);
            while(rs.next())
            {
                //hr login
                if((rs.getString(3)).equals("HR"))
                 {
                     this.dispose();
                     activities.setVisible(true);
                     activities.setLocationRelativeTo(null);
                     selection1.setVisible(true);
                     selection2.setVisible(false);
                     display1.setVisible(true);
                     display2.setVisible(false);
                     disp1.setVisible(true);
                     disp2.setVisible(false);
                     disp3.setVisible(false);
                     disp4.setVisible(false);
                     disp5.setVisible(false);
                     disp6.setVisible(false);    
                     cho1.setSelected(true);
                     t1.setText("");
                     p1.setText("");
                 }
                //project head login
                else if((rs.getString(3)).equals("PROJECT HEAD"))
                    {
                      this.dispose();
                     activities.setVisible(true);
                     activities.setLocationRelativeTo(null);
                     selection1.setVisible(false);
                     selection2.setVisible(true);
                     display1.setVisible(false);
                     display2.setVisible(true);
                     displ1.setVisible(true);
                     displ2.setVisible(false);
                     displ3.setVisible(false);
                     displ4.setVisible(false);
                     displ5.setVisible(false);
                     displ6.setVisible(false);  
                     displ7.setVisible(false);
                     choo1.setSelected(true);
                     t1.setText("");
                     p1.setText("");      
                    }
                //relogin if login previously failed 
                 else
                   {
                 JOptionPane.showMessageDialog(null,"login not successful TRY AGAIN");
                 t1.setText("");
                 p1.setText("");
                   }
            }  
                 

           }
        catch(Exception e)
           {
            JOptionPane.showMessageDialog(null,e.getMessage());
           }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        table1.setVisible(true);
        table2.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void test3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_test3ActionPerformed
        timechooser.setVisible(true);
        timechooser.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_test3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        /*Time is choosen from the spinners*/
        timechooser.setVisible(false);
        jPanel4.setVisible(true);
        table1.setVisible(false);
        table2.setVisible(false);
        test1.setVisible(true);
        test2.setVisible(true);
        test3.setVisible(false);
        test4.setVisible(true);
        int h1=(Integer)(s1.getValue());
        int m1=(Integer)(s2.getValue());
        int se1=(Integer)(s3.getValue());
        int h2=(Integer)(s4.getValue());
        int m2=(Integer)(s5.getValue());
        int se2=(Integer)(s6.getValue());
        String a=c1.getSelectedItem().toString();
        String b=c2.getSelectedItem().toString();
        if("PM".equals(a))
            h1=h1+12;
        if("PM".equals(b))
            h2=h2+12;
        time1=h1+":"+m1+":"+se1;
        time2=h2+":"+m2+":"+se2;
        test1.setText(time1);
        test2.setText(time2);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void test4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_test4ActionPerformed
timechooser.setVisible(true);
test1.setText("");
test2.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_test4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    /* Checking for different active volunteers and providing them with their own tasks*/
        try
          {
            user=t1.getText();
            String pass=new String(p1.getPassword());
            String query="Select * from volunteer_login where username='"+user+"'and password='"+pass+"';";
            System.out.println(query);
            rs=stmt.executeQuery(query);
            //volunteer login
            if(rs.first())
              {
                 activities1.setVisible(true);
                 t1.setText("");
                 p1.setText("");
                 this.dispose();
              }
            //re-login if login previously failed
            else
              {
                 JOptionPane.showMessageDialog(null,"login not successful TRY AGAIN");
                 t1.setText("");
                 p1.setText("");
              }
           
           }
        catch(Exception e)
           {
            JOptionPane.showMessageDialog(null,e.getMessage());
           }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
   /* Setting up a connection betwen front end-java and back end-Mysql
   database-Bookwallah
   current password in this pc-1234(change password as per the pc) 
   Include mysql jdbc driver(mysql-connector) in the libraries 
   Also include jDateChooser.jar and jDatePicker.jar in the libraries*/
  try
  {
   Class.forName("java.sql.Driver");
   con=DriverManager.getConnection("jdbc:mysql://localhost/bookwallah","root","1234");
   stmt=con.createStatement();
   this.setLocationRelativeTo(null);
   p1.setEchoChar('\u25CF');
  }

  catch(Exception e)
  {
  }
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void attendanceWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_attendanceWindowActivated
       // TODO add your handling code here:
    }//GEN-LAST:event_attendanceWindowActivated

    private void session_plan1WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_session_plan1WindowActivated
    /*-Making session plan well in advance by the volunteer specifying the details mentioned in the design.
      -The session number is counting the number of sessions in total irrespective of which volunteer held a particular session.
      -The value of the week is seleced automatically according to the date (comes directly from the sql database)
      -The books displayed to be chosen are fed according to the current value of the week for the ease of the volunteer
      -Earlier it was value of the month and then it was changed to value of the week. Therefore the column name in sql is value_of_the_month but the dates can be chosen accordingly
      */
    String value="";
    String book_name="";
    session_plan1.setLocationRelativeTo(null);
    user1.setText(user);
    co1.setSelectedIndex(-1);
    co2.setSelectedIndex(-1);
    co3.setSelectedIndex(-1);
    table1.getSelectionModel().clearSelection();
    DefaultTableModel model=(DefaultTableModel)table1.getModel();
    table1.setRowSelectionAllowed(true);
    table1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    model.setRowCount(0);
    try
    {
        //finding value from database
        String query2="select value_of_the_month from basic where curdate() between start_date and end_date;";
        rs=stmt.executeQuery(query2);
        System.out.println(query2);
        if(rs.next())
            value=rs.getString(1);
        value1.setText(value);
        
        //picking books from the database and adding them in the combobox
        String query3="select book_name from books where value='"+value+"';";
        rs=stmt.executeQuery(query3);
        System.out.println(query3);
        while(rs.next())
        {
            book_name=rs.getString(1);
            co1.addItem(book_name);
            co2.addItem(book_name);
            co3.addItem(book_name);
        }
        
        //selecting students from the database and adding them in the table
        String query="select student_name from attendance;";
        System.out.println(query);
        rs=stmt.executeQuery(query);
        while(rs.next())
        {
            model.addRow(new Object[]{rs.getString(1)});
        }
        
        //accessing session number of the new session from the database
        String query1="select session_number from session_plan;";
        System.out.println(query1);
        rs=stmt.executeQuery(query1);
        if(rs.last())
        {
            count=rs.getInt(1);
        }
        else
            count=0;
        System.out.println(count);
        counter.setText(""+(++count));
    }
    
    catch(Exception e)
    {
        
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_session_plan1WindowActivated

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
    /*enabling show password using EchoChar() property*/
    if(check.isSelected()==true)
     {
       p1.setEchoChar((char)0);
     }
    else
     {
       p1.setEchoChar('\u25CF');
     }
        // TODO add your handling code here:
    }//GEN-LAST:event_checkActionPerformed

    private void user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
    //closing the application
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    /*Here all the information is being stored in the database*/
    try
    {
    String t="";
    String n="";
    String value=value1.getText();
    String date=date1.getText();
    String a[]=date.split("/",5);
    if(a[0].length()==1)
        t="0"+a[0];
    else
        t=a[0];
    String dates="20"+a[2]+"-"+a[1]+"-"+t;
        System.out.println(dates);
    String n1=co1.getSelectedItem().toString();
    String n2=co2.getSelectedItem().toString();
    String n3=co3.getSelectedItem().toString();
    String p=pro1.getSelectedItem().toString();
    String query5="select volunteer_name from volunteer_login where username='"+user+"';";
    rs=stmt.executeQuery(query5);
        System.out.println(query5);
    if(rs.next())
    {
        n=rs.getString(1);
    }
    String query="insert into session_plan(session_number,session_head,start_at,end_at,book1,book2,book3,project_place) values("+count+",'"+n+"','"+time1+"','"+time2+"','"+n1+"','"+n2+"','"+n3+"','"+p+"');";
    stmt.executeUpdate(query);
        System.out.println(query);
    String query1="update session_plan set session_date='"+dates+"' where session_number="+count+";";
    stmt.executeUpdate(query1);
        System.out.println(query1);
    String name="Session_"+count;
    String query2="alter table attendance add "+name+" varchar(10);";
    stmt.executeUpdate(query2);
        System.out.println(query2);
 
    int[] selectedrows = table1.getSelectedRows();
     for (int i = 0; i<selectedrows.length; i++)
        {
            System.out.println(selectedrows.toString());
           String query3="update attendance set "+name+"='A1' where student_name='"+table1.getValueAt(selectedrows[i],0).toString()+"';";
           stmt.executeUpdate(query3);
           System.out.println(query3);
        }
     
    session_plan1.dispose();
    JOptionPane.showMessageDialog(null,""+name+" Added successfully");
    activities1.setVisible(true);
    }
    
    catch(Exception e)
    {
        System.out.println(e.getMessage());
        date1.setText("");
        co1.setSelectedIndex(-1);
        co2.setSelectedIndex(-1);
        co3.setSelectedIndex(-1);
        table1.getSelectionModel().clearSelection();
        
        try
        {
           String query="select student_name from attendance;";
           System.out.println(query);
           rs=stmt.executeQuery(query);
           int count1=0;
           if(rs.last())
             {
                count1=rs.getInt(1);
             }
           String name="Session_"+count1;
           String query1="alter table attendance drop column "+name+";";
           stmt.executeUpdate(query1);
           System.out.println(query1);
           counter.setText(""+count1);
        }
        
        catch(Exception e1)
        {
            
        }
        session_plan1.setVisible(true);
        jPanel4.setVisible(false);
        test1.setVisible(false);
        test2.setVisible(false);
        test4.setVisible(false);
        test3.setVisible(true);
    }
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void at1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_at1ActionPerformed
    String s=at1.getSelectedItem().toString();
    DefaultTableModel model=(DefaultTableModel)table3.getModel();
    model.setRowCount(0);
    int t;
    try
    {
        
        String query="select student_name from attendance where "+s+"='A1';";
        rs=stmt.executeQuery(query);
        System.out.println(query);
        while(rs.next())
        {
            model.addRow(new Object[]{rs.getString(1)});
        }
    }
    
    catch(Exception e)
    {
        
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_at1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
    /*Extra students are added to the attendance table*/
    String name=JOptionPane.showInputDialog("Please enter student's name: ");
    DefaultTableModel model=(DefaultTableModel)table3.getModel();
    model.addRow(new Object[]{name});
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    /*Attendance will be uploaded in the database
      The students selected in advance by the volunteer are marked A1 in the database 
      The students selected and are present are marked P1
      The students selected and are absent are marked P2
      */
    String s=at1.getSelectedItem().toString();
    int n=s.indexOf("_");
    String m=s.substring(n+1);
    try
    {
        int[] selectedrow = table3.getSelectedRows();
        for (int i = 0; i<selectedrow.length; i++)
        {
            System.out.println(selectedrow.toString());
            String query1="update attendance set "+s+"='P1' where "+s+"='A1' and student_name='"+table3.getValueAt(selectedrow[i],0).toString()+"';";
            stmt.executeUpdate(query1);
            System.out.println(query1);
            String query2="update attendance set "+s+"='P2' where "+s+" is NULL and student_name='"+table3.getValueAt(selectedrow[i],0).toString()+"';";
            stmt.executeUpdate(query2);
            System.out.println(query2);
        }
        
        String query3="update session_plan set status='success' where session_number="+m+";";
        stmt.executeUpdate(query3);
        System.out.println(query3);
        JOptionPane.showMessageDialog(null,"Attendance for "+s+" frozen successfully");
        attendance.dispose();
        activities1.setVisible(true);
    }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void co1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_co1ActionPerformed
    
        // TODO add your handling code here:
    }//GEN-LAST:event_co1ActionPerformed

    private void co2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_co2ActionPerformed
    
        // TODO add your handling code here:
    }//GEN-LAST:event_co2ActionPerformed

    private void co3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_co3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_co3ActionPerformed

    private void co2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_co2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_co2FocusGained

    private void co1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_co1FocusLost
    String a=co1.getSelectedItem().toString();
    co2.removeItem(a);
        // TODO add your handling code here:
    }//GEN-LAST:event_co1FocusLost

    private void co2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_co2FocusLost
    String a=co1.getSelectedItem().toString();
    String b=co2.getSelectedItem().toString();
    co3.removeItem(a);
    co3.removeItem(b);
        // TODO add your handling code here:
    }//GEN-LAST:event_co2FocusLost

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
   /*Student name accepted*/
    panel1.setVisible(true);
    String name=input.getText();
    String text="";
    try
    {
        String query="select comments from student where student_name='"+name+"';";
        rs=stmt.executeQuery(query);
        System.out.println(query);
        if(rs.next())
        {
            text=rs.getString(1);
            ta1.setText(text);
        }
    }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void student_infoWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_student_infoWindowActivated
    student_info.setLocationRelativeTo(null);
    panel1.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_student_infoWindowActivated

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
    /*Behaviour information about students*/
    String name=input.getText();
    String text=ta1.getText();
    String text2=ta2.getText();
    text=text+"\n"+text2;
    try
    {
        String query1="update student set comments='"+text+"' where student_name='"+name+"';";
        stmt.executeUpdate(query1);
        System.out.println(query1);
        JOptionPane.showMessageDialog(null,name+"'s information added successfully");
        ta1.setText("");
        ta2.setText("");
    }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
        ta1.setText("");
        ta2.setText("");
    }
    
    student_info.dispose();
    input.setText("");
    activities1.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void reviewing_attendanceWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_reviewing_attendanceWindowActivated
    
        // TODO add your handling code here:
    }//GEN-LAST:event_reviewing_attendanceWindowActivated

    private void datesOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_datesOnSelectionChange
    
        // TODO add your handling code here:
    }//GEN-LAST:event_datesOnSelectionChange

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
    /*Accepting date from the user*/
    DefaultTableModel model1=(DefaultTableModel)table4.getModel();
    String t="";
    String s="";
    int n=0;
    String date=dates.getText();
    String a[]=date.split("/",5);
    if(a[0].length()==1)
        t="0"+a[0];
    else
        t=a[0];
    String date1="20"+a[2]+"-"+a[1]+"-"+t;
        System.out.println(date1);
        System.out.println(date1);
    try
    {
        String query4="select session_number from session_plan where session_date='"+date1+"';";
        rs=stmt.executeQuery(query4);
        System.out.println(query4);
        while(rs.next())
        {
            int no=rs.getInt(1);
            String x="Session_"+no;
            sessions.addItem(x);
        }
        
    }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void r1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_r1ItemStateChanged
    
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ItemStateChanged

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
    DefaultTableModel model=(DefaultTableModel)tableA.getModel();
    jPanel12.setVisible(true);
    z3.setVisible(false);
    z4.setVisible(false);
    z1.setVisible(true);
    z2.setVisible(true);
    bo1.setVisible(true);
    bo2.setVisible(false);
    tableB.setVisible(false);
    jPanel22.setVisible(false);
    tableA.setVisible(true);
    jPanel21.setVisible(true);
    try
    {
        String query="select name from volunteer_info where status='Active';";
        rs=stmt.executeQuery(query);
        System.out.println(query);
        while(rs.next())
        {
            z2.addItem(rs.getString("name"));
        }
    }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }    
    
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void z2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_z2ItemStateChanged
    
        // TODO add your handling code here:
    }//GEN-LAST:event_z2ItemStateChanged

    private void z2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z2ActionPerformed
    
        // TODO add your handling code here:
    }//GEN-LAST:event_z2ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
    jPanel12.setVisible(true);
    z1.setVisible(false);
    z2.setVisible(false);
    z3.setVisible(true);
    z4.setVisible(true);
    DefaultTableModel model=(DefaultTableModel)tableB.getModel();
    bo2.setVisible(true);
    bo1.setVisible(false);
    tableA.setVisible(false);
    jPanel21.setVisible(false);
    tableB.setVisible(true);
    jPanel22.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
    timetable.dispose();
    try
          {
            
            String query="Select * from admin_login where username='"+user+"'and password='"+pass+"';";
            System.out.println(query);
            rs=stmt.executeQuery(query);
            while(rs.next())
            {
                
                if((rs.getString(3)).equals("HR"))
                 {
                    activities.setVisible(true);
                    activities.setLocationRelativeTo(null);
                    timetable.dispose();
                    selection1.setVisible(true);
                    selection2.setVisible(false);
                    display1.setVisible(true);
                    display2.setVisible(false);
                    disp1.setVisible(true);
                    disp2.setVisible(false);
                    disp3.setVisible(false);
                    disp4.setVisible(false);
                    disp5.setVisible(false);
                    disp6.setVisible(false);    
                    cho1.setSelected(true);
                 }
                 
                else if((rs.getString(3)).equals("PROJECT HEAD"))
                    {
                        activities.setVisible(true);
                        activities.setLocationRelativeTo(null);
                        timetable.dispose();
                        selection1.setVisible(false);
                        selection2.setVisible(true);
                        display1.setVisible(false);
                        display2.setVisible(true);
                        displ1.setVisible(true);
                        displ2.setVisible(false);
                         displ3.setVisible(false);
                        displ4.setVisible(false);
                        displ5.setVisible(false);
                        displ6.setVisible(false);
                        displ7.setVisible(false);  
                        choo1.setSelected(true);                       
                    }
                
                 else
                   {
                 JOptionPane.showMessageDialog(null,"login not successful TRY AGAIN");
                   }
            }  
                 

           }
        catch(Exception e)
           {
            JOptionPane.showMessageDialog(null,e.getMessage());
           }
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void z4OnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_z4OnSelectionChange
        
        // TODO add your handling code here:
    }//GEN-LAST:event_z4OnSelectionChange

    private void y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y2ActionPerformed

    private void volunteer_infoWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_volunteer_infoWindowActivated
    try
    {
        String query="select name from volunteer_info;";
        rs=stmt.executeQuery(query);
        System.out.println(query);
        while(rs.next())
        {
            y1.addItem(rs.getString(1));
        }
        
        String query1="select name from volunteer_info;";
        rs=stmt.executeQuery(query1);
        System.out.println(query1);
        while(rs.next())
        {
            y1.addItem(rs.getString(1));
        }
    }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }    
        
        // TODO add your handling code here:
    }//GEN-LAST:event_volunteer_infoWindowActivated

    private void y1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_y1ItemStateChanged
    /*All the information of a particular volunteer can be retrieved from here*/
    String a=y1.getSelectedItem().toString();
    try
    {
        String query="select * from volunteer_info where name='"+a+"';";
        rs=stmt.executeQuery(query);
        System.out.println(query);
        if(rs.next())
        {
            String date=rs.getString(2);
            String i=rs.getString(4);
            String s=rs.getString(5);
            y2.setText(a);
            y3.setText(date);
            y4.setText(i);
            if(s.equals("Active"))
                y5.setText("Yes");
            else
                y5.setText("No");
        }
    }
    
    catch(Exception e)
    {
        
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_y1ItemStateChanged

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
    /*The working institution and the status of the volunteer is being updated*/
    jPanel15.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
    /*Making the final change in the database*/
    String n=y2.getText();
    String i=y6.getText();
    String s=y7.getSelectedItem().toString();
    String s1;
    if(s.equals("Yes"))
        s1="Active";
    else
        s1="Inactive";
    try
    {
        String query="update volunteer_info set working_institution_name='"+i+"',status='"+s1+"' where name='"+n+"';";
        stmt.executeUpdate(query);
        System.out.println(query);
        JOptionPane.showMessageDialog(null,"Infomation updated successfully");
        volunteer_info.dispose();
        activities.setVisible(true);
        activities.setLocationRelativeTo(null);
        selection1.setVisible(true);
        selection2.setVisible(false);
        display1.setVisible(true);
        display2.setVisible(false);
        disp1.setVisible(true);
        disp2.setVisible(false);
        disp3.setVisible(false);
        disp4.setVisible(false);
        disp5.setVisible(false);
        disp6.setVisible(false);    
        cho1.setSelected(true);
    }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
    volunteer_info.dispose();
    activities.setVisible(true);
        activities.setLocationRelativeTo(null);
        selection1.setVisible(true);
        selection2.setVisible(false);
        display1.setVisible(true);
        display2.setVisible(false);
        disp1.setVisible(true);
        disp2.setVisible(false);
        disp3.setVisible(false);
        disp4.setVisible(false);
        disp5.setVisible(false);
        disp6.setVisible(false);    
        cho1.setSelected(true);
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void volunteer_infoWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_volunteer_infoWindowOpened
    
        // TODO add your handling code here:
    }//GEN-LAST:event_volunteer_infoWindowOpened

    private void student_info_fullWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_student_info_fullWindowActivated
    jPanel17.setVisible(false);
    
    try
    {
        String query="select student_name from student;";
        rs=stmt.executeQuery(query);
        System.out.println(query);
        while(rs.next())
        {
            x1.addItem(rs.getString(1));
        }
    }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_student_info_fullWindowActivated

    private void x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1ActionPerformed
    /*Student imformation is being displayed according to prior logins*/
    jPanel17.setVisible(true);
    String n=x1.getSelectedItem().toString();
    x2.setText(n);
    try
    {
        String query="select age,date_of_joining from student where student_name='"+n+"';";
        rs=stmt.executeQuery(query);
        System.out.println(query);
        while(rs.next())
        {
            int a=rs.getInt(1);
            x4.setText(""+a);
            String d=rs.getString(2);
            x3.setText(d);
        }
    
        String text="";
        String query1="select comments from student where student_name='"+n+"';";
        rs=stmt.executeQuery(query1);
        System.out.println(query1);
        if(rs.next())
        {
            text=rs.getString(1);
            x7.setText(text);
        }
     }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_x1ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
    x2.setText("");
    x3.setText("");
    x4.setText("");
    try
          {
           String query="Select * from admin_login where username='"+user+"'and password='"+pass+"';";
            System.out.println(query);
            rs=stmt.executeQuery(query);
            while(rs.next())
            {
                
                if((rs.getString(3)).equals("HR"))
                 {
                    activities.setVisible(true);
                    activities.setLocationRelativeTo(null);
                    selection1.setVisible(true);
                    selection2.setVisible(false);
                    display1.setVisible(true);
                    display2.setVisible(false);
                    disp1.setVisible(true);
                    disp2.setVisible(false);
                    disp3.setVisible(false);
                    disp4.setVisible(false);
                    disp5.setVisible(false);
                    disp6.setVisible(false);    
                    cho1.setSelected(true);
                    student_info_full.dispose();
                 }
                 
                else if((rs.getString(3)).equals("PROJECT HEAD"))
                 {
                    activities.setVisible(true);
                    activities.setLocationRelativeTo(null);                    
                    selection1.setVisible(false);
                    selection2.setVisible(true);
                    display1.setVisible(false);
                    display2.setVisible(true);
                    displ1.setVisible(true);
                    displ2.setVisible(false);
                    displ3.setVisible(false);
                    displ4.setVisible(false);
                    displ5.setVisible(false);
                    displ6.setVisible(false);
                    displ7.setVisible(false);  
                    choo1.setSelected(true);                       
                       student_info_full.dispose();     
                 }  
            }
         }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
    /*Adding new volunteers and their details*/
    String n=w1.getText();
    String d1=w2.getText();
    String t="";
    String a[]=d1.split("/",5);
    if(a[0].length()==1)
        t="0"+a[0];
    else
        t=a[0];
    String d2="20"+a[2]+"-"+a[1]+"-"+t;
    String d3=w4.getText();
    String t1="";
    String a1[]=d3.split("/",5);
    if(a1[0].length()==1)
        t1="0"+a[0];
    else
        t1=a[0];
    String d4="20"+a1[2]+"-"+a1[1]+"-"+t1;
    String i=w3.getText();
    String l=w5.getText();
    try
    {
        String query="insert into volunteer_info values('"+l+"','"+d2+"','"+n+"','"+i+"','Active','"+d4+"');";
        stmt.executeUpdate(query);
        System.out.println(query);
        
        String query1="insert into volunteer_login values('"+l+"','1234','"+n+"');";
        stmt.executeUpdate(query1);
        System.out.println(query1);
        
        JOptionPane.showMessageDialog(null,"Added Successfully");
        activities.setVisible(true);
        add_volunteer.dispose();
        w1.setText("");
        w3.setText("");
        w5.setText("");
    }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
    /*Adding new students and their details in the database*/
    String n =v1.getText();  
    int a=(Integer)(v2.getValue());
    String d1=v3.getText();
    String t="";
    String a1[]=d1.split("/",5);
    if(a1[0].length()==1)
        t="0"+a1[0];
    else
        t=a1[0];
    String d2="20"+a1[2]+"-"+a1[1]+"-"+t;
    String c=v4.getText();
    try
    {
        String query="insert into student values('"+n+"',"+a+",'"+d2+"','"+c+"');";
        stmt.executeUpdate(query);
        System.out.println(query);
        JOptionPane.showMessageDialog(null,"Student Added Successfully");
        v1.setText("");
        v2.setValue(0);
        v4.setText("");
        add_student.dispose();
        activities.setVisible(true);
    }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
    attendance.dispose();
    activities1.setVisible(true);
    activities1.setLocationRelativeTo(null);
    a2.setText("");
    a3.setText("");
    table3.removeAll();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton38ActionPerformed

    private void timetableWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_timetableWindowActivated
    jPanel12.setVisible(false);
    r1.setSelected(false);
    r2.setSelected(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_timetableWindowActivated

    private void bo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo1ActionPerformed
    /*Timetable display according to volunteer*/
    String name1=z2.getSelectedItem().toString();
    DefaultTableModel model=(DefaultTableModel)tableA.getModel();
    try
    {
        String query="select session_date,start_at,end_at,status from session_plan where session_head='"+name1+"';";
        rs=stmt.executeQuery(query);
        System.out.println(query);
        while(rs.next())
        {
            String d=rs.getString(1);
            String t1=rs.getString(2);
            String t2=rs.getString(3);
            String t3=t1+" - "+t2;
            String s=rs.getString(4);
            model.addRow(new Object[]{d,t3,s});
        }
    }
    
    catch(Exception e)
    {
       JOptionPane.showMessageDialog(null,e.getMessage());
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_bo1ActionPerformed

    private void bo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo2ActionPerformed
    DefaultTableModel model=(DefaultTableModel)tableB.getModel();
   /*Time table display according to date*/
    String d1=z4.getText();
    String t="";
    String a[]=d1.split("/",5);
    if(a[0].length()==1)
        t="0"+a[0];
    else
        t=a[0];
    String d2="20"+a[2]+"-"+a[1]+"-"+t;
    try
    {
        String query="select session_head,start_at,end_at,status from session_plan where session_date='"+d2+"';";
        rs=stmt.executeQuery(query);
        System.out.println(query);
        while(rs.next())
        {
            String d=rs.getString(1);
            String t1=rs.getString(2);
            String t2=rs.getString(3);
            String t3=t1+" - "+t2;
            String s=rs.getString(4);
            model.addRow(new Object[]{d,t3,s});
        }
    }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_bo2ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
    /*Adding value of the week */
    try
    {
    String t="";
    String t1="";
    String value=u3.getText();
    String date=u1.getText();
    String a[]=date.split("/",5);
    if(a[0].length()==1)
        t="0"+a[0];
    else
        t=a[0];
    String dates="20"+a[2]+"-"+a[1]+"-"+t;
        
    String date1=u2.getText();
    String a1[]=date1.split("/",5);
    if(a1[0].length()==1)
        t1="0"+a1[0];
    else
        t1=a1[0];
    String dates1="20"+a1[2]+"-"+a1[1]+"-"+t1;
        System.out.println(dates);
        String query="insert into basic values('"+value+"','"+dates+"','"+dates1+"');";
        stmt.executeUpdate(query);
        System.out.println(query);
        JOptionPane.showMessageDialog(null,"Added Successfully");
        value_week.dispose();
        activities.setVisible(true);
        activities.setLocationRelativeTo(null);
        u2.setText("");
        u3.setText("");
    }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton39ActionPerformed

    private void q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q2ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
    /*Adding new books to the database*/
    String a=q1.getText();
    String b=q2.getText();
    String c=q3.getText();
    try
    {
        String query="insert into books values('"+a+"','"+b+"','"+c+"');";
        stmt.executeUpdate(query);
        System.out.println(query);
        JOptionPane.showMessageDialog(null,"Added Succesfully");
        q1.setText("");
        q2.setText("");
        q3.setText("");
        add_books.dispose();
        activities.setVisible(true);
        activities.setLocationRelativeTo(null);
    }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
    if(user.equals("HR"))
    {
        activities.setVisible(true);
        activities.setLocationRelativeTo(null);
        reviewing_attendance.dispose();
        selection1.setVisible(true);
        selection2.setVisible(false);
        display1.setVisible(true);
        display2.setVisible(false);
        disp1.setVisible(true);
        disp2.setVisible(false);
        disp3.setVisible(false);
        disp4.setVisible(false);
        disp5.setVisible(false);
        disp6.setVisible(false);    
        cho1.setSelected(true);
    }
    
    if(user.equals("PROJECT HEAD"))
    {
        activities.setVisible(true);
        activities.setLocationRelativeTo(null);
        reviewing_attendance.dispose();
        selection1.setVisible(false);
        selection2.setVisible(true);
        display1.setVisible(false);
        display2.setVisible(true);
        displ1.setVisible(true);
        displ2.setVisible(false);
        displ3.setVisible(false);
        displ4.setVisible(false);
        displ5.setVisible(false);
        displ6.setVisible(false);
        displ7.setVisible(false);  
        choo1.setSelected(true);
    }
    
    head.setText("");
    tim1.setText("");
    tim2.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton43ActionPerformed

    private void volunteer_infoWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_volunteer_infoWindowStateChanged
    
        // TODO add your handling code here:
    }//GEN-LAST:event_volunteer_infoWindowStateChanged

    private void y1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_y1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_y1MouseClicked

    private void y1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_y1MousePressed
    int count=0;
    if(count==0)
    {
        y1.removeItemAt(0);
        count=1;
    }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_y1MousePressed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
    session_plan1.dispose();
    activities1.setVisible(true);
    activities1.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void sessionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sessionsActionPerformed
     
        // TODO add your handling code here:
    }//GEN-LAST:event_sessionsActionPerformed

    private void sessionsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sessionsItemStateChanged
    
        // TODO add your handling code here:
    }//GEN-LAST:event_sessionsItemStateChanged

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
    /*Depicting session number
      Timing of each session
      Student present or absent in a session are shown here*/
    DefaultTableModel model1=(DefaultTableModel)table4.getModel();
    model1.setRowCount(0);
    String t="";
    String s="";
    int n=0;
    String date=dates.getText();
    String a[]=date.split("/",5);
    if(a[0].length()==1)
        t="0"+a[0];
    else
        t=a[0];
    String date1="20"+a[2]+"-"+a[1]+"-"+t;
        System.out.println(date1);
        System.out.println(date1);
        String x=sessions.getSelectedItem().toString();
        int i=x.indexOf("_");
        String m=x.substring(i+1);
    try
    {
        
        String query="select session_head,start_at,end_at from session_plan where session_number="+m+";";
        rs=stmt.executeQuery(query);
        System.out.println(query);
        if(rs.first())
        {
            String name=rs.getString(1);
            head.setText(name);
            String time1=rs.getString(2);
            tim1.setText(time1);
            String time2=rs.getString(3);
            tim2.setText(time2);
        }
      
        String query1="select student_name from attendance where "+x+"='P1';";
        rs1=stmt.executeQuery(query1);
        System.out.println(query1);
        while(rs1.next())
            {
                String student=rs1.getString(1);
                String text="<html><body><font color=\"white\">"+student+"</font></body></html>";
                model1.addRow(new Object[]{text});
            }
            
        String query2="select student_name from attendance where "+x+"='P2';";
        rs2=stmt.executeQuery(query2);
        System.out.println(query2);
        while(rs2.next())
            {
                String student=rs2.getString(1);
                String text="<html><body><font color=\"green\">"+student+"</font></body></html>";
                model1.addRow(new Object[]{text});
            }
            
        String query3="select student_name from attendance where "+x+"='A1';";
        rs3=stmt.executeQuery(query3);
        System.out.println(query3);
        while(rs3.next())
            {
                String student=rs3.getString(1);
                String text="<html><body><font color=\"red\">"+student+"</font></body></html>";
                model1.addRow(new Object[]{text});
            }
    }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }           // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void attendanceWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_attendanceWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_attendanceWindowClosed

    private void attendanceWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_attendanceWindowOpened
    /*Names of the students selected at the time of session plan will be displayed in the table*/
    attendance.setLocationRelativeTo(null);
    table3.setRowSelectionAllowed(true);
    table3.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    int a=0;
    int t1,t2;
    String x="";
    try
    {
        String query3="select volunteer_name from volunteer_login where username='"+user+"';";
        rs=stmt.executeQuery(query3);
        System.out.println(query3);
        if(rs.first())
        {
            x=rs.getString(1);
        }
        String query="select session_number from session_plan where session_head='"+x+"' and session_date=curdate()";
        rs=stmt.executeQuery(query);
        System.out.println(query);
        while(rs.next())
        {
            a=rs.getInt(1);
            String name="Session_"+a;
            at1.addItem(name);
        }
        
        String query2="select session_number from session_plan where session_head='"+x+"' and session_date=curdate()";
        rs=stmt.executeQuery(query2);
        System.out.println(query2);
        while(rs.next())
        {
            a=rs.getInt(1);
            String name="Session_"+a;
            at1.addItem(name);
        }
        
        String query1="select start_at,end_at from session_plan where session_number="+a+";";
        rs=stmt.executeQuery(query1);
        System.out.println(query1);
        if(rs.next())
        {
            a2.setText(rs.getString(1));
            a3.setText(rs.getString(2));
            
        }
    }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_attendanceWindowOpened

    private void tracking_booksWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_tracking_booksWindowActivated
    jPanel27.setVisible(false);
    jPanel28.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_tracking_booksWindowActivated

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
    /*Finding a single book randomly according to the name*/
    n1.setVisible(false);
    n2.setVisible(false);
    m1.setVisible(true);
    m2.setVisible(true);
    m3.setVisible(true);
    m4.setVisible(true);
    m5.setVisible(true);
    m6.setVisible(true);
    m7.setVisible(true);
    m8.setVisible(true);
    m9.setVisible(true);
    m10.setVisible(true);
    jPanel27.setVisible(true);
    jPanel28.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
    /*Finding books according to the value of week*/
    n1.setVisible(true);
    n2.setVisible(true);
    jPanel28.setVisible(true);
    jPanel27.setVisible(true);
    m1.setVisible(false);
    m2.setVisible(false);
    m3.setVisible(false);
    m4.setVisible(false);
    m5.setVisible(false);
    m6.setVisible(false);
    m7.setVisible(false);
    m8.setVisible(false);
    m9.setVisible(false);
    m10.setVisible(false);
    try
    {
        String query="select value_of_the_month from basic;";
        rs=stmt.executeQuery(query);
        System.out.println(query);
        while(rs.next())
        {
            n2.addItem(rs.getString(1));
        }
        
        String query1="select value_of_the_month from basic;";
        rs=stmt.executeQuery(query1);
        System.out.println(query1);
        while(rs.next())
        {
            n2.addItem(rs.getString(1));
        }
        
    }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
          // TODO add your handling code here:
    }//GEN-LAST:event_r4ActionPerformed

    private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2ActionPerformed
    String n=m2.getText();
    try
    {
        String query="select book_publisher,value from books where book_name='"+n+"';";
        rs=stmt.executeQuery(query);
        System.out.println(query);
        if(rs.first())
        {
            m4.setText(rs.getString(2));
            m6.setText(rs.getString(1));
        }
        
        String query1="select session_date,project_place from session_plan where book1='"+n+"' or book2='"+n+"' or book3='"+n+"';";
        rs=stmt.executeQuery(query1);
        System.out.println(query1);
        if(rs.last())
        {
             m8.setText(rs.getString(1));
             m10.setText(rs.getString(2));
        }
    }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_m2ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
    String n=n2.getSelectedItem().toString();
    DefaultTableModel model=(DefaultTableModel)n3.getModel();
    model.setRowCount(0);
    try
    {
        String query="select book_name,book_publisher from books where value='"+n+"';";
        rs=stmt.executeQuery(query);
        System.out.println(query);
        while(rs.next())
        {
            String a=rs.getString(1);
            String b=rs.getString(2);
            model.addRow(new Object[]{a,b});
        }
    }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_n2ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
    tracking_books.dispose();
    activities.setVisible(true);
    activities.setLocationRelativeTo(null);
    m2.setText("");
    m4.setText("");
    m6.setText("");
    m8.setText("");
    m10.setText("");
    DefaultTableModel model=(DefaultTableModel)n3.getModel();
    model.setRowCount(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
    add_books.dispose();
    activities.setVisible(true);
    activities.setLocationRelativeTo(null);
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
    student_info.dispose();
    activities1.setVisible(true);
    activities1.setLocationRelativeTo(null);
    ta1.setText("");
    ta2.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
    add_volunteer.dispose();
    activities.setVisible(true);
    activities.setLocationRelativeTo(null);
    w1.setText("");
    w2.setText("");
    w4.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
    add_student.dispose();
    activities.setVisible(true);
    activities.setLocationRelativeTo(null);
       v1.setText("");
       v4.setText("");
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
    value_week.dispose();
    activities.setVisible(true);
    activities.setLocationRelativeTo(null);
    u3.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton50ActionPerformed

    private void headActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_headActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        JFileChooser f1 = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int r=f1.showSaveDialog(null); 
        if (r == JFileChooser.APPROVE_OPTION) 
                up1.setText(f1.getSelectedFile().getAbsolutePath()); 
        else
                up1.setText("<html><body><font color='Red'><B>PLEASE SELECT A FILE</B></font></body></html>"); 
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        volunteer_app.setVisible(true);
        volunteer_app.setLocationRelativeTo(null);
        activities1.dispose();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        volunteer_app.dispose();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        String path1=up1.getText();
        String path2=up2.getText();
        String to = "drishti.singh.btech2018@sitpune.edu.in";
        String subject = "Application for working as volunteer";
        String user = "agarwal.shreya1819@gmail.com";
        String pass = "jhava_project";
        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");	
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        
        Session session = Session.getDefaultInstance(props,new Authenticator() 
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() 
            {
                return new PasswordAuthentication(user,pass);
            }
        });
        
        try
        {
            MimeMessage message = new MimeMessage(session);
            
            message.setFrom(new InternetAddress(user));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            
            // creating first MimeBodyPart object 
            BodyPart messageBodyPart1 = new MimeBodyPart();  
            messageBodyPart1.setContent("<html><h1>APPLICATION FOR VOLUNTEER</h1><body>Name: "+up3.getText()+"<br>Date Of Birth: "+up4.getText()+"</br><br>Currenlty working at: "+up5.getText()+"</br><br>Below attached are the resume and photgraph for the same.</br><br></br><br>Don't reply this is an autogenerated mail</br></body></html>","text/html");
              
            // creating second MimeBodyPart object 
            BodyPart messageBodyPart2 = new MimeBodyPart();  
            String filename1 = path1;
            FileDataSource source = new FileDataSource(filename1);   
            messageBodyPart2.setDataHandler(new DataHandler(source));   
            messageBodyPart2.setFileName(filename1); 
            
            //creating third MimeBodyPart object
            BodyPart messageBodyPart3 = new MimeBodyPart();
            String filename2 = path2;
            FileDataSource source1 = new FileDataSource(filename2);   
            messageBodyPart3.setDataHandler(new DataHandler(source1));   
            messageBodyPart3.setFileName(filename2); 
              
            // creating MultiPart object 
            Multipart multipartObject = new MimeMultipart();   
            multipartObject.addBodyPart(messageBodyPart1);   
            multipartObject.addBodyPart(messageBodyPart2); 
            multipartObject.addBodyPart(messageBodyPart3); 
      
            // set body of the email. 
            message.setContent(multipartObject); 

            Transport.send(message);
            
            JOptionPane.showMessageDialog(null,"Email sent!");
            volunteer_app.dispose();
            activities1.setVisible(true);
            activities1.setLocationRelativeTo(null);
        }
        catch (MessagingException e) 
        {
            JOptionPane.showMessageDialog(null,"Email Not Sent");
            throw new RuntimeException(e);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
         JFileChooser f1 = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int r=f1.showSaveDialog(null); 
        if (r == JFileChooser.APPROVE_OPTION) 
                up2.setText(f1.getSelectedFile().getAbsolutePath()); 
        else
                up2.setText("<html><body><font color='Red'><B>PLEASE SELECT A FILE</B></font></body></html>"); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        JFileChooser f1 = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int r=f1.showSaveDialog(null); 
        if (r == JFileChooser.APPROVE_OPTION) 
        {
             ph4.append(f1.getSelectedFile().getAbsolutePath()+"\n");
        }
        else
                ph4.setText("<html><body><font color='Red'><B>PLEASE SELECT A FILE</B></font></body></html>"); 
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        String name=ph1.getText();
        String month=ph2.getSelectedItem().toString();
        int year=ph3.getValue();
        String text=ph4.getText();
        String imagename[]=text.split("\n");
        for(int i=0;i<imagename.length;i++)
            System.out.println(""+imagename[i]);
        System.out.println(month);
        System.out.println(year);
        
        try
        {
            PreparedStatement pre=null;
            File imgfile[]=new File[imagename.length];
            for(int i=0;i<imgfile.length;i++)
            {
                imgfile[i]=new File(imagename[i]);
                FileInputStream fin = new FileInputStream(imgfile[i]);
                pre = con.prepareStatement("insert into events values ( ?, ? ,? ,?)");
                pre.setString(1,name);
                pre.setBinaryStream(2,fin,(int)imgfile[i].length());
                pre.setString(3,month);
                pre.setInt(4,year);
                pre.executeUpdate();
            }
            JOptionPane.showMessageDialog(null,"Uploaded successfully");
            uploading.dispose();
            activities1.setVisible(true);
            activities1.setLocationRelativeTo(null);
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Error Occured");
            ph1.setText("");
            ph2.setSelectedIndex(0);
            ph4.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton58ActionPerformed

    private void cancelWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_cancelWindowActivated
         DefaultTableModel model=(DefaultTableModel)table7.getModel();
        try
        {
           
            String name="";
            String query="select volunteer_name from volunteer_login where username='"+user+"';";
            rs=stmt.executeQuery(query);
            if(rs.first())
            {
                name=rs.getString(1);
            }
            String query1="select session_number,start_at,end_at,status,project_place from session_plan where session_head='"+name+"' and session_date=curdate();";
            rs=stmt.executeQuery(query1);
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getInt(1),rs.getString(5),rs.getInt(1),rs.getInt(2),rs.getString(4)});
                ch1.addItem(rs.getInt(1));
            }
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"There are no sessions scheduled yet");
            model.setRowCount(0);
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelWindowActivated

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
       int no=(Integer)ch1.getSelectedItem();
       try
       {
           String query="update session_plan set status='failure' where session_number="+no+";";
           System.out.println(query);
           stmt.executeUpdate(query);
           String name="";
           String query1="select volunteer_name from volunteer_login where username='"+user+"';";
           rs=stmt.executeQuery(query1);
           if(rs.first())
           {
              name=rs.getString(1);
           }
        String to = "drishti.singh.btech2018@sitpune.edu.in";
        String subject = "Application for working as volunteer";
        String user = "agarwal.shreya1819@gmail.com";
        String pass = "jhava_project";
        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");	
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        
        Session session = Session.getDefaultInstance(props,new Authenticator() 
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() 
            {
                return new PasswordAuthentication(user,pass);
            }
        });
        
        try
        {
             // MimeMessage object. 
         MimeMessage message = new MimeMessage(session); 
  
         // Set From Field: adding senders email to from field. 
         message.setFrom(new InternetAddress(user)); 
  
         // Set To Field: adding recipient's email to from field. 
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to)); 
  
         // Set Subject: subject of the email 
         message.setSubject("SESSION CANCELLED"); 
  
         // set body of the email. 
         message.setContent("<html><h1>SESSION CANCELLED</h1><body>The session held by "+name+ " has been cancelled","text/html"); 
  
         // Send email. 
         Transport.send(message); 
         JOptionPane.showMessageDialog(null,"Mail successfully sent"); 
       
         volunteer_app.dispose();
         activities1.setVisible(true);
         activities1.setLocationRelativeTo(null);
        }
        catch (MessagingException e) 
        {
            JOptionPane.showMessageDialog(null,"Email Not Sent");
            throw new RuntimeException(e);
        }
       }
       catch(Exception e)
       {
           
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton60ActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        
        a5 = (long) Math.floor(Math.random() * 9000L) + 1000L;
        System.out.println(""+a5);
        String to = f1.getText();
        String subject = "RESET PASSWORD";
        String user = "agarwal.shreya1819@gmail.com";
        String pass = "jhava_project";
        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");	
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        
        Session session = Session.getDefaultInstance(props,new Authenticator() 
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() 
            {
                return new PasswordAuthentication(user,pass);
            }
        });
        
        try
        {
            MimeMessage message = new MimeMessage(session);
            
            message.setFrom(new InternetAddress(user));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            message.setContent("<html><h2>RESET PASSWORD</h2><body>Your OTP is "+a5+".<br>Donot share with anyone</br></body></html>","text/html");

            Transport.send(message);
            myTimer.scheduleAtFixedRate(task,0,1000);
            f2.setVisible(true);
            f4.setVisible(true);
            f5.setVisible(true);
            dis_time.setVisible(true);
            panel_disp.setVisible(false);
            info.setText("Email Sent");
        }
        catch (MessagingException e) 
        {
            myTimer.cancel();
            myTimer.purge();
            JOptionPane.showMessageDialog(null,"Email Not Sent");
            throw new RuntimeException(e);
        }
       
        // TODO add your handling code here:
    }//GEN-LAST:event_f1ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        forgot.setVisible(true);
        this.dispose();
        forgot.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton61ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f2ActionPerformed

    private void f4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4ActionPerformed
        long a=Long.parseLong(f2.getText());
        if(a==a5)
        {
            panel_disp.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"INVALID OTP");
            forgot.dispose();
            forgot.setVisible(true);
            dis_time.setText("");
            info.setText("");
            myTimer.cancel();
            myTimer.purge();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_f4ActionPerformed

    private void forgotWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_forgotWindowActivated
        f2.setVisible(false);
        f4.setVisible(false);
        f5.setVisible(false);
        panel_disp.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotWindowActivated

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        String to=f1.getText();
        String subject = "NEW PASSWORD";
        String user = "agarwal.shreya1819@gmail.com";
        String pass = "jhava_project";
        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");	
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        
        Session session = Session.getDefaultInstance(props,new Authenticator() 
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() 
            {
                return new PasswordAuthentication(user,pass);
            }
        });
        
        try
        {
            MimeMessage message = new MimeMessage(session);
            
            message.setFrom(new InternetAddress(user));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            message.setContent("<html><h2>NEW PASSWORD</h2><body>Your password has been reset to "+f3.getText(),"text/html");

            Transport.send(message);
            JOptionPane.showMessageDialog(null,"Email Sent!");
            forgot.dispose();
            this.setVisible(true);
            this.setLocationRelativeTo(null);
            
        }
        catch (MessagingException e) 
        {
            myTimer.cancel();
            myTimer.purge();
            JOptionPane.showMessageDialog(null,"Email Not Sent");
            throw new RuntimeException(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton64ActionPerformed

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f3ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        forgot.dispose();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // create an object of JFileChooser class 
            JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); 
  
            // set the selection mode to directories only 
            j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
  
            // invoke the showsOpenDialog function to show the save dialog 
            int r = j.showOpenDialog(null); 
  
            if (r == JFileChooser.APPROVE_OPTION) { 
                // set the label to the path of the selected directory 
                info_set.setText(j.getSelectedFile().getAbsolutePath()); 
            } 
            // if the user cancelled the operation 
            else
               info_set.setText("<html><body><font color='Red'><B>PLEASE SELECT A FILE</B></font></body></html>"); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton36ActionPerformed

    private void k1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k1ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        Blob blob;
        byte b[];
        String path=info_set.getText();
        String name=k1.getSelectedItem().toString();
        int count=1;
        try
        {
            //File file=new File("E:\\image1.png");
            //FileOutputStream fos=new FileOutputStream(file);
            String query="select photo from events where occassion='"+name+"' and month='"+k2.getSelectedItem().toString()+"' and year="+k3.getValue()+";";
            rs=stmt.executeQuery(query);
            System.out.println(query);
            while(rs.next())
            {
                path=path+"\\"+name+"_"+count+".jpg";
                System.out.println(path);
                File file=new File(path);
                count++;
                FileOutputStream fos=new FileOutputStream(file);
		blob=rs.getBlob(1);
                b=blob.getBytes(1,(int)blob.length());
		fos.write(b);
            }
            JOptionPane.showMessageDialog(null,"Saved Successfully");
            get_photos.dispose();
            activities.setLocationRelativeTo(null);
            activities.setVisible(true);
        }
        
        catch(Exception e)
        {
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton51ActionPerformed

    private void get_photosWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_get_photosWindowActivated
           try
           {
               String query="select occassion from events;";
               rs=stmt.executeQuery(query);
               while(rs.next())
               {
                   k1.addItem(rs.getString(1));
               }
           }
           
           catch(Exception e)
           {
               
           }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_get_photosWindowActivated

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        get_photos.dispose();
        activities.setLocationRelativeTo(null);
        activities.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        activities.dispose();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton65ActionPerformed

    private void cho1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cho1ActionPerformed
        if(cho1.isSelected())
        {
            disp1.setVisible(true);
            disp2.setVisible(false);
            disp3.setVisible(false);
            disp4.setVisible(false);
            disp5.setVisible(false);
            disp6.setVisible(false);    
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cho1ActionPerformed

    private void cho2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cho2ActionPerformed
        if(cho2.isSelected())
        {
            disp1.setVisible(false);
            disp2.setVisible(true);
            disp3.setVisible(false);
            disp4.setVisible(false);
            disp5.setVisible(false);
            disp6.setVisible(false);    
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cho2ActionPerformed

    private void cho3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cho3ActionPerformed
        if(cho3.isSelected())
        {
            disp1.setVisible(false);
            disp2.setVisible(false);
            disp3.setVisible(true);
            disp4.setVisible(false);
            disp5.setVisible(false);
            disp6.setVisible(false);    
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cho3ActionPerformed

    private void cho4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cho4ActionPerformed
        if(cho4.isSelected())
        {
            disp1.setVisible(false);
            disp2.setVisible(false);
            disp3.setVisible(false);
            disp4.setVisible(true);
            disp5.setVisible(false);
            disp6.setVisible(false);    
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cho4ActionPerformed

    private void cho5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cho5ActionPerformed
        if(cho5.isSelected())
        {
            disp1.setVisible(false);
            disp2.setVisible(false);
            disp3.setVisible(false);
            disp4.setVisible(false);
            disp5.setVisible(true);
            disp6.setVisible(false);    
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cho5ActionPerformed

    private void cho6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cho6ActionPerformed
        if(cho6.isSelected())
        {
            disp1.setVisible(false);
            disp2.setVisible(false);
            disp3.setVisible(false);
            disp4.setVisible(false);
            disp5.setVisible(false);
            disp6.setVisible(true);    
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cho6ActionPerformed

    private void activitiesWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_activitiesWindowActivated
    if(user.equals("HR"))
    {
        activities.setVisible(true);
        activities.setLocationRelativeTo(null);
        reviewing_attendance.dispose();
        selection1.setVisible(true);
        selection2.setVisible(false);
        display1.setVisible(true);
        display2.setVisible(false);
        disp1.setVisible(true);
        disp2.setVisible(false);
        disp3.setVisible(false);
        disp4.setVisible(false);
        disp5.setVisible(false);
        disp6.setVisible(false);    
        cho1.setSelected(true);
    }
    
    if(user.equals("PROJECT HEAD"))
    {
        activities.setVisible(true);
        activities.setLocationRelativeTo(null);
        reviewing_attendance.dispose();
        selection1.setVisible(false);
        selection2.setVisible(true);
        display1.setVisible(false);
        display2.setVisible(true);
        displ1.setVisible(true);
        displ2.setVisible(false);
        displ3.setVisible(false);
        displ4.setVisible(false);
        displ5.setVisible(false);
        displ6.setVisible(false);
        displ7.setVisible(false);  
        choo1.setSelected(true);
    }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_activitiesWindowActivated

    private void disp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disp1MouseClicked
        timetable.setVisible(true);
        timetable.setLocationRelativeTo(null);
        activities.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_disp1MouseClicked

    private void disp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disp2MouseClicked
        reviewing_attendance.setVisible(true);
        reviewing_attendance.setLocationRelativeTo(null);
        activities.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_disp2MouseClicked

    private void disp3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disp3MouseClicked
        volunteer_info.setVisible(true);
        volunteer_info.setLocationRelativeTo(null);
        activities.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_disp3MouseClicked

    private void disp4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disp4MouseClicked
        student_info.setVisible(true);
        student_info.setLocationRelativeTo(null);
        activities.dispose();
        try
        {
            String query="select student_name from student;";
            rs=stmt.executeQuery(query);
            System.out.println(query);
            while(rs.next())
            {
                x1.addItem(rs.getString(1));
            }
        }
    
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_disp4MouseClicked

    private void disp5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disp5MouseClicked
        add_volunteer.setVisible(true);
        add_volunteer.setLocationRelativeTo(null);
        activities.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_disp5MouseClicked

    private void disp6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disp6MouseClicked
        get_photos.setVisible(true);
        get_photos.setLocationRelativeTo(null);
        activities.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_disp6MouseClicked

    private void choo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choo1ActionPerformed
        if(choo1.isSelected())
        {
            displ1.setVisible(true);
            displ2.setVisible(false);
            displ3.setVisible(false);
            displ4.setVisible(false);
            displ5.setVisible(false);
            displ6.setVisible(false);
            displ7.setVisible(false);
        }     
        // TODO add your handling code here:
    }//GEN-LAST:event_choo1ActionPerformed

    private void choo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choo2ActionPerformed
        if(choo2.isSelected())
        {
            displ1.setVisible(false);
            displ2.setVisible(true);
            displ3.setVisible(false);
            displ4.setVisible(false);
            displ5.setVisible(false);
            displ6.setVisible(false);
            displ7.setVisible(false);
        }     
// TODO add your handling code here:
    }//GEN-LAST:event_choo2ActionPerformed

    private void choo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choo3ActionPerformed
       if(choo3.isSelected())
        {
            displ1.setVisible(false);
            displ2.setVisible(false);
            displ3.setVisible(true);
            displ4.setVisible(false);
            displ5.setVisible(false);
            displ6.setVisible(false);
            displ7.setVisible(false);
        }     
        // TODO add your handling code here:
    }//GEN-LAST:event_choo3ActionPerformed

    private void choo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choo4ActionPerformed
        if(choo4.isSelected())
        {
            displ1.setVisible(false);
            displ2.setVisible(false);
            displ3.setVisible(false);
            displ4.setVisible(true);
            displ5.setVisible(false);
            displ6.setVisible(false);
            displ7.setVisible(false);
        }     
// TODO add your handling code here:
    }//GEN-LAST:event_choo4ActionPerformed

    private void choo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choo5ActionPerformed
       if(choo5.isSelected())
        {
            displ1.setVisible(false);
            displ2.setVisible(false);
            displ3.setVisible(false);
            displ4.setVisible(false);
            displ5.setVisible(true);
            displ6.setVisible(false);
            displ7.setVisible(false);
        }     
        // TODO add your handling code here:
    }//GEN-LAST:event_choo5ActionPerformed

    private void choo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choo6ActionPerformed
      if(choo6.isSelected())
        {
            displ1.setVisible(false);
            displ2.setVisible(false);
            displ3.setVisible(false);
            displ4.setVisible(false);
            displ5.setVisible(false);
            displ6.setVisible(true);
            displ7.setVisible(false);
        }     
        // TODO add your handling code here:
    }//GEN-LAST:event_choo6ActionPerformed

    private void choo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choo7ActionPerformed
        if(choo7.isSelected())
        {
            displ1.setVisible(false);
            displ2.setVisible(false);
            displ3.setVisible(false);
            displ4.setVisible(false);
            displ5.setVisible(false);
            displ6.setVisible(false);
            displ7.setVisible(true);
        }     
        // TODO add your handling code here:
    }//GEN-LAST:event_choo7ActionPerformed

    private void displ1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displ1MouseClicked
        timetable.setVisible(true);
        timetable.setLocationRelativeTo(null);
        activities.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_displ1MouseClicked

    private void displ2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displ2MouseClicked
        add_books.setVisible(true);
        add_books.setLocationRelativeTo(null);
        activities.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_displ2MouseClicked

    private void displ3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displ3MouseClicked
        add_student.setVisible(true);
        add_student.setLocationRelativeTo(null);
        activities.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_displ3MouseClicked

    private void displ4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displ4MouseClicked
        student_info_full.setVisible(true);
        student_info_full.setLocationRelativeTo(null);
        activities.dispose();
        try
        {
            String query="select student_name from student;";
            rs=stmt.executeQuery(query);
            System.out.println(query);
            while(rs.next())
            {
                x1.addItem(rs.getString(1));
            }
        }
    
        catch(Exception e)
        {
                JOptionPane.showMessageDialog(null,e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_displ4MouseClicked

    private void displ5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displ5MouseClicked
        value_week.setVisible(true);
        value_week.setLocationRelativeTo(null);
        activities.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_displ5MouseClicked

    private void displ6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displ6MouseClicked
        tracking_books.setVisible(true);
        tracking_books.setLocationRelativeTo(null);
        activities.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_displ6MouseClicked

    private void displ7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displ7MouseClicked
        get_photos.setVisible(true);
        get_photos.setLocationRelativeTo(null);
        activities.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_displ7MouseClicked

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        activities1.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton66ActionPerformed

    private void displ8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displ8MouseClicked
        session_plan1.setVisible(true);
        session_plan1.setLocationRelativeTo(null);
        activities1.dispose();
        jPanel4.setVisible(false);
        test1.setVisible(false);
        test2.setVisible(false);
        test4.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_displ8MouseClicked

    private void displ9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displ9MouseClicked
       attendance.setVisible(true);
       attendance.setLocationRelativeTo(null);
       activities1.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_displ9MouseClicked

    private void displ10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displ10MouseClicked
       uploading.setVisible(true);
       uploading.setLocationRelativeTo(null);
       activities1.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_displ10MouseClicked

    private void displ11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displ11MouseClicked
        student_info.setVisible(true);
        student_info.setLocationRelativeTo(null);
        activities1.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_displ11MouseClicked

    private void displ12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displ12MouseClicked
       cancel.setVisible(true);
       cancel.setLocationRelativeTo(null);
       activities1.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_displ12MouseClicked

    private void choo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choo8ActionPerformed
        if(choo8.isSelected())
        {
            displ8.setVisible(true);
            displ9.setVisible(false);
            displ10.setVisible(false);
            displ11.setVisible(false);
            displ12.setVisible(false);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_choo8ActionPerformed

    private void choo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choo9ActionPerformed
       if(choo9.isSelected())
        {
            displ8.setVisible(false);
            displ9.setVisible(true);
            displ10.setVisible(false);
            displ11.setVisible(false);
            displ12.setVisible(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_choo9ActionPerformed

    private void choo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choo10ActionPerformed
        if(choo10.isSelected())
        {
            displ8.setVisible(false);
            displ9.setVisible(false);
            displ10.setVisible(true);
            displ11.setVisible(false);
            displ12.setVisible(false);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_choo10ActionPerformed

    private void choo11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choo11ActionPerformed
      if(choo11.isSelected())
        {
            displ8.setVisible(false);
            displ9.setVisible(false);
            displ10.setVisible(false);
            displ11.setVisible(true);
            displ12.setVisible(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_choo11ActionPerformed

    private void choo12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choo12ActionPerformed
       if(choo12.isSelected())
        {
            displ8.setVisible(false);
            displ9.setVisible(false);
            displ10.setVisible(false);
            displ11.setVisible(false);
            displ12.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_choo12ActionPerformed

    private void activities1WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_activities1WindowActivated
        displ8.setVisible(true);
        displ9.setVisible(false);
        displ10.setVisible(false);
        displ11.setVisible(false);
        displ12.setVisible(false);
        choo8.setSelected(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_activities1WindowActivated

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        cancel.dispose();
        activities1.setVisible(true);
        activities1.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        uploading.dispose();
        activities1.setVisible(true);
        activities1.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(main_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_login().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JFrame activities;
    private javax.swing.JFrame activities1;
    private javax.swing.JFrame add_books;
    private javax.swing.JFrame add_student;
    private javax.swing.JFrame add_volunteer;
    private javax.swing.JComboBox at1;
    private javax.swing.JFrame attendance;
    private javax.swing.JButton bo1;
    private javax.swing.JButton bo2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox c1;
    private javax.swing.JComboBox c2;
    private javax.swing.JFrame cancel;
    private javax.swing.JComboBox ch1;
    private javax.swing.JCheckBox check;
    private javax.swing.JRadioButton cho1;
    private javax.swing.JRadioButton cho2;
    private javax.swing.JRadioButton cho3;
    private javax.swing.JRadioButton cho4;
    private javax.swing.JRadioButton cho5;
    private javax.swing.JRadioButton cho6;
    private javax.swing.JRadioButton choo1;
    private javax.swing.JRadioButton choo10;
    private javax.swing.JRadioButton choo11;
    private javax.swing.JRadioButton choo12;
    private javax.swing.JRadioButton choo2;
    private javax.swing.JRadioButton choo3;
    private javax.swing.JRadioButton choo4;
    private javax.swing.JRadioButton choo5;
    private javax.swing.JRadioButton choo6;
    private javax.swing.JRadioButton choo7;
    private javax.swing.JRadioButton choo8;
    private javax.swing.JRadioButton choo9;
    private javax.swing.JComboBox co1;
    private javax.swing.JComboBox co2;
    private javax.swing.JComboBox co3;
    private javax.swing.JTextField counter;
    private datechooser.beans.DateChooserCombo date1;
    private datechooser.beans.DateChooserCombo dates;
    private javax.swing.JLabel dis_time;
    private javax.swing.JLabel disp1;
    private javax.swing.JLabel disp2;
    private javax.swing.JLabel disp3;
    private javax.swing.JLabel disp4;
    private javax.swing.JLabel disp5;
    private javax.swing.JLabel disp6;
    private javax.swing.JLabel displ1;
    private javax.swing.JLabel displ10;
    private javax.swing.JLabel displ11;
    private javax.swing.JLabel displ12;
    private javax.swing.JLabel displ2;
    private javax.swing.JLabel displ3;
    private javax.swing.JLabel displ4;
    private javax.swing.JLabel displ5;
    private javax.swing.JLabel displ6;
    private javax.swing.JLabel displ7;
    private javax.swing.JLabel displ8;
    private javax.swing.JLabel displ9;
    private javax.swing.JPanel display1;
    private javax.swing.JPanel display2;
    private javax.swing.JPanel display4;
    private javax.swing.JTextField f1;
    private javax.swing.JPasswordField f2;
    private javax.swing.JTextField f3;
    private javax.swing.JButton f4;
    private javax.swing.JLabel f5;
    private javax.swing.JFrame forgot;
    private javax.swing.JFrame get_photos;
    private javax.swing.JTextField head;
    private javax.swing.JLabel info;
    private javax.swing.JLabel info_set;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox k1;
    private javax.swing.JComboBox k2;
    private com.toedter.calendar.JYearChooser k3;
    private javax.swing.JLabel m1;
    private javax.swing.JTextField m10;
    private javax.swing.JTextField m2;
    private javax.swing.JLabel m3;
    private javax.swing.JTextField m4;
    private javax.swing.JLabel m5;
    private javax.swing.JTextField m6;
    private javax.swing.JLabel m7;
    private javax.swing.JTextField m8;
    private javax.swing.JLabel m9;
    private javax.swing.JLabel n1;
    private javax.swing.JComboBox n2;
    private javax.swing.JTable n3;
    private javax.swing.JPasswordField p1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel_disp;
    private javax.swing.JTextField ph1;
    private javax.swing.JComboBox ph2;
    private com.toedter.calendar.JYearChooser ph3;
    private javax.swing.JTextArea ph4;
    private javax.swing.JComboBox pro1;
    private javax.swing.JLabel pub1;
    private javax.swing.JLabel pub2;
    private javax.swing.JLabel pub3;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JFrame reviewing_attendance;
    private javax.swing.JSpinner s1;
    private javax.swing.JSpinner s2;
    private javax.swing.JSpinner s3;
    private javax.swing.JSpinner s4;
    private javax.swing.JSpinner s5;
    private javax.swing.JSpinner s6;
    private javax.swing.JPanel selection1;
    private javax.swing.JPanel selection2;
    private javax.swing.JPanel selection4;
    private javax.swing.JFrame session_plan1;
    private javax.swing.JComboBox sessions;
    private javax.swing.JFrame student_info;
    private javax.swing.JFrame student_info_full;
    private javax.swing.JTextField t1;
    private javax.swing.JTextArea ta1;
    private javax.swing.JTextArea ta2;
    private javax.swing.JTable table1;
    private javax.swing.JScrollPane table2;
    private javax.swing.JTable table3;
    private javax.swing.JTable table4;
    private javax.swing.JTable table7;
    private javax.swing.JTable tableA;
    private javax.swing.JTable tableB;
    private javax.swing.JTextField test1;
    private javax.swing.JTextField test2;
    private javax.swing.JButton test3;
    private javax.swing.JButton test4;
    private javax.swing.JTextField tim1;
    private javax.swing.JTextField tim2;
    private javax.swing.JDialog timechooser;
    private javax.swing.JFrame timetable;
    private javax.swing.JFrame tracking_books;
    private datechooser.beans.DateChooserCombo u1;
    private datechooser.beans.DateChooserCombo u2;
    private javax.swing.JTextField u3;
    private javax.swing.JLabel up1;
    private javax.swing.JLabel up2;
    private javax.swing.JTextField up3;
    private datechooser.beans.DateChooserCombo up4;
    private javax.swing.JTextField up5;
    private javax.swing.JFrame uploading;
    private javax.swing.JTextField user1;
    private javax.swing.JTextField v1;
    private javax.swing.JSpinner v2;
    private datechooser.beans.DateChooserCombo v3;
    private javax.swing.JTextArea v4;
    private javax.swing.JTextField value1;
    private javax.swing.JFrame value_week;
    private javax.swing.JFrame volunteer_app;
    private javax.swing.JFrame volunteer_info;
    private javax.swing.JTextField w1;
    private datechooser.beans.DateChooserCombo w2;
    private javax.swing.JTextField w3;
    private datechooser.beans.DateChooserCombo w4;
    private javax.swing.JTextField w5;
    private javax.swing.JComboBox x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField x3;
    private javax.swing.JTextField x4;
    private javax.swing.JTextField x5;
    private javax.swing.JLabel x6;
    private javax.swing.JTextArea x7;
    private javax.swing.JComboBox y1;
    private javax.swing.JTextField y2;
    private javax.swing.JTextField y3;
    private javax.swing.JTextField y4;
    private javax.swing.JTextField y5;
    private javax.swing.JTextField y6;
    private javax.swing.JComboBox y7;
    private javax.swing.JLabel z1;
    private javax.swing.JComboBox z2;
    private javax.swing.JLabel z3;
    private datechooser.beans.DateChooserCombo z4;
    // End of variables declaration//GEN-END:variables

    private void Remove(JTable table5, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
