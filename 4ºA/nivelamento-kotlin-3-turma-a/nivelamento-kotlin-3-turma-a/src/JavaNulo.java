public class JavaNulo {

    public static void main(String[] args) {
        String bairro = null;

        System.out.println(bairro.toUpperCase());

        Fruta f = new Fruta();
        Aluno a = new Aluno();
        Pais p = new Pais("Japão", 87897, 0.922);

        /*
        f.nome = "Maçã";
        a.idade = 9;
        p.nome = "México";
        HÁ IÉIÉ! Achou que os atributos eram públicos, né?
        Só que não! São privados e são criados get/set para os que são var
        Ou apenas get para os val
         */

        f.setNome("Maçã");
        a.setIdade(9);
        p.setNome("Méximo");
    }
}
