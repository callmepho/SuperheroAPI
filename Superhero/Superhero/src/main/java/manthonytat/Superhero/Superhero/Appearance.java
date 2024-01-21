package manthonytat.Superhero.Superhero;

import java.util.List;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Embeddable
public class Appearance {
  @Getter
  @Setter
  @NotBlank
  private String gender;

  @Getter
  @Setter
  @NotBlank
  private String race;

  @Getter
  @Setter
  @NotNull
  @Size(min = 2, max = 2)
  private List<String> height;

  @Getter
  @Setter
  @NotNull
  @Size(min = 2, max = 2)
  private List<String> weight;

  @Getter
  @Setter
  @NotBlank
  private String eyeColor;

  @Getter
  @Setter
  @NotBlank
  private String hairColor;
}
