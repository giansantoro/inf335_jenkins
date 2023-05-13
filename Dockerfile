# Imagem
FROM openjdk:11

# Diretorio app
WORKDIR /app

# Adicionar .java na imagem
ADD OlaUnicamp.java .

# Compilar/Executar
RUN javac OlaUnicamp.java

# Rodar na imagem docker quando pronto
CMD ["java
