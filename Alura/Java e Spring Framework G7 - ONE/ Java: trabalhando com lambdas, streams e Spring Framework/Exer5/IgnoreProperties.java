/*A anotação @JsonIgnoreProperties é a maneira correta de ignorar as propriedades desejadas no Java, 
colocando seu atributo ignoreUnknown como true, visto que por padrão ele é setado como false.*/

@JsonIgnoreProperties(ignoreUnknown = true)
