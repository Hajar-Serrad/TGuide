package com.example.tguide; /***********************************************************************
 * Module:  SiteTouristique.java
 * Author:  Administrateur
 * Purpose: Defines the Class SiteTouristique
 ***********************************************************************/

import java.util.*;

/** @pdOid 619b2d58-f732-444f-8575-d16f8b89e1cf */
public class SiteTouristique {
   /** @pdOid 1fafa115-e9a0-4b7e-a123-6d271ec1079e */
   private int idSite;
   /** @pdOid ed7ae2ec-67c1-4698-9188-ba50ec662e74 */
   private String nom;
   /** @pdOid 49e09a33-0343-4937-9902-9b46bad97450 */
   private String horaire;
   /** @pdOid bf5e939f-798b-4bf1-8840-561c889338ec */
   private Float longitude;
   /** @pdOid fb8bd49e-ca3a-4418-b6a6-88d0a601656d */
   private Float latitude;
   
   /** @pdRoleInfo migr=no name=Quartier assc=association4 mult=1..1 side=A */
   public Quartier quartier;
   
   /** @param id 
    * @param nom 
    * @param horaire
    * @pdOid 5d064052-42bb-41a8-aa1a-76eb184d1605 */
   public SiteTouristique(int id, String nom, String horaire) {
      // TODO: implement
      
   }

   public SiteTouristique() {
      // TODO: implement

   }
   
   /** @pdOid ed0e433d-0e40-49b1-bd70-cef2a8ebaa82 */
   public int getId() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid eeab80b6-197d-41b0-92c1-a864b6ec03aa */
   public String getNom() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 1ecbe526-d5f1-4de5-b409-6ce7334db917 */
   public String getHoraire() {
      // TODO: implement
      return null;
   }
   
   /** @param nom
    * @pdOid 4780c741-6181-4bdd-84b5-684545d83c02 */
   public void setNom(String nom) {
      // TODO: implement
   }
   
   /** @param horaire
    * @pdOid 9343bced-66c9-488d-aa9b-86bb958c666b */
   public void setHoraire(String horaire) {
      // TODO: implement
   }
   
   /** @pdOid ba6d8218-71ee-4fb1-81b8-d8af31ef0ec1 */
   public String getMeteo() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid f9e646bf-8c7a-46d5-b5a4-3d4628b56fc4 */
   public Float getLongitude() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid e1eb30ea-54b1-415d-8347-cba4de3a5dbd */
   public Float getLatitude() {
      // TODO: implement
      return null;
   }
   
   /** @param lg
    * @pdOid 639af477-7264-447f-ae54-65a3c5c5b27f */
   public void setLongitude(Float lg) {
      // TODO: implement
   }
   
   /** @param lt
    * @pdOid dc1f320c-ef35-421f-9ef8-bc079c06d3d7 */
   public void setLatitude(Float lt) {
      // TODO: implement
   }
   
   /** @pdOid 57370046-cb94-402d-950c-9a32b5bc364a */
   public void afficherInfos() {
      // TODO: implement
   }
   
   /** @param d
    * @pdOid dc81503c-ca1b-4f1a-acee-20e28d703728 */
   public Float calculerDistance(Float d) {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default parent getter */
   public Quartier getQuartier() {
      return quartier;
   }
   
   /** @pdGenerated default parent setter
     * @param newQuartier */
   public void setQuartier(Quartier newQuartier) {
      if (this.quartier == null || !this.quartier.equals(newQuartier))
      {
         if (this.quartier != null)
         {
            Quartier oldQuartier = this.quartier;
            this.quartier = null;
            oldQuartier.removeSiteTouristique(this);
         }
         if (newQuartier != null)
         {
            this.quartier = newQuartier;
            this.quartier.addSiteTouristique(this);
         }
      }
   }

}