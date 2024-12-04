/*Corresponde ao padrão definido no mapeamento /users/{id}*/

@GetMapping("/users/{id}")  
public String getUserById(@PathVariable Long id) {  
    return "User ID: " + id;  
}



// /users/123
