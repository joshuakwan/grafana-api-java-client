package com.appnexus.grafana.client.models;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class DashboardPanelLegend {
    Boolean avg;
    Boolean current;
    Boolean max;
    Boolean min;
    Boolean show;
    Boolean total;
    Boolean values;
    Boolean hideEmpty;
    Boolean hideZero;
    Boolean alignAsTable;
    Boolean rightSide;
}