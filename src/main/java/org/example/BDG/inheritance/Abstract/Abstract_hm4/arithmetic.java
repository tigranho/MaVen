package org.example.BDG.inheritance.Abstract.Abstract_hm4;
   interface Test {

}
    class arithmetic implements Test {
        public int square(int x) {
            return x * x;
        }
    }
    class ToTestInt {
            public static void main(String[] args){
                arithmetic value = new arithmetic();
                System.out.println(value.square(4));
            }
    }





