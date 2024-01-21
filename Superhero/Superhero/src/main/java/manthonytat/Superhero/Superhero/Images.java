package manthonytat.Superhero.Superhero;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Embeddable
public class Images {
  @Getter
  @Setter
  @NotBlank
  private String xs;

  @Getter
  @Setter
  @NotBlank
  private String sm;

  @Getter
  @Setter
  @NotBlank
  private String md;

  @Getter
  @Setter
  @NotBlank
  private String lg;
}
