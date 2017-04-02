/**
 * Created by fatimam on 30/03/2017.
 */
public class Singleton
{
        private static Singleton singleton = null;
        private String name;
        private Singleton() {
        }
        public static Singleton getInstance() {
            if (singleton == null) {
                singleton= new Singleton();
            }
            return singleton;
        }
        public String FirstName(String name) {
            this.name=name;
            return this.name;
        }
}
