public enum Curso {
    COMPUTACAO("Engenharia de Computação"),
    ADMINISTRACAO("Administração"),
    AUTOMACAO("Engenharia de Controle e Automação"),
    ALIMENTOS("Engenharia de Alimentos");

    private String name;

    Curso(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}