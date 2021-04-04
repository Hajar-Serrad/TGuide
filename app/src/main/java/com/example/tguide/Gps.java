package com.example.tguide; /***********************************************************************
 * Module:  Gps.java
 * Author:  Administrateur
 * Purpose: Defines the Class Gps
 ***********************************************************************/

import java.util.*;

/** @pdOid 41026dda-fbff-464c-af6d-4021a3f8ae98 */
public class Gps {
   /** @pdOid 3c78dd25-31fc-4776-ae7e-8dcd8ffcdaa3 */
   private int idLocalisation;
   /** @pdOid 2cf5ccab-0925-40cd-9378-fc31eed2a20d */
   private Float latitude;
   /** @pdOid 044d95b2-1e06-4778-b9c7-a51984c09c67 */
   private Float longitude;
   /** @pdOid 977ed1b5-9442-4f05-b9e8-645c97d9de35 */
   private Date timestamp;
   
   /** @pdRoleInfo migr=no name=Utilisateur assc=activer mult=1..1 side=A */
   public Utilisateur activer;
   
   /** @param id 
    * @param Longitude 
    * @param Latitude 
    * @param Timestamp
    * @pdOid 36748c84-e044-45c7-89f7-63a2c66c95ce */
   public Gps(int id, Float Longitude, Float Latitude, Date Timestamp) {
      // TODO: implement
   }
   
   /** @pdOid f64d2065-86d2-4d64-8431-758fb50db2d2 */
   public Float getLatitude() {
      // TODO: implement
      return null;
   }
   
   /** @param Lt
    * @pdOid e99df766-3714-48e7-8ad7-990bad7a42de */
   public void setLatitude(Float Lt) {
      // TODO: implement
   }
   
   /** @param Lg
    * @pdOid ecba2b72-531b-472b-b6a1-a46b75a22dab */
   public void setLongitude(Float Lg) {
      // TODO: implement
   }
   
   /** @param timestamp
    * @pdOid d725b5b1-22cb-427a-91d4-fc2f6bf4bf05 */
   public void setTimestamp(Date timestamp) {
      // TODO: implement
   }
   
   /** @pdOid 81de1db2-000a-4b5b-8cf3-0a6613e58a5f */
   public Float getLongitude() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid e9bf7143-65b6-4b7b-9da1-fafeb9d8ba31 */
   public Date getTimestamp() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 5b4dd284-60be-44d6-b276-87c056048403 */
   public void afficherLocalisationActuelle() {
      // TODO: implement
   }

}