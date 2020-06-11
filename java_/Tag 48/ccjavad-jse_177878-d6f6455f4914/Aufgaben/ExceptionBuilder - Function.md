# Aufgabe 'ExceptionBuilder - Function'

Gegeben ist die legacy-Methode `build`, die ein-Exception-Objekt bilden kann:
	
	public static Exception build(String errMsg, Class<? extends Exception> clazz) 
			throws NoSuchMethodException, InvocationTargetException, 
				InstantiationException, IllegalAccessException, IllegalArgumentException {
		
		Constructor<? extends Exception> c = clazz.getConstructor(String.class);
		
		return c.newInstance(errMsg);
	}

und die main-Methode, die die build-Methode aufruft: 
	
	public static void main(String[] args) {
		try {
			RuntimeException e1 = (RuntimeException)build("error 1", RuntimeException.class);
			
		} catch (NoSuchMethodException | 
				InvocationTargetException | 
				InstantiationException | 
				IllegalAccessException | 
				IllegalArgumentException e) {
				
			// handle exception
		}
		
		// ...
	}


- Ändern Sie bitte die Methode `build` so, dass folgende main-Methode kompiliert: 
    
		public static void main(String[] args) {
			RuntimeException e2 = build("error 2", errMsg -> new RuntimeException(errMsg));
			IllegalArgumentException e3 = build("error 3", IllegalArgumentException::new);
		}

Dabei darf die neue Version der Methode `build` keine checked-Exceptions mehr deklarieren. Entfernen Sie bitte auch komplett die Reflection-API-Aufrufe `getConstructor` und `newInstance`.

> Tipp. Um das Casting zu vermeiden können Sie die neue Version der Methode `build` generisch gestalten.


- Optional. Gestalten Sie die Methode `build` so, dass sie nur Exception-Objekte erzeugen kann und der folgende sinnlose Aufruf der Methode nicht möglich ist: 
    
		public static void main(String[] args) {
			String e4 = build("hello", s -> new String(s)); // die Zeile darf nicht kompilieren 
		}
