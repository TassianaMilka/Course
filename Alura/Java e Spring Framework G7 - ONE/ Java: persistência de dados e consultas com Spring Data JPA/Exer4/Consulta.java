
/* Esta query derivada utiliza corretamente a cláusula AndDateBetween para buscar todas as consultas realizadas por um médico 
específico entre duas datas.*/

public List<Consulta> findConsultaByMedicoIdAndDateBetween(Integer medicoId, LocalDate dataInicial, LocalDate dataFinal);
