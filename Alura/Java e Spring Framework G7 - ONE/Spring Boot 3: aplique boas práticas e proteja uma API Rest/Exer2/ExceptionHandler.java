
/*Classes de tratamento de exceptions devem ser anotadas com o @RestControllerAdvice e não com o @RestController */


@RestController
public class ExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public void tratarErro404() {
    }

}
