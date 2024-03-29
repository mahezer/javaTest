package luizalabs.Models;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

public class Items implements Serializable{
  private static final long serialVersionUID = 1L;
  
  @JsonProperty("items")
  @Getter @Setter private List<Item> items;
  
  public Items(List<Item> itemsList) {
    this.items = itemsList;
    this.filter = null;
    this.orderBy = null;
    this.groupBy = null;
  }

  @JsonProperty("filter")
  @Getter @Setter private String filter;
  
  @JsonProperty("orderBy")
  @Getter @Setter private String orderBy;

  @JsonProperty("groupBy")
  @Getter @Setter private String groupBy;
}
