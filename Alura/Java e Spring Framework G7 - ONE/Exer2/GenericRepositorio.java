/* utiliza de forma correta o conceito de tipos genéricos, possibilitando que o repository salve diferentes tipos de dados, 
diminuindo a repetição de código.*/

public class GenericRepository<T> { 
    public T save(T t) {
        // Código para salvar 't' no banco de dados
    }
}


public class GenericRepository {
    public <T> T save(T t) {
        // Código para salvar 't' no banco de dados
    }
}

