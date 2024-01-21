package manthonytat.Superhero.Superhero;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SuperheroService {
  
  @Autowired
  private SuperheroRepository superheroRepository;

  public List<Superhero> getAll(){
    return this.superheroRepository.findAll();
  }

  public Superhero createSuperhero(SuperheroCreateDTO data){
    String name = data.getName().trim();
    String slug = data.getSlug().trim();
    Powerstats powerstats = data.getPowerstats();
    Appearance appearance = data.getAppearance();
    Biography biography = data.getBiography();
    Work work = data.getWork();
    Connections connections = data.getConnections();
    Images images = data.getImages();

    Superhero newSuperhero = new Superhero(name, slug, powerstats, appearance, biography, work, connections, images);
    Superhero created = this.superheroRepository.save(newSuperhero);
    return created;
  }

  public Optional<Superhero> getById(Long id) {
    Optional<Superhero> foundSuperhero = superheroRepository.findById(id);
    return foundSuperhero;
  }

  public boolean deleteById(Long id) {
    Optional<Superhero> foundSuperhero = superheroRepository.findById(id);

    if(foundSuperhero.isPresent()){
      this.superheroRepository.delete(foundSuperhero.get());
      return true;
    }
    return false;
  }

  public Optional<Superhero> updateById(Long id, SuperheroUpdateDTO data){
    Optional<Superhero> foundSuperhero = superheroRepository.findById(id);

    if(foundSuperhero.isPresent()){
      Superhero toUpdate = foundSuperhero.get();
      BeanUtils.copyProperties(data, toUpdate);
      Superhero updatedSuperhero = this.superheroRepository.save(toUpdate);
      return Optional.of(updatedSuperhero);
    }

    return foundSuperhero;
  }
}
