package manthonytat.Superhero.Superhero;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Embeddable
public class Connections {
  @Getter
  @Setter
  @NotBlank
  private String groupAffiliation;

  @Getter
  @Setter
  @NotBlank
  private String relatives;
}
