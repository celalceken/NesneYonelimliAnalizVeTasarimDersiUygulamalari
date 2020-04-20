package cc.ders12.observer;

import java.util.ArrayList;
import java.util.List;

    public class Publisher implements ISubject {


        private List<IObserver> subscribers = new ArrayList<>();

        @Override
        public void attach(IObserver subscriber) {
            subscribers.add(subscriber);
        }

        @Override
        public void detach(IObserver subscriber) {
            subscribers.remove(subscriber);
        }

        @Override
        public void notify(String mesaj) {
            for(IObserver subscriber: subscribers) {
                subscriber.update(mesaj);
            }
        }






    }
