``` mermaid

    class Bootcamp {
        -String name
        -String description
        +List~Conteudo~ conteudos
        +Set~Dev~ devsInscritos
        +inscreverDev(Dev dev)
    }
    
    class Conteudo {
        <<abstract>>
        -String titulo
        -String descricao
        +calcularXp() double
    }
    
    class Curso {
        -int cargaHoraria
        +calcularXp() double
    }
    
    class Mentoria {
        -LocalDate data
        +calcularXp() double
    }
    
    class Dev {
        -String name
        -Set~Conteudo~ conteudosInscritos
        -Set~Conteudo~ conteudosConcluidos
        +inscreverBootcamp(Bootcamp bootcamp)
        +progredir()
        +calcularTotalXp() double
    }
    
    Bootcamp --> Conteudo
    Conteudo <|-- Curso
    Conteudo <|-- Mentoria
    Bootcamp --> Dev
    Dev --> Conteudo
    
```
