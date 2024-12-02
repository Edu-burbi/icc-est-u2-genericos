package models.genericos;

public class Par <K,V>{
    private K clave;
    private V valor;

    public Par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public void establecerClave(K clave){
        this.clave = clave;
    }

    public void establecerValor(V valor){
        this.valor = valor;
    }

    public K obtenerClave(){
        return this.clave;
    }

    public V obtenerValor(){
        return this.valor;
    }

    @Override
    public String toString() {
        return "Par [clave: " + clave + ", valor: " + valor + "]";
    }
}
