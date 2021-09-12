# Documentation

**j2ChartJs** provides almost every functionality specified in and follows the structure of the
[official ChartJs 3.x documentation](https://www.chartjs.org/docs/latest/).

Also check out the [examples](example.md) after reading through this documentation.

## General structure

The hierarchy of objects is the following:
- Chart
  - Options
  - Data
    - Dataset

### Creating data
Data can be created via datasets of the selected chart type. Every dataset can contain multiple data entries.  
The data type of these entries varies between chart types but is Integer/Double for most of them.  
You can add multiple data entries with the same call by separating them with a `,`. The same can be done with colors
and more.

Example for `BarChart`:
```java
BarChartDataset dataset = new BarChartDataset()
    .setData(12, 32, 8, 45, 27, 23)
    .setBackgroundColor(ChartColors.BACKGROUNDS)
    .addBorderColor(ChartColors.BORDER_RED, ChartColors.BORDER_ORANGE, ChartColors.BORDER_YELLOW);
```

Example for `BubbleChart`:
```java
BubbleChartDataset dataset = new BubbleChartDataset()
    .setLabel("Points in time and space")
    .setBackgroundColor(ChartColors.BACKGROUNDS)
    .setBorderColor(ChartColors.BORDERS)
    .addPointStyle("star");
for (int i = 0; i < 500; i++)
    dataset.addData(new BubbleChartDatapoint(random.nextInt(100), random.nextInt(100), random.nextInt(30) + 10));
```

As seen above, the data/options/chart objects can quickly be further configured via chained API calls.

### Collecting the data
Since multiple datasets can be placed on the same chart, they have to be collected in data objects.  
Also, labels for the dataset entries can be specified here.

Example with `DoughnutPieChartData`:
```java
DoughnutPieChartData data = new DoughnutPieChartData()
    .addDataset(dataset1, dataset2)
    .addLabels("First", "Second", "Third");
```


### Specifying more options
A wide variety of options can be set for the charts. The specification for all of them can be found on the
[official ChartJs 3.x documentation](https://www.chartjs.org/docs/latest/configuration/).

Here is a list of the most frequently used ones:
- `options.responsive`  
  The chart will normally automatically use up as much space as available. This might not be the behaviour you are
  intending to use. To disable automatic resizing and rather use the `width` and `height` property of the `canvas`
  element, set `responsive` to `false`.
  ```java
  new ChartOptions().setResponsive(false);
  ```
- `options.interaction.mode`  
  Setting this option to `index` will show all items at the same index on hovering over the data.  
  ```java
  new ChartOptions().setInteraction(new InteractionOption().setMode("index"));
  ```
- `options.plugins.title`  
  Setting a title alone will not show it, `display` will have to be set to `true` as well.
  ```java
  new ChartOptions().setTitle(new TitleOption().setText("Sample Chart").setDisplay(true));
  ```
- `options.scales`  
  For modifying existing scales or creating new ones.  
  To create/edit the scale of a dataset, add an `x` or `y` axis identifier to the dataset.
  This identifier can now be used to set all kinds of scale options.  
  Also note that the scale `B` doesn't show the grid via `new ScaleGridOption().setDisplay(false)`.
  ```java
  BarChartDataset dataset1 = new BarChartDataset()
      .setLabel("Week 1")
      .setData(40, 65, 59, 72, 81, 56, 55)
      .setyAxisID("A");
  BarChartDataset dataset2 = new BarChartDataset()
      .setLabel("Week 2")
      .setData(40, 65, 59, 72, 81, 56, 55)
      .setyAxisID("B");
  
  LinearScaleOption linearScaleOptionA = new LinearScaleOption()
      .setType("linear")
      .setPosition("left")
      .setSuggestedMax(100)
      .setGrid(new ScaleGridOption()
          .setDisplay(true)
          .setColor(Color.RED));
  LinearScaleOption linearScaleOptionB = new LinearScaleOption()
      .setType("logarithmic")
      .setPosition("right")
      .setBeginAtZero(false)
      .setTicks(new LinearScaleTicksOption()
          .setColor(Color.BLUE))
      .setGrid(new ScaleGridOption()
          .setDisplay(false));
  
  new ChartOptions()
      .addScale("A", linearScaleOptionA)
      .addScale("B", linearScaleOptionB);
  ```
- `options.animation`  
  There are two different animation types: Chart and property animations.  
  Chart animations affect the initialization animation and property animations can affect various properties
  of the charts.
  ```java
  new ChartOptions()
      .addPropertyAnimation(AnimationProperty.BORDER_WIDTH,
          new PropertyAnimationOption<Integer>()
              .setDuration(10000)
              .setFrom(4)
              .setTo(1))
      .setChartAnimation(new ChartAnimationOption()
          .setDelay(1000)
          .setDuration(4000)
          .setEasing(AnimationEasingType.EASE_IN_OUT_QUART)
          .setLoop(true));
  ```
  You can disable animations all together using `new ChartOptions().setAnimationsActive(false);`.
- `options.transitions`  
  Certain events can also be controlled via animations. These are called `transitions`.  
  This transition would move all data points in a dataset to `0 0` when hiding said dataset:
  ```java
  new ChartOptions().addTransition(TransitionAnimationType.HIDE, new TransitionAnimationOption()
      .addPropertyAnimation(AnimationPropertyOption.X, new PropertyAnimationOption<Integer>().setTo(0))
      .addPropertyAnimation(AnimationPropertyOption.Y, new PropertyAnimationOption<Integer>().setTo(0)));
  ```

### Creating the chart
After setting up the `options` and `dataset` objects, a chart of the same type as the dataset can be passed both
parameters.

Here's an example for a `BarChart`:
```java
BarChart chart = new BarChart()
    .setChartOptions(options)
    .setChartData(data);
  ```

To export the configuration as `JSONObject`, use `.toJson()` on the chart object. This JSON can now be used to
initialize the JS chart:
```JavaScript
var ctx = document.getElementById('canvasId');
new Chart(ctx, jsonChartConfiguration);
```

### Other useful tips & tricks
- To apply default colors to the chart dataset entries, use the ChartColor class.
  ```java
  BarChartDataset dataset = new BarChartDataset()
      .setData(12, 32, 8, 45, 27, 23)
      .setLabel("Sample Dataset")
      .setBackgroundColor(ChartColors.BACKGROUNDS)
      .setBorderColor(ChartColors.BORDERS)
      .addBorderWidth(1);
  ```

### Further notes
These are obviously not even half of the features you can use to style and configure your chart.  
Also take a look at the [examples](example.md).