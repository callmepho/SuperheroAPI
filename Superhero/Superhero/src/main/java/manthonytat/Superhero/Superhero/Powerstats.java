package manthonytat.Superhero.Superhero;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Embeddable
public class Powerstats {
  @Getter
  @Setter
  @NotNull
  private int intelligence;

  @Getter
  @Setter
  @NotNull
  private int strength;

  @Getter
  @Setter
  @NotNull
  private int speed;

  @Getter
  @Setter
  @NotNull
  private int durability;

  @Getter
  @Setter
  @NotNull
  private int power;

  @Getter
  @Setter
  @NotNull
  private int combat;
}