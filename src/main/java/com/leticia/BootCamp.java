package com.leticia;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BootCamp {


    private String name;
    private String description;
    private final List<Conteudo> conteudos = new ArrayList<>(); // Usando polimorfismo com Conteudo (Curso e Mentoria)
    private final Set<Dev> devsInscritos = new HashSet<>();

    public BootCamp(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Conteudo> getConteudos() {
        return conteudos;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void inscreverDev(Dev dev) {
        devsInscritos.add(dev);
        dev.inscreverBootcamp(this);
    }
}