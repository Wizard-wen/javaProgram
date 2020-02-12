import java.util.*;

public class constructorTest {
    public static void main(String[] args){
        
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("张三", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        for(Employee e : staff){
            System.out.println("姓名是" + e.getName());
        }

    }
}

class Employee {

    private static int nextId;

    private int id ;
    private String name = "";//实例域初始化
    private double salary;

    //静态初始化块
    static {
        // 构造一个新的随机数生成器
        Random generator = new Random();
        
        //返回一个0~n之间的随机数
        nextId = generator.nextInt(10000);
    } 

    //对象初始化块
    {
        id = nextId;
        nextId ++;
    }

    //三个重载构造器

    public Employee (String n, double s){
        name = n;
        salary = s;
    }

    public Employee (double s){
        this("Employee #"+nextId, s);
    }

    public Employee (){
        // name 初始化为 ""
        // salary 未显示设置，初始化为 0
        // id 在对象初始化块中已经初始化
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }

}
