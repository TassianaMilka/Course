

/*Ele retorna uma lista de todos os pacientes do banco de dados, lembrando de converter em DTO e modifica o endpoint.*/

@GetMapping("/pacientes")
public List<PacienteDTO> obterPacientes(){
    return converteDados(pacienteRepository.findAll());
}
