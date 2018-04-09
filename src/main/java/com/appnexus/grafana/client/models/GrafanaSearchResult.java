/* Licensed under Apache-2.0 */
package com.appnexus.grafana.client.models;

import java.util.List;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class GrafanaSearchResult {
    Integer id;
    String uid;
    String title;
    String ur;
    String type;
    List<String> tags;
    Boolean isStarred;
    Integer folderId;
    String forlderUid;
    String folderTitle;
    String folderUrl;
    String uri; // deprecated in Grafana v5.0
}
