package Pratica_2;

public class Participante {
    int rg, idade, id;
    String nome, sobrenome, grupo_sangue, celular, contato_emergencia;
    private int category;

    public Participante(
            int rg, int idade, int id, String nome, String sobrenome,
            String grupo_sangue, String celular, String contato_emergencia
    ) {
        this.rg = rg;
        this.idade = idade;
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.grupo_sangue = grupo_sangue;
        this.celular = celular;
        this.contato_emergencia = contato_emergencia;
    }

    public void showData(){
        System.out.println("Participante: " + this.id);
        System.out.println();
        System.out.println("RG:" + this.rg);
        System.out.println("Nome:" + this.nome);
        System.out.println("Sobrenome:" + this.sobrenome);
        System.out.println("Numero de celular:" + this.celular);
        System.out.println("Numero de emergencia:" + this.contato_emergencia);
        System.out.println("Grupo sanguíneo:" + this.grupo_sangue);
        System.out.println();

    }

    public void showFee(){
        int fee;
        if (this.idade < 18){
            if (this.category == 1 ){
                fee = 1300;
            }
            else {
                fee = 2000;
            }
        }
        else{
            if (this.category == 1){
                fee = 1500;
            }
            else if (this.category == 2){
                fee = 2300;
            }
            else{
                fee = 2800;
            }
        }
        System.out.println("A taxa de inscriçao é:" + fee);
    }

    public void showCategories(){
        System.out.println("1 - Circuito pequeno");
        System.out.println("2 - Circuito médio");
        if (this.idade > 18){
            System.out.println("3 - Circuito avançado");
        }
}

    public void setCategory(int category) {
        if (this.category == 3 && category == 3){
           return;
        }
        this.category = category;
    }

    public int getCategory() {
        return category;
    }

    }
