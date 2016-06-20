/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author zhangxr
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form StockerView
     */
    public MainView() {
        initComponents();

        setLocationRelativeTo(null);
        final URL filename = this.getClass().getResource("res/Livermore1.jpg");
        if (filename != null) {
            setIconImage(new ImageIcon(filename, "Icon").getImage());
        }

        importFile(fileIn);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItemCopy = new javax.swing.JMenuItem();
        jMenuItemClear = new javax.swing.JMenuItem();
        jPanelMain = new javax.swing.JPanel();
        jLabelStockName = new javax.swing.JLabel();
        jLabelStockCode = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePoint = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaMain = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldStartDate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEndDate = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelTrend = new javax.swing.JPanel();
        jPanelConfig = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTpoint1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTpoint2 = new javax.swing.JTextField();
        jCheckBoxVpoint = new javax.swing.JCheckBox();
        jTextFieldVpoint = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxMode = new javax.swing.JComboBox<String>();
        jButtonTest = new javax.swing.JButton();
        jLabelStatus = new javax.swing.JLabel();
        jPanelMACD = new javax.swing.JPanel();
        jPanelMA = new javax.swing.JPanel();
        jLabelOpen = new javax.swing.JLabel();
        jLabelHigh = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelLow = new javax.swing.JLabel();
        jButtonImport = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemImport = new javax.swing.JMenuItem();
        jMenuAdd = new javax.swing.JMenu();
        jMenuTestSystem = new javax.swing.JMenu();
        jMenuItemMACD = new javax.swing.JMenuItem();

        jMenuItemCopy.setText("复制");
        jMenuItemCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCopyActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItemCopy);

        jMenuItemClear.setText("清除");
        jMenuItemClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClearActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItemClear);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("证券交易系统");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelStockName.setFont(new java.awt.Font("华文新魏", 0, 19)); // NOI18N
        jLabelStockName.setForeground(new java.awt.Color(0, 0, 204));
        jLabelStockName.setText("上证指数");
        jLabelStockName.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanelMain.add(jLabelStockName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabelStockCode.setFont(new java.awt.Font("黑体", 0, 16)); // NOI18N
        jLabelStockCode.setForeground(new java.awt.Color(0, 0, 204));
        jLabelStockCode.setText("(000001)");
        jPanelMain.add(jLabelStockCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabelDate.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabelDate.setText("日期：----/--/--");
        jPanelMain.add(jLabelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jTablePoint.getTableHeader().setFont(new java.awt.Font("微软雅黑", 0, 12));
        jTablePoint.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jTablePoint.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"净利润", null, "收益率", ""},
                {"总盈利", null, "年化收益", null},
                {"总亏损", null, "标的收益率", ""},
                {"盈利次数", null, "起始资金", null},
                {"亏损次数", null, "当前资产", null},
                {"胜率(P)", null, "最大盈利", ""},
                {"平均盈利", "", "最大亏损", null},
                {"平均亏损", null, "持仓时间比", null},
                {"赔率(R)", "", "平均持仓期", null},
                {"数学期望", null, "平均盈利期", null},
                {"测试周期", null, "平均亏损期", null}
            },
            new String [] {
                "统计指标", "全部交易", "统计指标", "全部交易"
            }
        ));
        jScrollPane1.setViewportView(jTablePoint);
        if (jTablePoint.getColumnModel().getColumnCount() > 0) {
            jTablePoint.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTablePoint.getColumnModel().getColumn(0).setMaxWidth(70);
            jTablePoint.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTablePoint.getColumnModel().getColumn(2).setMaxWidth(70);
        }

        jPanelMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 340, 206));

        jTextAreaMain.setColumns(20);
        jTextAreaMain.setFont(new java.awt.Font("仿宋", 0, 11)); // NOI18N
        jTextAreaMain.setRows(5);
        jTextAreaMain.setComponentPopupMenu(jPopupMenu1);
        jTextAreaMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextAreaMainMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTextAreaMain);

        jPanelMain.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 340, 80));

        jLabel7.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabel7.setText("起始日期：");
        jPanelMain.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jTextFieldStartDate.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jTextFieldStartDate.setText("1990/05/14");
        jPanelMain.add(jTextFieldStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 80, -1));

        jLabel8.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabel8.setText("结束日期：");
        jPanelMain.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jTextFieldEndDate.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jTextFieldEndDate.setText("2016/05/31");
        jPanelMain.add(jTextFieldEndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 80, -1));

        jTabbedPane1.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N

        jPanelTrend.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelConfig.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "配置", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 12))); // NOI18N
        jPanelConfig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabel1.setText("起始状态：");
        jPanelConfig.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jComboBoxStatus.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "主上升", "主下降" }));
        jComboBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStatusActionPerformed(evt);
            }
        });
        jPanelConfig.add(jComboBoxStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabel2.setText("弹抽点：");
        jPanelConfig.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jTextFieldTpoint1.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jTextFieldTpoint1.setText("10");
        jPanelConfig.add(jTextFieldTpoint1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 30, -1));

        jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabel3.setText("反转点：");
        jPanelConfig.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jTextFieldTpoint2.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jTextFieldTpoint2.setText("5");
        jPanelConfig.add(jTextFieldTpoint2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 30, -1));

        jCheckBoxVpoint.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jCheckBoxVpoint.setText("使能V形反转");
        jPanelConfig.add(jCheckBoxVpoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jTextFieldVpoint.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jTextFieldVpoint.setText("20");
        jPanelConfig.add(jTextFieldVpoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 30, -1));

        jLabel9.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabel9.setText("模式：");
        jPanelConfig.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jComboBoxMode.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jComboBoxMode.setMaximumRowCount(9);
        jComboBoxMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "收盘价", "2日均线", "3日均线", "5日均线", "K线实体", "K线引线" }));
        jPanelConfig.add(jComboBoxMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jPanelTrend.add(jPanelConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 130));

        jButtonTest.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jButtonTest.setText("测试");
        jButtonTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTestActionPerformed(evt);
            }
        });
        jPanelTrend.add(jButtonTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        jLabelStatus.setFont(new java.awt.Font("隶书", 1, 30)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(255, 0, 0));
        jLabelStatus.setText("主上升!");
        jPanelTrend.add(jLabelStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jTabbedPane1.addTab("趋势", jPanelTrend);

        jPanelMACD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("MACD", jPanelMACD);

        jPanelMA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("均线", jPanelMA);

        jPanelMain.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 340, 330));

        jLabelOpen.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabelOpen.setText("开盘：");
        jPanelMain.add(jLabelOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 38, -1, -1));

        jLabelHigh.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabelHigh.setText("最高：");
        jPanelMain.add(jLabelHigh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 55, -1, -1));

        jLabelClose.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabelClose.setText("收盘：");
        jPanelMain.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 38, -1, -1));

        jLabelLow.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabelLow.setText("最低：");
        jPanelMain.add(jLabelLow, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 55, -1, -1));

        jButtonImport.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jButtonImport.setText("导入");
        jButtonImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImportActionPerformed(evt);
            }
        });
        jPanelMain.add(jButtonImport, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        getContentPane().add(jPanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 440));

        jMenuFile.setText("文件");

        jMenuItemImport.setText("导入...");
        jMenuItemImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemImportActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemImport);

        jMenuBar.add(jMenuFile);

        jMenuAdd.setText("添加");
        jMenuBar.add(jMenuAdd);

        jMenuTestSystem.setText("测试系统");

        jMenuItemMACD.setText("MACD");
        jMenuItemMACD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMACDActionPerformed(evt);
            }
        });
        jMenuTestSystem.add(jMenuItemMACD);

        jMenuBar.add(jMenuTestSystem);

        setJMenuBar(jMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemImportActionPerformed
        importFile(null);
    }//GEN-LAST:event_jMenuItemImportActionPerformed

    private void jButtonImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImportActionPerformed
        importFile(null);
    }//GEN-LAST:event_jButtonImportActionPerformed

    private void jButtonTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTestActionPerformed
        String start = jTextFieldStartDate.getText();
        String end = jTextFieldEndDate.getText();
        if ((end.compareTo(start) < 0)) {
            JOptionPane.showMessageDialog(this, "起始日期必须早于结束日期！");
            return;
        }

        boolean status = (jComboBoxStatus.getSelectedIndex() == 0);
        int t1 = Integer.parseInt(jTextFieldTpoint1.getText());
        int t2 = Integer.parseInt(jTextFieldTpoint2.getText());
        Livermore livermore = new Livermore(status, t1, t2);
        livermore.vpointEnable = jCheckBoxVpoint.isSelected();
        livermore.vpointValue = Integer.parseInt(jTextFieldVpoint.getText());
        BRM brm = new BRM(0);
        Strategy strategy = new Strategy(this, brm);
        strategy.livermore = livermore;

        try {
            fileWriter = new FileWriter(fileOut);

            for (String line : dataLineArrayList) {
                updateMarket(line);
                doModeComputing(livermore);
                if ((strDate.compareTo(start) >= 0) && (strDate.compareTo(end) <= 0)) {
                    double price = Double.parseDouble(strClose);
                    strategy.livermoreTrade(price);
                } else if (strDate.compareTo(end) > 0) {
                    break;
                }
            }
            parseStatus(livermore.Status);
            updateTable(brm, strategy);

            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_jButtonTestActionPerformed

    private void jComboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStatusActionPerformed
        String status = (jComboBoxStatus.getSelectedIndex() == 0) ? "mainRiseStatus" : "mainFallStatus";
        parseStatus(status);
    }//GEN-LAST:event_jComboBoxStatusActionPerformed

    private void jMenuItemMACDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMACDActionPerformed
        String start = jTextFieldStartDate.getText();
        String end = jTextFieldEndDate.getText();
        if ((end.compareTo(start) < 0)) {
            JOptionPane.showMessageDialog(this, "起始日期必须早于结束日期！");
            return;
        }

        MACD macd = new MACD(12, 26, 9);
        BRM brm = new BRM(0);
        Strategy strategy = new Strategy(this, brm);
        strategy.macd = macd;

        for (String line : dataLineArrayList) {
            updateMarket(line);
            double price = Double.parseDouble(strClose);
            macd.arithmetic(price);
            if ((strDate.compareTo(start) >= 0) && (strDate.compareTo(end) <= 0)) {
                strategy.macdCrossTrade(price);
            } else if (strDate.compareTo(end) > 0) {
                break;
            }
        }
        updateTable(brm, strategy);
    }//GEN-LAST:event_jMenuItemMACDActionPerformed

    private void jTextAreaMainMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaMainMouseReleased
        if (evt.isPopupTrigger()) {
            jPopupMenu1.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTextAreaMainMouseReleased

    private void jMenuItemClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClearActionPerformed
        jTextAreaMain.setText("");
    }//GEN-LAST:event_jMenuItemClearActionPerformed

    private void jMenuItemCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCopyActionPerformed
        jTextAreaMain.selectAll();
        jTextAreaMain.copy();
    }//GEN-LAST:event_jMenuItemCopyActionPerformed

    protected void importFile(String fileName) {
        if (fileName == null) {
            JFileChooser chooser = new JFileChooser("data/");
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Data File (*.txt)", "txt");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Select Data File");
            int ret = chooser.showOpenDialog(this);
            if (ret == JFileChooser.APPROVE_OPTION) {
                fileIn = chooser.getSelectedFile().getPath();
                fileOut = fileIn.substring(0, fileIn.length() - 4) + "_测试日志.txt";
            } else {
                return;
            }
        } else {
            fileIn = fileName;
            fileOut = fileIn.substring(0, fileIn.length() - 4) + "_测试日志.txt";
        }

        try {
            File file = new File(fileIn);
            InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "gbk");
            BufferedReader br = new BufferedReader(isr);
            String[] words = br.readLine().split("\t");
            jLabelStockName.setText(words[1]);
            jLabelStockCode.setText("(" + words[0].replaceAll("[\\pP\\p{Punct}]", "") + ")");
            words = br.readLine().split("\t");
            column = words.length;
            String line;
            dataLineArrayList = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                dataLineArrayList.add(line);
            }
            br.close();
            isr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doModeComputing(Livermore livermore) {
        double price;
        String msg = "";
        switch (jComboBoxMode.getSelectedIndex()) {
            case 0:
                price = Double.parseDouble(strClose);
                msg = livermore.arithmetic(price);
                statusRecord(livermore, msg);
                break;
            case 1:
                if (!strMA2.isEmpty()) {
                    price = Double.parseDouble(strMA2);
                    msg = livermore.arithmetic(price);
                    statusRecord(livermore, msg);
                }
                break;
            case 2:
                if (!strMA3.isEmpty()) {
                    price = Double.parseDouble(strMA3);
                    msg = livermore.arithmetic(price);
                    statusRecord(livermore, msg);
                }
                break;
            case 3:
                if (!strMA5.isEmpty()) {
                    price = Double.parseDouble(strMA5);
                    msg = livermore.arithmetic(price);
                    statusRecord(livermore, msg);
                }
                break;
            case 4:
                price = Double.parseDouble(strOpen);
                msg = livermore.arithmetic(price);
                statusRecord(livermore, msg);
                price = Double.parseDouble(strClose);
                msg = livermore.arithmetic(price);
                statusRecord(livermore, msg);
                break;
            case 5:
                price = Double.parseDouble(strClose.compareTo(strOpen) > 0 ? strLow : strHigh);
                msg = livermore.arithmetic(price);
                statusRecord(livermore, msg);
                price = Double.parseDouble(strClose.compareTo(strOpen) > 0 ? strHigh : strLow);
                msg = livermore.arithmetic(price);
                statusRecord(livermore, msg);
                break;
        }
    }

    protected void parseStatus(String status) {
        switch (status) {
            case "mainRiseStatus":
                jLabelStatus.setText("主上升！");
                jLabelStatus.setForeground(new java.awt.Color(255, 0, 0));
                break;
            case "normalFallUStatus":
                jLabelStatus.setText("自然回撤");
                jLabelStatus.setForeground(new java.awt.Color(255, 51, 51));
                break;
            case "normalRiseUStatus":
                jLabelStatus.setText("自然回升");
                jLabelStatus.setForeground(new java.awt.Color(255, 51, 51));
                break;
            case "minorFallUStatus":
                jLabelStatus.setText("次级回撤");
                jLabelStatus.setForeground(new java.awt.Color(255, 153, 153));
                break;
            case "minorRiseUStatus":
                jLabelStatus.setText("次级回升");
                jLabelStatus.setForeground(new java.awt.Color(255, 153, 153));
                break;
            case "mainFallStatus":
                jLabelStatus.setText("主下降！");
                jLabelStatus.setForeground(new java.awt.Color(0, 153, 0));
                break;
            case "normalRiseDStatus":
                jLabelStatus.setText("自然回升");
                jLabelStatus.setForeground(new java.awt.Color(51, 255, 51));
                break;
            case "normalFallDStatus":
                jLabelStatus.setText("自然回撤");
                jLabelStatus.setForeground(new java.awt.Color(51, 255, 51));
                break;
            case "minorRiseDStatus":
                jLabelStatus.setText("次级回升");
                jLabelStatus.setForeground(new java.awt.Color(153, 255, 153));
                break;
            case "minorFallDStatus":
                jLabelStatus.setText("次级回撤");
                jLabelStatus.setForeground(new java.awt.Color(153, 255, 153));
                break;
            default:
                break;
        }
    }

    protected void updateMarket(String line) {
        String[] words = line.split("\t");
        strDate = words[0];
        strOpen = words[1];
        strHigh = words[2];
        strLow = words[3];
        strClose = words[4];

        try {
            strMA2 = words[column - 6];
            strMA3 = words[column - 5];
            strMA5 = words[column - 4];
            strMA10 = words[column - 3];
            strMA20 = words[column - 2];
            strMA60 = words[column - 1];
        } catch (Exception e) {
        }

        jLabelDate.setText("日期：" + strDate);
        jLabelOpen.setText("开盘：" + strOpen);
        jLabelHigh.setText("最高：" + strHigh);
        jLabelLow.setText("最低：" + strLow);
        jLabelClose.setText("收盘：" + strClose);
    }

    protected void updateTable(BRM brm, Strategy stg) {
        jTablePoint.setValueAt((float) brm.getNetProfit(), 0, 1);
        jTablePoint.setValueAt((float) brm.getGainProfit(), 1, 1);
        jTablePoint.setValueAt((float) brm.getLossProfit(), 2, 1);
        jTablePoint.setValueAt(brm.getGainTimes(), 3, 1);
        jTablePoint.setValueAt(brm.getLossTimes(), 4, 1);
        jTablePoint.setValueAt((float) brm.getWinRate(), 5, 1);
        jTablePoint.setValueAt((float) brm.getMeanGain(), 6, 1);
        jTablePoint.setValueAt((float) brm.getMeanLoss(), 7, 1);
        jTablePoint.setValueAt((float) brm.getOdds(), 8, 1);
        jTablePoint.setValueAt((float) brm.getExpectation(), 9, 1);
        jTablePoint.setValueAt((float) stg.cycleYears + "年", 10, 1);

        jTablePoint.setValueAt((float) brm.getEarningRate() + "%", 0, 3);
        jTablePoint.setValueAt((float) brm.getAnnualRate(stg.cycleYears) + "%", 1, 3);
        jTablePoint.setValueAt((float) brm.getObjectRate(Double.parseDouble(strClose)) + "%", 2, 3);
        jTablePoint.setValueAt((float) brm.initAsset, 3, 3);
        jTablePoint.setValueAt((float) brm.getCurrentAsset(Double.parseDouble(strClose)), 4, 3);
        jTablePoint.setValueAt((float) brm.getMaxGain(), 5, 3);
        jTablePoint.setValueAt((float) brm.getMaxLoss(), 6, 3);
        jTablePoint.setValueAt((float) stg.getPositionDaysRate() + "%", 7, 3);
        jTablePoint.setValueAt((float) stg.getMeanPositionDays(brm) + "天", 8, 3);
        jTablePoint.setValueAt((float) stg.getMeanGainDays(brm) + "天", 9, 3);
        jTablePoint.setValueAt((float) stg.getMeanLossDays(brm) + "天", 10, 3);
    }

    protected void statusRecord(Livermore lm, String msg) {
        if (msg.equals("") != true) {
            msgLogger(msg);
            fileLogger("[" + strDate + "] " + msg);
            if (!msg.contains("趋势可能改变")) {
                fileLogger("上关键点：" + lm.riseKeyHead
                        + "\t\t上关键点：" + lm.fallKeyHead
                        + "\r\n下关键点：" + lm.riseKeyFoot
                        + "\t\t下关键点：" + lm.fallKeyFoot
                        + "\r\n主上升值：" + lm.mainRiseVal
                        + "\t\t主下降值：" + lm.mainFallVal
                        + "\r\n自然回撤：" + lm.normalFallUVal
                        + "\t\t自然回撤：" + lm.normalFallDVal
                        + "\r\n自然回升：" + lm.normalRiseUVal
                        + "\t\t自然回升：" + lm.normalRiseDVal
                        + "\r\n次级回撤：" + lm.minorFallUVal
                        + "\t\t次级回撤：" + lm.minorFallDVal
                        + "\r\n次级回升：" + lm.minorRiseUVal
                        + "\t\t次级回升：" + lm.minorRiseDVal);
            }
        }
    }

    public void msgLogger(String str) {
        jTextAreaMain.append("[" + strDate + "] " + str + System.getProperty("line.separator"));
    }

    public void fileLogger(String str) {
        if (fileWriter != null) {
            try {
                fileWriter.write(str + System.getProperty("line.separator"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private String strDate = "";
    private String strOpen = "";
    private String strClose = "";
    private String strHigh = "";
    private String strLow = "";
    private String strMA2 = "";
    private String strMA3 = "";
    private String strMA5 = "";
    private String strMA10 = "";
    private String strMA20 = "";
    private String strMA60 = "";

    private String fileIn = "data\\上证指数.txt";
    private String fileOut = "data\\上证指数_测试日志.txt";
    public FileWriter fileWriter;

    public int column = 15;
    public ArrayList<String> dataLineArrayList;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonImport;
    private javax.swing.JButton jButtonTest;
    private javax.swing.JCheckBox jCheckBoxVpoint;
    private javax.swing.JComboBox<String> jComboBoxMode;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelHigh;
    private javax.swing.JLabel jLabelLow;
    private javax.swing.JLabel jLabelOpen;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelStockCode;
    private javax.swing.JLabel jLabelStockName;
    private javax.swing.JMenu jMenuAdd;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItemClear;
    private javax.swing.JMenuItem jMenuItemCopy;
    private javax.swing.JMenuItem jMenuItemImport;
    private javax.swing.JMenuItem jMenuItemMACD;
    private javax.swing.JMenu jMenuTestSystem;
    private javax.swing.JPanel jPanelConfig;
    private javax.swing.JPanel jPanelMA;
    private javax.swing.JPanel jPanelMACD;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelTrend;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTablePoint;
    private javax.swing.JTextArea jTextAreaMain;
    private javax.swing.JTextField jTextFieldEndDate;
    private javax.swing.JTextField jTextFieldStartDate;
    private javax.swing.JTextField jTextFieldTpoint1;
    private javax.swing.JTextField jTextFieldTpoint2;
    private javax.swing.JTextField jTextFieldVpoint;
    // End of variables declaration//GEN-END:variables
}
