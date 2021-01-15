# CDISingleton

Ao implementarmos o this.config = newConfig na classe RelatorioResource é possível notar que sempre ao tentarmos usar o método GET no ConfigResource uma configuração diferente é instanciada, abandonando o padrão Singleton.

As we implement the this.config = newConfig in the RelatorioResource class it is possible to notice that whenever we try to use the GET method in the ConfigResource a diferent config is created, abandonning the Singleton pattern.
