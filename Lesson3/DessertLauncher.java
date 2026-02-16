public class DessertLauncher {
    public static void main(String[] args) {
        System.out.println("测试 Dessert.main():");
        Dessert.main(null);  // 应该输出 "I love dessert!"

        System.out.println("\n测试 Dessert 对象:");

        // 创建第一个 dessert
        Dessert d1 = new Dessert(1, 2);
        d1.printDessert();  // 应该输出: 1 2 1

        // 创建第二个 dessert
        Dessert d2 = new Dessert(3, 4);
        d2.printDessert();  // 应该输出: 3 4 2

        // 再次调用第一个 dessert 的 print 方法，注意 numDesserts 仍然是 2
        System.out.println("再次调用 d1.printDessert():");
        d1.printDessert();
    }
}
