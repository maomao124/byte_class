/**
 * Project name(项目名称)：Byte类
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/2
 * Time(创建时间)： 19:56
 * Version(版本): 1.0
 * Description(描述)：
 * Byte 类中的常用方法
 * 方法	         返回值	      功能
 * byteValue()	byte	以一个 byte 值返回 Byte 对象
 * compareTo(Byte bytel)	int	在数字上比较两个 Byte 对象
 * doubleValue()	double	以一个 double 值返回此 Byte 的值
 * intValue()	int	以一个 int 值返回此 Byte 的值
 * parseByte(String s)	byte	将 String 型参数解析成等价的 byte 形式
 * toStringO	String	返回表示此 byte 值的 String 对象
 * valueOf(String s)	Byte	返回一个保持指定 String 所给出的值的 Byte 对象
 * equals(Object obj)	boolean	将此对象与指定对象比较，如果调用该方法的对象与 obj 相等 则返回 true，否则返回 false
 * Byte 类的常用常量
 * 在 Byte 类中包含了很多的常量，其中较为常用的常量如下。
 * MIN_VALUE：byte 类可取的最小值。
 * MAX_VALUE：byte 类可取的最大值。
 * SIZE：用于以二进制补码形式表示的 byte 值的位数。
 * TYPE：表示基本类 byte 的 Class 实例。
 */

public class test
{
    @SuppressWarnings("all")
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        Byte b1 = 4;
        Byte b2 = new Byte("90");
        Byte b3 = new Byte((byte) 9);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b2.byteValue());  //以一个 byte 值返回 Byte 对象
        System.out.println(b3.intValue());  //以一个 int 值返回此 Byte 的值
        System.out.println(b1.compareTo(b3));  //在数字上比较两个 Byte 对象
        System.out.println(b2.compareTo(b3));
        Byte b4 = Byte.parseByte("35");   //将 String 型参数解析成等价的 byte 形式
        System.out.println(b4);
        System.out.println(b4.toString());  //返回表示此 byte 值的 String 对象
        Byte b5 = Byte.valueOf("24");   //返回一个保持指定 String 所给出的值的 Byte 对象
        System.out.println(b5);
        System.out.println(b4.equals(b5));   //将此对象与指定对象比较，如果调用该方法的对象与 obj 相等 则返回 true，否则返回 false
        Byte b6 = 24;
        System.out.println(b5.equals(b6));
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
