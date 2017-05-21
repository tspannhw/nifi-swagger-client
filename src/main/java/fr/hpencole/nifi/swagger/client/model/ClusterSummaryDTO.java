/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.1.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package fr.hpencole.nifi.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClusterSummaryDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-21T18:12:37.188+02:00")
public class ClusterSummaryDTO {
  @SerializedName("connectedNodes")
  private String connectedNodes = null;

  @SerializedName("connectedNodeCount")
  private Integer connectedNodeCount = null;

  @SerializedName("totalNodeCount")
  private Integer totalNodeCount = null;

  @SerializedName("connectedToCluster")
  private Boolean connectedToCluster = false;

  @SerializedName("clustered")
  private Boolean clustered = false;

  public ClusterSummaryDTO connectedNodes(String connectedNodes) {
    this.connectedNodes = connectedNodes;
    return this;
  }

   /**
   * When clustered, reports the number of nodes connected vs the number of nodes in the cluster.
   * @return connectedNodes
  **/
  @ApiModelProperty(example = "null", value = "When clustered, reports the number of nodes connected vs the number of nodes in the cluster.")
  public String getConnectedNodes() {
    return connectedNodes;
  }

  public void setConnectedNodes(String connectedNodes) {
    this.connectedNodes = connectedNodes;
  }

  public ClusterSummaryDTO connectedNodeCount(Integer connectedNodeCount) {
    this.connectedNodeCount = connectedNodeCount;
    return this;
  }

   /**
   * The number of nodes that are currently connected to the cluster
   * @return connectedNodeCount
  **/
  @ApiModelProperty(example = "null", value = "The number of nodes that are currently connected to the cluster")
  public Integer getConnectedNodeCount() {
    return connectedNodeCount;
  }

  public void setConnectedNodeCount(Integer connectedNodeCount) {
    this.connectedNodeCount = connectedNodeCount;
  }

  public ClusterSummaryDTO totalNodeCount(Integer totalNodeCount) {
    this.totalNodeCount = totalNodeCount;
    return this;
  }

   /**
   * The number of nodes in the cluster, regardless of whether or not they are connected
   * @return totalNodeCount
  **/
  @ApiModelProperty(example = "null", value = "The number of nodes in the cluster, regardless of whether or not they are connected")
  public Integer getTotalNodeCount() {
    return totalNodeCount;
  }

  public void setTotalNodeCount(Integer totalNodeCount) {
    this.totalNodeCount = totalNodeCount;
  }

  public ClusterSummaryDTO connectedToCluster(Boolean connectedToCluster) {
    this.connectedToCluster = connectedToCluster;
    return this;
  }

   /**
   * Whether this NiFi instance is connected to a cluster.
   * @return connectedToCluster
  **/
  @ApiModelProperty(example = "null", value = "Whether this NiFi instance is connected to a cluster.")
  public Boolean getConnectedToCluster() {
    return connectedToCluster;
  }

  public void setConnectedToCluster(Boolean connectedToCluster) {
    this.connectedToCluster = connectedToCluster;
  }

  public ClusterSummaryDTO clustered(Boolean clustered) {
    this.clustered = clustered;
    return this;
  }

   /**
   * Whether this NiFi instance is clustered.
   * @return clustered
  **/
  @ApiModelProperty(example = "null", value = "Whether this NiFi instance is clustered.")
  public Boolean getClustered() {
    return clustered;
  }

  public void setClustered(Boolean clustered) {
    this.clustered = clustered;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterSummaryDTO clusterSummaryDTO = (ClusterSummaryDTO) o;
    return Objects.equals(this.connectedNodes, clusterSummaryDTO.connectedNodes) &&
        Objects.equals(this.connectedNodeCount, clusterSummaryDTO.connectedNodeCount) &&
        Objects.equals(this.totalNodeCount, clusterSummaryDTO.totalNodeCount) &&
        Objects.equals(this.connectedToCluster, clusterSummaryDTO.connectedToCluster) &&
        Objects.equals(this.clustered, clusterSummaryDTO.clustered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectedNodes, connectedNodeCount, totalNodeCount, connectedToCluster, clustered);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterSummaryDTO {\n");
    
    sb.append("    connectedNodes: ").append(toIndentedString(connectedNodes)).append("\n");
    sb.append("    connectedNodeCount: ").append(toIndentedString(connectedNodeCount)).append("\n");
    sb.append("    totalNodeCount: ").append(toIndentedString(totalNodeCount)).append("\n");
    sb.append("    connectedToCluster: ").append(toIndentedString(connectedToCluster)).append("\n");
    sb.append("    clustered: ").append(toIndentedString(clustered)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
