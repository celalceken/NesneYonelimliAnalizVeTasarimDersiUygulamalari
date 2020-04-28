package cc.ders12.factory.uygulama2;

class UbuntuButon implements IButon {
    String etiket;

    UbuntuButon(){
        System.out.println("Ubuntu butonu oluştu");
    }


    public String getEtiket() {
        return etiket;
    }

    public void setEtiket(String etiket) {
        this.etiket = etiket;
    }


    @Override
    public void onClick() {

    }

    @Override
    public void onDblClick() {

    }

}
