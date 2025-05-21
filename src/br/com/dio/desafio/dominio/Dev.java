package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
  private String nome;
  private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

  public void inscreverBootcamp(BootCamp bootcamp){
    this.conteudosInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add(this);
  }

  public void progredir() {
    Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
    if (conteudo.isPresent()) {
      Conteudo c = conteudo.get();
      removerConteudoInscrito(c);
      adicionarConteudoConcluido(c);

    }else{
      System.err.println("Nenhum conteúdo para prosseguir.");
    }
  }

  public double calcularTotalXp() {
    return this.conteudosConcluidos.stream()
          .mapToDouble(Conteudo::calcularXP) 
          .sum();
}

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  

  public Set<Conteudo> getConteudosInscritos() {
    return conteudosInscritos;
  }

  public Set<Conteudo> getConteudosConcluidos() {
    return conteudosConcluidos;
  }

  public void adicionarConteudoInscrito(Conteudo conteudo){
    this.conteudosInscritos.add(conteudo);
  }

  public void removerConteudoInscrito(Conteudo conteudo){
   this.conteudosInscritos.remove(conteudo);
  }

  public void adicionarConteudoConcluido(Conteudo conteudo){
    this.conteudosConcluidos.add(conteudo);
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
    result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Dev other = (Dev) obj;
    if (conteudosInscritos == null) {
      if (other.conteudosInscritos != null)
        return false;
    } else if (!conteudosInscritos.equals(other.conteudosInscritos))
      return false;
    if (conteudosConcluidos == null) {
      if (other.conteudosConcluidos != null)
        return false;
    } else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
      return false;
    return true;
  }

  

  
}
