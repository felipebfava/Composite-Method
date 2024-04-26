
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TaskSystem simpletask1 = new SimpleTask("Fazer a ULA no programa LogiSim", "Implementar a Unidade Lógica e Aritmética no LogiSim", 12);
        TaskSystem simpletask2 = new SimpleTask("Fazer um processador de 8 bits", "Implementar um processador de 8 bits no LogiSim", 12);
        TaskSystem simpletask3 = new SimpleTask("Álgebra Relacional com comandos no SQL", "Implementar Álgebra Relacional no Modelo Lógico", 15);
        
        TaskSystem compoundtask1 = new CompoundTask("Trabalho de Arquitetura", Arrays.asList(simpletask1));
        TaskSystem compoundtask2 = new CompoundTask("Fazer o Trabalho da Angelita", Arrays.asList(simpletask2, compoundtask1));
        TaskSystem compoundtask3 = new CompoundTask("Trabalho de Banco de Dados", Arrays.asList(simpletask3));
        
        compoundtask2.print("");
        System.out.println("\n");
        compoundtask3.print("");

    }
}