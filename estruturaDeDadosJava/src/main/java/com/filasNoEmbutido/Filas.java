package com.filasNoEmbutido;

class Fila {

    private No refNoEntradaFila = null;

    /*
    * Usando o metodo Object para instanciar o obj
    * Alterando o euqueue, incluindo o objeto, como boas práticas
    * foi a execução do programa ficará mais limpo e rapido para um Debug.
    * No dequeue alterou o retorno usando o metodo para capturar o objeto "getobject.
    * */

    public void enqueue(Object obj){
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public Object dequeue(){
        if(!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    public Object first(){
        if(!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
        /*
        * Efetuando a condição booleano para retorna se a condição "refNoEntradaFila é Verdadeiro o falso;
        * */

    }

    @Override
    public String toString() {
        String stringRetoro = "";
        No noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null){
            while (true){
                stringRetoro += "[No{objeto = " + noAuxiliar.getObject() + " }]---->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else {
                    stringRetoro += "null";
                    break;
                }
            }
        }else {
            stringRetoro = "null";
        }
        return stringRetoro;
    }
}
