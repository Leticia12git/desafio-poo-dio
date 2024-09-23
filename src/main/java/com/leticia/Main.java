package com.leticia;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Aprenda Java do básico ao avançado", 8);
        Curso curso2 = new Curso("Curso Spring Boot", "Criação de APIs com Spring Boot", 10);

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Tire suas dúvidas sobre Java", LocalDate.now());

        BootCamp bootcamp = new BootCamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLeticia = new Dev("Leticia");
        bootcamp.inscreverDev(devLeticia);

        System.out.println("Conteúdos Inscritos Leticia: " + devLeticia.calcularTotalXp());
        devLeticia.progredir();
        System.out.println("Conteúdos Concluídos Leticia: " + devLeticia.calcularTotalXp());
    }
}