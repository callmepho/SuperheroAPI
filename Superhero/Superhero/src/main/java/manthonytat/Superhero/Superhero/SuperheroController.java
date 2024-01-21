package manthonytat.Superhero.Superhero;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import manthonytat.Superhero.Exceptions.NotFoundException;

@RestController
@RequestMapping("/superheros")
public class SuperheroController {
  @Autowired
  private SuperheroService superheroService;

  @GetMapping
  public ResponseEntity<List<Superhero>> getAll(){
    List<Superhero> allSuperheros = this.superheroService.getAll();
    return new ResponseEntity<>(allSuperheros, HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Superhero> createSuperhero(@Valid @RequestBody SuperheroCreateDTO data){
    Superhero newSuperhero = this.superheroService.createSuperhero(data);
    return new ResponseEntity<Superhero>(newSuperhero, HttpStatus.CREATED);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Superhero> getById(@PathVariable Long id){
    Optional<Superhero> found = this.superheroService.getById(id);

    if(found.isPresent()){
      return new ResponseEntity<Superhero>(found.get(), HttpStatus.OK);
    }
    throw new NotFoundException(String.format("Superhero with id: %d does not exist", id));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Superhero> deleteById(@PathVariable Long id){
    boolean deleted = this.superheroService.deleteById(id);

    if(deleted == true){
      return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }

    throw new NotFoundException(String
				.format("Superhero with id: %d does not exist, could not delete", id));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Superhero> updateById(@PathVariable Long id, @Valid @RequestBody SuperheroUpdateDTO data){
    Optional<Superhero> updated = this.superheroService.updateById(id, data);

    if(updated.isPresent()){
      return new ResponseEntity<Superhero>(updated.get(), HttpStatus.OK);
    }

    throw new NotFoundException(String
				.format("Superhero with id: %d does not exist, could not delete", id));
  }
}
