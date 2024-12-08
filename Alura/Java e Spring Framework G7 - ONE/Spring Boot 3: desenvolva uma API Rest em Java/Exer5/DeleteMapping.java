
/*Ocorrerá um erro 404 - not found.*/



@DeleteMapping(“/id”)
public void apagar(@PathVariable Long id) {
    repository.deleteById(id);
}
