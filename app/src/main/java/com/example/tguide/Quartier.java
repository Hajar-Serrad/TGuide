package com.example.tguide; /***********************************************************************
 * Module:  Quartier.java
 * Author:  Administrateur
 * Purpose: Defines the Class Quartier
 ***********************************************************************/

import java.util.*;

/** @pdOid 0564b44b-9e3e-412c-91b0-06d88a9fce81 */
public class Quartier {
   /** @pdOid 3d30bb08-0e86-4986-b0d9-7e48109fdbf6 */
   private int idQuartier;
   /** @pdOid 03fc197a-5746-4fea-9a02-c56aa0864f85 */
   private String nomQuartier;
   
   /** @pdRoleInfo migr=no name=StatistiquesCOVID assc=avoir mult=1..1 */
   public StatistiquesCOVID statistiquesCOVID;
   /** @pdRoleInfo migr=no name=SiteTouristique assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public Collection<SiteTouristique> siteTouristique;
   /** @pdRoleInfo migr=no name=Ville assc=contenir mult=1..1 side=A */
   public Ville ville;
   
   /** @param id 
    * @param nom
    * @pdOid 2313c184-c6e8-42ea-ad14-801a54f2a588 */
   public Quartier(int id, String nom) {
      // TODO: implement
      
   }
   
   /** @pdOid 56f43a3e-ccb4-4f50-812e-f05f188dad92 */
   public int getId() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 3b5f6d03-c122-45b2-a1b7-dab6451a0cb7 */
   public String getNomQuartier() {
      // TODO: implement
      return null;
   }
   
   /** @param nom
    * @pdOid 8d2a43da-46fa-42ee-86b0-65cd82c27fbe */
   public void setNomQuartier(String nom) {
      // TODO: implement
   }
   
   /** @pdOid a4869a91-849b-442d-a2d9-8aca0dea7aef */
   public void decrire() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public Collection<SiteTouristique> getSiteTouristique() {
      if (siteTouristique == null)
         siteTouristique = new HashSet<SiteTouristique>();
      return siteTouristique;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorSiteTouristique() {
      if (siteTouristique == null)
         siteTouristique = new HashSet<SiteTouristique>();
      return siteTouristique.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSiteTouristique */
   public void setSiteTouristique(Collection<SiteTouristique> newSiteTouristique) {
      removeAllSiteTouristique();
      for (Iterator iter = newSiteTouristique.iterator(); iter.hasNext();)
         addSiteTouristique((SiteTouristique)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSiteTouristique */
   public void addSiteTouristique(SiteTouristique newSiteTouristique) {
      if (newSiteTouristique == null)
         return;
      if (this.siteTouristique == null)
         this.siteTouristique = new HashSet<SiteTouristique>();
      if (!this.siteTouristique.contains(newSiteTouristique))
      {
         this.siteTouristique.add(newSiteTouristique);
         newSiteTouristique.setQuartier(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldSiteTouristique */
   public void removeSiteTouristique(SiteTouristique oldSiteTouristique) {
      if (oldSiteTouristique == null)
         return;
      if (this.siteTouristique != null)
         if (this.siteTouristique.contains(oldSiteTouristique))
         {
            this.siteTouristique.remove(oldSiteTouristique);
            oldSiteTouristique.setQuartier((Quartier)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSiteTouristique() {
      if (siteTouristique != null)
      {
         SiteTouristique oldSiteTouristique;
         for (Iterator iter = getIteratorSiteTouristique(); iter.hasNext();)
         {
            oldSiteTouristique = (SiteTouristique)iter.next();
            iter.remove();
            oldSiteTouristique.setQuartier((Quartier)null);
         }
      }
   }

}