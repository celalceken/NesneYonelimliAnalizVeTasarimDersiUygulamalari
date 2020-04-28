package cc.ders12.factory.uygulama2;

public class UbuntuButonFactory implements IButonFactory {
    @Override
    public IButon factoryMethod() {
        return new UbuntuButon();
    }
}
