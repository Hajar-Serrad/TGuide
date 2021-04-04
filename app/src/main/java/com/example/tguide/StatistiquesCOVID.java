package com.example.tguide; /***********************************************************************
 * Module:  StatistiquesCOVID.java
 * Author:  Administrateur
 * Purpose: Defines the Class StatistiquesCOVID
 ***********************************************************************/

import java.util.*;

/** @pdOid ea185cf1-85b7-491e-9c5e-dcc5afb3958a */
public class StatistiquesCOVID {
   /** @pdOid df589b85-1856-4fe0-97ec-adad03f5dd5f */
   private int idS;
   /** @pdOid a2baed9a-e8c9-4a5e-be6a-3eab433d03c3 */
   private int nbrCasConfirmes;
   /** @pdOid 8212eef4-4582-4c77-9a69-1f0dc9320e24 */
   private Date date;
   
   /** @pdRoleInfo migr=no name=Quartier assc=avoir mult=1..* side=A */
   public Quartier[] quartier;
   
   /** @param idS
    * @pdOid bbe74411-abd4-46a5-bf3d-73e150889cb6 */
   public StatistiquesCOVID(int idS) {
      // TODO: implement
      
   }
   
   /** @pdOid 8a06d1a2-dd77-4287-b5a4-fb4fb073a965 */
   public int getnbr() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 08f10af6-f1a0-4e36-ac6e-19941ce86678 */
   public Date getDate() {
      // TODO: implement
      return null;
   }
   
   /** @param nbr
    * @pdOid 0764fdc4-1a7d-4322-b7f9-f55b00f0d5b5 */
   public void setNbrCasConfirmes(int nbr) {
      // TODO: implement
   }
   
   /** @param date
    * @pdOid dcb25182-031f-4329-82ec-97097c910efb */
   public void setDate(Date date) {
      // TODO: implement
   }

}