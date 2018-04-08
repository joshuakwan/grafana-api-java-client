/* Licensed under Apache-2.0 */
package com.appnexus.grafana.client.models;

import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class DashboardTemplateList {
  DashboardTemplateListCurrent current;
  Integer hide;
  Boolean includeAll;
  String label;
  Boolean multi;
  String name;
  List<DashboardTemplateListOption> options;
  String query;
  String type;

  String datasource;

  // TODO need to map integer to options
  Integer refresh;
}
