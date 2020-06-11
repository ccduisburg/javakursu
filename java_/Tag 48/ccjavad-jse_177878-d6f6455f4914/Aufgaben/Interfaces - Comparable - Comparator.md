# Aufgabe 'Interfaces - Comparable/Comparator'

- Erstellen Sie nach den JavaBeans Standard  eine Klasse "Person" mit den Eigenschaften "vorname" und "nachname", die gelesen und geändert werden dürfen. 

>Tipp: Nach JavaBeans Standard werden Eigenschaften (Properties) mit Zugriffsmethoden definiert. Eigenschaft x ensteht, wenn es eine getter-Methode gibt (schreibgeschützte Eigenschaft) oder die getter- und setter-Methoden. Z.B. wird hier die Eigenschaft 'size' definiert:

		public int getSize() { ... }
		public void setSize(int newValue) { ... }

> Alternativ zum Präfix 'get' kann man für boolean-Eigenschaften die Zugriffsmethode mit dem Präfix 'is' definieren:
    
		public boolean isGesund() { ... }


*Erstellen Sie eine Klasse mit der main-Methode, in der folgende Aufgaben gelöst werden*

- Speichern Sie in einem Array vier Personen:

        Paul Smith
        Paul Black
        John Smith
        John Black


- Geben Sie den Inhalt des Arrays auf der Konsole aus.


- Sortieren Sie das Array mit Hilfe der Methode `java.util.Arrays.sort(Object[])`. Dabei müssen die Personen nach dem Nachnamen und bei gleichen Nachnamen nach dem Vornamen verglichen werden.

> Optional: eine weitere Eigenschaft 'geburtsjahr' in der Klasse 'Person' definieren und bei der Sortierung berücksichtigen, falls die Nachnamen und Vornamen gleich sind


- Geben Sie erneut den Inhalt des Arrays auf der Konsole aus.


- Das Array bitte absteigend sortieren und ausgeben.

>Tipp: Interface java.util.Comparator

>Tipp: java.util.Arrays.sort(array, comparator)


- Suchen Sie in dem aufsteigend sortiertem Array nach der Person 'John Black' 

>Tipp: java.util.Arrays.binarySearch(array, key)


- Suchen Sie in dem absteigend sortiertem Array nach der Person 'John Smith'
    
>Tipp: java.util.Arrays.binarySearch(array, key, comparator)
