package br.com.abreu;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Fruta extends PanacheEntity {

  public String nome;
  public int quantidade;

}