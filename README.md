# cabmanApp

- Pour sécuriser des url regarde le fichier WebSecurityConfig.java.
- Pour chiffrer le mot de passe utilisateur on utilise le méthode "passwordEncoder" de spring boot. 

example:
```
    //ce bean est déjà décalrer dans not spring sécurité config "WebSecurityConfig" 
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
	
	//Injecter ce bean dans notre service pour faire l'encodage.
	@Autowired
	private PasswordEncoder passwordEncoder;

	user.setPassword(passwordEncoder.encode(accountDto.getPassword()));
```
	
=> Pour plus d'info regarder l'article suivante: http://www.baeldung.com/spring-security-registration-password-encoding-bcrypt


