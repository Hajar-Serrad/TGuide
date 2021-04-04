package com.example.tguide; /***********************************************************************
 * Module:  Ville.java
 * Author:  Administrateur
 * Purpose: Defines the Class Ville
 ***********************************************************************/

import java.util.*;

/** @pdOid bb60168c-3603-449d-be5b-dbd5a0f464e8 */
public class Ville {
   /** @pdOid b3938111-a436-444c-8929-aff6f96bc5dc */
   private int idVille;
   /** @pdOid 965bfaa6-8924-4c3d-8b2d-7f59a16dc1e1 */
   private String nomVille;
   /** @pdOid 7224bccf-3727-4a2a-b88b-24b25ce806a1 */
   private String nomPays;
   
   /** @pdRoleInfo migr=no name=Quartier assc=contenir mult=1..* type=Aggregation */
   public Quartier[] quartier;
   
   /** @param id 
    * @param nomVille 
    * @param pays
    * @pdOid 1ffc2197-3296-4e1d-a674-7745b8cb4259 */
   public Ville(int id, String nomVille, String pays) {
      // TODO: implement
      
   }
   
   /** @pdOid 9be2b6fe-97ae-4e35-8c3c-079b7032a2df */
   public int getId() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 55a62217-414e-442a-a987-0ea3a82f8940 */
   public String getNomVille() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 9c989b1b-fb07-4c41-bf48-f762ff284e06 */
   public String getPays() {
      // TODO: implement
      return null;
   }
   
   /** @param ville
    * @pdOid b8a442bd-35b8-4434-ae64-2e551fe27da1 */
   public void setNomVille(String ville) {
      // TODO: implement
   }
   
   /** @param pays
    * @pdOid 9dba7ba1-a4e5-48bc-a34c-0b3070312033 */
   public void setPays(String pays) {
      // TODO: implement
   }

}