import java.util.List;

public class CompoundTask implements TaskSystem{
    private String titulo;
    private List<TaskSystem> issues;

    public CompoundTask (String titulo, List<TaskSystem> issues) {
        this.titulo = titulo;
        this.issues = issues;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + "Tarefa Composta: " + titulo);
        for(TaskSystem task : issues) {
            task.print(structure + "  ");
        }
    }

    public List<TaskSystem> getTasks() {
        return issues;
    }
    
}