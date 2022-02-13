package Modelo;

public class Ordenador {
    public void insertionSortMayorMenor(DoubleLinkList lista){
        int i, j;  
        Movie key;
        for (i = 1; i < lista.getSize(); i++){
            key = lista.getIndexLink(i).getData();
            j = i - 1;  
            while (j >= 0 && Integer.parseInt(lista.getIndexLink(j).getData().getId())  < Integer.parseInt(key.getId())){
                lista.getIndexLink(j+1).setData(lista.getIndexLink(j).getData()); 
                j = j - 1;  
            }
            lista.getIndexLink(j+1).setData(key);
            
        }  
    }

    public void insertionSortMenorMayor(DoubleLinkList lista){
        int i, j;  
        Movie key;
        for (i = 1; i < lista.getSize(); i++){
            key = lista.getIndexLink(i).getData();
            j = i - 1;  
            while (j >= 0 && Integer.parseInt(lista.getIndexLink(j).getData().getId())  > Integer.parseInt(key.getId())){
                lista.getIndexLink(j+1).setData(lista.getIndexLink(j).getData()); 
                j = j - 1;  
            }
            lista.getIndexLink(j+1).setData(key);
            
        }  
    }
}

