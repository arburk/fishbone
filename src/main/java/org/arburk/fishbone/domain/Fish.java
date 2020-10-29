package org.arburk.fishbone.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
@AllArgsConstructor
@Builder
public class Fish {

  public enum Language {
    DE,
    EN,
    IT,
    FR
  }

  private final long id;
  private final Map<Language, String> names;
  private String description;

  @JsonFormat(pattern="yyyy-MM-dd")
  private final Date createdOn = new Date();

}
