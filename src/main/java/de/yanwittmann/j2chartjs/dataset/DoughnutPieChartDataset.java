package de.yanwittmann.j2chartjs.dataset;

import de.yanwittmann.util.Util;
import org.json.JSONObject;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unchecked")
public class DoughnutPieChartDataset extends ChartDataset<DoughnutPieChartDataset, Number> {

    private String label;

    /**
     * Sweep to allow arcs to cover.
     */
    private Integer circumference;
    /**
     * Starting angle to draw arcs from.
     */
    private Integer rotation;
    /**
     * The outer radius of the chart. Ending with '%', percentage of the maximum radius.
     */
    private String radius;
    /**
     * The portion of the chart that is cut out of the middle. Ending with '%', percentage of the chart radius.<br>
     * 50% - for doughnut, 0 - for pie
     */
    private String cutout;

    /**
     * Arc background color.
     */
    private List<Color> backgroundColor = null;
    /**
     * Arc border borderColor.
     */
    private List<Color> borderColor = null;
    /**
     * Arc border width (in pixels).
     */
    private List<Number> borderWidth = null;
    /**
     * Arc offset (in pixels).
     */
    private List<Number> offset = null;
    /**
     * Arc background color when hovered.
     */
    private List<Color> hoverBackgroundColor = null;
    /**
     * Arc border borderColor when hovered.
     */
    private List<Color> hoverBorderColor = null;
    /**
     * Arc border width (in pixels) when hovered.
     */
    private List<Number> hoverBorderWidth = null;
    /**
     * Arc offset (in pixels) when hovered.
     */
    private List<Number> hoverOffset = null;
    /**
     * Fixed arc offset (in pixels). Similar to <code>offset</code> but applies to all arcs.
     */
    private List<Number> spacing = null;
    /**
     * The relative thickness of the dataset. Providing a value for weight will cause the pie or doughnut dataset to be drawn with a thickness relative to the sum of all the dataset weight values.
     */
    private List<Number> weight = null;

    public String getLabel() {
        return label;
    }

    public DoughnutPieChartDataset setLabel(String label) {
        this.label = label;
        return this;
    }

    public Integer getCircumference() {
        return circumference;
    }

    public DoughnutPieChartDataset setCircumference(Integer circumference) {
        this.circumference = circumference;
        return this;
    }

    public Integer getRotation() {
        return rotation;
    }

    public DoughnutPieChartDataset setRotation(Integer rotation) {
        this.rotation = rotation;
        return this;
    }

    public String getRadius() {
        return radius;
    }

    public DoughnutPieChartDataset setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    public String getCutout() {
        return cutout;
    }

    public DoughnutPieChartDataset setCutout(String cutout) {
        this.cutout = cutout;
        return this;
    }

    public List<Color> getBackgroundColor() {
        return backgroundColor;
    }

    public DoughnutPieChartDataset setBackgroundColor(List<Color> backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public List<Color> getBorderColor() {
        return borderColor;
    }

    public DoughnutPieChartDataset setBorderColor(List<Color> borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public List<Number> getBorderWidth() {
        return borderWidth;
    }

    public DoughnutPieChartDataset setBorderWidth(List<Number> borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public List<Number> getOffset() {
        return offset;
    }

    public DoughnutPieChartDataset setOffset(List<Number> offset) {
        this.offset = offset;
        return this;
    }

    public List<Color> getHoverBackgroundColor() {
        return hoverBackgroundColor;
    }

    public DoughnutPieChartDataset setHoverBackgroundColor(List<Color> hoverBackgroundColor) {
        this.hoverBackgroundColor = hoverBackgroundColor;
        return this;
    }

    public List<Color> getHoverBorderColor() {
        return hoverBorderColor;
    }

    public DoughnutPieChartDataset setHoverBorderColor(List<Color> hoverBorderColor) {
        this.hoverBorderColor = hoverBorderColor;
        return this;
    }

    public List<Number> getHoverBorderWidth() {
        return hoverBorderWidth;
    }

    public DoughnutPieChartDataset setHoverBorderWidth(List<Number> hoverBorderWidth) {
        this.hoverBorderWidth = hoverBorderWidth;
        return this;
    }

    public List<Number> getHoverOffset() {
        return hoverOffset;
    }

    public DoughnutPieChartDataset setHoverOffset(List<Number> hoverOffset) {
        this.hoverOffset = hoverOffset;
        return this;
    }

    public List<Number> getSpacing() {
        return spacing;
    }

    public DoughnutPieChartDataset setSpacing(List<Number> spacing) {
        this.spacing = spacing;
        return this;
    }

    public List<Number> getWeight() {
        return weight;
    }

    public DoughnutPieChartDataset setWeight(List<Number> weight) {
        this.weight = weight;
        return this;
    }

    public DoughnutPieChartDataset addBackgroundColor(Color... colors) {
        backgroundColor = Util.initializeListIfNull(backgroundColor);
        backgroundColor.addAll(Arrays.asList(colors));
        return this;
    }

    public DoughnutPieChartDataset addBorderColor(Color... colors) {
        borderColor = Util.initializeListIfNull(borderColor);
        borderColor.addAll(Arrays.asList(colors));
        return this;
    }

    public DoughnutPieChartDataset addBorderWidth(Number... widths) {
        borderWidth = Util.initializeListIfNull(borderWidth);
        borderWidth.addAll(Arrays.asList(widths));
        return this;
    }

    public DoughnutPieChartDataset addOffset(Number... offsets) {
        offset = Util.initializeListIfNull(offset);
        offset.addAll(Arrays.asList(offsets));
        return this;
    }

    public DoughnutPieChartDataset addSpacing(Number... spacings) {
        spacing = Util.initializeListIfNull(spacing);
        spacing.addAll(Arrays.asList(spacings));
        return this;
    }

    public DoughnutPieChartDataset addWeight(Number... weights) {
        weight = Util.initializeListIfNull(weight);
        weight.addAll(Arrays.asList(weights));
        return this;
    }

    public DoughnutPieChartDataset addHoverBackgroundColor(Color... colors) {
        hoverBackgroundColor = Util.initializeListIfNull(hoverBackgroundColor);
        hoverBackgroundColor.addAll(Arrays.asList(colors));
        return this;
    }

    public DoughnutPieChartDataset addHoverBorderColor(Color... colors) {
        hoverBorderColor = Util.initializeListIfNull(hoverBorderColor);
        hoverBorderColor.addAll(Arrays.asList(colors));
        return this;
    }

    public DoughnutPieChartDataset addHoverBorderWidth(Number... widths) {
        hoverBorderWidth = Util.initializeListIfNull(hoverBorderWidth);
        hoverBorderWidth.addAll(Arrays.asList(widths));
        return this;
    }

    public DoughnutPieChartDataset addHoverOffset(Number... offsets) {
        hoverOffset = Util.initializeListIfNull(hoverOffset);
        hoverOffset.addAll(Arrays.asList(offsets));
        return this;
    }

    @Override
    public JSONObject toJson() {
        JSONObject datasetJson = new JSONObject();
        Util.addToJson(datasetJson, "data", data);
        Util.addToJson(datasetJson, "label", label);
        Util.addToJson(datasetJson, "circumference", circumference);
        Util.addToJson(datasetJson, "rotation", rotation);
        Util.addToJson(datasetJson, "radius", radius);
        Util.addToJson(datasetJson, "cutout", cutout);
        Util.addToJson(datasetJson, "backgroundColor", backgroundColor);
        Util.addToJson(datasetJson, "borderColor", borderColor);
        Util.addToJson(datasetJson, "borderWidth", borderWidth);
        Util.addToJson(datasetJson, "offset", offset);
        Util.addToJson(datasetJson, "hoverBackgroundColor", hoverBackgroundColor);
        Util.addToJson(datasetJson, "hoverBorderColor", hoverBorderColor);
        Util.addToJson(datasetJson, "hoverBorderWidth", hoverBorderWidth);
        Util.addToJson(datasetJson, "hoverOffset", hoverOffset);
        Util.addToJson(datasetJson, "spacing", spacing);
        Util.addToJson(datasetJson, "weight", weight);
        return datasetJson;
    }
}
