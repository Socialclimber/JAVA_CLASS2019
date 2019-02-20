import com.tech1.ClassA;
import com.tech1.ClassB;
public class Test{
        public static void main(String[] args){
                ClassA a = new ClassA();
                ClassB b = new ClassB();
                
                int c = a.add(1,3);
                int d = b.multiply(3,5);
                System.out.println("Result of Addition is: "+c);
                System.out.println("Result of multiplication is: "+d);
        }
       
}
