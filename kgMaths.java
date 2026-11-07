public class kgMaths {
    public static void main(String[] args) {
        System.out.println(Math.abs(-99));
        System.out.println(Math.round(5.5));
        System.out.println(Math.ceil(5.6));
        System.out.println(Math.floor(5.5));
        System.out.println(Math.random());

        for (int i = 0; i < 10; i++) {
            long random = Math.round(Math.random() * 100);
            System.out.println(random);
        }
    }
}
