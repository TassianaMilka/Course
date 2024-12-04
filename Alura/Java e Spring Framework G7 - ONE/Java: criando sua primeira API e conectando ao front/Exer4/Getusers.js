

/*Uma forma válida de mapear um endpoint GET e definir um mapeamento de rota que responde a requisições do tipo GET */

@RequestMapping(value = "/users", method = RequestMethod.GET)  
public void getAllUsers() {  
    // lógica aqui  
}


@GetMapping("/users")  
public void getAllUsers() {  
    // lógica aqui  
}
