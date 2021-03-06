package de.yanwittmann.j2chartjs.data;

import de.yanwittmann.j2chartjs.dataset.ChartDataset;
import de.yanwittmann.j2chartjs.dataset.PolarAreaChartDataset;
import de.yanwittmann.j2chartjs.preset.ChartColors;

public class PolarAreaChartData extends ChartData<PolarAreaChartData, PolarAreaChartDataset, Number> {
    @Override
    public PolarAreaChartData applyDefaultStylePerDatapoint() {
        for (ChartDataset<PolarAreaChartDataset, Number> dataset : datasets) {
            if (dataset instanceof PolarAreaChartDataset) {
                ((PolarAreaChartDataset) dataset)
                        .setBackgroundColor(ChartColors.BACKGROUNDS)
                        .setBorderColor(ChartColors.BORDERS);
            }
        }
        return this;
    }

    @Override
    public PolarAreaChartData applyDefaultStylePerDataset() {
        int colorIndex = 0;
        for (ChartDataset<PolarAreaChartDataset, Number> dataset : datasets) {
            if (dataset instanceof PolarAreaChartDataset) {
                ((PolarAreaChartDataset) dataset)
                        .addBackgroundColor(ChartColors.BACKGROUNDS.get(colorIndex % ChartColors.BACKGROUNDS.size()))
                        .addBorderColor(ChartColors.BORDERS.get(colorIndex % ChartColors.BORDERS.size()));
                colorIndex++;
            }
        }
        return this;
    }
}
