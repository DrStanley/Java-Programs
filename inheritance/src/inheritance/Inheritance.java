package inheritance;
 class name{            
 int y=5,x=3;
public void call () {
    System.out.println(" this class is inheriting name ");
}
 } 
class aboy extends name{
    public void doo(){
        y+=5;
        System.out.println(y+" is in aboy class");
    }
}
class agirl extends name{
public void say(){
        x+=3;
        System.out.println(x+" is in agirl class");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        aboy boyObject = new aboy(); 
       
        boyObject.call();
        boyObject.doo();
    }
}