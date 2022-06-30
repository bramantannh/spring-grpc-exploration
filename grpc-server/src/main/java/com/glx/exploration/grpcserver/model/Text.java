package com.glx.exploration.grpcserver.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity(name = "text_table")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Text {

  @Id
  @Column(columnDefinition = "char(36)")
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  protected String id;

  private String content;

}
