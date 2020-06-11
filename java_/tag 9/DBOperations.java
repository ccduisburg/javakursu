package de.timberman.tderegion;

import java.sql.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import org.bukkit.Server;
import org.bukkit.entity.Player;

public class DBOperations implements Runnable {

	//Achtung! Beim Laden von TDERegions zuerst DBOperations.loadClass() aufrufen
	/*Sicherstellen von Stringlängen in den anderen Klassen:
	world max 30
	Spielername max 20- done
	Regionname max 20 (Sollte gegeben sein, solange die Map nicht außergewöhnlich riesig wird.)
	 */
	//(exSaveRegions) ist noch nicht fertig, Speicherung auf .tick() Ebene
	private int operation;
	private String s;
	private Spieler spieler;
	private Region r;
	private int x;
	private int z;
	private Collection <Region> col;
	private static int tick=0;

	public static Connection con;


	//************************************************\\
	//Getter, Setter
	//************************************************\\
	void setOperation(int operation){
		this.operation=operation;
	}

	void setSpieler(Spieler sp){
		this.spieler=sp;
	}

	void setString(String s){
		this.s=s;
	}

	void setInts(int x,int z){
		this.x=x;
		this.z=z;
	}

	void setRegion(Region r){
		this.r=r;
	}

	void setCol(Collection<Region> col){
		this.col=col;
	}

	int getX(){
		return x;
	}

	int getZ(){
		return z;
	}

	int getOperation(){
		return this.operation;
	}

	String getString(){
		return this.s;
	}

	Region getRegion(){
		return this.r;
	}

	Collection<Region> getCol(){
		return this.col;
	}

	Spieler getSpieler(){
		return this.spieler;
	}
	//*************************************************\\
	//Utility
	//*************************************************\\

	/*
	 * Utility
	 */
	public static boolean tableExists(String tableName,String DBname){
		ResultSet rs=null;
		boolean b=false;
		try {
			Statement check=con.createStatement();
			rs=check.executeQuery("SELECT COUNT(*) " +
					"FROM information_schema.tables " +
					"WHERE table_schema = '" +DBname+"' "+
					"AND table_name = '"+tableName+"';");

			rs.next();
			b=rs.getInt(1)>0;
			rs.close();
			check.close();
		} catch (SQLException e) {
			System.out.println("Fehler in TDERegion.DBOperations.tableExists:");
			e.printStackTrace();
		}
		return b;
	}

	/*
	 * Utility
	 */
	public static boolean playerExists(String uid){
		boolean b=false;
		try {
			Statement sta=con.createStatement();
			ResultSet exists=sta.executeQuery(
					"SELECT COUNT(ID)" +
							" FROM Spieler" +
							" WHERE SpielerUID='"+uid+"';");
			exists.next();
			b=exists.getInt(1)>0;
			exists.close();
			sta.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return b;
	}
	
	public static boolean playerExistsByName(String name){
		boolean b=false;
		try {
			Statement sta=con.createStatement();
			ResultSet exists=sta.executeQuery(
					"SELECT COUNT(ID)" +
							" FROM Spieler" +
							" WHERE Spielername='"+name+"';");
			exists.next();
			b=exists.getInt(1)>0;
			exists.close();
			sta.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return b;
	}

	/*
	 * Utility
	 */
	public static boolean regionExists(String name,String world){
		boolean b=false;
		try {
			Statement sta=con.createStatement();
			ResultSet exists=sta.executeQuery(
					"SELECT COUNT(ID)" +
							" FROM Regionlist" +
							" WHERE Regionname='"+name+"' AND world='"+world+"';");
			exists.next();
			b=exists.getInt(1)>0;
			exists.close();
			sta.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return b;
	}

	/*
	 * Utility
	 */
	public static boolean managerExists(int DBID){
		boolean b=false;
		try {
			Statement sta=con.createStatement();
			ResultSet exists=sta.executeQuery(
					"SELECT COUNT(ID)" +
							" FROM Rights" +
							" WHERE RegionID='"+DBID+"';");
			exists.next();
			b=exists.getInt(1)>0;
			exists.close();
			sta.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return b;
	}

	//*************************************************\\
	//Von außen aufgerufen
	//*************************************************\\
	/*
	 * Stellt Verbindung her
	 * Initialisiert Variablen
	 * Erstellt nicht vorhandene Tabellen
	 * Lädt statics für die Spieler Klasse
	 */

	public static void loadClass(String host,String port, String DBname,String user,String pw, Server server){
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			//url = "jdbc:mysql://" + this.hostname + ":" + this.portnmbr + "/" + this.database;
			String url = "jdbc:mysql://" + host + ":" + port + "/" + DBname;
			con=DriverManager.getConnection(url, user, pw);

			int i=0; //Zählt die Anzahl der Tabellen, die erstellt werden mussten.

			//Nicht vorhandene Tabellen anlegen
			if (!tableExists("Spieler",DBname)){

				Statement sta1=con.createStatement();

				sta1.executeUpdate("CREATE TABLE Spieler " +
						"(ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY," +
						"SpielerUID varchar(36), " +
						"Spielername varchar(20), " +
						"Bonusregionen INT);");

				i++;
				sta1.close();
				//Wert für "all"= 0
				//Wenn als erstes eingefügt, zwangsweise 0
				Statement sta2=con.createStatement();
				
				/*
				 * 1.8 UUID - Ggf. von Spielername auf SpielerUID umstellen?? 
				 */
				sta2.executeUpdate("INSERT INTO Spieler (SpielerUID,Spielernamen,Bonusregionen) VALUES ('all','all',0);" );
				sta2.close();

				sta2=con.createStatement();
				sta2.executeUpdate("INSERT INTO Spieler (SpielerUID,Spielernamen,Bonusregionen) VALUES ('server','server',0);" );
				sta2.close();



				System.out.println("TDERegions.DBOperations: Tabelle Spieler wurde angelegt.");
			}

			if (!tableExists("Flags",DBname)){

				Statement sta1=con.createStatement();

				//Byte entspricht hier TINYINT
				sta1=con.createStatement();
				sta1.executeUpdate("CREATE TABLE Flags " +
						"(ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY," +
						"RegionID INT, " +
						"flag TINYINT, " +
						"Wert BOOL );");

				i++;
				sta1.close();

				System.out.println("TDERegions.DBOperations: Tabelle Flags wurde angelegt.");
			}

			if (!tableExists("Rights",DBname)){

				Statement sta1=con.createStatement();

				sta1=con.createStatement();
				sta1.executeUpdate("CREATE TABLE Rights " +
						"(ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY," +
						"RegionID INT, " +
						"r TINYINT, " +
						"Spieler INT, " +
						"Wert BOOL );");

				i++;
				sta1.close();

				System.out.println("TDERegions.DBOperations: Tabelle Rights wurde angelegt.");
			}

			if (!tableExists("Regionlist",DBname)){

				Statement sta1=con.createStatement();

				sta1.executeUpdate("CREATE TABLE Regionlist " +
						"(ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY," +
						"Regionname varchar(20), " +
						"preis INT, " +
						"owner INT, " +
						"world varchar(30) );");

				i++;
				sta1.close();

				System.out.println("TDERegion.DBOperations: Tabelle Regionlist wurde angelegt.");
			}

			HashMap<String,Spieler> h=null;
			//Spielerdaten laden
			Statement sta=con.createStatement();
			ResultSet s=sta.executeQuery("SELECT COUNT(ID) FROM Spieler");

			s.next();
			//Achtung! Wird standardmäßig Spieler "all" enthalten
			//Deshalb keine Nullpointergefahr bei s.next()
			if (s.getInt(1)>0){

				Statement check=con.createStatement();
				ResultSet r=check.executeQuery(	"SELECT SpielerUID,ID,Spielername FROM Spieler;");				
				
				h=new HashMap<String,Spieler>();
				
				Map<Integer,String> spielerID=new HashMap<Integer,String>();
				Map<String,Integer> spielerIDreversed=new HashMap<String,Integer>();
				Map<String,Integer> spielerNameID=new HashMap<String,Integer>();
				Map<String,String> spielerNameUID=new HashMap<String,String>();
				Map<String,String> spielerNameUIDreversed=new HashMap<String,String>();
				
				while (r.next()){
					if (!r.getString(1).isEmpty()){
						System.out.println("TDERegion: Spieler: "+r.getString(3) + " hat die UID: " +r.getString(1));
						h.put(r.getString(1), null);
						spielerID.put(r.getInt(2),r.getString(1));
						spielerIDreversed.put(r.getString(1),r.getInt(2));
						spielerNameID.put(r.getString(3),r.getInt(2));
						spielerNameUID.put(r.getString(3),r.getString(1));
						spielerNameUIDreversed.put(r.getString(1),r.getString(3));
					}
					else{
						
						/*
						 * 1.8 Migration Tool
						 * Player has no UID!
						 */
						//System.out.println("TDERegion: Spieler: "+r.getString(3) + " hat keine UID!");
						
						
							if (TDERegion.getOfflinePlayerList().containsKey(r.getString(3).toLowerCase())) {
								String newUID = TDERegion.getOfflinePlayerList().get(r.getString(3).toLowerCase());
								//System.out.println("TDERegion: OfflinePlayer: "+r.getString(3) + " gefunden! (DB-ID: "+r.getInt(2)+")");
								h.put(newUID, null);
								spielerID.put(r.getInt(2),newUID);
								spielerIDreversed.put(newUID,r.getInt(2));
								spielerNameID.put(r.getString(3),r.getInt(2));
								spielerNameUID.put(r.getString(3),newUID);
								spielerNameUIDreversed.put(newUID,r.getString(3));
								/*
								 * TODO: Datensatz des Spielers in der DB updaten!
								 */
								String s1="UPDATE Spieler SET SpielerUID='"+newUID+"' WHERE ID="+r.getInt(2)+";";
								Statement sta1=con.createStatement();
								sta1.executeUpdate(s1);
								sta1.close();
								
								//System.out.println("TDERegion: Spieler: "+r.getString(3) + " wurde UID " + newUID + " zugeordnet!");
							} else {
								//System.out.println("TDERegion: Spieler: "+r.getString(3) + " ist nicht bekannt!");
							}
					}

				}
				r.close();
				check.close();
				
				Spieler.loadDataFromDB(h,spielerID,spielerIDreversed,spielerNameID,spielerNameUID,spielerNameUIDreversed);	
			}
			s.close();
			/*
			 * Abgeschlossen
			 */

			System.out.println("TDERegion.DBOperations geladen. "+i+" Tabellen wurden neu angelegt.");



		} catch (Exception e) {
			System.out.println("Fehler in DBOperations.loadClass(): Konnte keine Verbindung herstellen, Tabellen nicht prüfen oder Treiber nicht laden. Fehlercode:");
			//Konnte nicht verbinden.
			e.printStackTrace();
		}

	}
	/*
	 * Schließt die Verbindung
	 */
	public static void closeClass(){
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("Fehler in DBOperations.loadClass(): Konnte Verbindung nicht schließen. "+e.getMessage());
		}
	}

	public static void tick(){
		tick+=1;
		tick=tick%40;
		//Alle 2 Sekunden, 20 ticks/sec
		if (tick==0){
			saveRegions();
		}
	}

	//********************************
	/*
	 * Threadstartende DBOperationen
	 */
	//********************************
	public static void saveSpieler(Spieler spieler){
		//Methode 0

		DBOperations d= new DBOperations();
		d.setOperation(0);

		d.operation=0;
		d.spieler=spieler;
		new Thread(d).start();

	}

	public static void saveRegions(){ 
		//Methode 1
		DBOperations d= new DBOperations();
		d.setOperation(1);
		new Thread(d).start();

	}

	public static void loadSpieler(Player p){
		//Methode 2

		DBOperations d= new DBOperations();
		d.setOperation(2);
		d.setString(p.getUniqueId().toString());

		new Thread(d).start();

	}

	public static void loadRegion(int x, int z, String world){

		//Methode 3
		DBOperations d= new DBOperations();
		d.setOperation(3);

		d.setString(world);
		d.setInts(x,z);

		new Thread(d).start();

	}

	/* Löscht Spieler aus der DB
	 * Entfernt Rechte des Spielers auf allen Grundstücken in der DB
	 * Entfernt alle Regionen des Spielers in der DB 
	 * Alle Änderungen werden erst nach Neustart wirksam
	 */
	public static void removeSpieler(String uid){
		//Methode 4

		DBOperations d= new DBOperations();
		d.setOperation(4);

		d.setString(uid);

		new Thread(d).start();

	}

	public static void removeRegion(Region r){
		//Methode 5

		DBOperations d= new DBOperations();
		d.setOperation(5);

		d.setRegion(r);

		new Thread(d).start();

	}

	public static void saveRegion(Region r, String world){

		//Methode 6

		DBOperations d= new DBOperations();
		d.setOperation(6);

		d.setRegion(r);
		d.setString(world);

		new Thread(d).start();

	}

	public static void addBonus(String uid, int i){

		//Methode 7

		DBOperations d= new DBOperations();
		d.setOperation(7);

		//Verwendung von int x als Speicherung einer int Variablen. Keine Koordinate!
		d.x=i;
		d.setString(uid);

		new Thread(d).start();

	}


	public static int loadSpielerData(String uid){

		Spieler s=Spieler.getSpieler(uid);

		//0=Gesamt, 1=Bonus
		if (s!=null){
			//Existiert im Speicher

			return s.getBonus();
		}
		else{
			//Aus DB laden
			if (playerExists(uid)){
				//Spieler ist in der DB, laden

				try {
					Statement sta=con.createStatement();
					ResultSet r=sta.executeQuery("SELECT Bonusregionen FROM Spieler " +
							"WHERE Spieler.SpielerUID='"+uid+"';");
					r.next();
					int i=r.getInt(1);

					r.close();
					sta.close();

					return i;

				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}


		return 0;
	}


	public static LinkedList<String> loadPlayerRegions(String uid){

		LinkedList<String> l=null;

		if (playerExists(uid)){

			try {
				Statement sta=con.createStatement();
				ResultSet r=sta.executeQuery("SELECT COUNT(Regionlist.ID) " +
						"FROM Regionlist INNER JOIN Spieler on (Regionlist.owner=Spieler.ID) " +
						"WHERE Spieler.SpielerUID='"+uid+"';");

				r.next();

				if (r.getInt(1)>0){
					//Es sind Gebiete für den Spieler gespeichert
					l=new LinkedList<String>();

					Statement sta2=con.createStatement();
					ResultSet r2=sta2.executeQuery("SELECT Regionlist.Regionname,Regionlist.world " +
							"FROM Regionlist INNER JOIN Spieler on (Regionlist.owner=Spieler.ID) " +
							"WHERE Spieler.SpielerUID='"+uid+"';");

					while (r2.next()){
						l.add(r2.getString(2)+":"+r2.getString(1));
					}

					r2.close();
					sta2.close();					
				}

				r.close();
				sta.close();



			} catch (SQLException e) {
				System.out.println("Fehler in TDERegion.DBOperations.loadPlayerRegions:");
				e.printStackTrace();
			}
		}

		return l;
	}


	public static Map<String,LinkedList<Region>> getAllRegions(){

		HashMap<String,LinkedList<Region>> m=new HashMap<String,LinkedList<Region>>();

		try {
			Statement sta=con.createStatement();
			ResultSet r=sta.executeQuery("SELECT COUNT(ID) FROM Regionlist");

			r.next();
			if (r.getInt(1)>0){

				//Es sind Regionen vorhanden

				Statement sta2=con.createStatement();
				ResultSet r2=sta2.executeQuery("SELECT Regionlist.Regionname,Regionlist.Preis,Regionlist.world,Spieler.SpielerUID,Spieler.Spielername " +
						"FROM Regionlist INNER JOIN Spieler on Regionlist.owner=Spieler.ID;");


				while (r2.next()){

					Region re=new Region();
					String regionname=r2.getString(1);

					int i=regionname.indexOf("_");
					if (i>0){
						//Zulässiges Format, nur hier gehts weiter!
						int x=Integer.parseInt(regionname.substring(0,i));
						int z=Integer.parseInt(regionname.substring(i+1,regionname.length()));

						int preis=r2.getInt(2);
						String world=r2.getString(3);
						String owner=r2.getString(4);

						if (TDERegion.isEnabled(world)){

							if (!m.containsKey(world) ) m.put(world,new LinkedList<Region>());

							re.setX(x);
							re.setZ(z);
							re.setPreis(preis);
							re.owner=owner;
							re.ownerName=r2.getString(5);
							m.get(world).add(re);
						}
					}
					else{
						System.out.println("Fehler in TDERegion.DBOperations.getAllRegions: Gebietname "+regionname+" ist im falschen Format!");
					}

				}
			}

			r.close();
			sta.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}



		return m;
	}

	//********************************************************\\
	//Private, ausführende Methoden
	//********************************************************\\
	private void exAddBonus(String uid,int i){

		if (playerExists(uid)){
			try {
				Statement sta=con.createStatement();

				String s="SELECT ID,Bonusregionen FROM Spieler WHERE SpielerUID='"+uid+"';";
				ResultSet r=sta.executeQuery(s);

				//ID=1,Regionen=2
				r.next();

				Statement sta2=con.createStatement();

				String s2="UPDATE Spieler" +
						" SET Bonusregionen="+(r.getInt(2)+i)+
						" WHERE ID="+r.getInt(1)+";"  ;
				sta2.executeUpdate(s2);

				r.close();
				sta.close();
				sta2.close();

			} catch (SQLException e) {
				System.out.println("Fehler in TDERegions.addBonus. Stacktrace:");
				e.printStackTrace();
			}
		}
		else{
			System.out.println("Fehler in TDERegions.addBonus: Der Spieler mit UID "+uid+" existiert nicht in der DB!");
		}

	}

	private void exSaveSpieler(Spieler sp){

		try{
			if (playerExists(sp.getSpielerUID())){
				//Existiert bereits und ist im speicher

				String s="UPDATE Spieler SET Spielername='"+sp.getName()+"', Bonusregionen="+sp.getBonus()+" WHERE ID="+sp.getDBID()+";";
				Statement sta=con.createStatement();
				sta.executeUpdate(s);
				sta.close();
			}
			else{
				//Existiert noch nicht
				//Neu einfügen
				String s=
						"INSERT INTO Spieler (SpielerUID,Spielername,Bonusregionen)"+
								" VALUES ('"+sp.getSpielerUID()+"','"+sp.getName()+"',"+sp.getBonus()+");";
				Statement sta=con.createStatement();
				sta.executeUpdate(s);
				sta.close();

				//ID des Spielers herausfinden und ins Objekt schreiben
				Statement getid=con.createStatement();
				ResultSet r2=getid.executeQuery(
						"SELECT DISTINCT Spieler.ID" +
								" FROM Spieler"+
								" WHERE Spieler.SpielerUID='"+sp.getSpielerUID()+"';");

				r2.next();

				synchronized (sp){
					sp.setDBID(r2.getInt(1));
				}

				r2.close();
				getid.close();
			}


		}catch (Exception e){
			//Fehler in der DB
			System.out.println("Fehler in DBOperations.exSaveSpieler");
			System.out.println(e.getMessage());
		}
	}

	private void exSaveRegions(){
		//Region.gebiete
		//Speichern der Regionen nach 20 Ticks

		synchronized(Region.regionPuffer){
			if (Region.regionPuffer.size()>0){
				Iterator<Region> it=Region.regionPuffer.keySet().iterator();
				while (it.hasNext()){

					Region r=it.next();
					String world=Region.regionPuffer.get(r);

					saveRegion(r, world);
				}
				Region.regionPuffer.clear();
			}
		}

	}

	private void exLoadSpieler(String uid){
		try{
			//Existiert spieler?
			if (playerExists(uid)){

				//Spieler aus der DB laden
				Statement sta=con.createStatement();
				ResultSet spieler=sta.executeQuery(
						"SELECT ID,Bonusregionen" +
								" FROM Spieler" +
								" WHERE SpielerUID='"+uid+"';");

				spieler.next();

				//Überprüfung, ob Gebiete für ihn gespeichert sind
				Statement check=con.createStatement();
				ResultSet exists=check.executeQuery(
						"SELECT COUNT(ID)" +
								" FROM Regionlist" +
								" WHERE owner="+spieler.getInt(1)+";");
				exists.next();

				LinkedList<String> l=new LinkedList<String>();

				if (exists.getInt(1)>0){

					//Es sind Gebiete für ihn gespeichert
					//Spieler.regions aus DB Regionliste holen
					Statement sta2=con.createStatement();
					ResultSet regionen=sta2.executeQuery(
							"SELECT Regionname,world" +
									" FROM Regionlist" +
									" WHERE owner="+spieler.getInt(1)+";");


					//Spielerobjekt anlegen
					while (regionen.next()){
						l.add(regionen.getString(2)+":"+regionen.getString(1));
					}
					regionen.close();
					sta2.close();
				}

				Spieler.loadSpieler(l, spieler.getInt(2),spieler.getInt(1),uid);


				spieler.close();
				exists.close();
				check.close();
				sta.close();
			}

		}catch (Exception e){
			//Fehler in der DB
			System.out.println("Fehler in DBOperations.exLoadSpieler");
			System.out.println(e.getMessage());
		}
	}

	private void exLoadRegion(String world,int x, int z){

		String name=x+"_"+z;

		try{

			if (regionExists(name,world)){

				Statement check=con.createStatement();

				//Regiondaten laden
				//RegionID, Preis,Besitzer,world
				ResultSet rs=check.executeQuery(
						"SELECT Regionlist.ID,Regionlist.preis,Spieler.SpielerUID,Spielername" +
								" FROM Regionlist INNER JOIN Spieler ON Spieler.ID=Regionlist.owner"+
								" WHERE Regionname='"+name+"' AND world='"+world+"';");

				//Auf Existenz des Besitzers checken für Integrität
				if (!rs.next()){
					//Leeres Resultset, Zugehöriger Spieler nicht gefunden?
					System.out.println("Problem in TDERegions.exLoadRegion: Kein Besitzer für Region "+world+":"+name);
					rs.close();
					check.close();
					return;
				}
				//****Managerdaten laden****\\

				RechteManager rm=new RechteManager();

				if (managerExists(rs.getInt(1))){

					Statement sta=con.createStatement();
					String s=
							"SELECT Rights.r, Rights.Spieler, Rights.Wert"+
									" FROM Rights"+
									" WHERE Rights.RegionID="+rs.getInt(1)+";";
					//Daten des Managers
					ResultSet manager=sta.executeQuery(s);

					while (manager.next()){
						int[] i=new int[1];
						i[0]=manager.getInt(1);
						rm.addRights(Spieler.getByID(manager.getInt(2)), manager.getBoolean(3),i );
					}

					manager.close();
					sta.close();
				}

				//Regionflags laden
				//Sind auf jeden Fall enthalten, da immer sofort mitgespeichert		
				String s=
						"SELECT flag, Wert"+
								" FROM Flags"+
								" WHERE RegionID="+rs.getInt(1)+";";


				Statement staFlags=con.createStatement();
				ResultSet rFlags=staFlags.executeQuery(s);

				Statement amountFlags=con.createStatement();
				ResultSet amount=amountFlags.executeQuery("SELECT MAX(flag) FROM (SELECT flag FROM Flags WHERE RegionID="+rs.getInt(1)+" ) AS Sub;");

				if (!amount.next()){
					System.out.println("Keine flags gefunden!");
					return;
				}

				//Nächstes: Regionflags
				boolean[] flags=new boolean[amount.getInt(1)+1];

				amount.close();
				amountFlags.close();

				int counter=0;
				while (rFlags.next()){
					flags[rFlags.getByte(1)]=rFlags.getBoolean(2);
					counter++;
				}


				//Auf Konsistenz testen
				if (counter!=flags.length){
					//Konsistenz nicht gegeben! Es wurden weniger Werte gesetzt als das Array groß ist!
					//Array mit Größe 1 erstellen, damit es von Region.loadRegion als fehlerhaft erkannt und neu initialisiert wird!
					flags=new boolean[]{false};

				}

				//Nächstes: Regiondata in r
				//RegionID, Preis,Besitzer,world
				int ID=rs.getInt(1);
				int preis=rs.getInt(2);
				String owner=rs.getString(3);
				String ownername=rs.getString(4);


				//********Daten sind geladen, Objekte initialisieren.********\\

				//Region erstellen und füllen
				Region r=new Region();
				r.loadRegion(rm, flags, preis,owner,ownername, x, z,world);
				synchronized (r){
					r.setDBID(ID);
				}

				rs.close();
				check.close();
				rFlags.close();
				staFlags.close();
				s=null;
			}

		} catch (Exception e){
			//Fehler ausgeben, wenn Verbindung fehlschlug.
			System.out.println("DBOperations.exloadRegion:");
			e.printStackTrace();
		}

	}


	private void exRemoveSpieler(String uid){
		try{
			int spielerid=-1;
			Spieler sp=Spieler.getSpieler(uid);

			if (sp!=null){
				//Spieler ist aktuell geladen, muss nicht aus DB gezogen werden
				if (sp.getDBID()!=-1) spielerid=sp.getDBID();
			}
			else if (playerExists(uid)){
				Statement staID=con.createStatement();
				ResultSet rid=staID.executeQuery("SELECT DISTINCT ID FROM Spieler WHERE Spieler.SpielerUID='"+uid+"';");
				rid.next();
				spielerid=rid.getInt(1);

				rid.close();
				staID.close();
			}
			else{
				System.out.println("Fehler in TDERegionDBOperations.exRemoveSpieler: Spieler ist nicht vorhanden! Wird nicht gelöscht!");
				return;
			}


			Statement del=con.createStatement();
			del.executeUpdate("DELETE FROM Rights WHERE Rights.Spieler="+spielerid+";");
			del.close();

			/* TODO Vorerst deaktiviert aus Sicherheitsgründen
			del=con.createStatement();
			del.executeUpdate("DELETE FROM Spieler WHERE ID="+spielerid+";");
			del.close();
			 */

			//Regionflags mitlöschen
			Statement sta=con.createStatement();
			ResultSet exists=sta.executeQuery(
					"SELECT COUNT(ID)" +
							" FROM Regionlist" +
							" WHERE owner="+spielerid+";");
			exists.next();

			if (exists.getInt(1)>0){

				Statement sta2=con.createStatement();
				ResultSet regionids=sta2.executeQuery(
						"SELECT ID,Regionname,world FROM Regionlist" +
								" WHERE owner="+spielerid+";");

				while (regionids.next()){

					del=con.createStatement();
					del.executeUpdate("DELETE FROM Flags WHERE RegionID="+regionids.getInt(1)+";");
					del.close();

					del=con.createStatement();
					del.executeUpdate("DELETE FROM Rights WHERE Rights.RegionID="+regionids.getInt(1)+";");
					del.close();

					Region.regenRegion(regionids.getString(2), regionids.getString(3));
				}
				regionids.close();
				sta2.close();
			}

			exists.close();
			sta.close();

			//Regionen rauskicken
			del=con.createStatement();
			del.executeUpdate("DELETE FROM Regionlist WHERE owner="+spielerid+";");
			del.close();

		}catch (Exception e){
			//Fehler in der DB
			System.out.println(e.getMessage());
		}
	}

	private void exRemoveRegion(Region r){

		try{	
			if (r.getDBID()>=0){
				//Managerdaten löschen
				Statement stadel=con.createStatement();
				stadel.executeUpdate(
						"DELETE FROM Rights WHERE Rights.RegionID="+r.getDBID()+";" );
				//Danach die Region leeren
				Statement sta=con.createStatement();
				sta.executeUpdate(
						"DELETE FROM Regionlist" +
								" WHERE Regionlist.ID="+r.getDBID()+";");

				//Flags aus der Flagtabelle löschen
				Statement sta2=con.createStatement();
				sta.executeUpdate(
						"DELETE FROM Flags" +
								" WHERE Flags.RegionID="+r.getDBID()+";");

				//Fertig
				stadel.close();
				sta2.close();
				sta.close();

			}
			else{
				System.out.println("Fehler in DBOperations.exRemoveRegion(): Region hat keine zugewiesene ID und wird nicht gelöscht.");
			}
		}catch (Exception e){
			//Fehler in der DB
			System.out.println(e.getMessage());
		}
	}

	/* 
	 * Speichert eine Region in die DB
	 */
	private void exSaveRegion(Region r, String world){
		try{

			int spielerid=Spieler.getSpielerID(r.owner);

			if (spielerid==-1){
				if (playerExists(r.owner)){
					Statement staID=con.createStatement();
					ResultSet rid=staID.executeQuery("SELECT DISTINCT ID FROM Spieler WHERE Spieler.SpielerUID='"+r.owner+"';");
					rid.next();
					spielerid=rid.getInt(1);

					rid.close();
					staID.close();

				}
				else{
					System.out.println("Fehler in TDERegionDBOperations.exSaveRegion: Zugehöriger Spieler ist nicht vorhanden! Wird nicht gespeichert!");
					spielerid=-1;
					return;
				}
			}


			if ( regionExists(r.getName(),world) ){

				//Schon in der DB
				Statement sta=con.createStatement();
				sta.executeUpdate("UPDATE Regionlist SET" +
						" preis="+r.getPreis()+
						" ,owner="+spielerid+
						" WHERE Regionname='"+r.getName()+"' AND world='"+world+"';"  );
				sta.close();

			}
			else{

				//Nicht in der DB vorhanden
				Statement sta=con.createStatement();
				sta.executeUpdate("INSERT INTO Regionlist (Regionname,preis,owner,world)" +
						" VALUES ('"+r.getName()+"',"+r.getPreis()+","+spielerid+",'"+world+"');"  );
				sta.close();
			}


			if (r.getDBID()==-1){
				//Noch keine ID gesetzt
				Statement sta2=con.createStatement();
				ResultSet rs=sta2.executeQuery("SELECT DISTINCT ID FROM Regionlist WHERE Regionname='"+r.getName()+"' AND world='"+world+"';"  );
				rs.next();

				//Der neuen Region ihre DBID zuweisen
				synchronized (r){
					r.setDBID(rs.getInt(1));
				}

				rs.close();
				sta2.close();
			}


			//Flags speichern, alte Flags rauskicken
			Statement stadel=con.createStatement();
			stadel.execute("DELETE FROM Flags WHERE RegionID="+r.getDBID()+";");
			stadel.close();

			Statement staflags=null;

			boolean[] flags=r.getFlags();

			for (int i=0;i<flags.length;i++){

				staflags=con.createStatement();
				staflags.execute("INSERT INTO Flags (RegionID,flag,Wert)" +
						" VALUES ("+r.getDBID()+","+(byte)i+","+flags[i]+");");
				staflags.close();
			}

			//alten Manager rauskicken
			Statement sta2=con.createStatement();
			sta2.executeUpdate("DELETE FROM Rights WHERE RegionID="+r.getDBID()+";"  );
			sta2.close();

			//Manager speichern
			HashMap<Integer, HashMap<Integer, Boolean>> table=r.getManagerData();

			Set<Integer> c=table.keySet();
			Iterator<Integer> it=c.iterator();

			String str="";
			while (it.hasNext()){

				synchronized (table){

					Integer I=it.next();

					HashMap<Integer, Boolean> v=table.get(I);

					Iterator<Integer> it2=v.keySet().iterator();

					while (it2.hasNext()){
						//Spielername
						int spielerID=it2.next();

						//*****************************
						//ID ist jetzt vorhanden. Check
						if (spielerID!=-1){
							//Nur wenn Spieler existiert, auch abspeichern
							boolean b=v.get(spielerID);

							//RegionID,r,SpielerID,Wert=boolean

							str="("+r.getDBID()+", "+I.byteValue()+", "+spielerID+", "+b+")";

							//Daten abschicken
							sta2=con.createStatement();
							sta2.executeUpdate("INSERT INTO Rights (RegionID,r,Spieler,Wert) VALUES "+str+";");
							sta2.close();

						}


					}//WHILE



				}//SYNCHRONIZED

			}//WHILE


		}catch (Exception e){
			//Fehler in der DB
			System.out.println(e.getMessage());
		}
	}

	
	
	//TODO Ausschließlich Debugging!
	public static void droptables(){
		
		
		try {
			
			Statement sta1=con.createStatement();
			
			sta1.executeUpdate("DROP TABLE `Flags`, `Regionlist`, `Rights`;");
			
			sta1.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	//********************************************************\\
	//Run(), Fallunterscheidung
	//********************************************************\\
	public synchronized void run(){


		int i=this.getOperation();

		//Feststellen, welche Operation benötigt wird.
		if (i==0) exSaveSpieler(this.getSpieler());
		else if (i==1) exSaveRegions();
		else if (i==2) exLoadSpieler(this.getString());
		else if (i==3) exLoadRegion(this.getString(),this.getX(),this.getZ());
		else if (i==4) exRemoveSpieler(this.getString());
		else if (i==5) exRemoveRegion(this.getRegion());
		else if (i==6) exSaveRegion(this.getRegion(),this.getString());
		else if (i==7) exAddBonus(this.getString(),this.getX());


	}

}