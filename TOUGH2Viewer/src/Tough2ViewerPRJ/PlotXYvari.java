/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tough2ViewerPRJ;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RectangleInsets;

/**
 *
 * @author stefano.bondua
 */
public class PlotXYvari extends javax.swing.JFrame {

    /**
     * Creates new form PlotXYvari
     */
    JFreeChart chart_advanced_A;
    JFreeChart chart_advanced_B;

    public PlotXYvari() {
        initComponents();
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(Tough2Viewer.dataobj.getVariableName()));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(Tough2Viewer.dataobj.getVariableName()));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(Tough2Viewer.dataobj.getVariableName()));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(Tough2Viewer.dataobj.getVariableName()));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(Tough2Viewer.dataobj.getVariableName()));

        ArrayList rocksnames = Tough2Viewer.dataobj.get_rocknames();
        int tipirocce = rocksnames.size();
        String[] rocknames_str = new String[tipirocce];
        for (int i = 0; i < tipirocce; i++) {
            rocknames_str[i] = (String) rocksnames.get(i);
        }
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(rocknames_str));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Plot"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBox2, jComboBox3});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 337, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Type A", jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Plot Type B"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "x", "y", "z" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Type B", jPanel3);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Block selecton"));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Only Selected Blocks");

        jButton1.setText("Update plot");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Only block of the selected rocktype");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("One serie per RockType");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("All blocks");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jButton1)
                    .addComponent(jRadioButton2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton4))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addGap(10, 10, 10)
                .addComponent(jRadioButton2)
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        plotGraphXY2();
        plotGraphXY3();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void plotGraphXY2() {
        int n_time_step = Tough2Viewer.dataobj.get_TimeSteps();
        int n_series = 2;
        int x_variable = jComboBox1.getSelectedIndex();
        int y_variable = jComboBox2.getSelectedIndex();
        int y1_variable = jComboBox3.getSelectedIndex();
        int nxyz = Tough2Viewer.dataobj.get_nxyz();
        if (jRadioButton4.isSelected()) {
            n_series = Tough2Viewer.dataobj.getRockTypesNumber();
        }

        XYSeries[] series = new XYSeries[n_series * 2];
        if (jRadioButton4.isSelected()) {
            for (int i = 0; i < n_series; i++) {
                series[i] = new XYSeries(jComboBox2.getSelectedItem() + "_" + Tough2Viewer.dataobj.get_RockType_name(i));
                series[n_series + i] = new XYSeries(jComboBox3.getSelectedItem() + "_" + Tough2Viewer.dataobj.get_RockType_name(i));
            }
        } else {
            series[0] = new XYSeries((String) jComboBox2.getSelectedItem());
            series[1] = new XYSeries((String) jComboBox3.getSelectedItem());
        }

        String VariableXName = (String) jComboBox1.getSelectedItem();
        String VariableYName = (String) jComboBox2.getSelectedItem();
        String VariableY1Name = (String) jComboBox3.getSelectedItem();
        String Title = VariableYName + " , " + VariableY1Name + " Vs " + VariableXName;
        for (int i_b = 0; i_b < nxyz; i_b++) {
            for (int it = 0; it < n_time_step; it++) {

                boolean to_add = false;
                if (jRadioButton1.isSelected()) {
                    to_add = true;

                } else if (jRadioButton2.isSelected()) {
                    if (Tough2Viewer.dataobj.Block_is_selected[i_b]) {
                        to_add = true;
                    }
                } else if (jRadioButton3.isSelected()) {
                    int rocktype = Tough2Viewer.dataobj.get_RockType(i_b);
                    if (rocktype == jComboBox4.getSelectedIndex()) {
                        to_add = true;
                    }
                } else if (jRadioButton4.isSelected()) {
                    int rocktype = Tough2Viewer.dataobj.get_RockType(i_b);
                    float x = Tough2Viewer.dataobj.get_dataArray(i_b, it, x_variable);
                    float y = Tough2Viewer.dataobj.get_dataArray(i_b, it, y_variable);
                    float y1 = Tough2Viewer.dataobj.get_dataArray(i_b, it, y1_variable);
                    series[rocktype].add(x, y);
                    series[n_series + rocktype].add(x, y1);
                    to_add = false;
                }
                if (to_add) {
                    float x = Tough2Viewer.dataobj.get_dataArray(i_b, it, x_variable);
                    float y = Tough2Viewer.dataobj.get_dataArray(i_b, it, y_variable);
                    float y1 = Tough2Viewer.dataobj.get_dataArray(i_b, it, y1_variable);

                    series[0].add(x, y);
                    series[1].add(x, y1);
                }

            }

        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        for (int i = 0; i < n_series; i++) {
            dataset.addSeries(series[i]);
            if (jRadioButton4.isSelected()) {
                dataset.addSeries(series[n_series + i]);
            }
        }

        chart_advanced_A = ChartFactory.createXYLineChart(
                Title,
                VariableXName,
                VariableYName,
                dataset,
                org.jfree.chart.plot.PlotOrientation.VERTICAL,
                true,
                false,
                false);

        XYPlot plot = chart_advanced_A.getXYPlot();

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        double Width = Tough2Viewer.dataobj.ShapeDimension;
        double Height = Tough2Viewer.dataobj.ShapeDimension;
        Shape myNewShape = new Rectangle2D.Double(-Width, -Height, 2 * Width, 2 * Height);
        for (int i = 0; i < n_series * 2; i++) {
            //renderer.setSeriesStroke(i, new BasicStroke(Tough2Viewer.dataobj.LineThicness, BasicStroke.JOIN_ROUND, BasicStroke.JOIN_BEVEL));
            //renderer.setSeriesShape(i, myNewShape);
            renderer.setSeriesLinesVisible(i, false);
            renderer.setSeriesShapesVisible(i, true);
        }

        //
        plot.setDomainGridlinePaint(Tough2Viewer.dataobj.GridAxisColor);
        plot.setRangeGridlinePaint(Tough2Viewer.dataobj.GridAxisColor);
        BasicStroke theGridLineStroke = (BasicStroke) plot.getDomainGridlineStroke();
        float linewidth = theGridLineStroke.getLineWidth();
        linewidth = linewidth * Tough2Viewer.dataobj.GridAxisThickness;
        float[] theDashArray = theGridLineStroke.getDashArray();

        for (int i = 0; i < theDashArray.length; i++) {
            theDashArray[i] = theDashArray[i] * Tough2Viewer.dataobj.StretchDashlines;
        }

        int cap = theGridLineStroke.getEndCap();
        int join = theGridLineStroke.getLineJoin();
        float miterlimit = theGridLineStroke.getMiterLimit();
        float dashphase = theGridLineStroke.getDashPhase();
        BasicStroke myGridLineStroke = new BasicStroke(linewidth, cap, join, miterlimit, theDashArray, dashphase);
        float offset = Tough2Viewer.dataobj.GridOffSet;
        plot.setAxisOffset(new RectangleInsets(offset, offset, offset, offset));
        plot.setDomainGridlineStroke(myGridLineStroke);
        plot.setRangeGridlineStroke(myGridLineStroke);
        plot.setBackgroundPaint(Tough2Viewer.dataobj.PlotAreaColor);
        //
        //

        plot.setRenderer(renderer);
        Tough2Viewer.dataobj.ScientificNotationAxis(plot);
        ChartPanel panelchart1 = new ChartPanel(chart_advanced_A);

        panelchart1.setSize(jPanel1.getSize());
        panelchart1.setVisible(true);

        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.add(panelchart1, BorderLayout.CENTER);
        jPanel1.setVisible(true);
        jPanel1.getParent().validate();
        jPanel1.repaint();

    }

    private void plotGraphXY3() {
        int n_time_step = Tough2Viewer.dataobj.get_TimeSteps();
        int n_series = 2;
        int y1_variable = jComboBox7.getSelectedIndex();
        int x_variable = jComboBox5.getSelectedIndex();
        int y2_variable = jComboBox6.getSelectedIndex();

        int nxyz = Tough2Viewer.dataobj.get_nxyz();
        if (jRadioButton4.isSelected()) {
            n_series = Tough2Viewer.dataobj.getRockTypesNumber();
        }

        XYSeries[] series = new XYSeries[n_series * 2];
        if (jRadioButton4.isSelected()) {
            for (int i = 0; i < n_series; i++) {
                series[i] = new XYSeries(jComboBox7.getSelectedItem() + "_" + Tough2Viewer.dataobj.get_RockType_name(i));
                series[n_series + i] = new XYSeries(jComboBox6.getSelectedItem() + "_" + Tough2Viewer.dataobj.get_RockType_name(i));
            }
        } else {
            series[0] = new XYSeries((String) jComboBox7.getSelectedItem());
            series[1] = new XYSeries((String) jComboBox6.getSelectedItem());
        }

        String VariableXName = (String) jComboBox5.getSelectedItem();
        String VariableY1Name = (String) jComboBox7.getSelectedItem();
        String VariableY2Name = (String) jComboBox6.getSelectedItem();

        String Title = VariableXName + " , " + VariableY1Name + " Vs " + VariableY2Name;
        for (int i_b = 0; i_b < nxyz; i_b++) {
            for (int it = 0; it < n_time_step; it++) {

                boolean to_add = false;
                if (jRadioButton1.isSelected()) {
                    to_add = true;

                } else if (jRadioButton2.isSelected()) {
                    if (Tough2Viewer.dataobj.Block_is_selected[i_b]) {
                        to_add = true;
                    }
                } else if (jRadioButton3.isSelected()) {
                    int rocktype = Tough2Viewer.dataobj.get_RockType(i_b);
                    if (rocktype == jComboBox4.getSelectedIndex()) {
                        to_add = true;
                    }
                } else if (jRadioButton4.isSelected()) {
                    int rocktype = Tough2Viewer.dataobj.get_RockType(i_b);
                    float x;
                    if (x_variable == 0) {
                        x = Tough2Viewer.dataobj.get_Xo(i_b);
                    } else if (x_variable == 1) {
                        x = Tough2Viewer.dataobj.get_Yo(i_b);
                    } else {
                        x = Tough2Viewer.dataobj.get_Zo(i_b);
                    }

                    float y1 = Tough2Viewer.dataobj.get_dataArray(i_b, it, y1_variable);
                    float y2 = Tough2Viewer.dataobj.get_dataArray(i_b, it, y2_variable);
                    series[rocktype].add(x, y1);
                    series[n_series + rocktype].add(x, y2);
                    to_add = false;
                }
                if (to_add) {
                    float x;
                    if (x_variable == 0) {
                        x = Tough2Viewer.dataobj.get_Xo(i_b);
                    } else if (x_variable == 1) {
                        x = Tough2Viewer.dataobj.get_Yo(i_b);
                    } else {
                        x = Tough2Viewer.dataobj.get_Zo(i_b);
                    }
                    float y1 = Tough2Viewer.dataobj.get_dataArray(i_b, it, y1_variable);

                    float y2 = Tough2Viewer.dataobj.get_dataArray(i_b, it, y2_variable);

                    series[0].add(x, y1);
                    series[1].add(x, y2);
                }

            }

        }

        XYSeriesCollection dataset_var1 = new XYSeriesCollection();
        XYSeriesCollection dataset_var2 = new XYSeriesCollection();
        if (!jRadioButton4.isSelected()) {
            dataset_var1.addSeries(series[0]);
            dataset_var2.addSeries(series[1]);
        } else {
            for (int i = 0; i < n_series; i++) {
                dataset_var1.addSeries(series[i]);
                if (jRadioButton4.isSelected()) {
                    dataset_var2.addSeries(series[n_series + i]);
                }
            }
        }

        chart_advanced_B = ChartFactory.createXYLineChart(
                Title,
                VariableXName,
                VariableY1Name,
                dataset_var1,
                org.jfree.chart.plot.PlotOrientation.HORIZONTAL,
                true,
                false,
                false);

        XYPlot plot = chart_advanced_B.getXYPlot();

        XYLineAndShapeRenderer renderer1 = new XYLineAndShapeRenderer();

        for (int i = 0; i < n_series * 2; i++) {
            renderer1.setSeriesLinesVisible(i, false);
            renderer1.setSeriesShapesVisible(i, true);
            renderer1.setUseFillPaint(false);
        }
        XYLineAndShapeRenderer renderer2 = new XYLineAndShapeRenderer();

        for (int i = 0; i < n_series * 2; i++) {
            renderer2.setSeriesLinesVisible(i, false);
            renderer2.setSeriesShapesVisible(i, true);
            renderer2.setUseFillPaint(true);
        }

        //
        plot.setDomainGridlinePaint(Tough2Viewer.dataobj.GridAxisColor);
        plot.setRangeGridlinePaint(Tough2Viewer.dataobj.GridAxisColor);
        BasicStroke theGridLineStroke = (BasicStroke) plot.getDomainGridlineStroke();
        float linewidth = theGridLineStroke.getLineWidth();
        linewidth = linewidth * Tough2Viewer.dataobj.GridAxisThickness;
        float[] theDashArray = theGridLineStroke.getDashArray();

        for (int i = 0; i < theDashArray.length; i++) {
            theDashArray[i] = theDashArray[i] * Tough2Viewer.dataobj.StretchDashlines;
        }

        int cap = theGridLineStroke.getEndCap();
        int join = theGridLineStroke.getLineJoin();
        float miterlimit = theGridLineStroke.getMiterLimit();
        float dashphase = theGridLineStroke.getDashPhase();
        BasicStroke myGridLineStroke = new BasicStroke(linewidth, cap, join, miterlimit, theDashArray, dashphase);
        float offset = Tough2Viewer.dataobj.GridOffSet;
        plot.setAxisOffset(new RectangleInsets(offset, offset, offset, offset));
        plot.setDomainGridlineStroke(myGridLineStroke);
        plot.setRangeGridlineStroke(myGridLineStroke);
        plot.setBackgroundPaint(Tough2Viewer.dataobj.PlotAreaColor);
        //
        //
        final NumberAxis yAxis2 = new NumberAxis(VariableY2Name);

        //yAxis2.setAutoRangeIncludesZero(true);
        plot.setDataset(1, dataset_var2);

        plot.setRangeAxis(1, yAxis2);
        plot.mapDatasetToRangeAxis(0, 0);
        plot.mapDatasetToRangeAxis(1, 1);

        plot.setRenderer(0, renderer1);
        plot.setRenderer(1, renderer2);
        Tough2Viewer.dataobj.ScientificNotationAxis(plot);
        ChartPanel panelchart1 = new ChartPanel(chart_advanced_B);

        panelchart1.setSize(jPanel4.getSize());
        panelchart1.setVisible(true);

        jPanel4.removeAll();
        jPanel4.repaint();
        jPanel4.add(panelchart1, BorderLayout.CENTER);
        jPanel4.setVisible(true);
        jPanel4.getParent().validate();
        jPanel4.repaint();

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
            java.util.logging.Logger.getLogger(PlotXYvari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlotXYvari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlotXYvari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlotXYvari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlotXYvari().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
