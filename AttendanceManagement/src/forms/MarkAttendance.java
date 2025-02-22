package forms;

import java.sql.*;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import dao.ConnectionProvider;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import utility.BDUtility;

public class MarkAttendance extends javax.swing.JFrame implements Runnable, ThreadFactory {

    private WebcamPanel panel;
    private Webcam webcam = null;
    private ExecutorService executor = Executors.newSingleThreadExecutor(this);
    private volatile boolean running = true;

    public MarkAttendance() {
        this.panel = null;
        initComponents();
        BDUtility.setImage(this, "images/Time.jpg", 1060, 650);
        setLayout(null);
        

        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));
        initWebcam();

        Timer timer = new Timer(1, e -> updateTime());
        timer.start();
    }

    private void updateTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        lblTime.setText(simpleDateFormat.format(new Date()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        webCamPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblCheckInCheckOut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1060, 650));
        setMinimumSize(new java.awt.Dimension(1060, 560));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1060, 650));
        setResizable(false);

        webCamPanel.setMaximumSize(new java.awt.Dimension(1060, 600));
        webCamPanel.setMinimumSize(new java.awt.Dimension(1060, 600));
        webCamPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mark Attendance");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date");

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Time");

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("Time");

        lblName.setForeground(new java.awt.Color(255, 255, 255));

        lblCheckInCheckOut.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(webCamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161)
                                .addComponent(jLabel3))
                            .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCheckInCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(51, 51, 51)
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(lblCheckInCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(webCamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        running = false;
        stopWebcam();
        if(executor!=null && !executor.isShutdown()){
            executor.shutdown();
        }
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarkAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCheckInCheckOut;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTime;
    private javax.swing.JPanel webCamPanel;
    // End of variables declaration//GEN-END:variables

    Map<String, String> resultMap = new HashMap<String, String>();

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
            try {
                Result result = null;
                BufferedImage image = null;

                if (webcam.isOpen()) {
                    if ((image = webcam.getImage()) == null) {
                        continue;
                    }
                }
                LuminanceSource source = new BufferedImageLuminanceSource(image);
                BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

                try {
                    result = new MultiFormatReader().decode(bitmap);

                } catch (NotFoundException ex) {

                }
                if (result != null) {
                    String jsonString = result.getText();
                    Gson gson = new Gson();
                    java.lang.reflect.Type type = new TypeToken<Map<String, String>>() {
                    }.getType();

                    resultMap = gson.fromJson(jsonString, type);
                    String finalPath = BDUtility.getPath("images\\" + resultMap.get("email") + ".jpg");
                    CircularImageFrame(finalPath);

                }
            } catch (Exception ex) {

            }
        } while (running);

    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r, "My thread");
        t.setDaemon(true);
        return t;

    }

    private void stopWebcam() {
        if (webcam != null && webcam.isOpen()) {
            webcam.close();
        }
    }

    private void initWebcam() {

        webcam = Webcam.getDefault();
        if (webcam != null) {
            Dimension[] resolutions = webcam.getViewSizes();
            Dimension maxResolution = resolutions[resolutions.length - 1];
            


            if (webcam.isOpen()) {
                webcam.close();
            }
            webcam.setViewSize(maxResolution);
            webcam.open();

            panel = new WebcamPanel(webcam);
            panel.setPreferredSize(maxResolution);
            panel.setFPSDisplayed(true);

            webCamPanel.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));
            executor.execute(this);
            executor.shutdown();

        } else {
            System.out.println("issue with webcam");
        }
    }
    private BufferedImage image = null;

    private void CircularImageFrame(String imagePath) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from userdetails where email ='" + resultMap.get("email") + "';");
            if (!rs.next()) {
                showPopUpForCertainDuration("User is not registered ", " invalid Qr", JOptionPane.ERROR_MESSAGE);
                return;
            }
            image = null;
            File imageFile = new File(imagePath);
            if (imageFile.exists()) {
                try {
                    image = ImageIO.read(new File(imagePath));
                    image = createCircularImage(image);
                    ImageIcon icon = new ImageIcon(image);
                    lblImage.setIcon(icon);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                BufferedImage imagee = new BufferedImage(300, 300, BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2d = imagee.createGraphics();
                g2d.setColor(Color.BLACK);
                g2d.fillOval(25, 25, 250, 250);
                g2d.setFont(new Font("Serif", Font.BOLD, 250));
                g2d.setColor(Color.white);
                g2d.drawString(String.valueOf(resultMap.get("name").charAt(0)).toUpperCase(), 75, 225);
                g2d.dispose();

                ImageIcon imageIconn = new ImageIcon(imagee);
                lblImage.setIcon(imageIconn);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.pack();
                this.setLocationRelativeTo(null);
                this.setVisible(true);

            }
            lblName.setHorizontalAlignment(JLabel.CENTER);
            lblName.setText(resultMap.get("name"));
            if (!checkInCheckout()) {
                return;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void showPopUpForCertainDuration(String popUpMessage, String popUpHeader, int iconId) throws HeadlessException {
        final JOptionPane optionPane = new JOptionPane(popUpMessage, iconId);
        final JDialog dialog = optionPane.createDialog(popUpHeader);
        Timer timer = new Timer(10000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
                clearUserDetails();
            }

          
        }); 
        timer.setRepeats(false);
        timer.start();
        dialog.setVisible(true);

        }
      private void clearUserDetails() {
          lblCheckInCheckOut.setText("");
          lblCheckInCheckOut.setBackground(null);
          lblCheckInCheckOut.setForeground(null);
          lblCheckInCheckOut.setOpaque(false);
          lblName.setText("");
          lblImage.setIcon(null);
    }
        
    

    private BufferedImage createCircularImage(BufferedImage image) {
        int diameter = 275;
        BufferedImage resizedImage = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2= resizedImage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(image, 0,0, diameter, diameter, null);
        g2.dispose();
        BufferedImage circularImage = new BufferedImage (diameter, diameter, BufferedImage.TYPE_INT_ARGB);
        g2=circularImage.createGraphics();
        Ellipse2D.Double circle = new Ellipse2D.Double(0,0,diameter, diameter);
        g2.setClip(circle);
        g2.drawImage(resizedImage, 0,0,null);
        g2.dispose();
        return circularImage;
    }

    private boolean checkInCheckout() throws HeadlessException, SQLException {
        String popUpHeader = null;
        String popUpMessage = null;
        Color color = null;

        Connection con = ConnectionProvider.getCon();
        Statement st = con.createStatement();

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        ResultSet rs = st.executeQuery("select * from userattendance where date='" + currentDate.format(dateFormatter) + "' and userid=" + Integer.valueOf(resultMap.get("id")) + ";");

        Connection connection = ConnectionProvider.getCon();
        if (rs.next()) {
            String checkOutDateTime = rs.getString(4);
            if (checkOutDateTime != null) {
                popUpMessage = "Already Checkout for the day";
                popUpHeader = "invalid Checkout";
                showPopUpForCertainDuration(popUpMessage, popUpHeader, JOptionPane.ERROR_MESSAGE);
                return false;
            }
            String checkInDateTime = rs.getString(3);
            LocalDateTime checkInLocalDateTime = LocalDateTime.parse(checkInDateTime, dateTimeFormatter);
            Duration duration = Duration.between(checkInLocalDateTime, currentDateTime);

            long hours = duration.toHours();
            long minutes = duration.minusHours(hours).toMinutes();
            long seconds = duration.minusHours(hours).minusMinutes(minutes).getSeconds();

            if (!(hours > 0 || (hours == 0 && minutes >= 5))) {
                long remainingMinutes = 4 - minutes;
                long remainingSeconds = 60 - seconds;

                popUpMessage = String.format("Your work duration is less than 5 minutes\nYou can check out after: %d minutes and %d seconds", remainingMinutes, remainingSeconds);
                popUpHeader = "duration warning";
                showPopUpForCertainDuration(popUpMessage, popUpHeader, JOptionPane.WARNING_MESSAGE);
                return false;

            }
            String updateQuery = "update userattendance set checkout=?, workduration=? where date=? and userid=?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, currentDateTime.format(dateFormatter));
            preparedStatement.setString(2, "" + hours + " Hours and " + minutes + " Minutes ");
            preparedStatement.setString(3, currentDate.format(dateFormatter));
            preparedStatement.setString(4, resultMap.get("id"));

            preparedStatement.executeUpdate();
            popUpHeader = "Checkout";
            popUpMessage = "Checked out at " + currentDateTime.format(dateTimeFormatter) + "\nWork duration" + hours + "Hours and " + minutes + " Minutes ";
            color = Color.RED;
        } else {
            //checkin
            String insertQuery = "INSERT INTO userattendance (userid,date,checkin) VALUES (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, resultMap.get("id"));
            preparedStatement.setString(2, currentDate.format(dateFormatter));
            preparedStatement.setString(3, currentDateTime.format(dateFormatter));
            preparedStatement.executeUpdate();
            popUpHeader = "Checkin";
            popUpMessage = "Checkin at" + currentDateTime.format(dateFormatter);
            color = Color.GREEN;
        }
        lblCheckInCheckOut.setHorizontalAlignment(JLabel.CENTER);
        lblCheckInCheckOut.setText(popUpHeader);
        lblCheckInCheckOut.setForeground(color);
        lblCheckInCheckOut.setBackground(Color.DARK_GRAY);
        lblCheckInCheckOut.setOpaque(true);
        showPopUpForCertainDuration(popUpMessage, popUpHeader, JOptionPane.INFORMATION_MESSAGE);
        return true;

    }
    public void paint (Graphics g){
        super.paint(g);
        if(image!=null){
            g.drawImage(image, 0,0,null);
        }
    }

}
