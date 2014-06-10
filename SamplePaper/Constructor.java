package SamplePaper;

    public class Constructor {

        private String s;

        protected int x;

        static{
            System.out.println("Mewh in Constructor");
        }


        public Constructor() {
            System.out.println("[1]" + this);
        }
        public Constructor(String s) {
            this();
            this.s = s;
            System.out.println("[2]" + this);
        }
        public String toString() {
            return " s = " + this.s + " x = " + this.x;
        }
    }



