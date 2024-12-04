public class Fila {
    private int[] valores;
    private int primeiro;
    private int ultimo;
    private int total;

    public Fila() {
        valores = new int [10];
        primeiro = 0;
        ultimo = 0;
        total = 0;
    }

    public void inserir (int elemento) {
        valores[ultimo] = elemento;
        ultimo = ultimo++;
        total++;
    }

    public int remover() {

        int elemento = valores[primeiro];
        //primeiro++;
        total--;

        return elemento;
    }

    public boolean isEmpyt() {
        return total == 0;
    }

    public boolean isFull() {
        return total == valores.length;
    }
}