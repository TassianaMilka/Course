
/*Uma maneira correta de criar uma primeira rota HTTP para visualizar todos os animais.*/

@GetMapping("/animais")
public String getAnimais(){
    return "Todos os animais";
}

