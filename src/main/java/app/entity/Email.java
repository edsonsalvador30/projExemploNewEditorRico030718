package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela EMAIL
 * @generated
 */
@Entity
@Table(name = "\"EMAIL\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Email")
public class Email implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "destinatario", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String destinatario;

  /**
  * @generated
  */
  @Column(name = "conteudo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String conteudo;

  /**
  * @generated
  */
  @Column(name = "conteudo_2", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String conteudo_2;

  /**
  * @generated
  */
  @Column(name = "conteudo_3", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String conteudo_3;

  /**
   * Construtor
   * @generated
   */
  public Email(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Email setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém destinatario
   * return destinatario
   * @generated
   */
  
  public java.lang.String getDestinatario(){
    return this.destinatario;
  }

  /**
   * Define destinatario
   * @param destinatario destinatario
   * @generated
   */
  public Email setDestinatario(java.lang.String destinatario){
    this.destinatario = destinatario;
    return this;
  }

  /**
   * Obtém conteudo
   * return conteudo
   * @generated
   */
  
  public java.lang.String getConteudo(){
    return this.conteudo;
  }

  /**
   * Define conteudo
   * @param conteudo conteudo
   * @generated
   */
  public Email setConteudo(java.lang.String conteudo){
    this.conteudo = conteudo;
    return this;
  }

  /**
   * Obtém conteudo_2
   * return conteudo_2
   * @generated
   */
  
  public java.lang.String getConteudo_2(){
    return this.conteudo_2;
  }

  /**
   * Define conteudo_2
   * @param conteudo_2 conteudo_2
   * @generated
   */
  public Email setConteudo_2(java.lang.String conteudo_2){
    this.conteudo_2 = conteudo_2;
    return this;
  }

  /**
   * Obtém conteudo_3
   * return conteudo_3
   * @generated
   */
  
  public java.lang.String getConteudo_3(){
    return this.conteudo_3;
  }

  /**
   * Define conteudo_3
   * @param conteudo_3 conteudo_3
   * @generated
   */
  public Email setConteudo_3(java.lang.String conteudo_3){
    this.conteudo_3 = conteudo_3;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Email object = (Email)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
