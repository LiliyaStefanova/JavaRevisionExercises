package SamplePaper;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 05/06/14
 * Time: 17:03
 * To change this template use File | Settings | File Templates.
 */
    public class ExceptionQuestion {

        private int n;

        private ExceptionQuestion(int i) {
            this.n = i;
        }
        private void bMethod(int a, int b) throws Exception {
            try {
             int c = a / b;
                System.out.println("The value of the variable c is " + c);
                throw new Exception("Oh well!");
            } catch (RuntimeException ex) {
                System.out.println("Exception: " + ex.getMessage());
                throw ex;
            } finally {
                System.out.println("Finally clause");
            }
        }

    public static void main (String[] args) {
            try{
            ExceptionQuestion obj = new ExceptionQuestion(0);
            obj.bMethod(14, 0);
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException clause");
            throw ex;
        } catch(Exception ex){
                System.out.println("Caught (Exception ex)" + ex.getMessage());
             }
        finally{
                System.out.println("Finished");
            }

        System.out.println("The end...");
    }
}
