## Gatling

**Gatling** é um projeto de testes de performance, carga ou stress. <br/>
Os testes são desenvolvidos em Scala utilizando o framework [Gatling](https://gatling.io/) <br/>
Como gerenciador de dependências é utilizado `gradle`

#### Pré requisitos

- gradle >= 4.7

#### Como executar

Para instalar as dependências do projeto, execute dentro do diretório `./gatling`;
```
gradle build
```

Para executar os testes, execute dentro do mesmo diretório;

```
./gradlew gatlingRun
```

#### Report
Report é gerado desse modelo: <br/>
![alt text](https://github.com/WarleyGabriel/gatling/blob/master/images/report.png)

O report é gerado dentro do diretório `gatling/build/reports/gatling`
