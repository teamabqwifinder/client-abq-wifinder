package edu.cnm.deepdive.abqwifinder.model.entity.frontend;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;


@Entity(
    foreignKeys = @ForeignKey(
        entity = Interface.class,
        parentColumns = "interface_id", childColumns = "interface_id",
        onDelete = ForeignKey.CASCADE
    )
)


public class User {

  @ColumnInfo(name = "user_id")
  @PrimaryKey(autoGenerate = true)
  private long userId;

  @ColumnInfo(name = "interface_id", index = true)
  private long interfaceId;

  @ColumnInfo
  private double password;

  @ColumnInfo(name = "location")
  private String location;

  @ColumnInfo(name = "ip_address")
  private double ipAddress;

  @ColumnInfo(name = "google_sign_in")
  private String googleSignIn;

  @ColumnInfo(name = "wifi_provider")
  private String wifiProvider;

}
