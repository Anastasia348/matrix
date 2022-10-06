public class Main {
        public static void main(String[] args) {
            Matrix m1 = new Matrix(3,3);
            Matrix m2 = new Matrix(3,3);
            Matrix m3 = new Matrix(3,3);
            Matrix m4 = new Matrix(3,3);
            Matrix m5 = new Matrix(3,3);
            m1.output();
            System.out.println();
            m2.output();
            System.out.println();
            m3 = m1.mplus(m2);
            m3.output();
            System.out.println();
            m4 = m1.umnozhenienachislo(2);
            m4.output();
            System.out.println();
            m5 = m1.umnozheniemat(m2);
            m5.output();

        }
    }
