# TP6 — Spring Boot et Thymeleaf

Dans ce TP, nous avons développé une application de gestion d’utilisateurs avec Spring Boot, Spring Data JPA et Thymeleaf. Le projet est configuré pour enregistrer les données dans une base MySQL. L’application permet d’afficher les utilisateurs, d’en ajouter et de vérifier les champs obligatoires du formulaire.

![Liste initiale vide](screenshots/Screenshot%202026-11-04%20093727.png)

Au début, la page d’accueil affiche un tableau vide avec les colonnes Nom et Email. Le lien Ajouter un utilisateur permet d’ouvrir le formulaire d’ajout.

![Liste contenant deux utilisateurs](screenshots/Screenshot%202026-11-04%20095849.png)

Après l’ajout de deux utilisateurs, la liste affiche leurs noms et leurs adresses email. Le contrôleur récupère les utilisateurs avec le repository et les transmet à la vue Thymeleaf.

![Formulaire avec un nom vide](screenshots/Screenshot%202026-11-04%20100045.png)

Nous ouvrons ensuite le formulaire d’ajout et renseignons une adresse email en laissant le champ Nom vide. Cette capture prépare la vérification des champs obligatoires.

![Liste affichant toujours deux utilisateurs](screenshots/Screenshot%202026-11-04%20100710.png)

La liste affiche toujours les deux utilisateurs précédents. Aucun utilisateur supplémentaire n’apparaît dans cette capture.

![Messages de validation du formulaire](screenshots/Screenshot%202026-11-04%20110029.png)

Dans la version du formulaire avec validation, les champs Nom et Email sont laissés vides tandis que le nom d’utilisateur est renseigné. Après l’envoi, les messages Le nom est obligatoire et L’email est obligatoire apparaissent au-dessus du formulaire et à côté des champs concernés. Les contraintes @NotBlank sont vérifiées grâce à @Valid ; BindingResult permet de revenir au formulaire en cas d’erreur, et Thymeleaf affiche les messages. Le nom d’utilisateur saisi est conservé.
