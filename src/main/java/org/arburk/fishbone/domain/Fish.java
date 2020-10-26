package org.arburk.fishbone.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import net.bytebuddy.utility.RandomString;

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

  /**
   * Test for codeQL to verify if the UseBraces.ql identifies the missing braces
   */
  public void generateRandomDescription() {
    if(1==1)
      f();
      g();	// Alert
  }

  public void f() {
  }

  public void g() {
  }


}
