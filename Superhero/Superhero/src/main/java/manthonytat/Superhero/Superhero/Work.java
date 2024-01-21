package manthonytat.Superhero.Superhero;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
public class Work {
  @Getter
  @Setter
  private String occupation;

  @Getter
  @Setter
  private String base;
}
