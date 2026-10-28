//OOP3_12 (final). Base has final void show() printing Base show. Try to override show() in Child1 extends Base, write the compile error as a comment, then delete the override. Also try final class Safe with class Hack extends Safe, comment the error, and delete Hack. Call new Child1().show().
class Base {
    final void show() {
        System.out.println("Base show");
    }
}

class Child1 extends Base {
    // Attempting to override show() causes a compiler error:
    // show() in Child1 cannot override show() in Base
    // overridden method is final

    // @Override
    // void show() {
    //     System.out.println("Child show");
    // }
}

final class Safe {
}

// Attempting to extend Safe causes a compiler error:
// cannot inherit from final Safe

// class Hack extends Safe {
// }

public class OOP3_12 {
    public static void main(String[] args) {
        new Child1().show();
    }
}
