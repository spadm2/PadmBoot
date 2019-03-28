package com.bluedart.location.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;


@Component
public class ReportUtilImpl implements ReportUtil {

	@Override
	public void generatePaiChart(String path, List<Object[]> data) {
		DefaultPieDataset dataset=new DefaultPieDataset();
		for (Object[] objects : data) {
			dataset.setValue(objects[0].toString(), new Double(objects[1].toString()));
		}
		JFreeChart chart = ChartFactory.createPieChart3D("location details", dataset);
		try {
			ChartUtilities.saveChartAsJPEG(new File(path), chart, 400, 400);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
