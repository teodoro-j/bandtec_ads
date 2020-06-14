public class TesteFuncionario {

    public static void main(String[] args) {
        Engenheiro e = new Engenheiro("Maria", "123456", 20000);
        Vendedor v = new Vendedor("Matheus", "2346789", 50000,0.10);
        Horista h =new Horista("Joana", "945757",40,100);

        System.out.println(e);
        System.out.println(v);
        System.out.println(h);

        Empresa emp = new Empresa();
        emp.adicionaFunc(e);
        emp.adicionaFunc(v);
        emp.adicionaFunc(h);

        emp.exibeFunc();

        emp.exibeTotalSalario();
    }
}



