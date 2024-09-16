/**
 * finally keywords guarantees to process all necessary actions in code
 * specially for this case we talk about sw.off() method to off switch object
 * after some manipulations with it...
 */
public class Main {
    public static void main(String[] args) {
        print(testFinally());
    }

    public static void print(Object obj) {
        System.out.println(obj);
    }
    public static String testFinally() {
        Switch sw = OnOffSwitch.getSw();
        try {
            sw.on();
            OnOffSwitch.f();
            sw.off();
        } catch (OnOffException1 e) {
            print(e.getCause());
            sw.off();
            return "1";
        } catch (OnOffException2 e) {
            print(e.getCause());
            sw.off();
            return "2";
        } finally {
            sw.off();
            //return "finally";
        }
        return "function end";
    }
}
