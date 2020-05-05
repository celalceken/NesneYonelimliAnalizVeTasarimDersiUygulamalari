package cc.ders12.iterator;

import java.util.LinkedList;
import java.util.List;

public class PersonelCollection implements IContainer {
    private List<Personel> personelListesi = new LinkedList<Personel>();

    public List<Personel> getPersonelListesi() {
        return personelListesi;
    }

    @Override
    public IIterator getIterator() {
        return new PersonelIterator();
    }

    private class PersonelIterator implements IIterator {

        //int index;
        int index=personelListesi.size()-1;

        @Override
        public boolean hasNext() {

            //if(index < personelListesi.size()){
            if(index >=0){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                //return personelListesi.get(index++);
                return personelListesi.get(index--);
            }
            return null;
        }
    }
}