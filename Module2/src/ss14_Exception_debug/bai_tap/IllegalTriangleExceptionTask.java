package ss14_Exception_debug.bai_tap;

public class IllegalTriangleExceptionTask  extends  Exception{
    IllegalTriangleExceptionTask(String s){
        super(s);
    }

    IllegalTriangleExceptionTask(String message,Throwable throwable, String status){
        super(message,throwable);
    }
}
