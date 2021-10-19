package com.filas;

class Fila {

    private No refNoEntradaFila = null;

    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public No dequeue(){
        if(!isEmpty()){
            No primeiroNO = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true){
                if(primeiroNO.getRefNo() != null){
                    noAuxiliar = primeiroNO;
                    primeiroNO = primeiroNO.getRefNo();
                }else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNO;
        }
        return null;
    }

    public No first(){
        if(!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
            return primeiroNo;
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
