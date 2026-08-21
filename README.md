# Learn Together — Jetpack Compose Tutorial

Application Android réalisée avec **Jetpack Compose** dans le cadre d'un exercice pratique (Pigier MOOC-FOAD, module RISO).

L'application **Learn Together** affiche une liste d'articles à propos de plusieurs bibliothèques Jetpack. Cet exercice porte spécifiquement sur l'écran affichant un tutoriel dédié à **Jetpack Compose**.

## 📱 Aperçu

L'écran est composé de :
1. Une image d'illustration en pleine largeur
2. Un titre (24sp)
3. Deux paragraphes de description, avec texte justifié

## 🛠️ Stack technique

- **Langage** : Kotlin
- **UI Toolkit** : Jetpack Compose
- **Design system** : Material 3 (`MaterialTheme`)
- **IDE** : Android Studio

## 📂 Structure du projet

```
app/src/main/
├── java/com/example/learntogether/
│   ├── MainActivity.kt              # Point d'entrée, setContent + thème
│   └── ui/
│       └── theme/
│           ├── Color.kt             # Palette de couleurs
│           ├── Theme.kt             # LearnTogetherTheme (MaterialTheme)
│           └── Type.kt              # Typographie (bodyLarge, etc.)
└── res/
    ├── drawable/
    │   └── bg_compose_background.png
    └── values/
        └── strings.xml              # Titre + paragraphes de l'article
```

## ✨ Fonctionnalités / contraintes UI respectées

| Élément | Contrainte |
|---|---|
| Image | Pleine largeur (`ContentScale.FillWidth`) |
| Titre (`Text` n°1) | Taille 24sp, padding 16dp (haut, bas, début, fin) |
| Paragraphe 1 (`Text` n°2) | Taille par défaut, padding 16dp (début, fin), `TextAlign.Justify` |
| Paragraphe 2 (`Text` n°3) | Taille par défaut, padding 16dp (4 côtés), `TextAlign.Justify` |

> **Note technique** : la justification (`TextAlign.Justify`) est désactivée par Compose si le style de texte a un `letterSpacing` non nul. Le style `bodyLarge` du thème définissant `letterSpacing = 0.5.sp`, il est neutralisé localement (`letterSpacing = 0.sp`) sur les `Text` justifiés pour que l'alignement fonctionne correctement.

## 🚀 Installation et exécution

1. Cloner le dépôt :
   ```bash
   git clone https://github.com/<votre-utilisateur>/learn-together.git
   ```
2. Ouvrir le projet dans **Android Studio**.
3. Laisser Gradle synchroniser les dépendances.
4. Lancer l'application sur un émulateur ou un appareil physique (`Run ▶`).

## 📦 Dépendances principales

```kotlin
implementation("androidx.core:core-ktx:1.13.1")
implementation("androidx.activity:activity-compose:1.9.2")
implementation(platform("androidx.compose:compose-bom:2024.09.00"))
implementation("androidx.compose.ui:ui")
implementation("androidx.compose.ui:ui-graphics")
implementation("androidx.compose.ui:ui-tooling-preview")
implementation("androidx.compose.material3:material3")
debugImplementation("androidx.compose.ui:ui-tooling")
```

## 👤 Auteur

Isaac N'DRI — Développeur full-stack, mobile & DevOps