package org.sansorm.sqlite;

import jakarta.persistence.*;
import org.sansorm.DateConverter;

import java.util.Date;

@Table
public class TargetClassSQL
{
   @Id
   @GeneratedValue
   @Column
   private Integer id;

   @Column
   private String string;

   @Column
   @Convert(converter = DateConverter.class)
   private Date timestamp;

   public TargetClassSQL()
   {
   }

   public TargetClassSQL(String string, Date timestamp) {
      this.string = string;
      this.timestamp = timestamp;
   }

   public Integer getId() {
      return id;
   }

   public String getString() {
      return string;
   }

   public void setString(String string) {
      this.string = string;
   }

   public Date getTimestamp() {
      return timestamp;
   }

   public void setTimestamp(Date timestamp) {
      this.timestamp = timestamp;
   }
}
