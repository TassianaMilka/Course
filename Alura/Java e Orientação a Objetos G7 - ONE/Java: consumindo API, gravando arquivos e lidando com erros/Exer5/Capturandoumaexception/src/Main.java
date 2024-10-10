//O código vai gerar um erro de compilação.

try {
Pessoa p = null;
  System.out.println(p.getNome());
        } catch (Exception e) {
        System.out.println("Exception");
} catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array Index Out Of Bounds Exception");
} catch (NullPointerException e) {
        System.out.println("Null Pointer Exception");
}