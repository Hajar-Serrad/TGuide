package com.example.tguide; /***********************************************************************
 * Module:  Utilisateur.java
 * Author:  Administrateur
 * Purpose: Defines the Class Utilisateur
 ***********************************************************************/

import java.util.*;

/** @pdOid 5bef5485-5a91-4903-9b8b-fd749827b5fe */
public class Utilisateur {
   /** @pdOid dfebf955-4255-4110-87a8-42cab77171d7 */
   private int idUser;
   /** @pdOid b17dbd1d-3ea2-43a8-a0e1-28a78f539afe */
   private String nom;
   /** @pdOid 8b111d1b-0cb2-44eb-bef9-7370717ccf05 */
   private String prenom;
   /** @pdOid ca82ed11-b9df-4aa7-8a7b-23ad7dc19513 */
   private String email;
   /** @pdOid af19c414-3d7e-4388-9c34-4ae94ee45b6b */
   private String password;
   
   /** @pdRoleInfo migr=no name=Ville assc=chercher mult=1..1 */
   public Ville ville;
   /** @pdRoleInfo migr=no name=Gps assc=activer mult=1..1 */
   public Gps gps;
   
   /** @param id 
    * @param nom 
    * @param prenom 
    * @param email 
    * @param password
    * @pdOid be1e33e9-b045-43d4-86b2-5d1a2b3c97fc */
   public Utilisateur(int id, String nom, String prenom, String email, String password) {
      // TODO: implement
   }
   
   /** @pdOid 6b3797cc-86fc-44da-a9f1-d1a8740f1f8f */
   public int getId() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 41e59e19-bea6-4b98-9890-681b7d1fcb1b */
   public String getNom() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 8f62e7a1-3bdd-459a-9bed-e574192aebf8 */
   public String getPrenom() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid f2f6e48d-1a6b-4623-97ec-887710128eb1 */
   public String getEmeil() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 3293a659-8ea7-49f7-a05f-dab1f4a3cd15 */
   public String getMotDePasse() {
      // TODO: implement
      return null;
   }
   
   /** @param nom
    * @pdOid d8763155-3bc5-4715-9543-45739a4bb8ba */
   public void setNom(String nom) {
      // TODO: implement
   }
   
   /** @param prenom
    * @pdOid 4c25f873-c227-4a15-a838-60518ee5553b */
   public void setPrenom(String prenom) {
      // TODO: implement
   }
   
   /** @param email
    * @pdOid 07f0bec6-8068-4333-a005-a52fbbb8cae0 */
   public void setEmail(String email) {
      // TODO: implement
   }
   
   /** @param pass
    * @pdOid 1dfacb91-b4e4-493f-9f18-67cc4220fb06 */
   public void setMotDePasse(String pass) {
      // TODO: implement
   }
   
   /** @pdOid 5e33926b-3f54-423f-a4fd-336913d7a868 */
   public Boolean creerCompte() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 8510a4ae-4ca5-4795-a5ed-ff388a82ec94 */
   public Boolean s_authentifier() {
      // TODO: implement
      return null;
   }

}