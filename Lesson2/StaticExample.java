package Lesson2;

public class StaticExample {
    
    // 1. 静态变量（类变量）：所有实例共享同一个值
    public static int staticCounter = 0;
    
    // 2. 实例变量：每个实例都有自己的值
    public int instanceCounter = 0;
    
    // 3. 静态方法：可以直接通过类名调用，不需要创建对象
    public static void staticMethod() {
        System.out.println("这是静态方法，可以通过类名直接调用");
        System.out.println("静态计数器: " + staticCounter);
        // 不能直接访问实例变量和实例方法
        // System.out.println(instanceCounter); // 错误！
    }
    
    // 4. 实例方法：需要通过对象实例来调用
    public void instanceMethod() {
        System.out.println("这是实例方法，需要通过对象实例调用");
        System.out.println("静态计数器: " + staticCounter);  // 可以访问静态变量
        System.out.println("实例计数器: " + instanceCounter); // 可以访问实例变量
    }
    
    // 5. 静态代码块：类加载时执行一次
    static {
        System.out.println("静态代码块执行：类加载时执行一次");
        staticCounter = 100;
    }
    
    // 6. 实例代码块：每次创建对象时执行
    {
        System.out.println("实例代码块执行：每次创建对象时执行");
        instanceCounter = 10;
    }
    
    // 7. 构造函数
    public StaticExample() {
        System.out.println("构造函数执行");
        staticCounter++;
        instanceCounter++;
    }
    
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        System.out.println("=== 演示静态方法调用 ===");
        // 直接通过类名调用静态方法
        StaticExample.staticMethod();
        
        System.out.println("\n=== 演示静态变量共享 ===");
        // 创建多个对象
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        StaticExample obj3 = new StaticExample();
        
        // 所有对象共享同一个静态变量
        System.out.println("obj1的静态计数器: " + obj1.staticCounter);
        System.out.println("obj2的静态计数器: " + obj2.staticCounter);
        System.out.println("obj3的静态计数器: " + obj3.staticCounter);
        System.out.println("通过类名访问静态计数器: " + StaticExample.staticCounter);
        
        System.out.println("\n=== 演示实例变量独立 ===");
        // 每个对象有独立的实例变量
        System.out.println("obj1的实例计数器: " + obj1.instanceCounter);
        System.out.println("obj2的实例计数器: " + obj2.instanceCounter);
        System.out.println("obj3的实例计数器: " + obj3.instanceCounter);
        
        // 修改一个对象的实例变量
        obj1.instanceCounter = 999;
        System.out.println("修改obj1的实例计数器后:");
        System.out.println("obj1的实例计数器: " + obj1.instanceCounter);
        System.out.println("obj2的实例计数器: " + obj2.instanceCounter);
        System.out.println("obj3的实例计数器: " + obj3.instanceCounter);
        
        System.out.println("\n=== 演示实例方法调用 ===");
        obj1.instanceMethod();
        obj2.instanceMethod();
        
        System.out.println("\n=== 常用静态方法示例 ===");
        // Math类的所有方法都是静态的
        System.out.println("Math.pow(2, 3): " + Math.pow(2, 3));
        System.out.println("Math.sqrt(16): " + Math.sqrt(16));
        System.out.println("Math.random(): " + Math.random());
        
        // System.out.println 也是静态方法
        System.out.println("System.out.println 是静态方法");
    }
}