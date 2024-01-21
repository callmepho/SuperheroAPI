package manthonytat.Superhero.Superhero;

import lombok.Getter;
import lombok.Setter;

public class SuperheroUpdateDTO {
  @Getter
  @Setter
  private String name;

  @Getter
  @Setter
  private String slug;

  @Getter
  @Setter
  private Powerstats powerstats;

  @Getter
  @Setter
  private Appearance appearance;

  @Getter
  @Setter
  private Biography biography;

  @Getter
  @Setter
  private Work work;

  @Getter
  @Setter
  private Connections connections;

  @Getter
  @Setter
  private Images images;
}
