package SamplePaper;

    class SubConstructor extends Constructor {

        protected String s;

        static{
            System.out.println("Bla in SubConstructor");
        }

        SubConstructor(int x) {
            super("label");

            x = this.x;
            System.out.println("[4] x = " + x);
        }
        public SubConstructor(String s) {
            this(12);
            this.s = s;
            x = 19;
            System.out.println("[5] x = " + x);
        }
    }

