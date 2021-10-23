package com.listaEncadeada;

public class listaEncadeada<T>{

    private No<T> referenciaEntrada;

    public listaEncadeada(){
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<T>(conteudo);
        if (this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < size() - 1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }


    public No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for (int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    private int size() {
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while (true){
            if (referenciaAux != null){
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else {
                    break;
                }
            }else {
                break;
            }
        }
        return tamanhoLista;
    }

    private void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteudo no indice " + index + " desta lista. Está lista so vai ate " + ultimoIndice + ".");
        }
    }


    private boolean isEmpty() {
        return referenciaEntrada == null ? true : false;
    }

    public No<T> getReferenciaEntrada() {
        return referenciaEntrada;
    }

    public void setReferenciaEntrada(No<T> referenciaEntrada) {
        this.referenciaEntrada = referenciaEntrada;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo = " + noAuxiliar.getConteudo() + " }] -->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    public T remove(int index) {
        validaIndice(index);
        No<T> noPivor = getNo(index);
        if (index == 0){
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
            noAnterior.setProximoNo(noPivor.getProximoNo());
            return noPivor.getConteudo();
        }
}
