

<h1 align="center">Snackbar Custom</h1>
<p align="center">
  <img width="200"  src="https://raw.githubusercontent.com/danielsidev/snackbarcustom/master/app/src/main/res/drawable/screenshot/Screenshot_20180331-131055.png">
</p>
Um modelo para customizar o Snackbar padrão do Android alterando as cores conforme sua necessidade.

### Download para teste:



* Criei esse projeto simples para exemplificar o uso. Basta baixá-lo e executá-lo no Android Studio.

* A classe modelo chamada SnackbarCustom.java funciona com chamas de métodos estáticos ou criação de instância, encapsulamento e exibir o snackbar. O tipo de uso fica a critério do desenvolvedor. Funciona das duas formas.


### Instruções
----------
* As dependências da classe fazem menção, somente, ao a própria classe Snackbar do Android. As outras dependência presente no build.gradle são referentes ao material design para o cardview do exemplo e não são necessárias ao modelo Snackbar.


*Para chamadas estáticas faça:*
----------

```
/* Importe a classe do package model */
import com.br.snackbarcustomize.model.SnackbarCustom;

/*
 Faça a chama chamada estática passando, no mínimo 4 parâmetros:
 1: A view, 2: O texto, 3:O tempo(int).0=LONG / -1=SHORT, 4: Cor Hexadecimal de fundo

 @param View view
 @param Charsequence textReturn
 @param Integer numberTime /* 0 [ LONG ] ou -1 [ SHORT ] */
 @param String hexadecimalBackground

 SnackbarCustom.make(view,textReturn, numberTime,hexadecimalBackground ).show();
*/

//Exemplo: Chamada estática alterando a cor de fundo do Snackbar
SnackbarCustom.make(view,"Snackbar Customizado!",0, "#FF0000").show();

/*
  Para alterar a cor de fundo e a cor da fonte do texto,
  inclua mais um parâmetro para chamar o outro método.

  @param View view
  @param Charsequence textReturn
  @param Integer numberTime /* 0 [ LONG ] ou -1 [ SHORT ] */
  @param String hexadecimalBackground
  @param String hexadecimalColor

  SnackbarCustom.make(view,textReturn, numberTime,hexadecimalBackground, hexadecimalColor).show();
*/

//Exemplo: Chamada estática alterando a cor de fundo  e do texto do Snackbar
SnackbarCustom.make(view,"Snackbar Customizado!",0, "#EDEDED", "#1b7d83").show();

```
<p align="center">
  <img width="200"  src="https://raw.githubusercontent.com/danielsidev/snackbarcustom/master/app/src/main/res/drawable/screenshot/Screenshot_20180331-131106.png">
</p>
*Para criar uma instância, encapsular e exibir o snackbar, faça:*
----------

```
/* Importe a classe do package model */
import com.br.snackbarcustomize.model.SnackbarCustom;



//Exemplo: Chamada estática alterando a cor de fundo do Snackbar
SnackbarCustom.make(view,"Snackbar Customizado!",0, "#FF0000").show();

/*
  Para alterar a cor de fundo e a cor da fonte do texto,
  inclua mais um parâmetro para chamar o outro método.

  @param View view
  @param Charsequence textReturn
  @param Integer numberTime /* 0 [ LONG ] ou -1 [ SHORT ] */
  @param String hexadecimalBackground
  @param String hexadecimalColor

  SnackbarCustom.make(view,textReturn, numberTime,hexadecimalBackground, hexadecimalColor).show();
*/

//Exemplo: Chamada com instância, alterando a cor de fundo do Snackbar

SnackbarCustom snack = new SnackbarCustom();
               snack.setView(view);
               snack.setText("Snack Customizado!");
               snack.setDuration(0);
               snack.setHexadecimalBackground("#FF0000");
               snack.showBackgroundColor();


//Exemplo: Chamada com instância, alterando a cor do texto do Snackbar

SnackbarCustom snack = new SnackbarCustom();
               snack.setView(view);
               snack.setText("Snack Customizado!");
               snack.setDuration(-1);
               snack.setHexadecimalColor("#FF0000");
               snack.showTextColor();

//Exemplo: Chamada com instância, alterando a cor de fundo e do texto do Snackbar

SnackbarCustom snack = new SnackbarCustom();
               snack.setView(view);
               snack.setText("Snack Customizado!");
               snack.setDuration(-1);
               snack.setHexadecimalBackground("#dea537");
               snack.setHexadecimalColor("#f05401");
               snack.showComplete();

```
<p align="center">
  <img width="200"  src="https://raw.githubusercontent.com/danielsidev/snackbarcustom/master/app/src/main/res/drawable/screenshot/Screenshot_20180331-131102.png">
</p>
