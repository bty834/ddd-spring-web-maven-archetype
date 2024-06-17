
# Quick Start

```bash
mvn archetype:create-from-project

cd target/generated-sources/archetype
mvn install

mvn archetype:crawl

# go to your project dir
mvn archetype:generate -DarchetypeCatalog=local
# select the ddd-spring-web-archetype 
```

ps: generated root pom.xml has superfluous empty lines, please remove manually

# Layers

![layers](./doc/img/layers.png)