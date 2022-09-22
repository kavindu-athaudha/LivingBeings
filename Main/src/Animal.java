public class Animal {
    public void reproduce(){
        System.out.println(this.getClass().getName() + " -> " + this.getClass().getName() + " -> " + new Throwable().getStackTrace()[0].getMethodName());
    }

    public void grow(){
        System.out.println(this.getClass().getName() + " -> " + new Throwable().getStackTrace()[0].getMethodName());
    }

    public void nourish(){
        System.out.println(this.getClass().getName() + " -> " + new Throwable().getStackTrace()[0].getMethodName());
    }

    public void adapt(){
        System.out.println(this.getClass().getName() + " -> " + new Throwable().getStackTrace()[0].getMethodName());
    }

    public void move(){
        System.out.println(this.getClass().getName() + " -> " + new Throwable().getStackTrace()[0].getMethodName());
    }
}
