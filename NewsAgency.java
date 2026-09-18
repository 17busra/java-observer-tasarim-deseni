
import java.util.*;

interface Observer {

   
    void update(String message);
}


class EmailUser implements Observer {

    private String name;

    public EmailUser(String name) {

         this.name = name;
    }

    @Override

    public void update(String message) {

          System.out.println(name + ": " + message);
    }
}

class NewsAgency {

   private List<Observer> observers =
            new ArrayList<>();
   public void addObserver(Observer observer) {

        observers.add(observer);
    }

      public void notifyObservers(String msg) {

         for(Observer o : observers) {

                    o.update(msg);
        }
    }
}


public class Main {



public static void main(String[] args) {

      NewsAgency agency = new NewsAgency();

        Observer u1 =
                new EmailUser("Ayşe");

        agency.addObserver(u1);

        agency.notifyObservers("Yeni haber!");
    }
}
