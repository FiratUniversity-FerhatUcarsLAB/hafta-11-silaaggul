public class Exercise4_2 {

  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) {   // 1
        zippo("rattle", 13);                   // 2
    }

    public static void baffle(String blimp) {
        System.out.println(blimp);            // 4
        zippo("ping", -5);                    // 5
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {                                    // 6
            System.out.println(quince + " zoop");          // 7
        } else {
            System.out.println("ik");                      // 3
            baffle(quince);                                // 8
            System.out.println("boo-wa-ha-ha");            // 9
        }
    }
}
