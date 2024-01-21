package manthonytat.Superhero.Superhero;

import java.util.List;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Embeddable
public class Biography {
  @Getter
  @Setter
  @NotBlank
  private String fullName;

  @Getter
  @Setter
  @NotBlank
  private String alterEgos;

  @Getter
  @Setter
  @Size(min = 1)
  private List<String> aliases;

  @Getter
  @Setter
  @NotBlank
  private String placeOfBirth;

  @Getter
  @Setter
  @NotBlank
  private String firstAppearance;

  @Getter
  @Setter
  @NotBlank
  private String publisher;

  @Getter
  @Setter
  @NotBlank
  private String alignment;
}
