package manthonytat.Superhero.Superhero;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

public class SuperheroCreateDTO {
  @Getter
  @Setter
  @NotBlank
  private String name;

  @Getter
  @Setter
  @NotBlank
  private String slug;

  @Getter
  @Setter
  @NotNull
  private Powerstats powerstats;

  @Getter
  @Setter
  @NotNull
  private Appearance appearance;

  @Getter
  @Setter
  @NotNull
  private Biography biography;

  @Getter
  @Setter
  @NotNull
  private Work work;

  @Getter
  @Setter
  @NotNull
  private Connections connections;

  @Getter
  @Setter
  @NotNull
  private Images images;
}
