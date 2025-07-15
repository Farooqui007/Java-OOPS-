    class keyboard{

        int keys=100;
        String color="White";

        public void pressed(){
            System.out.println("Pressed the button");
        }
        public void throwit(){
            System.out.println("Hit");
        }
    }

    class advkeyboard extends keyboard{
        public void hitnum()   {
            System.out.println("Send num ");
        }

    }

    class OOPS{
        public static void main (String args[]){

            advkeyboard obj;
            obj = new advkeyboard();
            
            obj.pressed();
            obj.throwit();
            obj.hitnum();
        }
    }