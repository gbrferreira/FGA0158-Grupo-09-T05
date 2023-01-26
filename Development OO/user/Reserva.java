package user;
import java.util.*;

public class Reserva {
    private String descricao;
    private int id;
    //o atributo ID é o número do objeto Reserva correspondente instanciado na array.
    private String salaReservada;
    private  String horario;
    private int qtdDePessoas;
    public static int qtdAtendimento;
    //método construtor padrão para a classe Reserva. A variável qtdAtendimento soma +1 toda vez que um objeto Reserva é instanciado,
    //e essa variável será utilizada na classe Professor para o método calcAtendimentosRestantes.
    public Reserva(String descricao, int id, String salaReservada, String horario, int qtdDePessoas) {
        this.descricao= descricao;
        this.id = id;
        this.salaReservada = salaReservada;
        this.horario = horario;
        this.qtdDePessoas = qtdDePessoas;
        qtdAtendimento++;
    }

    //Getters e setters
    public String getDescricao(){
        return descricao;
    }

    public int getId() {
        return id;
    }

    public String getSalaReservada() {
        return salaReservada;
    }

    public String getHorario() {
        return horario;
    }

    public int getQtdDePessoas() {
        return qtdDePessoas;
    }

    public void setDescricao(String descricao){
        this.descricao= descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalaReservada(String salaReservada) {
        this.salaReservada = salaReservada;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setQtdDePessoas(int qtdDePessoas) {
        this.qtdDePessoas = qtdDePessoas;
    }
  
       /* método que calcula o horário mais pedido nas reservas, usando como base a array Reservas que foi criada na main,
       de acordo com o input do usuário.*/
        public static String calcHoraFreq (Reserva[] reservas) {
            /*um hashmap que utiliza valores Int (para podermos manipular os elementos do hashmap sem as dificuldades do tipo String)
            e armazena os horários das Reservas instanciadas como chaves String, de forma que podermos realizar operações com os elementos da HashMap, como calcular 
            qual horário ou sala esteve presente mais vezes, utilizando como base o maior valor Int.*/
            HashMap<String, Integer> horariosFrequentes = new HashMap<>();
            //usaremos um laço for percorrendo cada objeto Reserva armazenado dentro da Array de objetos Reservas.

            for (Reserva reserva : reservas) {
            /*dentro desse laço, uma variável armazenará o horário dos objetos que ela percorrer, de um em um, e ela será utilizada para comparações nas condicionais,
            de forma que possamos determinar qual o horário mais frequente.*/
                String horario = reserva.getHorario();
                /*nessa condicional if, compararemos se o horário armazenado pela variável bate com a chave da HashMap. se sim, o valor int do elemento respectivo da HashMap será subistituido
                por valor + 1, e se não, devolverá o valor sem alterações. */
                if (horariosFrequentes.containsKey(horario)) {
                    horariosFrequentes.put(horario, horariosFrequentes.get(horario) + 1);
                } else {
                    horariosFrequentes.put(horario, 1);
                }
            }
            //a variável armazenará o horário que mais apareceu no hashmap.
            String horarioMaisFrequente = "";
            //uma variável contador para determinar o número de vezes que o horário mais apareceu no hashmap, e também será utilizado como parâmetro para nossa condicional.
            int contMax = 0;
            //este laço for percorre o hashmap de horário em horário (nossas chaves) e armazena a chave com maior valor numérico, assim determinando qual o horário mais frequente.
            for (String horario : horariosFrequentes.keySet()) {
                if (horariosFrequentes.get(horario) > contMax) {
                    contMax = horariosFrequentes.get(horario);
                    horarioMaisFrequente = horario;
                }
            }
            //retornamos uma variável com o horario mais frequente.
            return horarioMaisFrequente;
    }

    //um método que calcula qual sala apareceu mais vezes nas Reservas. segue a mesma lógica do cálculo de qual sala foi mais frequente.
    public static String calcSalaFreq (Reserva[] reservas){
        HashMap<String, Integer> salasFrequentes = new HashMap<>();
        for (Reserva reserva : reservas) {
            String sala = reserva.getSalaReservada();
            if(salasFrequentes.containsKey(sala)) {
                salasFrequentes.put(sala, salasFrequentes.get(sala) + 1);
            } else {
                salasFrequentes.put(sala, 1);

            }
        }
        String salaMaisFrequente= "";
        int contMax2= 0;
        for(String sala : salasFrequentes.keySet()){
            if (salasFrequentes.get(sala) > contMax2){
                contMax2= salasFrequentes.get(sala);
                salaMaisFrequente= sala;
            }
        }
        return salaMaisFrequente;
    }
    

//uma main para podermos rodar e testar o código, onde instanciamos os objetos de acordo com o input do usuário.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas reservas devem ser feitas? ");
        int n = sc.nextInt();
        String coletalixo= sc.nextLine();

        //variavel String que coleta o valor \n que o nextInt não pode coletar, para não pular o método NextLine.
        //Uma array de objetos Reserva será criada de acordo com o numero de reservas que o usuário deseja fazer.
        Reserva[] reservas = new Reserva[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Descreva o que deseja fazer com a sala reservada para a reserva " + (i + 1) + ": \n" );
            String descricao= sc.nextLine();
            System.out.print("Digite o horário desejado para a reserva " + (i + 1) + " ( em hh/mm.)" + ": ");
            String horario = sc.next();
            System.out.print("Digite qual sala/laboratório deseja para a reserva " + (i + 1) + ": ");
            String sala = sc.next();
            System.out.print("Digite quantos alunos estarão na reserva  " + (i + 1 ) + ": " );
            int qtdDePessoas = sc.nextInt();
            String coletalixo2= sc.nextLine();
            reservas[i] = new Reserva(descricao, i+1, sala, horario, qtdDePessoas);
            //cria um novo objeto Reserva e adiciona ao array de reservas.
        }
        //Chamada dos métodos calcHoraFreq, calcSalaFreq e teste de atendimentos restantes da classe Professor.
        System.out.println("A hora mais frequentemente reservada foi: " + calcHoraFreq(reservas));
        System.out.println("A sala mais frequentemente reservada foi: " + calcSalaFreq(reservas));
        System.out.println("Professor(a), você tem" + Professor.calcAtendimentoRestante(qtdAtendimento) + " atendimentos restantes. \n");
       sc.close();
    }
}   