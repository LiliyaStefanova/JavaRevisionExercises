package SamplePaper;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 04/06/14
 * Time: 20:24
 * To change this template use File | Settings | File Templates.
 */

    public class OutOfRangeException extends Exception{

    private static  final long serialVersionUID = 1L;
    private String reason;

    public OutOfRangeException(String reason){
            this.reason=reason;
    }
    public String getReason()
         {
        return reason;
        }
}
