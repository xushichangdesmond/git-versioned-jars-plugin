# git-versioned-jars-plugin

A simple gradle plugin that writes the current git commit to a file in src/main/resources/version for the project (and subprojects) so that it would appear in built jar files.
It is recommended to add the following entry to .gitignore, but it is entirely optional

```
**/src/main/resources/version
```
