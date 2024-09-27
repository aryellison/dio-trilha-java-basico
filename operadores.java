public class operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);
        //2 aula

        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);
        //3 aula

        //x repetição
        int numero1 = 5;
        numero1++;
        //numero1 = numero1 + 1;
        System.out.println(numero1);

        boolean variavel = true;

        System.out.println(!variavel); //4 aula

        //operador ternario 
        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        //operadores relacionais

        int numeroUm = 1;
        int numeroDois = 2;

        boolean simNao = numeroUm == numeroDois;    

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

         simNao = numeroUm != numeroDois;    

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numeroUm > numeroDois;    

        System.out.println("numeroUm é maior a numeroDois? " + simNao);
        //exemplo 

        String nomeUm = "ary";
        String nomeDois = "ary";
        // String nomeDois = new String("ary");
        //system.out.println(nomeUm.equals(nomeDois)); quando se trata de objetos, mais recomendado 
        System.out.println(nomeUm == nomeDois);

        //operadores logicos 

        // && operador logico "E"
        // || operador logico "OU"

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 || condicao2){
            System.out.println("uma das condições sao verdadeiras");
    }
}
}
