package manthonytat.Superhero.Superhero;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "superheros")
public class Superhero {

  @Getter
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

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

  public Superhero() {};

  public Superhero(String name, String slug, Powerstats powerstats, Appearance appearance, Biography biography, Work work, Connections connections, Images images) {
    this.name = name;
    this.slug = slug;
    this.powerstats = powerstats;
    this.appearance = appearance;
    this.biography = biography;
    this.work = work;
    this.connections = connections;
    this.images = images;
  };
}
