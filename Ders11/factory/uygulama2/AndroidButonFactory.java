package cc.ders12.factory.uygulama2;

public class AndroidButonFactory implements IButonFactory {
    @Override
    public IButon factoryMethod() {
        return new AndroidButon();
    }
}
