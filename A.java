public class A {
    private int A1;
    private float A2;

    public int getA1() {
        return A1;
    }

    public float getA2() {
        return A2;
    }
    
    public void setA1(int a1) {
        this.A1 = a1;
    }

    public void setA2(float a2) {
        this.A2 = a2;
    }

    public void MA1(){
        System.out.println("MA1");
    }

    public void MA2(){
        System.out.println("MA2");
    }

<<<<<<< HEAD
    public int getSoma(int a, int b) {
        return a + b;
    }
=======
    public void MA3(){
        System.out.println("Alteração a classe A apartir do clone");
    }

>>>>>>> b14e82c (Criação da Classe C e Criado o Método MA3() na Classe A)
}
