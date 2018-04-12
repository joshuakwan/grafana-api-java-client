package com.appnexus.grafana.client.models;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class OrganizationSuccessfulPost {
    String orgId;
    String message;
}
