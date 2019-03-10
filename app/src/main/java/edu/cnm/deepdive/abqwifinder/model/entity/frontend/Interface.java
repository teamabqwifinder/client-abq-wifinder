package edu.cnm.deepdive.abqwifinder.model.entity.frontend;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.PrimaryKey;

@Entity(
    indices = @Index(value = "date", unique = true)
)

public class Interface {

  @ColumnInfo(name = "interface_id")
  @PrimaryKey(autoGenerate = true)
  private long interfaceId;

  @ColumnInfo(name = "name")
  private String name;

  @ColumnInfo(name = "city")
  private String city;

  @ColumnInfo(name = "business_name")
  private String businessName;

}
