
/*O Spring lançará uma exceção na inicialização.De um conflito de mapeamento.*/

@GetMapping("/home")  
public String homePage() {  
    return "Home Page";  
}  

@GetMapping("/home")  
public String anotherHomePage() {  
    return "Another Home Page";  
} 
