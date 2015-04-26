package javafxchartsample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;

/**
 * JavaFX Chart Sample
 * 
 * @author tomo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private PieChart pieChart;
    @FXML private LineChart lineChart;
    @FXML private AreaChart areaChart;
    @FXML private BubbleChart bubbleChart;
    @FXML private ScatterChart scatterChart;
    @FXML private BarChart barChart;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setPieChart();
        setLineChart();
        setAreaChart();
        setBubbleChart();
        setScatterChart();
        setBarChart();
    }    

    private void setPieChart() {
        ObservableList<PieChart.Data> pieData = FXCollections.observableArrayList(
                new PieChart.Data("Oranges", 60),
                new PieChart.Data("Apples", 30),
                new PieChart.Data("Pears", 10)
        );
        pieChart.setData(pieData);
        pieChart.setTitle("PieChart");
    }    

    private void setLineChart() {
        lineChart.setTitle("LineChart");
        XYChart.Series<String, Number> series =new  XYChart.Series<>();
        series.getData().addAll(new XYChart.Data<>("1", 10),
                new XYChart.Data<>("2", 20),
                new XYChart.Data<>("3", 30)
                );
        lineChart.getData().add(series);
    }

    private void setAreaChart() {
        areaChart.setTitle("AreaChart");
        XYChart.Series<String, Number> seriesApril = new XYChart.Series<>();
        seriesApril.getData().addAll(
                new XYChart.Data<>("1", 1),
                new XYChart.Data<>("2", 2),
                new XYChart.Data<>("3", 3)
                );
        XYChart.Series<String, Number> seriesMay = new XYChart.Series<>();
        seriesMay.getData().addAll(
                new XYChart.Data<>("1", 2),
                new XYChart.Data<>("2", 4),
                new XYChart.Data<>("3", 6)
                );
        areaChart.getData().addAll(seriesApril, seriesMay);
        
    }

    private void setBubbleChart() {
        bubbleChart.setTitle("BubbleChart");
        XYChart.Series<Number, Number> s1 = new XYChart.Series<>();
        s1.getData().addAll(
                new XYChart.Data<>(1, 1, 0.1),
                new XYChart.Data<>(2, 2, 0.2),
                new XYChart.Data<>(3, 3, 0.3)
        );
        XYChart.Series<Number, Number> s2 = new XYChart.Series<>();
        s2.getData().addAll(
                new XYChart.Data<>(1, 2, 0.2),
                new XYChart.Data<>(2, 4, 0.4),
                new XYChart.Data<>(3, 6, 0.6)
        );
        bubbleChart.getData().addAll(s1,s2);
    }

    private void setScatterChart() {
        scatterChart.setTitle("ScatterChart");
        XYChart.Series<String, Number> s1 = new XYChart.Series<>();
        s1.getData().addAll(
                new XYChart.Data<>("1", 1),
                new XYChart.Data<>("2", 2),
                new XYChart.Data<>("3", 3)
        );
        scatterChart.getData().addAll(s1);
    }

    private void setBarChart() {
        barChart.setTitle("BarChart");
        String c1 = "Japan";
        String c2 = "U.S";
        String c3 = "Italy";
        XYChart.Series<String, Number> s1 = new XYChart.Series<>();
        s1.setName("2013");
        s1.getData().addAll(
                new XYChart.Data<>(c1, 1),
                new XYChart.Data<>(c2, 2),
                new XYChart.Data<>(c3, 3)
        );
        XYChart.Series<String, Number> s2 = new XYChart.Series<>();
        s2.setName("2014");
        s2.getData().addAll(
                new XYChart.Data<>(c1, 2),
                new XYChart.Data<>(c2, 4),
                new XYChart.Data<>(c3, 6)
        );
        barChart.getData().addAll(s1, s2);
    }
    
}
