public class Traduccion extends GramaticaCoralBaseListener {
    @Override
    public void enterInit(GramaticaCoralParser.InitContext ctx) {
        /** Agregar los imports para las funciones predeterminadas*/
        System.out.println("import math");
        System.out.println("import random");
    }

    @Override
    public void enterDeclaration(GramaticaCoralParser.DeclarationContext ctx) {
        /** Declarar variable entera con 0 o variable float con 0.0 */
        //Declarar variable
        System.out.print(ctx.IDENTIFIER().getText() + "=");

        //Decidir si hacerla igual a 0 o 0.0
        if (ctx.TYPE().getText().compareTo("integer") == 0){
            System.out.println("0");
        } else {
            System.out.println("0.0");
        }
    }

    @Override
    public void enterInput(GramaticaCoralParser.InputContext ctx){
        /** Declarar variable entera con 0 o variable float con 0.0 */
        System.out.println(ctx.variable().getText()+"=input()");
    }


}
