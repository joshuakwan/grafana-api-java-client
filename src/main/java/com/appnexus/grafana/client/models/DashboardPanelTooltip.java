package com.appnexus.grafana.client.models;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class DashboardPanelTooltip {
    Boolean msResolution;
    Boolean shared;
    Integer sort;
    String valueType;
}
