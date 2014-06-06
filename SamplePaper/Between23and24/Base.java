package SamplePaper.Between23and24;


    class Base {
        public void methodOne() {
            System.out.println("A");
            methodTwo();
            System.out.println("Z");
        }

        public void methodOne(int a) {
            System.out.println("W");
            methodTwo();
            methodTwo(new Integer(a));
        }


    public void methodTwo() {
        System.out.println("P");
    }

    public void methodTwo(Integer x) {
        System.out.print("B");
    }

}

