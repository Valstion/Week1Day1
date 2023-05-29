public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int num = 23;
        int[] nums = {5, 8, 30};
        int[] nums1 = new int[5];
        boolean isTasty = true;
        boolean[] options = {true, true, false, true, true};
        boolean[] options1 = new boolean[5]; // default value = true
        if (5 > 4) {
            System.out.println("tai tiesa");
        } else if (5 < 4) {
            System.out.println("jie if buvo false. ir jei else if yra tiesa");
        } else System.out.println("bet kok s kita veriantas pries tai aprasyti");
        String result = "";
        result = (5 > 4) ? "jei tiesa" : "jei bet koks kitas variantas";
        String gender = (true) ? "Moteris" : "Vyras";
        String text = "some kind of text";
        while (true) {
            break;
        }
        boolean shoulGo1 = true;
        while (shoulGo1) {
            shoulGo1 = false;
        }
        do {
            System.out.println("Vykdis bet kokiu atveju 1 karta");
        } while (false);
        for (int g = 0; g < nums1.length; g++) {
            System.out.println(nums1[g]);
        }
        for (int g = 0; g < nums1.length; g++) {
            if (g % 2 == 0) {
                continue;
            }
            System.out.println(nums1[g]);
        }
        for (int g = 0; g < nums1.length; g++) {
            if (g == 5) {
                break;
            }
            System.out.println(nums1[g]);
        }
    }
}